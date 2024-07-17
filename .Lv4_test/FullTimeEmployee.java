package level4.test;

public class FullTimeEmployee implements Employee {

    private double baseSalary; // 기본급
    private double bonus; // 보너스

    public FullTimeEmployee(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() { // 직원의 월급 계산
        return baseSalary + bonus;
    }

    @Override
    public EmployeeType getEmployeeType() { // 직원의 유형을 반환
        return EmployeeType.FULL_TIME;
    }

    @Override
    public String toString() { // 총 출력
        return "FullTimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", employeeType=" + getEmployeeType() +
                '}';
    }
}
