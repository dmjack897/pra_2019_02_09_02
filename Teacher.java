package pra_2019_02_09;

public class Teacher extends Person {
	
	private String teacherID;
	private int monthSalary;
	private int workedTear;
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public int getWorkedTear() {
		return workedTear;
	}
	public void setWorkedTear(int workedTear) {
		this.workedTear = workedTear;
	}
	public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedTear) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.monthSalary = monthSalary;
		this.workedTear = workedTear;
	}

	public void show()
	{
		System.out.println("------------------------");
		System.out.println("교사 이름 " + getName());
		System.out.println("교사 나이 " + getAge());
		System.out.println("교사 키 " + getHeight());
		System.out.println("교사 몸무게 " + getWeight());
		System.out.println("교번 " + getTeacherID());
		System.out.println("교사 월급 " + getMonthSalary());
		System.out.println("교사 연차 " + getWorkedTear());
	
		System.out.println("------------------------");
	}
}
