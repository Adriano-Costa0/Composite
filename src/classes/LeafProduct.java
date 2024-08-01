public class LeafProduct extends ProductComponent {

  public LeafProduct(String name, int price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public int getPrice() {
    return this.price;
  }

}
