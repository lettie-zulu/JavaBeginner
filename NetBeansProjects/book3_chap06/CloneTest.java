/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap06;

/**
 *
 * @author letti
 */
public class CloneTest {
    
 public static void main(String[] args) {
        Employee emp1 = new Employee("Martinez", "Anthony");
        emp1.setSalary(40000.0);
        Employee emp2 = (Employee) emp1.clone();
        emp1.setLastName("Smith");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}

class Employee {

    private String lastName;
    private String firstName;
    private double salary;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee emp;
        emp = new Employee(
                this.lastName, this.firstName);
        emp.setSalary(this.salary);
        return emp;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}
