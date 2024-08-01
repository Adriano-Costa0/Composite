package enums;

public enum ClientLevel {
  BRONZE(3), PRATA(5), OURO(7), PLATINA(10);

  private final int level;

  ClientLevel(int level) {
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}