package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Modal2 {

	private static Connection con;

	static {
		try {
			con = Connect.getMySQLCon();
		} catch (Exception e) {
		}
	}

	public static boolean verify(String email) {
		try (PreparedStatement ps = con.prepareStatement("select * from user where email=?");) {
			ps.setString(1, email);
			ResultSet res = ps.executeQuery();
			if (res.next())
				return true;
			else
				return false;
		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}
	}

	public static boolean registerUser(String name, String surname, String email, String password) {

		try (PreparedStatement ps = con
				.prepareStatement("insert into user(name,surname,email,password) values(?,?,?,?)");) {
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setString(3, email);
			ps.setString(4, password);
			int a = ps.executeUpdate();
			if (a >= 1)
				return true;
			else
				return false;

		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}
	}

	public static ResultSet getUserData(String email) {
		ResultSet res = null;
		try (PreparedStatement ps = con.prepareStatement("select * from user where email=?");) {
			ps.setString(1, email);
			return res = ps.executeQuery();

		} catch (SQLException e) {
			System.out.println(e);
			return res;
		}
	}

	public static int update(String name, String surname, String email, String password) {
		int a = 0;
		try (PreparedStatement ps = con.prepareStatement("update user set name=?,surname=?,email=?,password=?");) {
			ResultSet res = getUserData(email);

			if (name == "" || name == null)
				name = res.getString(name);
			if (surname == "" || surname == null)
				surname = res.getString(surname);
			if (email == "" || email == null)
				email = res.getString(email);
			if (password == "" || password == null)
				password = res.getString("password");

			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setString(3, email);
			ps.setString(4, password);

			a = ps.executeUpdate();
			if (a >= 1)
				return a;
			else
				return a;
		} catch (SQLException e) {
			System.out.println(e);
			return a;
		}
	}

	public static int delete(String email) {
		int a = 0;
		try (PreparedStatement ps = con.prepareStatement("delete from user where email=?");) {
			ps.setString(1, email);
			return a = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			return a;
		}
	}

//	------------------ADMIN-----------------
	public static ResultSet getAllUser_Ad() {
		ResultSet res = null;
		try (PreparedStatement ps = con.prepareStatement("Select * from user");) {
			return res = ps.executeQuery();

		} catch (SQLException e) {
			System.out.println(e);
			return res;
		}
	}

	public static boolean validation_Ad(String user, String pass) {

		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM admin WHERE user=?");) {
			ps.setString(1, user);
			ResultSet res = ps.executeQuery();
			if (res.next() && pass == res.getString("password")) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}
		return false;
	}

	public static boolean addProduct_Ad(String proName, String proImg, String proID) {
		String sql = "INSERT INTO product() VALUES ?,?,?,?";
		try (PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, proName);
			int a = ps.executeUpdate();
			if (a >= 1)
				return true;
			else
				return false;
		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}
	}

}
