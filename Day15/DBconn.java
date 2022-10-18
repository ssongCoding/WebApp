import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB connection, select, insert
 * @author ITSC
 *
 */
public class DBconn {
	private Connection conn; // 자바와 DB를 연결해줄 통로
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet rs;
	
	String url = "jdbc:mysql://localhost:3306/test";
	
	DBconn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver 로딩 성공");
			
			conn = DriverManager
					.getConnection(url, "root", "root");
			System.out.println("DB 접속 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * testTable 테이블 전체 조회
	 */
	public void findAll() {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM testTable");
			
			while(rs.next()) { // 다음 행 있어?
				System.out.println(rs.getInt("id") + " " 
						+ rs.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void save(int id, String name) {
		try {
			String sql = "INSERT INTO testTable VALUES(?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id); // 1번 ?에 id를 넣어줌
			pstmt.setString(2, name); // 2번 ?에 name을 넣어줌
			
			pstmt.executeUpdate();
			System.out.println("DB 저장 성공");
			
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBconn db = new DBconn();
		db.findAll();
	}
}
