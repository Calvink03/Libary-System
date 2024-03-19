package project;

import java.time.LocalDate;

public class CD extends PhysicalItem
{
	protected CD(String name, LocalDate rentDate, LocalDate dueDate)
	{
		super(name, rentDate, dueDate);
	}
}
