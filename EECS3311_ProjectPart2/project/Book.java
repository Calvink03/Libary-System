package project;

import java.time.LocalDate;

public class Book extends PhysicalItem
{
	public int textbookEdition;
	
	protected Book(String name, LocalDate rentDate, LocalDate dueDate) 
	{
		super(name, rentDate, dueDate);
	}
	
	public void similarBooks()
	{
		
	}
}
