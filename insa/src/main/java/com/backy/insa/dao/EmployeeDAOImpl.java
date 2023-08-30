package com.backy.insa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.backy.insa.DBUtil;
import com.backy.insa.EmployeeVO;



public class EmployeeDAOImpl implements EmployeeDAO {
/*
	@Override
	public int insert(EmployeeVO emp1) {
		int result = 0;
		String query = "insert into employees values( ?, ?, ?, ?, ?, ?, ?, sysdate, '00', '00')";
		
		Connection con = null;
		PreparedStatement ps = null;
		System.out.println("여기까지 넘어온 자료" + emp1 );
		con = DBUtil.getConnection();
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, emp1.getEmpNo());
			ps.setString(2, emp1.getEmpName());
			ps.setString(3, emp1.getEmail());
			ps.setString(4, emp1.getBirth());
			ps.setString(5, emp1.getPhoneNo());
			ps.setString(6, emp1.getPostCode());
			ps.setString(7, emp1.getDetailAdd());
			result = ps.executeUpdate();
			} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			DBUtil.rC(ps, con);
		}
		
		return result;
	}

	@Override
	public int getMaxEmpNo() {
		int result = 0;
		String query = "select max(empNo) as maxNum from employees";//실행결과 1행 1열
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				result = rs.getInt("maxNum");//rs에서 정수형 형태로 가져와라 maxNum을 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.rC(rs, ps, con);//닫아준다.
		}
		return result;
	}
*/
	@Override
	public void delAll() {
		  Connection con = null;
	      PreparedStatement ps = null;
	      String query = "delete from employees";
	      con = DBUtil.getConnection();
	      try {
	         ps = con.prepareStatement(query);
	         ps.executeUpdate();
	      } catch (SQLException e) {
	         
	         e.printStackTrace();
	      }finally {
	         DBUtil.rC(ps, con);
	      }
		
	}

	@Override
	public int getCount() {
		int result = 0;
		Connection con = null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      String query = "select count(*) cnt from employees";
	      con = DBUtil.getConnection();
	      try {
	         ps = con.prepareStatement(query);
	         rs = ps.executeQuery();
	         while(rs.next()) {
	        	 result = rs.getInt("cnt");
	         }
	      } catch (SQLException e) {
	         
	         e.printStackTrace();
	      }finally {
	         DBUtil.rC(ps, con);
	      }
		
		return result;
	}

	@Override
	public int insert(EmployeeVO emp1) {
		int result = 0;
		 Connection con = null;
	      PreparedStatement ps = null;
	      String query = "insert into employees values( ?,?,?,?,?,?,?,sysdate,null,null)";
	      con = DBUtil.getConnection();
	      try {
	         ps = con.prepareStatement(query);
	         ps.setInt(1, emp1.getEmpNo());
	         ps.setString(2, emp1.getEmpName());
	         ps.setString(3, emp1.getEmail());
	         ps.setString(4, emp1.getBirth());
	         ps.setString(5, emp1.getPhoneNo());
	         ps.setString(6, emp1.getPostCode());
	         ps.setString(7, emp1.getDetailAdd());
	         result = ps.executeUpdate();
	      } catch (SQLException e) {
	         
	         e.printStackTrace();
	      }finally {
	         DBUtil.rC(ps, con);
	      }
		
		return result;
	}

	@Override
	public int maxEmpNo() {
		int result = 0;
		Connection con = null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      String query = "select max(empNo) from employees";
	      con = DBUtil.getConnection();
	      try {
	         ps = con.prepareStatement(query);
	         rs = ps.executeQuery();
	         while(rs.next()) {
	        	 result = rs.getInt(1);//첫번째 컬럼, 인덱스 써주는 방법 비추천
	         }
	      } catch (SQLException e) {
	         
	         e.printStackTrace();
	      }finally {
	         DBUtil.rC(ps, con);
	      }
		
		return result;
	}

	@Override
	public EmployeeVO getOne(int empNo) {
		EmployeeVO vo = null;
		Connection con = null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      String query = "select * from employees where empNo = ?";
	      con = DBUtil.getConnection();
	      try {
	         ps = con.prepareStatement(query);
	         ps.setInt(1, empNo);
	         rs = ps.executeQuery();
	         while(rs.next()) {
	        	 vo = new EmployeeVO();
	        	 vo.setEmpNo(rs.getInt("empNo"));
	        	 vo.setEmpName(rs.getString("empName"));//rs.getString(2) 인덱스 써주는 방법 비권장
	        	 vo.setEmail(rs.getString("Email"));
	        	 vo.setBirth(rs.getString("Birth"));
	        	 vo.setPhoneNo(rs.getString("PhoneNo"));
	        	 vo.setPostCode(rs.getString("PostCode"));
	        	 vo.setDetailAdd(rs.getString("DetailAdd"));
	        	 vo.setRegidate(rs.getString("Regidate"));
	        	 vo.setDepartCode(rs.getString("DepartCode"));
	        	 vo.setJopCode(rs.getString("JopCode"));
	        	 
	         }
	      } catch (SQLException e) {
	         
	         e.printStackTrace();
	      }finally {
	         DBUtil.rC(ps, con);
	      }
		
		return vo;
	}

}
