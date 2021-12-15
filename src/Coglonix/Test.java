package Coglonix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	static class Employee{
		int id;
		String firstname;
		String lastname;
		int salary;
		
		Employee(int id,String firstname,String lastname,int salary){
			this.id=id;
			this.firstname=firstname;
			this.lastname=lastname;
			this.salary=salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		
	}

	public static void main(String[] args) {
		Employee emp1=new Employee(1, "abc", "bca", 100);
		Employee emp2=new Employee(2, "vgy", "cba", 200);
		Employee emp3=new Employee(3, "jih", "abc", 300);
		List<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		Function<Employee, String> first=Employee::getFirstname;
		Function<Employee, String> last=Employee::getLastname;
		
		Comparator<Employee> lastfirst=Comparator.comparing(last).thenComparing(first);
		List<Employee> newList=list.stream().sorted(lastfirst).collect(Collectors.toList());
		for(int i=0;i<newList.size();i++) {
			System.out.println(newList.get(i).id+" "+newList.get(i).getFirstname()+" "+newList.get(i).lastname);
			
		}
	}

}
