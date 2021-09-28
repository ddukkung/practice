package practice0927;
import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

public class Practice02 {
	
	public Practice02() {
		showFrmae();
	}
	
	public void showFrmae() {
		JFrame f = new JFrame("테이블 기초");
		f.setBounds(600, 400, 400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 1. JScrollPane 객체 생성 후 JFrame에 부착
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane);
		
		// 2. JTable 객체 생성 후 JScrollPane의 setViewportView 영역에 부착
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		
		// 3. JTable 데이터 추가
		// 1) DefaultTableModel 객체에 배열 형태로 데이터 추가
		//	  -> 1차원 배열 생성하여 열 제목 저장, 2차원 배열 생성하여 데이터 추가
		//		 2차원 배열의 1개 행 = 1개 레코드(= 여러 개의 컬럼 집합)
		// 	  -> 크기가 불변이므로 데이터가 추가되는 경우 사용이 어려움
//		String[] columnNames = {"번호", "이름", "아이디", "패스워드"}; // 제목
//		String[][] data = { // 데이텨
//				{"1", "홍길동", "hong", "hong123"}, // 레코드
//				{"2", "이순신", "lee", "lee123"}, // 레코드
//				{"3", "홍길동", "hong", "hong123"}, // 레코드
//				{"4", "홍길동", "hong", "hong123"}, // 레코드
//				{"5", "홍길동", "hong", "hong123"}, // 레코드
//		};
//		DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
//		table.setModel(dtm);
		
		
		// 2) DefaultTableModel 객체에 Vector 객체 형태로 데이터 추가
		// 2-1. 제목과 데이터가 한꺼번에 추가되는 경우
		//		-> 데이터가 미리 준비된 상태에서 Model 객체 생성과 테이블에 추가 작업이 수행됨
//		Vector<String> columnNames = new Vector<String>(Arrays.asList("번호", "이름", "아이디", "패스워드")); // 제목
//		Vector data = new Vector();
		
//		// 번호, 이름, 아이디, 패스워드 순으로 데이터를 추가할 Vector 객체를 생성하여
//		// 데이터를 저장한 후 전체 Vector 객체에 1개 레코드 데이터 Vector 객체 추가
//		Vector rowData = new Vector();
//		rowData.add(1); rowData.add("홍길동"); rowData.add("hong"); rowData.add("hong123");
		
//		// 1개 레코드를 전체 Vector에 추가
//		data.add(rowData);
//		
//		// 새로운 Vector 객체를 생성하여 다시 새로운 1개 레코드 저장 후 전체 Vector에 추가
//		rowData = new Vector();
//		rowData.add(2); rowData.add("이순신"); rowData.add("lee"); rowData.add("lee123");
//		data.add(rowData);
//		
//		// 제목이 저장된 Vector 객체와 데이터가 저장된 Vector 객체를 Model 객체에 추가
//		DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
		
//		// Model 객체를 JTable에 추가
//		table.setModel(dtm);
		
		// 2-2. 제목만 추가 후에 1개 레코드씩 데이터 Vector 객체를 별도로 추가하는 경우
		// -> 데이터가 미리 만들어져 있지 않은 상태에서 열 제목만 먼저 추가하고 데이터는 차후에 추가하는 방법
		Vector<String> columnNames = new Vector<String>(Arrays.asList("번호", "이름", "아이디", "패스워드"));
		
		// DefaultTableModel 객체를 생성하여 제목열 Vector 객체를 먼저 추가
		// -> 제목을 표시할 행 번호를 0으로 지정
		DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
		
		// 제목만 저장된 DefaultTableModel 객체를 먼저 테이블에 추가 가능
		table.setModel(dtm);
		
		// 별도로 데이터를 추가하기 위해 Vector 객체를 생성하여
		// 1개 레코드를 저장한 후 DefaultTableModel 객체의 addRow() 메소드를 통해 추가
		// -> 별도의 메소드에서 데이터 추가작업이 이루어져야 할 경우
		//	  DefaultTableModel 객체를 JTable 객체로부터 가져와서 작업을 수행
		//	  -> getModel() 메소드를 통해 Model 객체 형태로 리턴받아 추가작업 수행
		//		 Model -> DefaultTableModel 형변환 필요
		DefaultTableModel myModel = (DefaultTableModel)table.getModel();
		// -> 기존의 제목열 및 추가된 데이터가 있을 경우 그대로 유지됨
		
		Vector rowData = new Vector();
		rowData.add(1); rowData.add("이순신"); rowData.add("lee"); rowData.add("lee123");
		myModel.addRow(rowData);
		
		rowData = new Vector();
		rowData.add(2); rowData.add("홍길동"); rowData.add("hong"); rowData.add("hong123");
		myModel.addRow(rowData);
		
		rowData = new Vector();
		rowData.add(3); rowData.add("이순신"); rowData.add("lee"); rowData.add("lee123");
		myModel.addRow(rowData);
		
		// 새로운 데이터가 추가된 Model 객체를 다시 JTable 객체에 추가
		table.setModel(myModel);
		
		f.setVisible(true);
				
	}

	public static void main(String[] args) {
		
		new Practice02();

	}

}
