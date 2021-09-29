package practice0927;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

public class Practice03 {
	
	JTable table; // 모든 메소드에서 접근할 수 있도록 전역변수로 선언
	
	public Practice03() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("Table 연습");
		f.setBounds(600, 400, 600, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JTable -> JScrollPane -> JFrame
		// 테이블의 제목열 : "id", "password", "name", "email", "phone", "reg_date"
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		Vector<String> columnNames = new Vector<String>(Arrays.asList("id", "password", "name", "email", "phone", "reg_date"));
		DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
		table.setModel(dtm);
		
		// SOUTH 영역에 조회, 검색, 삭제 버튼 생성 및 부착
		JButton btnSelect = new JButton("조회");
		JButton btnSearch = new JButton("검색");
		JButton btnDelete = new JButton("삭제");
		
		JPanel btnPanel = new JPanel();
		btnPanel.add(btnSelect);
		btnPanel.add(btnSearch);
		btnPanel.add(btnDelete);
		
		f.add(btnPanel, BorderLayout.SOUTH);
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == btnSelect) {
					select();
				} else if(e.getSource() == btnSearch) {
					String id = JOptionPane.showInputDialog(f, "검색할 ID를 입력해주세요.");
					search(id);
				} else if(e.getSource() == btnDelete) {
					String id = JOptionPane.showInputDialog(f, "검색할 ID를 입력해주세요.");
					
					int deleteCount = delete(id);
					
					if(deleteCount > 0) {
						JOptionPane.showMessageDialog(f, "삭제 완료");
					} else {
						JOptionPane.showMessageDialog(f, "존재하지 않는 ID입니다.");
					}
				}
			}
		};
		
		btnSelect.addActionListener(listener);
		btnSearch.addActionListener(listener);
		btnDelete.addActionListener(listener);
		
				
		
		f.setVisible(true);
	}
	
	public void select() {
		// member 테이블에 저장된 데이터를 조회하여
		// Vector 객체에 추가한 후 DefaultTableModel 객체에 추가
		
		// DB 작업에 필요한 문자열 4개 생성
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsp_db7";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 작업 완료");
			
			String sql = "SELECT * FROM member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			// JTable 객체로부터 데이터를 저장할 DefaultTableModel 객체 가져오기
			DefaultTableModel myModel = (DefaultTableModel)table.getModel();
			
			// 주의! SELECT 작업을 중복으로 수행할 경우 기존 DefaultTableModel을 통해 표시된 
			myModel.setRowCount(0);
			
			while(rs.next()) {
				// 1개 레코드를 저장할 Vector 객체 생성
				Vector data = new Vector();
				
				data.add(rs.getString("id"));
				data.add(rs.getString("password"));
				data.add(rs.getString("name"));
				data.add(rs.getString("email"));
				data.add(rs.getString("phone"));
				data.add(rs.getDate("reg_date"));
				
				// 1개 레코드가 저장된 Vector 객체를 DefaultTableModel 객체에 추가
				myModel.addRow(data);
				
			}
			// 추가된 Model 객체를 다시 JTable 객체에 추가
			table.setModel(myModel);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) { try { rs.close(); } catch (Exception e2) { }}
			if(pstmt != null) { try { pstmt.close(); } catch (Exception e2) { }}
			if(con != null) { try { con.close(); } catch (Exception e2) { }}
		}
	}
	
	public void search(String id) {
		
		// DB 작업에 필요한 문자열 4개 생성
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsp_db7";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 1단계. 드라이버 클래스 로드
			Class.forName(driver);
			
			// 2단계. DB 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 완료");
			
			String sql = "SELECT * FROM member WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			DefaultTableModel myModel = (DefaultTableModel)table.getModel();
			
			myModel.setRowCount(0);
			
			if(rs.next()) {
				
				Vector data = new Vector();
				
				data.add(rs.getString("id"));
				data.add(rs.getString("password"));
				data.add(rs.getString("name"));
				data.add(rs.getString("email"));
				data.add(rs.getString("phone"));
				data.add(rs.getDate("reg_date"));
				
				myModel.addRow(data);
			}
			
			table.setModel(myModel);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) { try { rs.close(); } catch (Exception e2) { }}
			if(pstmt != null) { try { pstmt.close(); } catch (Exception e2) { }}
			if(con != null) { try { con.close(); } catch (Exception e2) { }}
		}
		
	}
	
	public int delete(String id) {
		int deleteCount = 0;
		
		// DB 작업에 필요한 문자열 4개 생성
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsp_db7";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1단계. 드라이버 클래스 로드
			Class.forName(driver);
			
			// 2단계. DB 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 완료");
			
			String sql = "DELETE FROM member WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			deleteCount = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) { try { pstmt.close(); } catch (Exception e2) { }}
			if(con != null) { try { con.close(); } catch (Exception e2) { }}
		}
		
		
		return deleteCount;
	}

	public static void main(String[] args) {
		
		new Practice03();

	}

}
