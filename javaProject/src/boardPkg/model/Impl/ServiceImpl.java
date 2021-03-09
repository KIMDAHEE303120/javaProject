package boardPkg.model.Impl;

import boardPkg.model.Board;
import boardPkg.model.Service;
import boardPkg.control.BoardDAO;

public class ServiceImpl implements Service { // 구현객체가 변경되면 ..
	BoardDAO dao = new BoardDAO();
	
	
	// 메소드
	@Override
	public Board[] getBoardList() {
		return dao.selectBoards();
	}

	@Override
	public Board getBoard(int boardNo) {
		return dao.selectBoard(boardNo);
	}

	@Override
	public void createBoard(Board board) {
		dao.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		dao.updateBoard(board);
	}

	@Override
	public void removeBoard(Board board) {
		dao.deleteBoard(board);
	}

}
