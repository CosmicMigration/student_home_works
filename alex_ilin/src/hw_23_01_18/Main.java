package hw_23_01_18;

import hw_23_01_18.computer_task.*;
import hw_23_01_18.robot_task.*;

import javax.xml.transform.Source;

public class Main {
    //Todo
    //Добавить каждому компоненту его специфическое поведение. Н-д: CD-Rom  может читать а может еще и записывать диски.
    //эта часть не выполнена
    public static void main(String[] args) {
        robot();
        computer();
    }

    public static void robot(){
        Leg leg = new Leg();
        Head head = new Head();
        Arm arm = new Arm();
        Body corpus= new Body();

        System.out.println("Цех по производству роботов.\nОтчет:");
        Robot Robot_v1 = new Robot(head, leg, leg, arm, arm, corpus);
        System.out.println("\nБракованные роботы:\n");
        Robot Robot_v2 = new Robot(head,  leg, arm, arm, corpus);
        System.out.println();
        Robot Robot_v3 = new Robot(leg, head, arm, arm, corpus);
        System.out.println();
        Robot Robot_v4 = new Robot(leg, leg, arm, arm, corpus);
        System.out.println();
        Robot Robot_v5 = new Robot(head, leg, leg, arm, corpus);
        System.out.println();
        Robot Robot_v6 = new Robot(head, leg, leg, arm, arm);
        System.out.println();
        Robot Robot_v7 = new Robot( leg, leg,head, corpus);
        System.out.println();
        Robot Robot_v8 = new Robot(head, arm, arm, corpus);
        System.out.println();
        Robot Robot_v9 = new Robot( leg, leg, head, arm, corpus);
        System.out.println();
        Robot Robot_v10 = new Robot( leg, leg, arm, arm);
        System.out.println();
        Robot Robot_v11 = new Robot(corpus);
        System.out.println("");
    }
    public static void computer(){
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Printer printer = new Printer();
        System_block system_block = new System_block();

        System.out.println("\nЦех сборки компьютеров.\nСбор информации");
        System.out.println("\nФункционирующие компьютеры\n");
        Computer computer_v1 = new Computer(mouse, keyboard, monitor, system_block, printer);
        System.out.println("");
        Computer computer_v2 = new Computer(keyboard, monitor, system_block, printer);
        System.out.println("");
        Computer computer_v3 = new Computer(mouse, keyboard, monitor, system_block);
        System.out.println("\nКомпьютеры требующие доработки\n");
        Computer computer_v4 = new Computer(mouse, keyboard, monitor, printer);
        System.out.println("");
        Computer computer_v5 = new Computer(mouse, keyboard, system_block, printer);
        System.out.println("");
        Computer computer_v6 = new Computer(mouse, monitor, system_block, printer);
        System.out.println("");
        Computer computer_v7 = new Computer( monitor, system_block, printer);

    }
}
