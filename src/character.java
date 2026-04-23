
abstract class Character {
    protected String name;
    protected int hp;
    protected int attackDamage;

    public Character(String name, int hp, int attackDamage) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0)
            hp = 0;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract void attack(Character target);

    public void skill(Character target) {
        System.out.println(name + " has no special skill!");
    }
}