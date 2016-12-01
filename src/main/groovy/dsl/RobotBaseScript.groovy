package dsl

/**
 * Created by hlieu on 11/28/16.
 */
abstract class RobotBaseScript extends Script {
    void move (Direction dir){
        this.binding.robot.move dir
    }
}
