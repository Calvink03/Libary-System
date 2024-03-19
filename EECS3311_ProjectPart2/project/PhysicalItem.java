package project;

import java.time.LocalDate;

public class PhysicalItem 
{
	public String name;
	public int itemID;
	public int quantity; //The number of copies in the library, 20.
	public LocalDate rentDate;
	public LocalDate dueDate;
	
	protected PhysicalItem(String name, LocalDate rentDate, LocalDate dueDate)
	{
		this.name = name;
		this.rentDate = rentDate;
		this.dueDate = dueDate;
		this.quantity = 20;
		
		itemID = IDGenerator.getInstance().getNextID();
	}
	
	public void addItem(String name, LocalDate rentDate, LocalDate dueDate)
	{
		new PhysicalItem(name, rentDate, dueDate);
	}
}
