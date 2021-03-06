/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern2;

/**
 *
 * @author Lasse Andersen
 */
public class TestEnemyAttackers {

    public static void main(String[] args) {

        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }
}
