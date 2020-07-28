public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee obj1 = new Employee();
		obj1.empid = 306;
		obj1.name = "Deepika";
		Employee obj2 = (Employee)obj1.clone();
		obj2.empid = 104;
		obj2.name = "Deepi";
		System.out.println(obj1);
		System.out.println(obj2);
	