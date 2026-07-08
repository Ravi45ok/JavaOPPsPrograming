package Mini_project;

public class EmployeeDB {
    private int dbCapacity;
    private Employee emp[];
    private int index = 0;

    public EmployeeDB(int dbCapacity) {
        this.dbCapacity = dbCapacity;
        this.emp = new Employee[dbCapacity];
    }

    void insertEmployee(Employee e) {
        if (index < dbCapacity) {
            emp[index] = e;
            index++;
            System.out.println("Employee has been added");
        } else {
            System.out.println("Insufficent Capacity");
        }
    }

    public void readEmpDb() {
        System.out.println("name" + "\t" + "company" + "\t" + "salary" + "\t" + "id");
        System.out.println("-----------------------------");
        if (emp != null) {
            for (int i = 0; i < emp.length; i++) {
                if (emp[i] != null) {
                    emp[i].displayEmployee();
                }
            }
        }
    }

    public void search_by_id(int id) {
        int count = 0;
        int i = 0;
        while (emp[i] != null) {
            if (id == emp[i].id) {
                emp[i].displayEmployee();
                count++;
                break;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("Invalid Id");
        }
    }

    public void search_by_salary(double salary) {

        int count = 0;
        int i = 0;
        while (emp[i] != null) {
            if (salary == emp[i].salary) {
                emp[i].displayEmployee();
                count++;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("No employee exist with this salary");
        }
    }

    public void search_by_name(String name) {
        int count = 0;
        int i = 0;
        while (emp[i] != null) {
            if (name.equalsIgnoreCase(emp[i].name)) {
                emp[i].displayEmployee();
                count++;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("No employee exist with this Name");
        }
    }

    public void search_by_exp(double exp) {
        int count = 0;
        int i = 0;
        while (emp[i] != null) {
            if (exp == emp[i].exp) {
                emp[i].displayEmployee();
                count++;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("No employee exist with this Exp");
        }
    }

    void deleteEmployee(int index) {
        if (index < size() && index >= 0) {
            int i = index;
            while (emp[i + 1] != null) {
                emp[i] = emp[i + 1];
                i++;
            }
            emp[i] = null;
            this.index = this.index - 1;
        } else {
            System.out.println("Give correct Index");
        }
    }

    void deleteEmployeeById(int id) {
        int i = 0;
        boolean flag = true;
        while (i < size()) {
            if (emp[i].id == id) {
                flag = false;
                int j = i;
                while (emp[j + 1] != null) {
                    emp[j] = emp[j + 1];
                    j++;
                }
                emp[j] = null;
                this.index = this.index - 1;
            }
            i++;
        }
        if (flag) {
            System.out.println("No Employee exist with Such id");
        }

    }
    void UpdateById(int id , String name, double exp, double salary){
        int i=0;
        boolean flag = true
        ;
        while (i<size()) {
              if (emp[i].id == id){
                flag = false;
                emp[i].name =name;
                emp[i].exp=exp;
                emp[i].salary =salary;
              }
              i++;
        }
        if(flag){
            System.out.println("No Employee exist with Such id");
        }
    }

    public int size() {
        return index;
    }
}