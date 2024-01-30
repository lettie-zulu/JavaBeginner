
//. Rewrite the calcDiscount code using a switch statement.  
//     Use a ternary expression to replace the nested if logic.
//     For better performance, use a break statement in each case block.
//     Include a default block to handle invalid custType values.
package ex10_3_exercise;


public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    public void calcDiscount() {
       

        switch(custType){
            case NONPROFIT:
                discount = (total > 900)? 10: 5;
                break;
            case PRIVATE:
                discount = (total > 900)? 7 : 0;
                break;
            case (CORP):
                discount = (total < 500)? 8 : 5;
            default:
                System.out.println("invalid cust type");
        }   
    }
}