package data;

//variables

public class candidateData {
	private int Id;
	
	private String Lname;
	
	private String Fname;
	
	private String Side;
	
	private String Hometown;
	
	private int Age;
	
	private String Why;
	
	private String What;
	
	private String Occupation;
	
	private String Password;
	
	private String Username;
	
	//functions
	
	public candidateData(String Id, String Lname, String Fname, String Side, String Hometown, String Age, String Why, String What, String Occupation, String Password, String Username) {
		// TODO Auto-generated constructor stub
		setId(Id);
		
		this.Fname=Fname;
		
		this.setLname(Lname);
		
		this.setSide(Side);
		
		this.setHometown(Hometown);
		
		this.setAge(Age);
		
		this.setWhy(Why);
		
		this.setWhat(What);
		
		this.setOccupation(Occupation);
		
		this.setPassword(Password);
		
		this.setUsername(Username);
		
		//candidate data
		
	}
	public candidateData (String Password, String Username) {
		this.setPassword(Password);
		this.setUsername(Username);
	}
	public candidateData() {
		// TODO Auto-generated constructor stub
	}
	
	// id
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public void setId(String Id) {
		try {
			this.Id = Integer.parseInt(Id);
		}
		catch(NumberFormatException | NullPointerException e) {
		}
	}
	
	//first name
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String Fname) {
		this.Fname = Fname;
	}
	
	//last name
	
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	//side
	
	public String getSide() {
		return Side;
	}
	public void setSide(String side) {
		Side = side;
	}
	
	//hometown
	
	public String getHometown() {
		return Hometown;
	}
	public void setHometown(String hometown) {
		Hometown = hometown;
	}
	
	//age
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public void setAge(String Age) {
		try {
			this.Age = Integer.parseInt(Age);
		}
		catch(NumberFormatException | NullPointerException e) {
		}
	}
	
	//why
	
	public String getWhy() {
		return Why;
	}
	public void setWhy(String why) {
		Why = why;
	}
	
	
	
	public String getWhat() {
		return What;
	}
	public void setWhat(String what) {
		What = what;
	}
	
	//occupation
	
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	
	//password
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	//username
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
}
