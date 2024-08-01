import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends ProductComponent {
  private List<ProductComponent> products = new ArrayList<>();

  public CompositeProduct(String name) {
    this.name = name;
  }

  @Override
  public int getPrice() {
    System.out.println(this.name + ": \n");
    int total = 0;
    for (ProductComponent product : products) {
      int price = product.getPrice();
      total += price;
      System.out.println("- " + product.name + ": R$" + price);
    }
    return total;
  }

  public void addProduct(ProductComponent product) {
    products.add(product);
  }

  public void removeProduct(ProductComponent product) {
    products.remove(product);
  }

  public void listProducts() {
    System.out.println(this.name + ": \n");
    for (ProductComponent product : products) {
      int price = product.getPrice();
      System.out.println("- " + product.name + ": R$" + price);
    }
  }

}
