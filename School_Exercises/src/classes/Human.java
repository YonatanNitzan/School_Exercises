package classes;

public class Human {
	/* Variable declaration */
	private int money;
	private String s, name, fname, id, bankPass, gender;
	
	public String getAtributes()
	{
		s = String.format("%s, %s: \nSex: %s \nID: %d \nBank account password: %s\n"
				+ "Money balance: %d USD", fname, name, gender, id, bankPass, money);
		return s;
	}

	/* ID */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/* Money */
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	/* First name */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* Family name */
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	/* Password */
	public String getBankPass() {
		return bankPass;
	}

	public void setBankPass(String bankPass) {
		this.bankPass = bankPass;
	}

	/* Gender */
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/* Pronoun generator */
	public String pronoun() {
		if(gender.toLowerCase().equals("male"))
			return "his";
		else if(gender.toLowerCase().equals("female"))
			return "her";
		else
			return "their";
	}

	public boolean checkPass(String pass) {
		if(pass.equals(bankPass))
			return true;
		else
			return false;
	}
}
