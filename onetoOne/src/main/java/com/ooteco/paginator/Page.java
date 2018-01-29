package com.ooteco.paginator;

import java.io.Serializable;

public class Page implements Serializable {
    private static final long serialVersionUID = -2429864663690465105L;

    private static final int DEFAULT_SLIDERS_COUNT = 7;

    /**
     * 默认页码
     */
    public static final int DEFAULT_PAGE_NUMBER = 1;

    /**
     * 默认每页记录数
     */
    public static final int DEFAULT_PAGE_SIZE = 10;

    /**
     * 最大每页记录数
     */
    private static final int MAX_PAGE_SIZE = 1000;

    /**
     * 页码
     */
    private int pageNumber = DEFAULT_PAGE_NUMBER;

    /**
     * 每页记录数
     */
    private int pageSize = DEFAULT_PAGE_SIZE;

    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 排序属性
     */
    private String orderProperty;

    /**
     * 排序方向
     */
    private EntityOrder.Direction orderDirection;

    public Page() { }

    /**
     * 构造器
     *
     * @param pageNumber 第几页
     * @param pageSize   每页数量
     * @param totalCount 总记录数
     */
    public Page(int pageNumber, int pageSize, int totalCount) {
        super();

        if (pageSize >= 1) {
            if (pageSize <= MAX_PAGE_SIZE) {
                this.pageSize = pageSize;
            } else {
                this.pageSize = MAX_PAGE_SIZE;
            }
        }
        this.totalCount = totalCount;
        this.pageNumber = computePageNumber(pageNumber);
    }

    /**
     * 取得当前页。
     */
    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber < 1) {
            pageNumber = DEFAULT_PAGE_NUMBER;
        }
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        if (pageSize < 1) {
            pageSize = DEFAULT_PAGE_SIZE;
        } else if (pageSize > MAX_PAGE_SIZE) {
            pageSize = MAX_PAGE_SIZE;
        }

        this.pageSize = pageSize;
    }

    /**
     * 取得总项数。
     *
     * @return 总项数
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 是否是首页（第一页），第一页页码为1
     *
     * @return 首页标识
     */
    public boolean isFirstPage() {
        return pageNumber <= 1;
    }

    /**
     * 是否是最后一页
     *
     * @return 末页标识
     */
    public boolean isLastPage() {
        return pageNumber >= getTotalPages();
    }

    /**
     * 上一页
     *
     * @return 上一页页数
     */
    public int getPrePage() {
        if (isHasPrePage()) {
            return pageNumber - 1;
        } else {
            return pageNumber;
        }
    }

    /**
     * 下一页
     *
     * @return 下一页页数
     */
    public int getNextPage() {
        if (isHasNextPage()) {
            return pageNumber + 1;
        } else {
            return pageNumber;
        }
    }

    /**
     * 判断指定页码是否被禁止，也就是说指定页码超出了范围或等于当前页码。
     *
     * @param pageNumber 页码
     * @return boolean  是否为禁止的页码
     */
    public boolean isDisabledPage(int pageNumber) {
        return ((pageNumber < 1) || (pageNumber > getTotalPages()) || (pageNumber == this.pageNumber));
    }

    /**
     * 是否有上一页
     *
     * @return 上一页标识
     */
    public boolean isHasPrePage() {
        return (pageNumber - 1 >= 1);
    }

    /**
     * 是否有下一页
     *
     * @return 下一页标识
     */
    public boolean isHasNextPage() {
        return (pageNumber + 1 <= getTotalPages());
    }

    /**
     * 开始行，可以用于oracle分页使用 (1-based)。
     */
    public int getStartRow() {
        if (getPageSize() <= 0 || totalCount <= 0) {
            return 0;
        }
        return pageNumber > 0 ? (pageNumber - 1) * getPageSize() + 1 : 0;
    }

    /**
     * 结束行，可以用于oracle分页使用 (1-based)。
     */
    public int getEndRow() {
        return pageNumber > 0 ? Math.min(pageSize * pageNumber, getTotalCount()) : 0;
    }

    /**
     * offset，计数从0开始，可以用于mysql分页使用(0-based)
     */
    public int getOffset() {
        return pageNumber > 0 ? (pageNumber - 1) * getPageSize() : 0;
    }

    /**
     * 得到 总页数
     *
     * @return 总页数
     */
    public int getTotalPages() {
        if (totalCount <= 0) {
            return 0;
        }
        if (pageSize <= 0) {
            return 0;
        }

        int count = totalCount / pageSize;
        if (totalCount % pageSize > 0) {
            count++;
        }
        return count;
    }

    protected int computePageNumber(int pageNumber) {
        return computePageNumber(pageNumber, pageSize, totalCount);
    }

    /**
     * 页码滑动窗口，并将当前页尽可能地放在滑动窗口的中间部位。
     *
     * @return 返回滑动的页码数组
     */
    public Integer[] getSlider() {
        return slider(DEFAULT_SLIDERS_COUNT);
    }

    /**
     * 页码滑动窗口，并将当前页尽可能地放在滑动窗口的中间部位。
     * 注意:不可以使用 getSlider(1)方法名称，因为在JSP中会与 getSlider()方法冲突，报exception
     *
     * @return 返回滑动的页码数组
     */
    public Integer[] slider(int slidersCount) {
        return generateLinkPageNumbers(getPageNumber(), getTotalPages(), slidersCount);
    }

    private static int computeLastPageNumber(int totalItems, int pageSize) {
        if (pageSize <= 0) {
            return 1;
        }
        int result = totalItems % pageSize == 0 ? totalItems / pageSize : totalItems / pageSize + 1;
        if (result <= 1) {
            result = 1;
        }
        return result;
    }

    private static int computePageNumber(int pageNumber, int pageSize, int totalItems) {
        if (pageNumber <= 1) {
            return 1;
        }
        if (Integer.MAX_VALUE == pageNumber || pageNumber > computeLastPageNumber(totalItems, pageSize)) {
            return computeLastPageNumber(totalItems, pageSize);
        }
        return pageNumber;
    }

    private static Integer[] generateLinkPageNumbers(int currentPageNumber, int lastPageNumber, int count) {
        int avg = count / 2;

        int startPageNumber = currentPageNumber - avg;
        if (startPageNumber <= 0) {
            startPageNumber = 1;
        }

        int endPageNumber = startPageNumber + count - 1;
        if (endPageNumber > lastPageNumber) {
            endPageNumber = lastPageNumber;
        }

        if (endPageNumber - startPageNumber < count) {
            startPageNumber = endPageNumber - count;
            if (startPageNumber <= 0) {
                startPageNumber = 1;
            }
        }

        java.util.List<Integer> result = new java.util.ArrayList<Integer>();
        for (int i = startPageNumber; i <= endPageNumber; i++) {
            result.add(i);
        }
        return result.toArray(new Integer[result.size()]);
    }

    public String getOrderProperty() {
        return orderProperty;
    }

    public void setOrderProperty(String orderProperty) {
        this.orderProperty = orderProperty;
    }

    public EntityOrder.Direction getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(EntityOrder.Direction orderDirection) {
        this.orderDirection = orderDirection;
    }

    @Override
    public String toString() {
        return "Page" + "{pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", totalCount=" + totalCount + '}';
    }


}
