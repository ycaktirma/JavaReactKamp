
public class StudentManager extends UserManager{
	
	@Override
	public void deleteUser(User user) {
		System.out.println( user.get_name() +" the student has been deleted.");
	}
	
	public void completeHomework(int homeworkId, Student student) {
		
		Homework[] homeworks = student.get_homeworkActive();
		for(Homework homework:homeworks) {
			if(homeworkId == homework.get_id()) {
				homework.set_situation(true);
				System.out.println("DEBUG:"+homework.is_situation()+homework.get_title());
			}
		}
		student.set_homeworkActive(homeworks);
		System.out.println(student.get_name() + " completed a homework.");
	}
	
	public void displayHomework(Student student) {
		
		System.out.println("Homeworks of "+student.get_name());
		Homework[] homeworks = student.get_homeworkActive();
		for(Homework homework:homeworks) {
			System.out.println(homework.get_title() + " : "+ homework.is_situation());
		}
		System.out.println("===========================");
	}
}
