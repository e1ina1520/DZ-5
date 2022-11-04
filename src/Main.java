
public class Main {
    public static void main(String[] args) {

      Hero hero = new Hero(913,52,45);
      System.out.println("HERO");
      System.out.println("Health:  "+" " + hero.getHealth());
      System.out.println("Damage:"+" " + hero.getDamage());
      System.out.println("Superpower:"+" " + hero.getSuperpower());
      System.out.println("     ***** ");


        Hero hero2 = new Hero(1500,200,120);
        System.out.println("HERO 2");
        System.out.println("Health:"+" " + hero2.getHealth());
        System.out.println("Damage:"+" " + hero2.getDamage());
      System.out.println("     *****");

        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(60);
        boss.setProtection(100);

      System.out.println("BOSS");
      System.out.println("Health:" + " " + boss.getHealth());
      System.out.println("Damage:" + " " + boss.getDamage());
      System.out.println("Protection:" + " " + boss.getProtection());

    }
}