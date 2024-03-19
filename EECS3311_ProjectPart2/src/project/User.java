package project;

import java.util.Scanner;

public class User 
{
	public String email;
	public String password;
	public UserType type;
	
	//Password must be a strong password.
	
	protected User()
	{
	}
	
	protected User(String email, String password, UserType type)
	{
		this.email = email;
		this.password = password;
		this.type = type;
	}
	
	//Can change the system.outs to booleans that change.
	public void login(String email, String password)
	{
		if(this.email.equals(email) && this.password.equals(password))
		{
			System.out.println("You are now logged in.");
		}
		else if(!this.email.equals(email) && !this.password.equals(password))
		{
			System.out.println("Your email and password was incorrect");
		}
		else if(!this.email.equals(email))
		{
			System.out.println("Your email was invalid");
		}
		else
		{
			System.out.println("Your password was incorrect");
		}
	}
	
	//Can change the system.outs to booleans that change.
	public void register()
	{
		if(this.email == null)
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter your email.");
			
			this.email = scanner.nextLine();
			
			System.out.println("Please enter your password.");
			
			String newPassword = scanner.nextLine();

			if(!strongPasswordCheck(newPassword))
			{
				do
				{
					System.out.println("Your password was not considered strong enough.");
					System.out.println("Please enter a new password.");
					
					newPassword = scanner.nextLine(); //Use a temporary variable each time.
				}
				while(!strongPasswordCheck(newPassword));
			}
			
			this.password = newPassword; //Change the password.
			
			System.out.println("Please enter your account type.");
			//Very specific for right now
			System.out.println("Faculty_Member, Non_Faculty_Member, Student, or Visitor");
			
			String userType = scanner.nextLine();
			
			userType = userType.toUpperCase();
			
			if(checkIfValidUserType(userType))
			{
				if(!checkIfVisitor(this.type))
				{
					//validiation
				}
			}
			else
			{
				do
				{
					System.out.println("Your user type was not of the four options.");
					System.out.println("Please enter a valid user type.");
					
					userType = scanner.nextLine(); //Use a temporary variable each time.
					
					userType = userType.toUpperCase();
				}
				while(!checkIfValidUserType(userType));
			}
			
			scanner.close();
			
			System.out.println("You have successfully registered an account.");
		}
		else if(this.email.equals(email))
		{
			System.out.println("You already have an account with this email.");
		}
	}
	
	public boolean strongPasswordCheck(String password)
	{
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasNumber = false;
		boolean hasSpecial = false;
		
		for(char character : password.toCharArray())
		{
			if(Character.isUpperCase(character))
			{
				hasUpperCase = true;
			}
			else if(Character.isLowerCase(character))
			{
				hasLowerCase = true;
			}
			else if(Character.isDigit(character))
			{
				hasNumber = true;
			}
			else
			{
				hasSpecial = true;
			}
		}
		
		return (hasUpperCase && hasLowerCase && hasNumber && hasSpecial);
	}
	
	//Can the user put in the newPassword as the current password?
	//Can change the system.outs to booleans that change.
	public void changePassword(String email, String password, String newPassword)
	{
		Scanner scanner = new Scanner(System.in);
		
		//Ensure that they login
		//Could have a boolean loggedIn as well to check this.
		if(this.email.equals(email) && this.password.equals(password))
		{
			if(strongPasswordCheck(newPassword))
			{
				this.password = newPassword;
				
				System.out.println("You have successfully changed your password.");
			}
			else //Weak password
			{
				do
				{
					System.out.println("Your password was not considered strong enough.");
					System.out.println("Please enter a new password.");
					
					newPassword = scanner.nextLine(); //Changes the newPassword to the newest password.j
				}
				while(!strongPasswordCheck(newPassword));
				
				this.password = newPassword; //Change the password.
				
				System.out.println("You have successfully changed your password.");
			}
		}
		else
		{
			System.out.println("Your email or password was incorrect.");
		}
		
		scanner.close();
	}
	
	public boolean checkIfValidUserType(String userType)
	{
		for(UserType userTypeEnum : UserType.values())
		{
			//Check to see if the given String is one of the four user types.
			if(userTypeEnum.name().equals(userType)) 
			{
				this.type = userTypeEnum;
				
				return true;
			}
		}
		
		return false;
	}
	
	//Quickly check if the user needs more validation and authentication.
	public boolean checkIfVisitor(UserType type)
	{
		if(type == UserType.VISITOR)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Using observer pattern here?
	public void loginVisitor()
	{
		
	}
}
