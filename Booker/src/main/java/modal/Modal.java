package modal;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Modal {

	private String email, pass, name, surname, phone;
	private String searchKey;
	private String proId, subject, edition, price, univercity, branch, semester, publication, imgName1, imgName2,
			imgName3, stream;
	private String sellerName, sellerEmail, sellerPhone;
	private String adminUser, adminPass, adminName, adminSurname;

	// ====================Setter=Getter=========================
	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnivercity() {
		return univercity;
	}

	public void setUnivercity(String univercity) {
		this.univercity = univercity;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getImgName1() {
		return imgName1;
	}

	public void setImgName1(String imgName1) {
		this.imgName1 = imgName1;
	}

	public String getImgName2() {
		return imgName2;
	}

	public void setImgName2(String imgName2) {
		this.imgName2 = imgName2;
	}

	public String getImgName3() {
		return imgName3;
	}

	public void setImgName3(String imgName3) {
		this.imgName3 = imgName3;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerPhone() {
		return sellerPhone;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}
//============================Admin=========================================

	public String getAdminUser() {
		return adminUser;
	}

	public void setAdminUser(String adminUser) {
		this.adminUser = adminUser;
	}

	public String getAdminPass() {
		return adminPass;
	}

	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminSurname() {
		return adminSurname;
	}

	public void setAdminSurname(String adminSurname) {
		this.adminSurname = adminSurname;
	}

	public boolean adminLogin() {
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con.prepareStatement("SELECT password FROM admin where user =?");) {
			ps.setString(1, adminUser);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				if (res.getString("password").equals(adminPass)) {
					return true;
				} else
					return false;
			} else
				return false;
		} catch (Exception e) {
			return false;
		}
	}

//============================Curd==========================================
	public boolean sellBook() {
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con.prepareStatement(
						"INSERT INTO product(proId,subject,edition,price,univercity,branch,semester,publication,img1,img2,img3,sellerEmail,stream) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");) {
			ps.setString(1, proId);
			ps.setString(2, subject);
			ps.setString(3, edition);
			ps.setString(4, price);
			ps.setString(5, univercity);
			ps.setString(6, branch);
			ps.setString(7, semester);
			ps.setString(8, publication);
			ps.setString(9, imgName1);
			ps.setString(10, imgName2);
			ps.setString(11, imgName3);
			ps.setString(12, sellerEmail);
			ps.setString(13, stream);
			if (ps.executeUpdate() == 1) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return false;
	}

	public List<Modal> search() {
		List<Modal> al = null;
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con
						.prepareStatement("SELECT * FROM product WHERE subject LIKE ? OR semester LIKE ?");) {
			ps.setString(1, "%" + searchKey + "%");
			ps.setString(2, "%" + searchKey + "%");
			ResultSet res = ps.executeQuery();
			al = new ArrayList<>();
			Modal m = null;
			while (res.next()) {
				m = new Modal();
				m.setProId(res.getString("proId"));
				m.setSubject(res.getString("subject"));
				m.setEdition(res.getString("edition"));
				m.setPrice(res.getString("price"));
				m.setUnivercity(res.getString("univercity"));
				m.setBranch(res.getString("branch"));
				m.setSemester(res.getString("semester"));
				m.setPublication(res.getString("publication"));
				m.setImgName1(res.getString("img1"));
				m.setImgName2(res.getString("img2"));
				m.setImgName3(res.getString("img3"));
				m.setSellerEmail(res.getString("sellerEmail"));
				m.setStream(res.getString("stream"));
				al.add(m);
			}
			return al;
		} catch (Exception e) {
			return al;
		}
	}

	public boolean userValidate() {
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con.prepareStatement("SELECT email FROM user WHERE email = ?");) {
			ps.setString(1, email);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean signIn() {
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con.prepareStatement("SELECT password FROM user WHERE email = ?");) {
			ps.setString(1, email);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				if (pass.equals(res.getString("password"))) {
					return true;
				}
				return false;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public boolean signUp() {
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con
						.prepareStatement("insert into user(name,surname,email,password,phone) values(?,?,?,?,?)");) {
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.setString(5, phone);
			int a = ps.executeUpdate();
			if (a == 1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public List<Modal> sellList() {
		List<Modal> al = null;
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con.prepareStatement("SELECT * FROM product WHERE sellerEmail=?");) {
			ps.setString(1, sellerEmail);
			al = new ArrayList<>();
			Modal m = null;
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				m = new Modal();
				m.setProId(res.getString("proId"));
				m.setSubject(res.getString("subject"));
				m.setEdition(res.getString("edition"));
				m.setPrice(res.getString("price"));
				m.setUnivercity(res.getString("univercity"));
				m.setBranch(res.getString("branch"));
				m.setSemester(res.getString("semester"));
				m.setPublication(res.getString("publication"));
				m.setImgName1(res.getString("img1"));
				m.setImgName2(res.getString("img2"));
				m.setImgName3(res.getString("img3"));
				m.setSellerEmail(res.getString("sellerEmail"));
				m.setStream(res.getString("stream"));
				al.add(m);
			}
			return al;
		} catch (Exception e) {
			return al;
		}
	}

	private Modal[] getImg() {
		Modal[] m1 = new Modal[1];
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con.prepareStatement("SELECT img1,img2,img3 FROM product WHERE proId = ?")) {
			ps.setString(1, proId);
			ResultSet res = ps.executeQuery();
			Modal m = null;
			if (res.next()) {
				m = new Modal();
				m.setImgName1(res.getString("img1"));
				m.setImgName2(res.getString("img2"));
				m.setImgName3(res.getString("img3"));
				m1[0] = m;
			}
			return m1;
		} catch (Exception e) {
			return m1;

		}
	}

	public boolean deletePro() {
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con.prepareStatement("DELETE FROM product WHERE proID=?");) {
			Modal[] m1 = this.getImg();
			String Img1Name = m1[0].getImgName1();
			String Img2Name = m1[0].getImgName2();
			String Img3Name = m1[0].getImgName3();
			String applicationPath2 = "D:\\Workspace\\servlet\\Booker";
			String imgPath = "\\src\\main\\webapp\\images\\products";
			Path path1 = Paths.get(applicationPath2 + imgPath + File.separator + Img1Name);
			Files.delete(path1);
			Path path2 = Paths.get(applicationPath2 + imgPath + File.separator + Img2Name);
			Files.delete(path2);
			Path path3 = Paths.get(applicationPath2 + imgPath + File.separator + Img3Name);
			Files.delete(path3);
			ps.setString(1, proId);
			if (ps.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public Modal getProDetail() {
		Modal m = null;
		try (Connection con = Connect.getMySQLCon();
				PreparedStatement ps = con.prepareStatement("SELECT * FROM product WHERE proId=?");) {
			ps.setString(1, proId);
			ResultSet res = ps.executeQuery();
			if (res.next()) {
				m = new Modal();
				m.setProId(res.getString("proId"));
				m.setSubject(res.getString("subject"));
				m.setEdition(res.getString("edition"));
				m.setPrice(res.getString("price"));
				m.setUnivercity(res.getString("univercity"));
				m.setBranch(res.getString("branch"));
				m.setSemester(res.getString("semester"));
				m.setPublication(res.getString("publication"));
				m.setImgName1(res.getString("img1"));
				m.setImgName2(res.getString("img2"));
				m.setImgName3(res.getString("img3"));
				m.setSellerEmail(res.getString("sellerEmail"));
				m.setStream(res.getString("stream"));
			}
			return m;
		} catch (Exception e) {
			return m;
		}
	}
}
