
public class Student {
	int id;
	String name, course;
	int marks[] = new int[3];
	
	public Student(int id, String name, String course, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public int getSid() {
		return this.id;
	}
	public void setSid(int id) {
		this.id = id;
	}
	
	public String getSname() {
		return this.name;
	}
	
	public void setSname(String name) {
		this.name = name;
	}
	
	public String getCourse() {
		return this.course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public int[] getMarks() {
		return this.marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return id + " " + name + " "+ course+" "  + marks[0]+" "+marks[1]+" "+marks[2]+" ";			
	}

	public int total() {
		return this.marks[0]+this.marks[1]+this.marks[2];
	}
	
	public double percentage() {
		return this.total()/3;
	}
	
	public void displayResult(){
		if(this.percentage()>=90)
			System.out.println("First Class");
		else if(this.percentage()>=80&&this.percentage()<=90)
			System.out.println("Second Class");
		else if(this.percentage()<35)
			System.out.println("Fail");
	}

	public static void main(String[] args) {
		int[] marks1 = {95, 98, 97};
		Student ob1 = new Student(101, "Sarthak", " CSE", marks1);
		
		int[] marks2 = {95, 70, 77};
		Student ob2 = new Student(102, "Shubham", " ECE", marks2);
		
		int[] marks3 = {50, 75, 45};
		Student ob3 = new Student(103, "Ronak", " MNC", marks3);
		
		int[] marks4 = {10, 12, 30};
		Student ob4 = new Student(104, "Anil", " CE", marks4);
		System.out.format("%8s %16s %16s %8s %8s %8s", "ID" ,"Name", "Course", "Marks1", "Marks2", "Marks3");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.format("%8d %16s %16s %8d %8d %8d", ob1.id , ob1.name, ob1.course, ob1.marks[0], ob1.marks[1], ob1.marks[2]);
		System.out.println();
		System.out.format("%8d %16s %16s %8d %8d %8d", ob2.id , ob2.name, ob2.course, ob2.marks[0], ob2.marks[1], ob2.marks[2]);
		System.out.println();
		System.out.format("%8d %16s %16s %8d %8d %8d", ob3.id , ob3.name, ob3.course, ob3.marks[0], ob3.marks[1], ob3.marks[2]);
		System.out.println();
		System.out.format("%8d %16s %16s %8d %8d %8d", ob4.id , ob4.name, ob4.course, ob4.marks[0], ob4.marks[1], ob4.marks[2]);
		System.out.println();
	}
}
