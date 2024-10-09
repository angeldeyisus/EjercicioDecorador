/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dominio;

/**
 *
 * @author Chris
 */
public class DemoStarbuzz {

    /**
     * The main method serves as the entry point for the demonstration.
     *
     * @param args Command-line arguments (not used in this demonstration).
     */
    public static void main(String[] args) {
        test();
    }

    /**
     * The test method demonstrates the interaction of various beverage and
     * decorator classes.
     */
    public static void test() {

        Beverage expresso = new Expresso();
        MilkDecorator milkDecorator = new MilkDecorator(expresso, 3);
        Decorator soyDecorator = new Decorator(milkDecorator, 2);
        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(soyDecorator, 2);
        System.out.println(chocolateDecorator);
    }

}
