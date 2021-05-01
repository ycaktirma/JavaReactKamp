
public class Main {

	public static void main(String[] args) {
		
		Homework dayTwoHomeworkOne = new Homework();
		dayTwoHomeworkOne.set_id(0);
		dayTwoHomeworkOne.set_title("Ödev 1");
		dayTwoHomeworkOne.set_description("Aþaðýdaki oynatma listesini 27-39 aralýðýnda izleyiniz.(27-39 Dahil) Kendiniz de uygulayýnýz.");
		dayTwoHomeworkOne.set_situation(false);
		
		Homework dayTwoHomeworkTwo = new Homework();
		dayTwoHomeworkTwo.set_id(0);
		dayTwoHomeworkTwo.set_title("Ödev 2");
		dayTwoHomeworkTwo.set_description("User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)");
		dayTwoHomeworkTwo.set_situation(false);
		
		Homework[] dayThreeHomeworksEmirhan = new Homework[]
		{
			dayTwoHomeworkOne
		};
		Homework[] dayThreeHomeworksYarkin = new Homework[]
		{
			dayTwoHomeworkTwo
		};
		
		
		Student yarkin = new Student();
		yarkin.setId(0);
		yarkin.set_name("Yarkýn");
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
