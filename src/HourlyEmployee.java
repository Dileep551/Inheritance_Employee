public class HourlyEmployee extends Employee {

    double hourlyPayRate;

    int hours;



    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double collectPay(){

        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){

        return 2 * collectPay();


    }


}
