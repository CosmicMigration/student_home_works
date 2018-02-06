package hw_for_robot.robot_hw;

import hw_for_robot.robot_hw.robotPart.Body;
import hw_for_robot.robot_hw.robotPart.Hand;
import hw_for_robot.robot_hw.robotPart.Head;
import hw_for_robot.robot_hw.robotPart.Leg;

import java.util.Objects;

public class Robot {
    private Body body;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;
    private Head head;

    public Robot() {
    }

    public Robot(Body body, Hand leftHand, Hand roghtHand, Leg leftLeg, Leg rightLeg, Head head) {
        this.body = body;
        this.leftHand = leftHand;
        this.rightHand = roghtHand;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.head = head;
        checkOnRobotParts( body, leftHand,  roghtHand,  leftLeg, rightLeg,  head);
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return Objects.equals(body, robot.body) &&
                Objects.equals(leftHand, robot.leftHand) &&
                Objects.equals(rightHand, robot.rightHand) &&
                Objects.equals(leftLeg, robot.leftLeg) &&
                Objects.equals(rightLeg, robot.rightLeg) &&
                Objects.equals(head, robot.head);
    }

    @Override
    public int hashCode() {

        return Objects.hash(body, leftHand, rightHand, leftLeg, rightLeg, head);
    }

    @Override
    public String toString() {

        return "Robot{" +
                "body=" + body +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                ", head=" + head +
                '}';
    }
    private void checkOnRobotParts(Body body, Hand leftHand, Hand roghtHand, Leg leftLeg, Leg rightLeg, Head head){
        int count = 0;
            if(head!=null&& body!=null){
                count++;
              head.canThink();
            }
            if (leftHand!=null&&roghtHand!=null && body!=null){
                count++;
                if(leftHand.getTypeHand().equals("left")) {
                    leftHand.robotCanWrite();
                }
                if(rightHand.getTypeHand().equals("right")) {
                    rightHand.robotCanWrite();
                }
            }
        if (leftLeg!=null&&rightLeg!=null && body!=null){
            count++;
            if(leftLeg.getTypeLeg().equals("left")) {
                leftLeg.robotCanRun();
            }
            if(rightLeg.getTypeLeg().equals("right")) {
                rightLeg.robotCanRun();
            }
        }
        if(count==3){
            System.out.println("Robot Ready!");

            }else if(count<3){
            System.out.println("Robot need update");
        }


    }
}
