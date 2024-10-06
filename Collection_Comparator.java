package Collection_PracticeIMP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 7. Custom Sorting: Write a program to sort a list
  of `Employee` objects (with fields `name`, `age`)
   based on age using `Comparator`.
 */

class employee
{
	private String name;
	private int age;
	private String salary;
	private String position;
	public employee(String name, int age, String salary, String position) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", age=" + age + ", salary=" + salary + ", position=" + position + "]";
	}
	
	
}
class checkName implements Comparator<employee>
{

	@Override
	public int compare(employee o1, employee o2) {
		
		if(o1.getAge()>(o2.getAge()))
		{
			return 1;
		}
		else if(o2.getAge()>(o1.getAge()))
		{
			return -1;
		}
		return 0;
	}
	
}
public class Collection_Comparator {
	
	public static void main(String[] args) {
		
		employee e=new employee("harsh",22,"30000","java Developer");
		employee e1=new employee("Aditya",21,"30000","java Developer");
		employee e2=new employee("sangram",20,"30000","java Developer");
		employee e3=new employee("omkar",24,"30000","java Developer");
		
		List<employee>al=new ArrayList<employee>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Collections.sort(al,new checkName());
		
		for(employee l:al)
		{
			System.out.println(l.getName()+" "+l.getAge()+" "+l.getSalary()+" "+l.getPosition());
		}

		
	
		
	}

}
