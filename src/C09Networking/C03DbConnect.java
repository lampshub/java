package C09Networking;

import java.sql.*;

public class C03DbConnect {
    public static void main(String[] args) throws SQLException {
//        mysql드라이버 별도 다운로드 및 추가
        String url = "jdbc:mysql://localhost:3306/board?useSSL=false";  //SSL 보안기술 -> false : 보안설정 안하겠다
        String userName = "root";
        String password = "test1234";
        Connection myConnection = DriverManager.getConnection(url, userName, password);
        System.out.println(myConnection);

//        Statement객체에 쿼리를 담아 db에 전송
        Statement st = myConnection.createStatement();
        ResultSet result = st.executeQuery("select * from post");
//        next()를 통해 데이터를 1행씩 read
//        next로 첫줄 넘어감
        while(result.next()) {
            System.out.println(result.getInt("id"));
            System.out.println(result.getString("title"));
            System.out.println(result.getString("contents"));
        }
    }
}
