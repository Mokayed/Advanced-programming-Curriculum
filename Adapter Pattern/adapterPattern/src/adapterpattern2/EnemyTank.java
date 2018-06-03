package adapterpattern2;

import java.util.Random;

/**
 *
 * @author Lasse Andersen
 */
public class EnemyTank implements EnemyAttacker {

    private Random rnd = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = rnd.nextInt(10) + 1;
        System.out.println("Enemy tank does " + attackDamage + " damage");
    }

    @Override
    public void driveForward() {
        int movement = rnd.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the Tank");

    }

}
