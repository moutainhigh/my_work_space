package com.match.utils.page;

import com.match.utils.StringUtil;

/**
 * 分页查询条件基类
 * 
 * @author GaoXiang Date: 2014-8-5
 */
public class PageQuery {
    
    /**
     * 查询页数
     */
    private int page;
    
    /**
     * 每页条数
     */
    private int pageSize = 10;
    
    /**
     * 开始条数
     */
    private int startRow;
    
    public int getPage() {
        return page;
    }
    
    public void setPage(int page) {
        this.page = page;
    }
    
    public int getPageSize() {
        return pageSize;
    }
    
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    public int getStartRow() {
        return startRow;
    }
    
    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }
    
    @Override
    public String toString() {
        return StringUtil.beanObject2String(this);
    }
}
