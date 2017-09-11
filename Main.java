import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup sg=new StudentGroup(10);

	Date date=new Date(1997,6,29);
	Student s=new Student(503,"vinay",date,63.0);

                sg.addFirst(s);

              System.out.println(sg.getStudent(0).getId());






	}

}
