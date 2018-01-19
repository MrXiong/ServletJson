package com.zx.demo;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GetUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> list = new ArrayList<User>() ;
        list.add(new User("id1","大熊1",123456));
        list.add(new User("id2","静香2",1234569999));
        String jsonStr = JsonTools.toJson(list);
        resp.setHeader("Content-type", "text/json;charset=UTF-8");
        OutputStream ps = resp.getOutputStream();
        //这句话的意思，使得放入流的数据是utf8格式
        ps.write(jsonStr.getBytes("UTF-8"));
        ps.close();

    }

}
