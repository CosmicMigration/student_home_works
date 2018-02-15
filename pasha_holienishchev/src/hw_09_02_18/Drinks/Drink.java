package hw_09_02_18.Drinks;

import hw_09_02_18.Ingedients.Component;

public class Drink {
    private String name;
    private double price;
    private String componentsList;

    // Добавляем компонент + цену. Представление в виде строки
    public void addComponent(Component component) {
        price += component.getPrice();
        if (componentsList != null) {
            componentsList = componentsList + "\n" + component.getName() + " - " + component.getPrice() + "$";
        } else {
            componentsList = component.getName() + " - " + component.getPrice() + "$";
        }

    }

    public void getDrinkInfo() {
        System.out.println("***Drink Info***");
        System.out.println("Drink: " + name);
        System.out.println("Components:\n" + componentsList);
        System.out.println("Total Price: " + getPrice() + "$");
        System.out.println("****************\n");
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
