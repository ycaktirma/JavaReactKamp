
public class Main {

	public static void main(String[] args) {
		
		Homework dayThreeHomeworkOne = new Homework();
		dayThreeHomeworkOne.set_id(0);
		dayThreeHomeworkOne.set_title("�dev 1");
		dayThreeHomeworkOne.set_description("A�a��daki oynatma listesini 27-39 aral���nda izleyiniz.(27-39 Dahil) Kendiniz de uygulay�n�z.");
		dayThreeHomeworkOne.set_situation(false);
		
		Homework dayThreeHomeworkTwo = new Homework();
		dayThreeHomeworkTwo.set_id(0);
		dayThreeHomeworkTwo.set_title("�dev 2");
		dayThreeHomeworkTwo.set_description("User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)");
		dayThreeHomeworkTwo.set_situation(false);
		
		Homework[] dayThreeHomeworksEmirhan = new Homework[]
		{
				dayThreeHomeworkOne
		};
		Homework[] dayThreeHomeworksYarkin = new Homework[]
		{
				dayThreeHomeworkTwo
		};
		
		Student yarkin = new Student();
		yarkin.setId(0);
		yarkin.set_name("Yark�n");
		yarkin.setEmail("ycaktirma@gmail.com");
		yarkin.setPassword("123456");
		yarkin.set_homeworkActive(dayThreeHomeworksYarkin);
		
		Student emirhan = new Student();
		emirhan.setId(1);
		emirhan.set_name("Emirhan");
		emirhan.setEmail(null);
		emirhan.setPassword("123321");
		emirhan.set_homeworkActive(dayThreeHomeworksEmirhan);
		
		Instructor enginDemirog = new Instructor();
		enginDemirog.setId(2);
		enginDemirog.set_name("Engin");
		enginDemirog.setEmail(null);
		enginDemirog.setPassword("qwqwqwqw");
		enginDemirog.set_courses(new String[]{"Course 1","Course 2"});
		
		StudentManager studentManager = new StudentManager();
		studentManager.displayHomework(emirhan);
		studentManager.completeHomework(0, emirhan);
		studentManager.displayHomework(emirhan);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.displayCourses(enginDemirog);
		
		studentManager.deleteUser(yarkin);
		
		
	}

}
