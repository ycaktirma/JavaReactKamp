
public class User {
	
	private int _id;
	private String _email;
	private String _password;
	private String _name;
	
	public User() {
		System.out.println("A user has been created.");
	}
	

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		this._email = email;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		this._password = password;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}
	
		
}
