package pra_2019_02_09;

public class Student extends Person{
	
	private String studentID;
	private int grade;
	private double GPA;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void Show()
	{
		System.out.println("------------------------");
		System.out.println("学生の名前 " + getName());
		System.out.println("学生の歳 " + getAge());
		System.out.println("学生の身長 " + getHeight());
		System.out.println("学生の体重 " + getWeight());
		System.out.println("クラス " + getGrade());
		System.out.println("学生番号 " + getGPA());
		System.out.println("------------------------");
	}
}
