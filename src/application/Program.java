package application;


import entities.Product;
import entities.ShoppingCart;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Product p1 = new Product("nikito",2.50,5);
        Product p2 = new Product("Leite",5.50,3);
        Product p3 = new Product("Nescau",9.99,1);
        Product p4 = new Product("Requeijão",5.25,1);
        Product p5 = new Product("Pão doce",0.50,8);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(p1);
        shoppingCart.addProduct(p2);
        shoppingCart.addProduct(p3);
        shoppingCart.addProduct(p4);
        shoppingCart.addProduct(p5);
        System.out.println("total ");
        System.out.print(shoppingCart.totalPurchase());
    }
}
