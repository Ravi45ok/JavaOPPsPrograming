package Mini_project;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeDB e1 = new EmployeeDB(10);
        e1.insertEmployee(new Employee("Aditya", 1.5, 45000, 5982));
        e1.insertEmployee(new Employee("Ravi", 5.0, 75000, 5968));
        e1.insertEmployee(new Employee("Rohit", 4.5, 35000, 5989));
        e1.insertEmployee(new Employee("Krish", 3.3, 55000, 5987));
        e1.insertEmployee(new Employee("Arayan", 8.9, 55000, 5990));
        e1.insertEmployee(new Employee("Naman", 2.2, 75000, 5991));
        e1.insertEmployee(new Employee("vishal", 1.5, 55000, 5992));
        e1.readEmpDb();
        System.out.println("No of Employees in Db : " + e1.size());
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Id to Search Employee");
        int id = sc.nextInt();
        e1.search_by_id(id);
        System.out.println("Give the Salary to Search Employee");
        double salary = sc.nextDouble();
        e1.search_by_salary(salary);
        System.out.println("Give the Name to Search Employee");
        String name = sc.next();
        e1.search_by_name(name);
        System.out.println("Give the Exp to Search Employee");
        double exp = sc.nextDouble();
        e1.search_by_exp(exp);
        System.out.println("Give the index which you wants to Delete");
        int index = sc.nextInt();
        e1.deleteEmployee(index);
        System.out.println("After Employee deletion new Database will Look like this");
        e1.readEmpDb();
        System.out.println("No of Employees in Db After deletion : " + e1.size());
        int idFordelete = sc.nextInt();
        e1.deleteEmployeeById(idFordelete);
        e1.readEmpDb();
        System.out.println("No of Employees in Db After deletion : " + e1.size());
        int idForUpdate = sc.nextInt();
        e1.UpdateById(idForUpdate, "vikash", 7, 68000);
        e1.readEmpDb();
        System.out.println("No of Employees in Db After updation : " + e1.size());
        sc.close();
    }
}
