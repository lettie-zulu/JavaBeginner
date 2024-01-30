
package ex10_3_exercise;

//Run the ShoppingCart class again to test your logic.
/**
 *
 * @author Letti
 */
public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
