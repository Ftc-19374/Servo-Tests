package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="test_servo")
public class test_servo extends LinearOpMode{

    CRServo servo1;
    boolean ButtonA;
    boolean ButtonB;

    public void runOpMode() throws InterruptedException {
        servo1 = hardwareMap.crservo.get("servo1");
        waitForStart();
        while (opModeIsActive()) {
            ButtonA = gamepad1.a;
            ButtonB = gamepad1.b;

            if (ButtonA) {
                servo1.setPower(1.0);
            }
            if (ButtonB) {
                servo1.setPower(-1.0);
            }
            else
            {
                servo1.setPower(0);
            }
        }
        }

}
