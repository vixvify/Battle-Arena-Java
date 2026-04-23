class Mage extends Character {

    public Mage(String name) {
        super(name, 100, 25);
    }

    @Override
    public void attack(Character target) {
        int damage = attackDamage;
        target.takeDamage(damage);

        System.out.println("\n===== ACTION =====");
        System.out.println(name + " casts magic on " + target.getName());
        System.out.println("Damage: " + damage);
        System.out.println("====================\n");
    }

    @Override
    public void skill(Character target) {
        int damage = 45;
        target.takeDamage(damage);

        System.out.println("\n===== SKILL =====");
        System.out.println(name + " casts FIREBALL!!");
        System.out.println("Massive Damage: " + damage);
        System.out.println("====================\n");
    }
}