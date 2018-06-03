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
public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        robot = newRobot;
    }

    @Override
    public void fireWeapon() {
        robot.smashWithHands();
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        robot.reactToHuman(driverName);
    }

}
