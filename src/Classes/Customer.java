package Classes;

import java.util.Scanner;

public class Customer {
	private int customerID;
	private String NameSurname;
	private String email;
	private String password;
	private String address;
	private String sex;
	private int day;
	private int month;
	private int year;
	
	public Customer() {
        this.customerID = generateRandomID();
    }

    private int generateRandomID() {
        int min = 1000; 
        int max = 9999;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

	public int get_customerID()
	{
		return customerID;
	}

	public String get_NameSurname()
	{
		return NameSurname;
	}
	
	public void set_NameSurname(String NameSurname)
	{
		this.NameSurname = NameSurname;
	}
	
	public String get_email()
	{
		return email;
	}
	
	public void set_email(String email)
	{
		this.email = email;
	}

	public String get_password()
	{
		return password;
	}
	
	public void set_password(String password)
	{
		this.password = password;
	}
	
	public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int get_daybirth() {
        return day;
    }

    public void setDayBirth(int day) {
        this.day = day;
    }

    public int getMonthBirth() {
        return month;
    }

    public void setMonthBirth(int month) {
        this.month = month;
    }

    public int getYearBirth() {
        return year;
    }

    public void setYearBirth(int year) {
        this.year = year;
    }

	
	public void getInput()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name and surname: ");
		NameSurname = scanner.nextLine();
		System.out.println("Enter your email:");
		email = scanner.nextLine();
		System.out.println("Enter your address:");
		address = scanner.nextLine();


		while (true) {
			System.out.println("Enter your sex (M/F):");
			sex = scanner.nextLine().toUpperCase(); 
			if (sex.equals("M") || sex.equals("F")) {
				break; 
			} else {
				System.out.println("Invalid input. Please enter M or F.");
			}
		}

		// Validate day (1-31)
		while (true) {
			System.out.println("Enter your day of birth (1-31):");
			day = scanner.nextInt();
			if (day >= 1 && day <= 31) {
				break; 
			} else {
				System.out.println("Invalid day. Please enter a number between 1 and 31.");
			}
		}


		while (true) {
			System.out.println("Enter your month of birth (1-12):");
			month = scanner.nextInt();
			if (month >= 1 && month <= 12) {
				break; // Exit loop if valid input
			} else {
				System.out.println("Invalid month. Please enter a number between 1 and 12.");
			}
		}


		while (true) {
			System.out.println("Enter your year of birth (e.g., 1990):");
			year = scanner.nextInt();
			if (String.valueOf(year).length() == 4) {
				break; 
			} else {
				System.out.println("Invalid year. Please enter a 4-digit year.");
			}
		}
	}

	@Override
	public String toString() {
		return "\n\ncustomerID=" + customerID + "\nNameSurname=" + NameSurname + "\nemail=" + email
				+ "\npassword=" + password + "\naddress=" + address + "\nsex=" + sex + "\nday=" + day
				+ "\nmonth=" + month + "\nyear=" + year;
	}

}