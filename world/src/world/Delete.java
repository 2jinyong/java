package world;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

   public static void main(String[] args) {
      
      Connection conn = null;
      try {
         //JDBC Driver ���
         Class.forName("com.mysql.cj.jdbc.Driver");
         System.out.println("����̹��� ���������� �ε� �Ǿ����ϴ�.");
         
         String url = "jdbc:mysql://localhost:3306/world";
         String user = "root";
         String password = "1234";
         
         conn = DriverManager.getConnection(url, user, password);
         System.out.println("world db ���� ����");
         
         String sql = "delete from sampleTable where id = ?";
         int rs = 0;
         //�������� �������� PreparedStatement
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, 1);
         rs += pstmt.executeUpdate();
         pstmt.setInt(1, 2);
         rs += pstmt.executeUpdate();
         pstmt.setInt(1, 3);
         rs += pstmt.executeUpdate();

         System.out.println("������ ���� ���� " + rs);
         
         pstmt.close();
         
      }catch(ClassNotFoundException e) {
         e.printStackTrace();
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         if(conn != null) 
            try {
               conn.close();
               System.out.println("������ �������ϴ�.");
            }catch(SQLException e) {}
      }

   }

}
