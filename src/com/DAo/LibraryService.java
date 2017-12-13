package com.DAo;

import java.util.List;

import com.Beans.Book;

public class LibraryService {
    private static final LibraryService  Service=new LibraryService();
    private List<Book> list=null;
    private  LibraryService(){}
    public static LibraryService getService(){
        return Service;
    }
    public void createBook(Book book){
        CURDS.insert(book);
    }
    public List<Book> getList(){
         list=CURDS.select();
        return  list;
    }
    
    
}







