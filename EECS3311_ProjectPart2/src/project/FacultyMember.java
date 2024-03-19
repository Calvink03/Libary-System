package project;

import java.util.HashMap;
import java.util.Map;

public class FacultyMember extends User
{
	protected FacultyMember(String email, String password, UserType type) 
	{
		super(email, password, type);
	}

	Map<String, String> courseInfo = new HashMap<String, String>();
	
	//A Mapping from course to textbook. 
	//If there is no textbook in the course, then put null for textbook.
	//EECS3311 -> "Dogs are Cute!"
	
	public void addCourse(String courseName, String textbookName)
	{
		courseInfo.put(courseName, textbookName);
	}
	
	//Assuming you want to check if a course is in the course map.
	public boolean checkCourse(String target) 
	{
		boolean check = courseInfo.containsKey(target);
		
		return check;
	}
	
	public String checkCourseTextbook(String target)
	{
		boolean check = checkCourse(target);
		
		if(check)
		{
			String textbook = courseInfo.get(target);
			
			return textbook;
		}
		else
		{
			return "Course was not available";
		}
	}
}
