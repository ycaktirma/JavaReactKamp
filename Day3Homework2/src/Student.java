
public class Student extends User{
	
	
	private Homework[] _homeworkActive;
	
	public Student() {
		super();
	}

	public Homework[] get_homeworkActive() {
		return _homeworkActive;
	}

	public void set_homeworkActive(Homework[] _homework) {
		this._homeworkActive = _homework;
	}

	
	
	
}
