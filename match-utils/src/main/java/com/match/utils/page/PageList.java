package com.match.utils.page;

import java.util.List;

/**
 * 分页列表
 * 
 * @author GaoXiang Date: 2014-8-5
 */
public interface PageList<T> extends List<T> {
    
    /**
     * 表示是不是第一页
     * 
     * @return true 是; false 不是
     */
    public boolean isFirstPage();
    
    /**
     * 是否中间页
     * 
     * @return
     */
    public boolean isMiddlePage();
    
    /**
     * 是否最后一页
     * 
     * @return
     */
    public boolean isLastPage();
    
    /**
     * 下一页是否可用
     * 
     * @return
     */
    public boolean isNextPageAvailable();
    
    /**
     * 前一页是否可用
     * 
     * @return
     */
    public boolean isPreviousPageAvailable();
    
    /**
     * 下一页号
     * 
     * @return 取得下一页号
     */
    public int getNextPage();
    
    /**
     * 前一页号
     * 
     * @return
     */
    public int getPreviousPage();
    
    /**
     * Method getPageSize returns the pageSize of this PaginatedArrayList object.
     * 每页大小
     * 
     * @return the pageSize (type int) of this PaginatedArrayList object.
     */
    
    public int getPageSize();
    
    /**
     * Method setPageSize sets the pageSize of this PaginatedArrayList object.
     * 每页大小
     * 
     * @param pageSize the pageSize of this PaginatedArrayList object.
     */
    
    public void setPageSize(int pageSize);
    
    /**
     * Method getIndex returns the index of this PaginatedArrayList object.
     * 当前页。第一页是1
     * 
     * @return the index (type int) of this PaginatedArrayList object.
     */
    
    public int getIndex();
    
    /**
     * Method setIndex sets the index of this PaginatedArrayList object.
     * 当前页。第一页是1
     * 
     * @param index the index of this PaginatedArrayList object.
     */
    
    public void setIndex(int index);
    
    /**
     * Method getTotalItem returns the totalItem of this PaginatedArrayList object.
     * 总记录数
     * 
     * @return the totalItem (type int) of this PaginatedArrayList object.
     */
    
    public int getTotalItem();
    
    /**
     * Method setTotalItem sets the totalItem of this PaginatedArrayList object.
     * 总记录数
     * 
     * @param totalItem the totalItem of this PaginatedArrayList object.
     */
    
    public void setTotalItem(int totalItem);
    
    /**
     * Method getTotalPage returns the totalPage of this PaginatedArrayList object.
     * 总页数
     * 
     * @return the totalPage (type int) of this PaginatedArrayList object.
     */
    
    public int getTotalPage();
    
    /**
     * Method getStartRow returns the startRow of this PaginatedArrayList object.
     * 分页后的记录开始的地方
     * 
     * @return the startRow (type int) of this PaginatedArrayList object.
     */
    
    public int getStartRow();
    
    /**
     * Method getEndRow returns the endRow of this PaginatedArrayList object.
     * 分页后的记录结束的地方
     * 
     * @return the endRow (type int) of this PaginatedArrayList object.
     */
    
    public int getEndRow();
}
