package dao;

import bean.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueryProdect {

    /**
     * 分页查询所有商品信息
     *
     * @param page 页数
     * @return List<Product>
     */
    public List<Product> find(int page) {
        List<Product> list = new ArrayList<Product>();
        Connection conn = connUtil.ConnectUtil.getConnection();
        String sql = "select * from tb_product order by id desc limit ?,?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, (page - 1) * Product.PAGE_SIZE);
            ps.setInt(2, Product.PAGE_SIZE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setNum(rs.getInt("num"));
                p.setPrice(rs.getDouble("price"));
                p.setUnit(rs.getString("unit"));
                list.add(p);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 查询总记录数
     *
     * @return 总记录数
     */
    public int findCount() {
        int count = 0;
        Connection conn = connUtil.ConnectUtil.getConnection();
        String sql = "select count(*) from tb_product";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
