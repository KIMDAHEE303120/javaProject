package api;

public class User {

	String userId;
	int score;

	@Override
	public int hashCode() {
		// return super.hashCode();
		return score; //score가 같으면 같은 hashCode
	}

	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		User u = (User) obj;
		return this.userId.equals(u.userId);
		
	}

}
