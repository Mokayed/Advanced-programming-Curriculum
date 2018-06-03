package adapterpattern2;

import java.util.Random;

/**
 *
 * @author Lasse Andersen
 */
public class EnemyRobot {

    private Random rnd = new Random();

    public void smashWithHands() {
        int attackDamage = rnd.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + " Damage with its hands");

    }

    public void walkForward() {
        int movement = rnd.nextInt(5) + 1;

        System.out.println("Enemy Robot walks " + movement + " spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
