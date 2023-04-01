package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final class Connect {
	private Connect() {

	}

	static Connection getMySQLCon() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/booker", "root", "password");
	}

	static void clean(Connection con) throws SQLException {
		if (con != null)
			con.close();
	}

}
