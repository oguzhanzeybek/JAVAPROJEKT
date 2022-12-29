public class Product {

  public Product(int id){
    System.out.println("calisti");
  }
  private int _id; //veya int_id;
  private String name;
  private String description; // attribut-field
  private double price;
  private int StockAmount;

  public int getid() {
    return _id;
  }

  public void setId(int id) {
    _id = id; // this.id=id;
  }
}
