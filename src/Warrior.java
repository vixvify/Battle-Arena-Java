class Warrior extends Character {

    public Warrior(String name) {
        super(name, 150, 20);
    }

    @Override
    public void attack(Character target) {
        int damage = attackDamage;
        target.takeDamage(attackDamage);
        System.out.println("\n⚔️ ===== ACTION =====");
        System.out.println(name + " slashes " + target.getName());
        System.out.println("💥 Damage: " + damage);
        System.out.println("====================\n");
    }

    @Override
    public void skill(Character target) {
        int damage = 35;
        target.takeDamage(damage);

        System.out.println("\n💥 ===== SKILL =====");
        System.out.println(name + " uses POWER STRIKE!");
        System.out.println("🔥 Damage: " + damage);
        System.out.println("====================\n");
}
}