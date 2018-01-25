package hw_23_01_18.computer_task;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;
    private System_block system_block;
    private Printer printer;

    public Computer() {
        System.out.println("У вас возникла необходимость собрать компьютер? Занесите элементы");
    }

    public Computer(Mouse mouse, Keyboard keyboard, Monitor monitor, System_block system_block, Printer printer) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.system_block = system_block;
        this.printer = printer;
        System.out.println("Компьютер максимально оснащен и собран\n Можно писать, выводить, смотреть, печатать информацию");
    }

    public Computer(Mouse mouse, Keyboard keyboard, Monitor monitor, System_block system_block) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.system_block = system_block;
        System.out.println("Компьютер достаточно оснащен периферийными устройствами, можно писать, просматривать, все подключено и работает");
    }

    public Computer(Mouse mouse, Keyboard keyboard, Monitor monitor, Printer printer) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.printer = printer;
        System.out.println("Есть все детали компа, кроме самой важной - системного блока, невозможно подключить уст-ва");
    }

    public Computer(Mouse mouse, Keyboard keyboard, System_block system_block, Printer printer) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.system_block = system_block;
        this.printer = printer;
        System.out.println("Работать с компьютером наощупь не очень приятно, следует добавить монитор");
    }

    public Computer(Mouse mouse, Monitor monitor, System_block system_block, Printer printer) {
        this.mouse = mouse;
        this.monitor = monitor;
        this.system_block = system_block;
        this.printer = printer;
        System.out.println("Не хватает клавиатуры, можно смотреть и выводить инфу и даже печатать, но не вводить");
    }

    public Computer(Keyboard keyboard, Monitor monitor, System_block system_block, Printer printer) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.system_block = system_block;
        this.printer = printer;
        System.out.println("Без мыши не совсем удобно работать, хотя вполне возможно. Доступны все функции");
    }

    public Computer(Monitor monitor, System_block system_block, Printer printer) {
        this.monitor = monitor;
        this.system_block = system_block;
        this.printer = printer;
        System.out.println("Вам некак работать с информацией, подключите мышь и клавиатуру");
    }
}
