public class Employee {
    private double salary;

    public Employee(double s){
        salary = s;
    }
    public void increase(double amount){
        if (amount>0){
        salary = salary + amount;
        }
    }
    public double getPay(){
        return salary;
    }
    
    
}
