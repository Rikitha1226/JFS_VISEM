//One to Many  (One Department → Many Employees)

import java.util.*;
class Employee 
{
    int id;
    String name;
	float salary;
    Employee(int id, String name,float salary) 
	{
        this.id = id;
        this.name = name;
		this.salary = salary;
    }
}

class Department   //(One → Many)
{  
    int deptId;
    String deptName;
    List<Employee> emplst;   // One-to-Many
    Department(int did, String dname, List<Employee> emplst) 
	{
        this.deptId = did;
        this.deptName = dname;
        this.emplst = emplst;
    }
}

public class OneToManyDemo 
{   public static void main(String[] args) 
	{
        Employee e1 = new Employee(1, "Ravi", 12000);
        Employee e2 = new Employee(2, "Anita", 11000);
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        Department dept = new Department(101, "CSE", empList);
        System.out.println("Department: " + dept.deptName);
		float total = 0;
        float high = 0;
        String s = "";
        for (Employee e : dept.emplst) 
		{    System.out.println(e.id + " " + e.name+ " " +e.salary);
			 total = total+e.salary;
             if(e.salary > high)
             {
                high = e.salary;
                s = e.name;
             }
        }
		System.out.println("avg salary:" + (total/dept.emplst.size()));
        System.out.println("Highest paid employee name:" + s);
    }
}
