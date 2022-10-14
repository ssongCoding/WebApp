import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DB connection, select, insert
 * @author ITSC
 *
 */
public class DBconn {
	Connection conn; // �ڹٿ� DB�� �������� ���
	PreparedStatement pstmt;
	ResultSet rs;
	
	String url = "jdbc:mysql://localhost:3306/test";
	
	DBconn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver �ε� ����");
			
			conn = DriverManager
					.getConnection(url, "root", "root");
			System.out.println("DB ���� ����");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void save(int id, String name) {
		try {
			String sql = "INSERT INTO testTable VALUES(?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id); // 1�� ?�� id�� �־���
			pstmt.setString(2, name); // 2�� ?�� name�� �־���
			
			pstmt.executeUpdate();
			System.out.println("DB ���� ����");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBconn db = new DBconn();
		db.save(1, "tester1");
	}
}