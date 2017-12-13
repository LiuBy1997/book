package com.C;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Beans.Book;
import com.DAo.LibraryService;


@WebServlet("/LController")
public class LController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LController() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        
        List<String> errors = new ArrayList<>(); //存储错误信息
        //获取请求参数值
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        String author=request.getParameter("author");
        String discount=request.getParameter("discount");
        String price=request.getParameter("price");
        String num=request.getParameter("num");
        String test=request.getParameter("test");
        //校验
        if(name==null){
                errors.add("请填写书名");
        }
        if(type==null){
            errors.add("请勾选类型");
        }
        if(author==null){
            errors.add("请填写作者");
        }
        if(discount==null){
            errors.add("请勾选折扣");
        }
        if(num==null){
            errors.add("请填写数量");
        }
        if(price==null){
            errors.add("请填写价格");
        }
        if(test==null){
            errors.add("请填写内容简介");
        }
        double p=Double.parseDouble(price);
        int n=Integer.parseInt(num);
        if(errors.size() > 0){
        //失败，跳转到注册页面
                request.setAttribute("errors", errors);
                RequestDispatcher rd = request.getRequestDispatcher("Page/AddBook.jsp");
                rd.forward(request, response);
        }else{
        //成功
                Book book=new Book(name,type,author,discount,p,n,test);
                LibraryService.getService().createBook(book);
                request.setAttribute("book", book);
                request.getRequestDispatcher("Page/AddSu.jsp")
                .forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
