import java.util.Random;

public class FaveSubject {
	private Random r = new Random();
	private String Subject;
	private String student;

	public FaveSubject(String student) {
		this.student = student;
		int rSubject = r.nextInt(3);
		if (rSubject == 0) {
			Subject = "English";
		} else if (rSubject == 1) {
			Subject = "History";
		} else {
			Subject = "Science";
		}

	}

	public String getStudent() {
		return student;
	}

	public String getSubject() {
		return Subject;
	}
}