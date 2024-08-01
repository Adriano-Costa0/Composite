import enums.ClientLevel;

public class Client {
  String name;
  private ClientLevel level;

  public Client(String name, ClientLevel level) {
    this.name = name;
    this.level = level;
  }

  public int getLevel() {
    return this.level.getLevel();
  }
  
  public String getLevelEnum(){
    return this.level.toString();

  }
}
