package dbEX;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.sql.*;


public class DataBase extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JMenuBar bar;
	private JMenu menu_conn, menu_table;
	private JMenuItem conn, disconn, table1, table2,table3;
	private JLabel lb_username,lb_tablename;
	private JTextArea log;
	JScrollPane scrollPane;

	fr_in insert_fr;
	String colname []={"이름","사번","호봉","급여"};
	String data [][]= {
			{ "asdf", "s" },
			{"sd","d"}
	};
	String tmp[] = new String[4];

	// main	
	public static void main(String[] args) {

		try {
			DataBase frame = new DataBase();
			frame.setTitle("5조 박치수,이진오,정민석,최혁재");
			frame.setVisible(true);

		} catch (Exception e) {
			//e.printStackTrace();

		}
	}


	public DataBase() {
		/*
		 * 
		 * frame design
		 * 
		 * */		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		//table comlum name 설정
		//String colname [] = {"이름","사번","호봉","급여"};
		colname[0]="이름";
		colname[1]="사번";
		colname[2]="호봉";
		colname[3]="이름";



		model = new DefaultTableModel();//data,colname);

		table = new JTable(model);
		scrollPane.setViewportView(table);

		log = new JTextArea();
		JScrollPane scrolldata = new JScrollPane();
		contentPane.add(scrolldata, BorderLayout.SOUTH);
		scrolldata.setViewportView(log);


		//동쪽 버튼 패널, 그리드레이아웃
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		JButton btn_insert = new JButton("추가");
		panel.add(btn_insert);
		JButton btn_delete = new JButton("삭제");
		panel.add(btn_delete);
		JButton btn_refresh = new JButton("새로고침");
		panel.add(btn_refresh);
		JButton btn_transaction1 = new JButton("transaction1");
		btn_transaction1.setToolTipText("개발부서의 급여가 60만원 초과인 직원 정보(이름, 부서, 입사일, 근태정보)");
		panel.add(btn_transaction1);
		JButton btn_transaction2 = new JButton("transaction2");
		btn_transaction2.setToolTipText("부장이면서 호봉 2년차인 직원의 월급수령액");
		panel.add(btn_transaction2);
		JButton btn_transaction3 = new JButton("transaction3");
		btn_transaction3.setToolTipText("직급이 대리이면서 호봉이 2년차인 직원의 추가 수당");
		panel.add(btn_transaction3);
		JButton btn_transaction4 = new JButton("transaction4");
		btn_transaction4.setToolTipText("대리직급의 2014-11-01 일의 월급");
		panel.add(btn_transaction4);

		//버튼 액션 리스너
		btn_insert.addActionListener(this);
		btn_refresh.addActionListener(this);
		btn_delete.addActionListener(this);
		btn_transaction1.addActionListener(this);
		btn_transaction2.addActionListener(this);
		btn_transaction3.addActionListener(this);
		btn_transaction4.addActionListener(this);
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);


		//북쪽 메뉴
		bar = new JMenuBar();
		menu_conn = new JMenu("연결");
		menu_table = new JMenu("테이블");

		conn = new JMenuItem("연결");
		disconn = new JMenuItem("연결끊기");
		table1 = new JMenuItem("테이블1");
		table2 = new JMenuItem("테이블2");
		table3 = new JMenuItem("테이블3");
		JLabel lb_name = new JLabel("   이름 : ");
		JLabel lb_table = new JLabel("   테이블: ");
		lb_username = new JLabel("       ");
		lb_tablename = new JLabel("        ");
		panel_1.add(bar);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		bar.add(menu_conn);
		bar.add(menu_table);
		bar.add(lb_name);
		bar.add(lb_username);
		bar.add(lb_table);
		bar.add(lb_tablename);
		menu_conn.add(conn);
		menu_conn.add(disconn);
		menu_table.add(table1);
		menu_table.add(table2);
		menu_table.add(table3);

		table1.addActionListener(this);
		table2.addActionListener(this);
		table3.addActionListener(this);
		conn.addActionListener(this);
		disconn.addActionListener(this);



	}

	/*
	 * database 관련 전역 변수
	 * 
	 * */
	Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rsMetaData;

	String is_table_name;
	String colname_table1 [];

	/*
	 * actionlistener
	 * 
	 * */

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//연결
		try{
		if(e.getActionCommand().equals("연결")){
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url="jdbc:oracle:thin:@localhost:1521:xe";

				String user="scott";
				String pwd="tiger";
				con=DriverManager.getConnection(url,user,pwd);
				st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			}catch(Exception conn){
				log.append(" [연결 문제 발생!!] ");
				System.out.println("연결 문제 발생!!");
			};  
			log.append(" [DB 연결 성공] ");
			System.out.println("DB 연결 성공");
		}
		//연결끊기
		if(e.getActionCommand().equals("연결끊기")){
			try{
				rs.close();
			}catch(Exception re_e){
				log.append(" [데이터검색 실시안함!!] ");
				System.out.println("데이터검색 실시안함");
			}
			try{
				st.close();
				con.close();
				log.append(" [정상 연결 종료] ");
				System.out.println("연결 종료");
			}catch(Exception dis){
				log.append(" [종료문제발생!!] ");
				System.out.println("종료문제발생!!");
			};
		}

		//추가
		if(e.getActionCommand().equals("추가")){
			insert_fr = new fr_in(colname_table1);
			insert_fr.setVisible(true);
		}
		//삭제
		if(e.getActionCommand().equals("삭제")){
			String sql;
			try{
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				System.out.println(model.getRowCount());

				if(is_table_name == "payment"){
					String columlabel = rsMetaData.getColumnLabel(2);
//					System.out.println(columlabel);

					sql="delete from "+ is_table_name + " where "+columlabel+" = '"+table.getValueAt(table.getSelectedRow(), 1)+"'";
					st.executeUpdate(sql);

				}
				if(is_table_name == "employee"){
					String columlabel = rsMetaData.getColumnLabel(1);
//					System.out.println(columlabel);

					sql="delete from "+ is_table_name + " where "+columlabel+" = '"+table.getValueAt(table.getSelectedRow(), 0)+"'";
					st.executeUpdate(sql);
				}
				if(is_table_name == "deligence_lazy"){
					String columlabel = rsMetaData.getColumnLabel(2);
//					System.out.println(columlabel);

					sql="delete from "+ is_table_name + " where "+columlabel+" = '"+table.getValueAt(table.getSelectedRow(), 1)+"'";
					st.executeUpdate(sql);
				}
				model.removeRow(table.getSelectedRow());
			}catch(Exception ex){
				System.out.println("삭제 에러!!");
			}
		}
		if(e.getActionCommand().equals("새로고침")){
			if(is_table_name.equals("payment")){
				try{
					is_table_name = "payment";
					String sql="select * from "+is_table_name;
					rs=st.executeQuery(sql);

					rsMetaData = rs.getMetaData();
					lb_username.setText("park");
					lb_tablename.setText(is_table_name);
					//				System.out.println(rsMetaData.getColumnLabel(2));
					//				System.out.println(rsMetaData.getColumnName(2));
					colname_table1  = new String[rsMetaData.getColumnCount()];
					for(int i = 1;i<=rsMetaData.getColumnCount();i++){
						colname_table1[i-1]=rsMetaData.getColumnLabel(i);
					}

					//행 수 세기
					int rowcount=0;
					while(rs.next()){
						rowcount++;
					}rs.first();
					//		System.out.println("테이블1 행수"+rowcount);

					String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

					for (int i = 1;i<=rowcount;i++){
						for (int j = 1; j<=rsMetaData.getColumnCount();j++){
							table1_data[i-1][j-1] = rs.getString(j);
							System.out.println(table1_data[i-1][j-1]);
						}
						rs.next();
					}

					model = new DefaultTableModel(table1_data,colname_table1);
					table = new JTable(model);
					scrollPane.setViewportView(table);

					
				}catch(Exception sel){
					log.append("연결 문제 발생!!");
					System.out.println("선택 문제");
				};

			}
			if(is_table_name.equals("employee")){
				is_table_name = "employee";
				lb_username.setText("park");
				lb_tablename.setText(is_table_name);
				try{
					String sql="select * from "+is_table_name;
					rs=st.executeQuery(sql);

					ResultSetMetaData rsMetaData = rs.getMetaData();
					lb_username.setText("park");
					lb_tablename.setText("payment");
					//				System.out.println(rsMetaData.getColumnLabel(2));
					//				System.out.println(rsMetaData.getColumnName(2));
					colname_table1 = new String[rsMetaData.getColumnCount()];
					for(int i = 1;i<=rsMetaData.getColumnCount();i++){
						colname_table1[i-1]=rsMetaData.getColumnLabel(i);
					}

					//행 수 세기
					int rowcount=0;
					while(rs.next()){
						rowcount++;
					}rs.first();
					//		System.out.println("테이블1 행수"+rowcount);

					String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

					for (int i = 1;i<=rowcount;i++){
						for (int j = 1; j<=rsMetaData.getColumnCount();j++){
							table1_data[i-1][j-1] = rs.getString(j);
							System.out.println(table1_data[i-1][j-1]);
						}
						rs.next();
					}

					model = new DefaultTableModel(table1_data,colname_table1);
					table = new JTable(model);
					scrollPane.setViewportView(table);

					
				}catch(Exception sel){
					log.append("연결 문제 발생!!");
					System.out.println("선택 문제");
				};
			}
			if(is_table_name.equals("delegence_lazy")){
				is_table_name = "deligence_lazy";
				lb_username.setText("park");
				lb_tablename.setText(is_table_name);
				try{
					String sql="select * from "+is_table_name;
					rs=st.executeQuery(sql);

					ResultSetMetaData rsMetaData = rs.getMetaData();
					lb_username.setText("park");
					lb_tablename.setText("deligence_lazy");
					//				System.out.println(rsMetaData.getColumnLabel(2));
					//				System.out.println(rsMetaData.getColumnName(2));
					colname_table1 = new String[rsMetaData.getColumnCount()];
					for(int i = 1;i<=rsMetaData.getColumnCount();i++){
						colname_table1[i-1]=rsMetaData.getColumnLabel(i);
					}

					//행 수 세기
					int rowcount=0;
					while(rs.next()){
						rowcount++;
					}rs.first();
					//		System.out.println("테이블1 행수"+rowcount);

					String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

					for (int i = 1;i<=rowcount;i++){
						for (int j = 1; j<=rsMetaData.getColumnCount();j++){
							table1_data[i-1][j-1] = rs.getString(j);
							System.out.println(table1_data[i-1][j-1]);
						}
						rs.next();
					}

					model = new DefaultTableModel(table1_data,colname_table1);
					table = new JTable(model);
					scrollPane.setViewportView(table);

					
				}catch(Exception sel){
					log.append("연결 문제 발생!!");
					System.out.println("선택 문제");
				};
			}
			

		}

		//테이블 1
		if(e.getActionCommand().equals("테이블1")){
			try{
				is_table_name = "payment";
				String sql="select * from "+is_table_name;
				rs=st.executeQuery(sql);

				rsMetaData = rs.getMetaData();
				lb_username.setText("park");
				lb_tablename.setText(is_table_name);
				//				System.out.println(rsMetaData.getColumnLabel(2));
				//				System.out.println(rsMetaData.getColumnName(2));
				colname_table1  = new String[rsMetaData.getColumnCount()];
				for(int i = 1;i<=rsMetaData.getColumnCount();i++){
					colname_table1[i-1]=rsMetaData.getColumnLabel(i);
				}

				//행 수 세기
				int rowcount=0;
				while(rs.next()){
					rowcount++;
				}rs.first();
				//		System.out.println("테이블1 행수"+rowcount);

				String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

				for (int i = 1;i<=rowcount;i++){
					for (int j = 1; j<=rsMetaData.getColumnCount();j++){
						table1_data[i-1][j-1] = rs.getString(j);
					//	System.out.println(table1_data[i-1][j-1]);
					}
					rs.next();
				}

				model = new DefaultTableModel(table1_data,colname_table1);
				table = new JTable(model);
				scrollPane.setViewportView(table);

				
			}catch(Exception sel){
				log.append("연결 문제 발생!!");
				System.out.println("선택 문제");
			};


		}
		//테이블 2
		if(e.getActionCommand().equals("테이블2")){
			is_table_name = "employee";
			lb_username.setText("park");
			lb_tablename.setText(is_table_name);
			try{
				String sql="select * from "+is_table_name;
				rs=st.executeQuery(sql);

				ResultSetMetaData rsMetaData = rs.getMetaData();
				lb_username.setText("park");
				lb_tablename.setText("payment");
				//				System.out.println(rsMetaData.getColumnLabel(2));
				//				System.out.println(rsMetaData.getColumnName(2));
				colname_table1 = new String[rsMetaData.getColumnCount()];
				for(int i = 1;i<=rsMetaData.getColumnCount();i++){
					colname_table1[i-1]=rsMetaData.getColumnLabel(i);
				}

				//행 수 세기
				int rowcount=0;
				while(rs.next()){
					rowcount++;
				}rs.first();
				//		System.out.println("테이블1 행수"+rowcount);

				String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

				for (int i = 1;i<=rowcount;i++){
					for (int j = 1; j<=rsMetaData.getColumnCount();j++){
						table1_data[i-1][j-1] = rs.getString(j);
						//System.out.println(table1_data[i-1][j-1]);
					}
					rs.next();
				}

				model = new DefaultTableModel(table1_data,colname_table1);
				table = new JTable(model);
				scrollPane.setViewportView(table);

			
			}catch(Exception sel){
				log.append("연결 문제 발생!!");
				System.out.println("선택 문제");
			};
		}
		if(e.getActionCommand().equals("테이블3")){
			is_table_name = "deligence_lazy";
			lb_username.setText("park");
			lb_tablename.setText(is_table_name);
			try{
				String sql="select * from "+is_table_name;
				rs=st.executeQuery(sql);

				ResultSetMetaData rsMetaData = rs.getMetaData();
				lb_username.setText("park");
				lb_tablename.setText("deligence_lazy");
				//				System.out.println(rsMetaData.getColumnLabel(2));
				//				System.out.println(rsMetaData.getColumnName(2));
				colname_table1 = new String[rsMetaData.getColumnCount()];
				for(int i = 1;i<=rsMetaData.getColumnCount();i++){
					colname_table1[i-1]=rsMetaData.getColumnLabel(i);
				}

				//행 수 세기
				int rowcount=0;
				while(rs.next()){
					rowcount++;
				}rs.first();
				//		System.out.println("테이블1 행수"+rowcount);

				String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

				for (int i = 1;i<=rowcount;i++){
					for (int j = 1; j<=rsMetaData.getColumnCount();j++){
						table1_data[i-1][j-1] = rs.getString(j);
						//System.out.println(table1_data[i-1][j-1]);
					}
					rs.next();
				}

				model = new DefaultTableModel(table1_data,colname_table1);
				table = new JTable(model);
				scrollPane.setViewportView(table);

				
			}catch(Exception sel){
				log.append("연결 문제 발생!!");
				System.out.println("선택 문제");
			};
		}
		
		if(e.getActionCommand().equals("transaction1")){
			try{
				String sql=
						"SELECT distinct e.e_name,e.department,e.join_date,dl.night_work,dl.abroad_work,p.basepayment "+
				"FROM employee e,deligence_lazy dl,payment p WHERE e.e_number=dl.e_number AND e.e_paystep=dl.dl_paystep "+
								"AND e.e_rank=dl.dl_rank AND department=\'개발\' AND p.basepayment>6000000";
				rs=st.executeQuery(sql);

				ResultSetMetaData rsMetaData = rs.getMetaData();
				lb_username.setText("park");
				lb_tablename.setText("transaction1");
				//				System.out.println(rsMetaData.getColumnLabel(2));
				//				System.out.println(rsMetaData.getColumnName(2));
				colname_table1 = new String[rsMetaData.getColumnCount()];
				for(int i = 1;i<=rsMetaData.getColumnCount();i++){
					colname_table1[i-1]=rsMetaData.getColumnLabel(i);
				}

				//행 수 세기
				int rowcount=0;
				while(rs.next()){
					rowcount++;
				}rs.first();
				//		System.out.println("테이블1 행수"+rowcount);

				String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

				for (int i = 1;i<=rowcount;i++){
					for (int j = 1; j<=rsMetaData.getColumnCount();j++){
						table1_data[i-1][j-1] = rs.getString(j);
						//System.out.println(table1_data[i-1][j-1]);
					}
					rs.next();
				}

				model = new DefaultTableModel(table1_data,colname_table1);
				table = new JTable(model);
				scrollPane.setViewportView(table);

				
			}catch(Exception sel){
				log.append("연결 문제 발생!!");
				System.out.println("선택 문제");
			};

		}
		if(e.getActionCommand().equals("transaction2")){
			try{
				String sql=
						"SELECT distinct P_PAYSTEP, BASEPAYMENT+NW_PAYMENT+RESTPAYMENT+ABROADPAYMENT as M_PAYMENT "+
				"FROM PAYMENT,DELIGENCE_LAZY WHERE P_RANK='부장' AND YEAR_MONTH='2014-11-01' AND P_PAYSTEP='f02'";
				rs=st.executeQuery(sql);

				ResultSetMetaData rsMetaData = rs.getMetaData();
				lb_username.setText("park");
				lb_tablename.setText("transaction2");
				//				System.out.println(rsMetaData.getColumnLabel(2));
				//				System.out.println(rsMetaData.getColumnName(2));
				colname_table1 = new String[rsMetaData.getColumnCount()];
				for(int i = 1;i<=rsMetaData.getColumnCount();i++){
					colname_table1[i-1]=rsMetaData.getColumnLabel(i);
				}

				//행 수 세기
				int rowcount=0;
				while(rs.next()){
					rowcount++;
				}rs.first();
				//		System.out.println("테이블1 행수"+rowcount);

				String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

				for (int i = 1;i<=rowcount;i++){
					for (int j = 1; j<=rsMetaData.getColumnCount();j++){
						table1_data[i-1][j-1] = rs.getString(j);
						//System.out.println(table1_data[i-1][j-1]);
					}
					rs.next();
				}

				model = new DefaultTableModel(table1_data,colname_table1);
				table = new JTable(model);
				scrollPane.setViewportView(table);

				
			}catch(Exception sel){
				log.append("연결 문제 발생!!");
				System.out.println("선택 문제");
			};

			
		}
		if(e.getActionCommand().equals("transaction3")){
			try{
				String sql=
						"SELECT distinct e.e_name,e.department,NW_PAYMENT+RESTPAYMENT+ABROADPAYMENT AS ADD_PAYMENT "+
				"FROM employee e,deligence_lazy dl,payment p WHERE e.e_paystep=p.p_paystep AND "+
								"e.e_rank=p.p_rank AND p.p_PAYSTEP='c02'";
				rs=st.executeQuery(sql);

				ResultSetMetaData rsMetaData = rs.getMetaData();
				lb_username.setText("park");
				lb_tablename.setText("transaction3");
				//				System.out.println(rsMetaData.getColumnLabel(2));
				//				System.out.println(rsMetaData.getColumnName(2));
				colname_table1 = new String[rsMetaData.getColumnCount()];
				for(int i = 1;i<=rsMetaData.getColumnCount();i++){
					colname_table1[i-1]=rsMetaData.getColumnLabel(i);
				}

				//행 수 세기
				int rowcount=0;
				while(rs.next()){
					rowcount++;
				}rs.first();
				//		System.out.println("테이블1 행수"+rowcount);

				String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

				for (int i = 1;i<=rowcount;i++){
					for (int j = 1; j<=rsMetaData.getColumnCount();j++){
						table1_data[i-1][j-1] = rs.getString(j);
						//System.out.println(table1_data[i-1][j-1]);
					}
					rs.next();
				}

				model = new DefaultTableModel(table1_data,colname_table1);
				table = new JTable(model);
				scrollPane.setViewportView(table);

				
			}catch(Exception sel){
				log.append("연결 문제 발생!!");
				System.out.println("선택 문제");
			};

			
		}
		if(e.getActionCommand().equals("transaction4")){
			try{
				String sql=
						"SELECT distinct E_NAME,E_RANK,YEAR_MONTH,P_PAYSTEP, BASEPAYMENT+NW_PAYMENT+RESTPAYMENT+ABROADPAYMENT as M_PAYMENT "+
				"FROM EMPLOYEE,PAYMENT,DELIGENCE_LAZY WHERE P_RANK='대리' AND YEAR_MONTH='2014-11-01' AND E_PAYSTEP=DL_PAYSTEP AND DL_PAYSTEP=P_PAYSTEP";
				rs=st.executeQuery(sql);

				ResultSetMetaData rsMetaData = rs.getMetaData();
				lb_username.setText("park");
				lb_tablename.setText("transaction4");
				//				System.out.println(rsMetaData.getColumnLabel(2));
				//				System.out.println(rsMetaData.getColumnName(2));
				colname_table1 = new String[rsMetaData.getColumnCount()];
				for(int i = 1;i<=rsMetaData.getColumnCount();i++){
					colname_table1[i-1]=rsMetaData.getColumnLabel(i);
				}

				//행 수 세기
				int rowcount=0;
				while(rs.next()){
					rowcount++;
				}rs.first();
				//		System.out.println("테이블1 행수"+rowcount);

				String table1_data [][] = new String[rowcount][rsMetaData.getColumnCount()];

				for (int i = 1;i<=rowcount;i++){
					for (int j = 1; j<=rsMetaData.getColumnCount();j++){
						table1_data[i-1][j-1] = rs.getString(j);
						//System.out.println(table1_data[i-1][j-1]);
					}
					rs.next();
				}

				model = new DefaultTableModel(table1_data,colname_table1);
				table = new JTable(model);
				scrollPane.setViewportView(table);

				
			}catch(Exception sel){
				log.append("연결 문제 발생!!");
				System.out.println("선택 문제");
			};
			
		}
		
		
		//전체 Exception 
		}catch(Exception master_ex){
			
		}
		
	}





	/*
	 * 
	 * inner class second frame
	 * */
	class fr_in extends JFrame implements ActionListener{
		private JPanel main_panel;
		private JPanel btn_panel;
		private JButton btn_confirm;
		private JButton btn_clear_1;
		private DefaultTableModel model_1;
		private JTable table_1;
		String [] tmp;
		fr_in(String [] a){

			main_panel = new JPanel();
			btn_panel = new JPanel();
			tmp = new String[a.length];
			JScrollPane scrollPane_1 = new JScrollPane();
			for(int i = 0; i<a.length;i++){
				tmp[i]= a[i];
			}
			model_1 = new DefaultTableModel(tmp,1);

			table_1 = new JTable(model_1);



			main_panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(main_panel);
			main_panel.setLayout(new BorderLayout(0,0));
			main_panel.add(scrollPane_1,BorderLayout.CENTER);
			scrollPane_1.setViewportView(table_1);
			main_panel.add(btn_panel, BorderLayout.EAST);
			btn_panel.setLayout(new GridLayout(0, 1, 0, 0));

			btn_confirm = new JButton("저장");
			btn_clear_1 = new JButton("초기화");

			btn_panel.add(btn_confirm);
			btn_panel.add(btn_clear_1);


			btn_confirm.addActionListener(this);
			btn_clear_1.addActionListener(this);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(500,600,600,200);
			setVisible(false);

		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try{
				if(arg0.getActionCommand().equals("저장")){
					//				String ab [] = {(String)model_1.getValueAt(0, 0),(String)model_1.getValueAt(0, 1)
					//						,(String)model_1.getValueAt(0, 2),(String)model_1.getValueAt(0, 3),model_1.getValueAt(0, 4),model_1.getValueAt(0, 5)};
					String tmp_data [] = new String[tmp.length];

					String tmp_q="";
					String tmp_label="";
					for(int i = 0; i<=tmp.length-1;i++){
						tmp_data[i] = (String)model_1.getValueAt(0, i);
						System.out.println(i+" data "+ tmp_data[i]);
						System.out.println(i+" label "+ tmp[i]);
						if(tmp_data[i]==null){
							if(i==tmp.length-1){
								tmp_q = tmp_q + " null";
								tmp_label = tmp_label + tmp[i];
							}
							else{
								tmp_q = tmp_q + "null, ";
								tmp_label = tmp_label + tmp[i]+", ";
							}
						}
						else{
							if(i==tmp.length-1){
								tmp_label = tmp_label + tmp[i];
								tmp_q = tmp_q + "\'"+tmp_data[i]+"\'";
							}
							else{
								tmp_label = tmp_label + tmp[i]+", ";
								tmp_q = tmp_q + "\'"+tmp_data[i]+"\',";
								System.out.println(tmp_label);
								System.out.println(tmp_q);
							}
						}

					}

					System.out.println("insert into "+"park."+is_table_name+" "
							+ "("+tmp_label+")"+" values ("+ tmp_q + ")");
					
					st.executeUpdate("insert into "+is_table_name+" "+ "("+tmp_label+")" +  "values ("+tmp_q+")");
					
					System.out.println();
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.addRow(tmp_data);

				}
			}catch(Exception e){
				e.printStackTrace();
			}
			if(arg0.getActionCommand().equals("초기화")){
				String a[] = new String[tmp.length];
				for(int i = 0 ; i<tmp.length;i++){
					a[i]=null;
				}
				model_1.removeRow(0);
				model_1.insertRow(0,a);
			}
		}
		
	}
	
}


/*
 * backup
 * 
 * */

//class oracleconnect {
//
//	/**
//	 * @param args
//	 */
//	Connection con;
//	Statement st;
//	ResultSet rs;
//	oracleconnect(){
//		// TODO Auto-generated method stub
//		try{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 로딩 성공...");
//			String url="jdbc:oracle:thin:@localhost:1521:xe";
//
//			String user="park";
//			String pwd="1";
//			con=DriverManager.getConnection(url,user,pwd);
//			st=con.createStatement();
//		}catch(Exception e){
//			System.out.println("연결 문제");
//		};  
//		System.out.println("DB 연결 성공!");
//
//		try{
//			String sql="select * from payment";
//			rs=st.executeQuery(sql);
//			System.out.println("while 접근 직전");
//			while(rs.next()){
//				String id=rs.getString(2);
//				String passwd=rs.getString(1);
//				String dept=rs.getString(3);
//				System.out.println(id+"\t"+passwd+"\t"+dept);
//			}//while---------
//		}catch(Exception sel){
//			System.out.println("선택 문제");
//		};
//		try{
//			rs.close();
//			st.close();
//			con.close();
//		}catch(Exception dis){
//			System.out.println("종료문제");
//		};
//	}
//}


