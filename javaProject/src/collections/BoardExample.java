package collections;

import java.util.ArrayList;
import java.util.List;

class Board {
	String subject;
	String content;
	String writer;

	Board() {
	}

	Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}

}

public class BoardExample {

	public static void main(String[] args) {
		List<Board> boards = new ArrayList<Board>();
		// boards = new LinkedList<>();
		Board b1 = new Board();
		b1.subject = "test";
		b1.content = "content";
		b1.writer = "user1";
		boards.add(b1);
		// System.out.println("b1 " + b1.toString());

		Board b2 = new Board("java", "very good", "user2");
		Board b3 = new Board("Javascript", "good", "user1");

		boards.add(b1);
		boards.add(b2);
		boards.add(b3);
		boards.add(new Board("javascript", "good", "user1"));

		String searchStr = "java";
		// int index = searchStr.indexOf("java");
		for (int i = 0; i < boards.size(); i++) {
//			if (boards.get(i).subject.equals(searchStr)) {
//				System.out.println(boards.get(i));
//			}
			if (boards.get(i).subject.indexOf("java") == 0) {
				System.out.println(boards.get(i));
			}
			
			if(boards.get(i).subject.toLowerCase().indexOf("java") == 0) {
				System.out.println(boards.get(i));
			}

		}
	}
}
