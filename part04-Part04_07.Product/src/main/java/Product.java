/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mpnis
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String initialname, double initialprice, int initialquantity){
        this.name = initialname;
        this.price = initialprice;
        this.quantity = initialquantity;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", " + this.price + ", " + this.quantity);
    }
}
