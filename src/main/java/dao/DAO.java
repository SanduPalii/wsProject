package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import data.candidateData;
import data.questionsData;
import data.answersData;

public class DAO 

{
	private String url;
	private String user;
	private String pass;
	private Connection conn;
	public DAO(String url, String user, String pass) {
		this.url=url;
		this.user=user;
		this.pass=pass;
	}
	
	public boolean getConnection() {
		try {
	        if (conn == null || conn.isClosed()) {
	            try {
	                Class.forName("com.mysql.jdbc.Driver").newInstance();
	            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
	                throw new SQLException(e);
	            }
	            conn = DriverManager.getConnection(url, user, pass);
	        }
	        return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public ArrayList<candidateData> readAllcandidates() {
		ArrayList<candidateData> list=new ArrayList<>();
		try {
			Statement stmt=conn.createStatement();
			ResultSet RS=stmt.executeQuery("select * from ehdokkaat");
			while (RS.next()){
				candidateData f=new candidateData();
				f.setId(RS.getInt("Ehdokas_ID"));
				f.setLname(RS.getString("Sukunimi"));
				f.setFname(RS.getString("Etunimi"));
				f.setSide(RS.getString("Puolue"));
				f.setHometown(RS.getString("Kotipaikkakunta"));
				f.setAge(RS.getInt("Ika"));
				f.setWhy(RS.getString("Miksi_eduskuntaan"));
				f.setWhat(RS.getString("Mita_asioita_haluat_edistaa"));
				f.setOccupation(RS.getString("Ammatti"));
				f.setPassword(RS.getString("Salasana"));
				f.setUsername(RS.getString("Kayttajanimi"));
				list.add(f);
				
			}
			return list;
		}
		catch(SQLException e) {
			return null;
		}
	}
	
}