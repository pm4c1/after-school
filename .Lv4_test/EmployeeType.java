package level4.test;

public enum EmployeeType {
    // enum 클래스
    FULL_TIME(1.0),
    CONTRACT(0.8),
    INTERN(0.5);

    private double multiSalary;

    EmployeeType(double multiSalary) {
        this.multiSalary = multiSalary;
    }

    public double getMultiSalary() {
        return multiSalary;
    }
}
