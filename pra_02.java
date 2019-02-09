package pra_2019_02_09;

import pra_2019_02_09.Student;

public class pra_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("せいか", 26, 55, 178,"A1341221", 1, 5.6);
		Student s2 = new Student("服部", 24, 53, 78,"L142114", 2, 7.6);
		s1.Show();
		s2.Show();
		Teacher t1 = new Teacher("Jhon",25, 180, 120 ,"S987654", 30090,5);
		t1.show();
		
		Student[] S1 = new Student[100];
		for(int i=0;i<100;i++)
		{
			S1[i] = new Student("せいか", 27, 43, 160 , i + "", 4 , 5.0);
			S1[i].Show();
			
		}
	}

}
