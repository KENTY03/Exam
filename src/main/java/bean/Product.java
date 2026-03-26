package bean;
public class Product implements java.io.Serializable {
    // 商品番号 privateにすることで外部から直接アクセスできないようにする
	
    private int id;
    // 商品名
    private String name;
    // 価格
    private int price;
    // getterメソッド（値を取得するメソッド）商品番号を取得する
    public int getId() {
        return id;
    }
    // 商品名を取得する
    public String getName() {
        return name;
    }
    // 価格を取得する
    public int getPrice() {
        return price;
    }
    // setterメソッド（値を設定するメソッド） 商品番号を設定する
    public void setId(int id) {
        // 引数idをフィールドidに代入している
        this.id = id;
    }
    // 商品名を設定する
    public void setName(String name) {
        this.name = name;
    }
    // 価格を設定する
    public void setPrice(int price) {
        this.price = price;
    }
}