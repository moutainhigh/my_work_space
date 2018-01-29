package com.ooteco.paginator;

import java.util.ArrayList;
import java.util.Collection;

public class PageList<E> extends ArrayList<E> {

    private static final long serialVersionUID = 1412759446332294208L;

    private Page page;

    public PageList() {
    }

    public PageList(Collection<? extends E> c) {
        super(c);
    }

    public PageList(Collection<? extends E> c, Page p) {
        super(c);
        this.page = p;
    }

    public PageList(Page p) {
        this.page = p;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
