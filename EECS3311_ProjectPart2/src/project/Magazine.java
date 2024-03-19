package project;

import java.time.LocalDate;

public class Magazine extends PhysicalItem
{
	protected Magazine(String name, LocalDate rentDate, LocalDate dueDate) 
	{
		super(name, rentDate, dueDate);
	}
}
