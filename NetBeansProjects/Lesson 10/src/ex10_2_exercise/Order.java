package ex10_2_exercise;

public class Order {

    // Code the calcDiscount method.
//In the Order class:
//1. Examine the existing code.
//2. Code the calcDiscount method to determine discount for each 
//     custType. 
//     - Nonprofits get a 10% discount if their order is > 900, 
//       otherwise it's 5%
//     - Private types get 7% if order is > 900, otherwise no discount.
//     - Corporate types get 8% if order < 500, otherwise they get 5%.
//     - Use nested and chained if statement
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

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    public void calcDiscount() {
        switch (custType){
        case NONPROFIT:
             discount = (total > 900) ? 10 : 5;
             break;                     
            
        case PRIVATE:
            discount = (total > 900) ? 7.00 : 0.00;                
            break;                          
        case CORP:
            discount = (total < 500) ? 8.00 : 5.00;
                
        }            
        }
    }

