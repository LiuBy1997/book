package com.Beans;

import java.util.ArrayList;
import java.util.List;

public class User {
    public User(String name) {
        this.name = name;
    }

    private String name;

    private List<String> book = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBook() {
        return book;
    }

    public void setBook(String b) {
        book.add(b);
    }

}
