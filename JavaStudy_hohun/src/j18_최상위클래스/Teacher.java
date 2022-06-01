package j18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스)
 * 
 */

public class Teacher /*extends Object 생략되어 있다.*/ {
	
	private String name;
	private String subject;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	
	
	
	
	

}
