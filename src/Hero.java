public class Hero {
    private int health;
    private int damage;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getSuperpower() {
        return superpower;
    }

    private int superpower;

    public Hero(int health, int damage, int superpower){
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;

    }

    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;

    }
}




