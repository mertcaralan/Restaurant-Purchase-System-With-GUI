package Classes;

import java.util.Scanner;

public class Customer {
	
	private int customerID;

	private String NameSurname;
	private String email;
	private String password;
	private String address;
	private String gender;

	private int day,month,year;
	
	public Customer() {
        this.customerID = generateRandomID();
    }

    private int generateRandomID() {
        int min = 1000; 
        int max = 9999;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

	public int getCustomerID()
	{
		return customerID;
	}

	public String getNameSurname()
	{
		return NameSurname;
	}
	
	public void setNameSurname(String NameSurname)
	{
		this.NameSurname = NameSurname;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return sex;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthDay() {
        return day;
    }

    public void setBirthDay(int day) {
        this.day = day;
    }

    public int getBirthMonth() {
        return month;
    }

    public void setBirthMonth(int month) {
        this.month = month;
    }

    public int getBirthYear() {
        return year;
    }

    public void setBirthYear(int year) {
        this.year = year;
    }

	@Override
	public String toString() {
		return "\n\ncustomerID=" + customerID + "\nNameSurname=" + NameSurname + "\nemail=" + email
				+ "\npassword=" + password + "\naddress=" + address + "\nsex=" + sex + "\nday=" + day
				+ "\nmonth=" + month + "\nyear=" + year;
	}

}