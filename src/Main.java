import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 2 PLAYER BATTLE GAME ===");

        sc.nextLine();
        System.out.print("\nEnter Player 1 name: ");
        String p1Name = sc.nextLine();

        System.out.println("Choose character:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");

        int p1Choice = sc.nextInt();
        Character player1 = createCharacter(p1Choice, p1Name);

        sc.nextLine();
        System.out.print("\nEnter Player 2 name: ");
        String p2Name = sc.nextLine();

        System.out.println("Choose character:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");

        int p2Choice = sc.nextInt();
        Character player2 = createCharacter(p2Choice, p2Name);

        int turn = 1;

        while (player1.isAlive() && player2.isAlive()) {
            System.out.println("\n--- Turn " + turn + " ---");

            showStatus(player1, player2);

            System.out.println("\n" + player1.getName() + " turn:");
            playerTurn(sc, player1, player2);

            if (!player2.isAlive())
                break;

            System.out.println("\n" + player2.getName() + " turn:");
            playerTurn(sc, player2, player1);

            turn++;
        }

        System.out.println("\n=== GAME OVER ===");

        if (player1.isAlive()) {
            System.out.println(player1.getName() + " Wins!");
        } else {
            System.out.println(player2.getName() + " Wins!");
        }

        sc.close();
    }

    public static Character createCharacter(int choice, String name) {
        switch (choice) {
            case 1:
                return new Warrior(name);
            case 2:
                return new Mage(name);
            case 3:
                return new Archer(name);
            default:
                return new Warrior(name);
        }
    }

    public static void playerTurn(Scanner sc, Character attacker, Character target) {
        System.out.println("1. Attack");
        System.out.println("2. Skill");

        int action = sc.nextInt();

        if (action == 1) {
            attacker.attack(target);
        } else {
            attacker.skill(target);
        }
    }

    public static void showStatus(Character p1, Character p2) {
        System.out.println("\n===== STATUS =====");
        System.out.println(p1.getName() + " : " + p1.getHp());
        System.out.println(p2.getName() + " : " + p2.getHp());
        System.out.println("=====================");
    }
}