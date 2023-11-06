// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        SalariedEmployee emp = new SalariedEmployee("Matt", "12-21-1990",
//                "12-31-2024", 146508, "10-04-2021", 100000, true);



        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");

        System.out.println(tim);

        System.out.println("Age ="+ tim.getAge());
        System.out.println("Pay ="+ tim.collectPay());

        SalariedEmployee matt = new SalariedEmployee("Matt", "11/11/1989", "01/01/2021", 100000);

        System.out.println(matt);
        System.out.println("Matt's Paycheck =$"+ matt.collectPay());

        matt.retire();

        System.out.println("Matt's Pension check = $" + matt.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "12/21/1990",
                "10/01/2021", 15);

        System.out.println(mary);

        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Marys's Holiday Pay = $" + mary.getDoublePay());

    }
}