// ---------------------------------------------------------------------------------------------- //

// SETUP

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "robotCentric", group = "Linear Opmode")
public class robotCentric extends LinearOpMode {

    // OPMODE MEMBER DECLARATION
    private DcMotor leftFront;
    private DcMotor leftRear;
    private DcMotor rightFront;
    private DcMotor rightRear;
    private DcMotor leftSlides;
    private DcMotor rightSlides;
    private DcMotor intake;
    private Servo rightFourBar;
    private Servo leftFourBar;
    private CRServo outtake;

    @Override
    public void runOpMode() {

        // HARDWARE MAP
        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        leftRear = hardwareMap.get(DcMotor.class, "leftRear");

        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        rightRear = hardwareMap.get(DcMotor.class, "rightRear");

        leftSlides = hardwareMap.get(DcMotor.class, "leftSlides");
        rightSlides = hardwareMap.get(DcMotor.class, "rightSlides");

        intake = hardwareMap.get(DcMotor.class, "intake");

        rightFourBar = hardwareMap.get(Servo.class, "rightFourBar");
        leftFourBar = hardwareMap.get(Servo.class, "leftFourBar");

        outtake = hardwareMap.get(CRServo.class, "outtake");

// ---------------------------------------------------------------------------------------------- //

        // INIT

        //leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        //leftRear.setDirection(DcMotorSimple.Direction.REVERSE)

        /*leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftRear.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightRear.setMode(DcMotor.RunMode.RUN_USING_ENCODER);*/

// ---------------------------------------------------------------------------------------------- //

        // RUN

        waitForStart();
        if (opModeIsActive()) {
// ---------------------------------------------------------------------------------------------- //

            // LOOP

            while (opModeIsActive()) {

                // MECANUM MOVEMENT
                leftFront.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
                leftRear.setPower(-gamepad1.right_stick_y + (gamepad1.left_stick_x - gamepad1.right_stick_x));
                rightRear.setPower(-gamepad1.right_stick_y - (gamepad1.left_stick_x - gamepad1.right_stick_x));
                rightFront.setPower(-gamepad1.right_stick_y - (gamepad1.left_stick_x + gamepad1.right_stick_x));
            }
        }
    }
}