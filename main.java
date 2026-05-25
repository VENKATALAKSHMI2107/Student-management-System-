import java.util.ArrayList;
import java.util.Scanner;
class Employee 
{
	int empId;
	String empName;
	double salary;
	Employee(int empId,String empName,double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public  void displayEmployee (){
		System.out.println("empID:"+empId);
		System.out.println("empName:"+empName);
		System.out.println("salary:"+salary);
		System.out.println("----------------------");
	}
}
public class main
{
public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	ArrayList<Employee> employees=new ArrayList<>();
	while(true){
	System.out.println("\n1.Add Student");
	System.out.println("\n2.Display Student");
	System.out.println("\n3.exit");
		
	System.out.println("enter your choice");
	
	int option=sc.nextInt();
	switch(option){
		case 1:System.out.print("Enter ID: ");
                    int empId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String empName = sc.nextLine();

                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();

                    Employee e=new Employee(empId,empName,salary);
					employees.add(e);
					
					System.out.println("Student details added successfully");
					
					break;
					case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employee found.");
                    } else {
                        for (Employee s : employees) {
                            s.displayEmployee();
                        }
                    }
                    break;
					case 3:
					System.out.println("exiting.....");
					System.exit(0);
	default:
	System.out.println("in valid  option");
	}
	}
					
	
	}
}
