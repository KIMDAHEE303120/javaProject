package com.yedam.diary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//인터페이스를 구현하는,,,2

//날짜, 내용
//테이블
//접속계정 만들어서 사용 id, pw: diary
public class DiaryOracleDAO implements DAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} // end of DiaryOracleDAO()

//
//	// Map을 이용해서 diary 가져오기
//	public Map<String, String> getDiaryList() {
//		String sql = "Select * from diary";
//		Statement stmt = null;
//		ResultSet rs = null;
//		Map<String, String> map = new HashMap<>();
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				map.put(rs.getString("dates"), rs.getString("contents"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.close(rs, stmt, conn);
//		}
//		return map;
//	} // end of map

	@Override
	public int insert(DiaryVO vo) {
		conn = DBcon.getConnection();
		sql = "insert into diary (dates, contents) values(" + vo.getWdate() + ", '" + vo.getContents() + "')";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			return r;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}

	@Override
	public void update(DiaryVO vo) {
//		conn = DBcon.getConnection();
//		sql = "update diary set content = '"

	}

	@Override
	public int delete(String date) {
		conn = DBcon.getConnection();
		sql = "delete from diary where dates = " + date;
		try {
			stmt = conn.createStatement();
			stmt.executeQuery(sql);
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}

	@Override
	public DiaryVO selectDate(String date) {
		sql = "select * from diary where dates = " + date;
		conn = DBcon.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setWdate(rs.getString("dates"));
				vo.setContents(rs.getString("contents"));
				return vo;
			}
		} catch (SQLException e) {
			// e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		sql = "select * from diary where contents like = '%" + content + "%'";
		conn = DBcon.getConnection();
		List<DiaryVO> selectContent = new ArrayList<DiaryVO>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setWdate(rs.getString("dates"));
				vo.setContents(rs.getString("contents"));
				selectContent.add(vo);
			}			
		} catch (SQLException e) {
			//e.printStackTrace();
		}		
		return null;
	}

	@Override
	public List<DiaryVO> selectAll() {
		sql = "select * from diary";
		conn = DBcon.getConnection();

		List<DiaryVO> selectAll = new ArrayList<DiaryVO>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setWdate(rs.getString("dates"));
				vo.setContents(rs.getString("contents"));
				selectAll.add(vo);
			}
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("조회처리중에 에러가 발생했습니다.");
		} finally {
			close();
		}
		return selectAll;
	}

}
