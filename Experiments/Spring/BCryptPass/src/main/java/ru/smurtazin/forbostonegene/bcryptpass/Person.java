package ru.smurtazin.forbostonegene.bcryptpass;

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

	// ==== Mein ====
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
		return pw_hash;
	}

	public void setPw_hash(String plain_password) {
		this.pw_hash = BCrypt.hashpw(plain_password, BCrypt.gensalt());
	}

	boolean isValidPassword(String candidate_password){
		boolean valid = false;
		if (BCrypt.checkpw(candidate_password, this.pw_hash)) {
			valid = true;
		}
		return valid;
	}
}
