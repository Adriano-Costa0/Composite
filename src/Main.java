import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import enums.ClientLevel;

public class Main {
  public static void main(String[] args) {

    List<Client> clients = new ArrayList<>();
    List<LeafProduct> sortedProducts = new ArrayList<>();

    Client adriano = new Client("Adriano Costa", ClientLevel.BRONZE);
    Client maria = new Client("Paulo Cesar", ClientLevel.PRATA);
    Client paulo = new Client("Rogerio Senna", ClientLevel.OURO);
    Client soares = new Client("Irmaos Soares", ClientLevel.PLATINA);
    Client rebecca = new Client("Rebecca", ClientLevel.PLATINA);
    Client rafael = new Client("Rafael silva", ClientLevel.OURO);
    Client matheus = new Client("Matheus Canastro", ClientLevel.BRONZE);

    clients.add(adriano);
    clients.add(maria);
    clients.add(paulo);
    clients.add(soares);
    clients.add(rebecca);
    clients.add(rafael);
    clients.add(matheus);

    Random random = new Random();
    int sortedPos = random.nextInt(clients.size());

    LeafProduct productOne = new LeafProduct("Quadrinhos", 15);
    LeafProduct productTwo = new LeafProduct("Chaveiro", 5);
    LeafProduct productThree = new LeafProduct("Bustos", 10);
    LeafProduct productFour = new LeafProduct("Adesivos", 1);
    LeafProduct productFive = new LeafProduct("Poster", 25);
    LeafProduct productSix = new LeafProduct("Camiseta", 25);
    LeafProduct productSeven = new LeafProduct("Caneta", 3);
    LeafProduct productEight = new LeafProduct("Miniaturas", 20);

    sortedProducts.add(productOne);
    sortedProducts.add(productTwo);
    sortedProducts.add(productThree);
    sortedProducts.add(productFour);
    sortedProducts.add(productFive);
    sortedProducts.add(productSix);
    sortedProducts.add(productSeven);
    sortedProducts.add(productEight);

    Client sortedClient = clients.get(sortedPos);
    int sortedLevel = sortedClient.getLevel();

    CompositeProduct geekBox = new CompositeProduct("Caixa - Geek");

    for (int i = 0; i < sortedLevel; i++) {
      int productIndex = random.nextInt(sortedProducts.size());
      geekBox.addProduct(sortedProducts.get(productIndex));
    }

    System.out.println("Cliente nivel - " + sortedClient.getLevelEnum());
    int total = geekBox.getPrice();
    System.out.println("Total: R$" + total);
  }
}