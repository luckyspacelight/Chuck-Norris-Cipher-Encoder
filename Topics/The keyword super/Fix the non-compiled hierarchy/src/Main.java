class Employee {

    protected String name;
    protected String birthDate;

    public Employee(String name, String birthDate) {
        super.name = name;
        super.birthDate = birthDate;
    }
}

class RegularEmployee extends Employee {

    protected long salary;
    protected String hireDate;

    public RegularEmployee(String name, String birthDate, long salary, String hireDate) {
        this(name, birthDate);
        super.salary = salary;
        this.hireDate = hireDate;
    }
}

class ContractEmployee extends Employee {

    protected long payPerHour;
    protected String contractPeriod;

    public ContractEmployee(String name, String birthDate, long payPerHour, String contractPeriod) {
        this.payPerHour = payPerHour;
        super.contractPeriod = contractPeriod;
    }
}