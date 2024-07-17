package level4.test;

public class InternEmployee implements Employee{

    private double baseSalary; // 기본급

    public InternEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() { // 직원의 월급 계산
        return baseSalary;
    }

    @Override
    public EmployeeType getEmployeeType() { // 직원의 유형을 반환
        return EmployeeType.INTERN;
    }

    @Override
    public String toString() { // 총 출력
        return "InternEmployee{" +
                "baseSalary=" + baseSalary +
                ", employeeType=" + getEmployeeType() +
                '}';
    }
}
