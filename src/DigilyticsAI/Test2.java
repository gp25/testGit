package DigilyticsAI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

public class Test2 {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();

		list.add(new Person("a", 50));
		list.add(new Person("a", 30));
		list.add(new Person("b", 10));
		list.add(new Person("b", 20));
		list.add(new Person("c", 9));

		List<Person> newList = list.stream().sorted(Comparator.comparingInt(Person::getAge))
				.collect(Collectors.toList());
		List<Person> newListName = list.stream().sorted(Comparator.comparingInt(Person::getAge))
				.sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

//		
//		for (int i = 0; i < newList.size(); i++) {
//			System.out.println(newList.get(i).name + " " + newList.get(i).age);
//		}

		for (int i = 0; i < newListName.size(); i++) {
			System.out.println(newListName.get(i).name + " " + newListName.get(i).age);
		}

	}

}
