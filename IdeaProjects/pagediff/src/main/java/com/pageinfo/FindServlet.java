package com.pageinfo;

import bean.Product;
import dao.QueryProdect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FindServlet extends HttpServlet {
    public FindServlet(){

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int currPage=1;
        if(req.getParameter("page")!=null){
            currPage=Integer.parseInt(req.getParameter("page"));
        }
        QueryProdect dao=new QueryProdect();
        List<Product> list=dao.find(currPage);
        req.setAttribute("list",list);
        int pages;
        int count=dao.findCount();
        if(count % Product.PAGE_SIZE==0){
            pages=count/Product.PAGE_SIZE;
        }else {
            pages=count/Product.PAGE_SIZE+1;
        }
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<=pages;i++){
            if (i==currPage){
                sb.append("["+i+"]");
            }else {
                sb.append("<a href='FindServlet?page=" +i+"'>"+i+"</a>");
            }
            sb.append(" ");
        }
        req.setAttribute("bar",sb.toString());
        req.getRequestDispatcher("product_list.jsp").forward(req,resp);
    }
}
