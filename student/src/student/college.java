package student;

public class college {

	public student stu;
	
	public void setStudent(student st) 
	{
		this.stu=st;
	}
	
	public void displayInformation() {
		System.out.println("College info: ");
		stu.display();
	}
	
}
