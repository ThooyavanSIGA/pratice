package day8_classandObj;

public class CallfromObj {
	String name;
	byte age;
	double height;
	int weight;
	
	void data() {
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		System.out.println("height = " + height);
		System.out.println("weight = " + weight);
	}

	public static void main(String[] args) {
		CallfromObj obj =new CallfromObj();
		CallfromObj obj1= new CallfromObj();
		obj.name="thooyavan";
		obj.age=24;
		obj.height=55.5;
		obj.weight=55;
		
		obj1.name="thooyavan";
		obj1.age=24;
		obj1.height=55.5;
		obj1.weight=55;
	
		obj.data();
		obj1.data();
		
		
		

	}

}
