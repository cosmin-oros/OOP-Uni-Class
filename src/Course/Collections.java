package Course;

class Employee {
    private String surname, name;
    private String department;

    public Employee(String surname, String name, String department) {
        this.surname = surname;
        this.name = name;
        this.department = department;
    }
    public void changeDepartment(String department) {
        this.department = department;
    }
    public String toString() {
        return "Name:" + surname + " Department:" + department;
    }
    public boolean equals(Object o) {
        return (o instanceof Employee) && ((Employee)o).surname.equals(surname)
                && ((Employee)o).name.equals(name);
    }

}

class Accountant extends Employee {
    public Accountant(String surname, String name){
        super(surname, name, "accounting");
    }
}

class Programmer extends Employee {
    public Programmer(String surname, String name){
        super(surname, name, "software development");
    }
}

class Company {
    private String name;
    private Employee[] employees;
    private int nrOfEmployees = 0;

    public Company(String name, int nrOfEmployees){
        this.name = name;
        employees = new Employee[nrOfEmployees];
    }

    public void addEmployee(Employee e){
        if (nrOfEmployees < employees.length){
            employees[nrOfEmployees++] = e;
        }else{
            // we increase the max nr of employees
            Employee[] emps = new Employee[employees.length+10];
            System.arraycopy(employees, 0, emps, 0, employees.length);
            employees = emps;
            employees[nrOfEmployees++] = e;
        }
    }
}

class Collections {
    public static void main(String[] args){
        Employee e1 = new Employee("John", "Ion", "Maths");
        Employee e2 = new Employee("Marc", "Ionescu", "Info");

        e1.changeDepartment("Mathematics");
        System.out.println(e1.toString());
        System.out.println(e2.equals(e1));

        Employee[] e = new Employee[2];
        e[0] = new Accountant("Alex", "Gheorghe");
        e[1] = new Programmer("George", "Georgescu");

        System.out.println(e[0].toString());
        System.out.println(e[1].toString());

        Company google = new Company("google", 1000);
        google.addEmployee(e1);
        google.addEmployee(e2);
    }
}
