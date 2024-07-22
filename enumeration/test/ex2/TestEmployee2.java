package enumeration.test.ex2;

public class TestEmployee2 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(3000, 500);
        Employee contractEmployee = new ContractEmployee(2500);
        Employee internEmployee = new InternEmployee(1500);

        Employee[] employees = {new FullTimeEmployee(3000, 500), new ContractEmployee(2500), new InternEmployee(1500)};

        System.out.println("Full Time Employee Salary: " + employees[EmployeeType.FULL_TIME.ordinal()].calculateSalary());
        System.out.println("Contract Employee Salary: " + contractEmployee.calculateSalary());
        System.out.println("Intern Employee Salary: " + internEmployee.calculateSalary());

        System.out.println();

        System.out.println(fullTimeEmployee.toString());
        System.out.println(contractEmployee.toString());
        System.out.println(internEmployee.toString());
    }
}
