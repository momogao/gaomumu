package dao;

import connUtil.ConnectUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddProduct {
    /**
     * 添加产品
     */
    Connection conn = ConnectUtil.getConnection();
    String sql = "insert into tb_product(NAME,num,price,unit) VALUES(?,?,?,?)";
    public void addProduct(HttpServletRequest req, HttpServletResponse resp){

        PrintWriter out = null;
        try {
            req.setCharacterEncoding("utf-8");
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,req.getParameter("name"));
            ps.setInt(2,Integer.parseInt(req.getParameter("num")));
            ps.setDouble(3,Double.parseDouble(req.getParameter("price")));
            ps.setString(4,req.getParameter("unit"));
            int row = ps.executeUpdate();
            resp.setContentType("text/html;charset=utf-8");
            out = resp.getWriter();
            if (row > 0){
                out.write("成功添加了" + row + "条信息！");
                out.write("<a href='add_product.jsp'>继续添加</a>");
            }
            ps.close();
            conn.close();
            out.close();
        } catch (Exception e) {
            out.write("信息添加失败！");
            out.close();
            e.printStackTrace();
        }
    }
}
