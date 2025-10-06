public class Employee {

    int empNumber;
    double payRate;
    final int MAX_EMP_NUMBER = 9999;
    final double MAX_RATE = 60.00;
    final double OVERTIME_RATE = 1.5;

    public Employee(int empNumber, double payRate) {
    
       if (empNumber > MAX_EMP_NUMBER)
           empNumber = MAX_EMP_NUMBER;
       if (payRate > MAX_RATE)
           payRate = MAX_RATE;
       this.empNumber = empNumber;
       this.payRate = payRate;
    }
    public double getRegularPay(double hoursWorked) {
    
        if (hoursWorked <= 40)
            return hoursWorked * payRate;
        else
            return 40 * payRate;
    }
    public double getOvertimePay(double hoursWorked) {
        if (hoursWorked > 40)
            return (hoursWorked - 40) * payRate * OVERTIME_RATE;
        else
            return 0;
    }
} 