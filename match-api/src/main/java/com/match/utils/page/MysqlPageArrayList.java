package com.match.utils.page;

/**
 * mysql的分页方法
 * 
 * @author GaoXiang Date: 2014-8-5
 */
public class MysqlPageArrayList<T> extends AbstractPageList<T> {
    
    private static final long serialVersionUID = 5324376945675233220L;
    
    /**
     * 默认构造方法
     */
    public MysqlPageArrayList() {
        super();
    }
    
    /**
     * 带当前页和页大小的构造方法
     * 
     * @param index 当前页
     * @param pageSize 页大小
     */
    public MysqlPageArrayList(int index, int pageSize) {
        super(index, pageSize);
    }
    
    @Override
    protected void repaginate() {
        if (pageSize < 1) { // 防止程序偷懒，list和分页的混合使用
            pageSize = PAGESIZE_DEFAULT;
        }
        if (index < 1) {
            index = 1;// 恢复到第一页
        }
        if (totalItem > 0) {
            totalPage = totalItem / pageSize + (totalItem % pageSize > 0 ? 1 : 0);
            if (index > totalPage) {
                index = totalPage; // 最大页
            }
            
            endRow = index * pageSize;
            startRow = endRow - pageSize;
            endRow = pageSize;
            
            if (endRow > totalItem) {
                endRow = totalItem;
            }
        }
    }
    
}