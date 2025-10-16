package model.drone;

import model.drone.motor;
import model.drone.camera;
import model.drone.claw;


public class drone {
    motor motor1 = new motor();
    motor motor2 = new motor();
    motor motor3 = new motor();
    motor motor4 = new motor();
    claw droppingClaw = new claw();
    camera camera = new camera();
}
