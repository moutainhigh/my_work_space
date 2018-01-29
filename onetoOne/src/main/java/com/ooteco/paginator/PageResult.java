package com.ooteco.paginator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageResult<E> implements Serializable{

    /**
	 *
	 */
	private static final long serialVersionUID = -5758535250086262444L;

	private List<E> list = new ArrayList<E>();

    private Page page;

    private Object queryParam;

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Object getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(Object queryParam) {
        this.queryParam = queryParam;
    }
}
