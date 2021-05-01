
public class InstructorManager extends UserManager{
	
	@Override
	public void deleteUser(User user) {
		System.out.println( user.get_name() +" the instructor has been deleted.");
	}
	
	public void displayCourses(Instructor instructor) {
		String[] courses = instructor.get_courses();
		System.out.println("Courses of "+instructor.get_name()+":");
		for(String course:courses) {
			System.out.println(course);
		}
		System.out.println("===========================");
	}
}
