package world;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

   public static void main(String[] args) {
      
      Connection conn = null;
      try {
         //JDBC Driver 등록
         Class.forName("com.mysql.cj.jdbc.Driver");
         System.out.println("드라이버가 성공적으로 로드 되었습니다.");
         
         String url = "jdbc:mysql://localhost:3306/world";
         String user = "root";
         String password = "1234";
         
         conn = DriverManager.getConnection(url, user, password);
         System.out.println("world db 연결 성공");
         
         String sql = "delete from sampleTable where id = ?";
         int rs = 0;
         //변수값이 있을때는 PreparedStatement
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, 1);
         rs += pstmt.executeUpdate();
         pstmt.setInt(1, 2);
         rs += pstmt.executeUpdate();
         pstmt.setInt(1, 3);
         rs += pstmt.executeUpdate();

         System.out.println("삭제된 행의 수는 " + rs);
         
         pstmt.close();
         
      }catch(ClassNotFoundException e) {
         e.printStackTrace();
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         if(conn != null) 
            try {
               conn.close();
               System.out.println("연결을 끊었습니다.");
            }catch(SQLException e) {}
      }

   }

}
