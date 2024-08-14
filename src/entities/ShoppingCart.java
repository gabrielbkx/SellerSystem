package entities;

import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {

    private List<Product> product = new ArrayList<>();

    public ShoppingCart() {
    }

    public ShoppingCart(List<Product> producs) {
        this.product = product;
    }

    public void addProduct(Product p){
        product.add(p);
    }
    public void removeProduct(Product p){
        product.remove(p);
    }

    public Double totalPurchase(){
       double sum = 0;

       for (Product p : product){
           sum += p.getPrice() * p.getQuantity();
       }
       return sum;
    }
}
