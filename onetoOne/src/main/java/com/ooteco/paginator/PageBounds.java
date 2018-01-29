package com.ooteco.paginator;

import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;

public class PageBounds extends RowBounds implements Serializable {

    private static final long serialVersionUID = -6414350656252331011L;

    public static final int NO_PAGE = 1;
    /**
     * 页号
     */
    protected int page = NO_PAGE;
    /**
     * 分页大小
     */
    protected int limit = NO_ROW_LIMIT;

    public PageBounds() {
    }

    /**
     * 构造器
     *
     * @param rowBounds RowBounds对象
     */
    public PageBounds(RowBounds rowBounds) {
        if (rowBounds instanceof PageBounds) {
            PageBounds pageBounds = (PageBounds) rowBounds;
            this.page = pageBounds.page;
            this.limit = pageBounds.limit;
        } else {
            this.page = (rowBounds.getOffset() / rowBounds.getLimit()) + 1;
            this.limit = rowBounds.getLimit();
        }

    }

    /**
     * Query TOP N, default containsTotalCount = false
     *
     * @param limit 条数
     */
    public PageBounds(int limit) {
        this.limit = limit;
    }

    /**
     * 构造器
     *
     * @param page  第几页
     * @param limit 每页条数
     */
    public PageBounds(int page, int limit) {
        this.page = page;
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


    @Override
    public int getOffset() {
        if (page >= 1) {
            return (page - 1) * limit;
        }
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PageBounds{");
        sb.append("page=").append(page);
        sb.append(", limit=").append(limit);
        sb.append('}');
        return sb.toString();
    }
}
