package boardPkg.model;

public interface Service {

	// 메소드
	public Board[] getBoardList(); // 전체목록

	public Board getBoard(int boardNo); // 한건조회

	public void createBoard(Board board);// 게시글 작성

	public void modifyBoard(Board board);// 게시글 수정

	public void removeBoard(Board board);// 게시글 삭제

}
