package com.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Page implements Serializable {
    private static final long serialVersionUID = 1L;

    private int pages;

    private int num;

    private int lastp;

    private List<Book> list = new ArrayList<Book>();

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getLastp() {
        return lastp;
    }

    public void setLastp(int lastp) {
        this.lastp = lastp;
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

}
