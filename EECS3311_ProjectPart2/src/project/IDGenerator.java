package project;

import java.util.Iterator;

public class IDGenerator implements Iterator<Integer>
{
	private static IDGenerator instance = new IDGenerator();
	private int nextID = 1;

	public static IDGenerator getInstance()
	{
		return instance;
	}
	
	@Override
	public boolean hasNext() 
	{
		return true;
	}

	@Override
	public Integer next() 
	{
		return nextID++;
	}
	
	public int getNextID()
	{
		return next();
	}

}
