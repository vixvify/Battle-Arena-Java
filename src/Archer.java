import java.util.Random;

class Archer extends Character {

    public Archer(String name) {
        super(name, 110, 18);
    }

    @Override
    public void attack(Character target) {
        int damage = attackDamage;
        target.takeDamage(damage);

        System.out.println("\n===== ACTION =====");
        System.out.println(name + " shoots arrow at " + target.getName());
        System.out.println("Damage: " + damage);
        System.out.println("====================\n");
    }

    @Override
    public void skill(Character target) {
        Random rand = new Random();

        System.out.println("\n===== SKILL =====");
        System.out.println(name + " uses RAPID SHOT!");

        int totalDamage = 0;

        for (int i = 1; i <= 3; i++) {
            int damage = rand.nextInt(10) + 10;
            totalDamage += damage;

            System.out.println("Arrow " + i + " hits for " + damage);
        }

        target.takeDamage(totalDamage);

        System.out.println("Total Damage: " + totalDamage);
        System.out.println("====================\n");
    }
}