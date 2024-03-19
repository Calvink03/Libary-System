package project;

import java.time.LocalDate;
import java.util.ArrayList;

public class SystemDirectory 
{
	protected int itemID; //Iterator pattern here.
	protected int copies; 
	protected String location; 
	ArrayList<PhysicalItem> physicalRented;
	private int totalItems; //For what? Total items in the library?
	
	//Return the due date for any item.
	//Change return type.
	public LocalDate dueDate(PhysicalItem physical) 
	{
		return null;
	}
	
	//Return true or false if the item has less than 24 hours till the due date.
	public boolean check24Hours(PhysicalItem physical)
	{
		return true;
	}
	
	//Return true or false if the item is overdue.
	public boolean checkOverdue(PhysicalItem physical)
	{
		return true;
	}
	
	
	public int returnTotalItems()
	{
		return totalItems;
	}
}
