package cna.nl.ca.quintin.java1.Assignment1.InClassExamples;

import java.util.Scanner;

public class FunWithEmployee {

    public static void main(String[] args) {

        System.out.println("Fun With Employees.");

        double salaryTotal = 0.0;

        int employeeCounter = 0;

        final int NUM_EMPLOYEES = 3;

        Scanner input = new Scanner(System.in);

        // one constructor outside loop works for this example where we only care about salary to add to total
        Employee employee = new Employee("", "", 0.0);

        while (employeeCounter < NUM_EMPLOYEES){

            System.out.println("Enter employee first name: ");
            String firstName = input.next();
            employee.setFirstName(firstName);

            System.out.println("Enter employee last name: ");
            String lastName = input.next();
            employee.setLastName(lastName);

            System.out.println("Enter employee salary: ");
            double salary = input.nextDouble();
            employee.setSalary(salary);

            employee.giveRaise(0.08);

            System.out.printf("""
                    Employee first name: %s\s
                    Employee last name: %s\s
                    Employee new salary: $%,.2f\s

                    """, employee.getFirstName(), employee.getLastName(), employee.getSalary());

            salaryTotal += employee.getSalary();

            employeeCounter++;

        }

        double salaryAverage = salaryTotal / NUM_EMPLOYEES;

        System.out.printf("Average salary of employees: $%,.2f\n",salaryAverage);

    }
}
