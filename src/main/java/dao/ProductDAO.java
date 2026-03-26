package dao;

// SQL関連
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;

// DAOクラス（DB操作を担当するクラス）
public class ProductDAO extends DAO {

    // 商品検索
    public List<Product> search(String keyword) throws Exception {
        // 商品を保存するリスト
        List<Product> list = new ArrayList<>();

        // データベース接続
        Connection con = getConnection();
        // SQL文
        PreparedStatement st = con.prepareStatement(
            "select * from product where name like ?"
        );
        // プレースホルダに値をセット
        st.setString(1, "%" + keyword + "%");

        // SQL実行
        ResultSet rs = st.executeQuery();
        // 検索結果を1行ずつ取り出す
        while (rs.next()) {

            // 商品オブジェクト作成
            Product p = new Product();

            // DBデータ → Productオブジェクト
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setPrice(rs.getInt("price"));

            // リストに追加
            list.add(p);
        }

        // SQL終了
        st.close();
        con.close();

        // 商品リストを返す
        return list;
    }

    // 商品追加
    public int insert(Product product) throws Exception {

        // DB接続
        Connection con = getConnection();

        // INSERT文
        PreparedStatement st = con.prepareStatement(
            "insert into product(name, price) values(?, ?)"
        );

        // 商品名
        st.setString(1, product.getName());

        // 価格
        st.setInt(2, product.getPrice());

        // SQL実行
        int line = st.executeUpdate();

        // 終了処理
        st.close();
        con.close();


        // 追加された行数を返す
        return line;
    }
}