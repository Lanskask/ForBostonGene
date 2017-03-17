package hello;

import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.Date;

public class Person {

	@Id private String id;
	private String firstName;
	private String lastName;

	private Date birthday;
	private String email;
	private String pw_hash;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw_hash() {
		return this.pw_hash;
	}

	public void setPw_hash(String pw_hash) {
		this.pw_hash = BCrypt.hashpw(pw_hash, BCrypt.gensalt());
	}
}
