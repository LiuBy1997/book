package com.Beans;

public class Book {
    public Book(int id, String name, String type, String author, String discount, double price, int num,
            String test) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.author = author;
        this.discount = discount;
        this.price = price;
        this.num = num;
        this.test = test;
    }
    public Book(String name, String type, String author, String discount, double price, int num,
            String test) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.discount = discount;
        this.price = price;
        this.num = num;
        this.test = test;
    }
    public Book() {
    }

    private int id;

    private String name;

    private String type;

    private String author;

    private String discount;

    private double price;

    private int num;

    private String test;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
