// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");

        System.out.println(tim);

        System.out.println("Age ="+ tim.getAge());
        System.out.println("Pay ="+ tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("joe", "11/11/1989", "01/01/2021", 100000);

        System.out.println(joe);
        System.out.println("joe's Paycheck =$"+ joe.collectPay());

        joe.retire();

        System.out.println("joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "12/21/1990",
                "10/01/2021", 15);

        System.out.println(mary);

        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Marys's Holiday Pay = $" + mary.getDoublePay());

    }
}