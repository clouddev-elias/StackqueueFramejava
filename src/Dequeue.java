package sett04;

public interface dequeue 
{
	public void pushLast(int value);

	public void pushFirst(int value);

	public int popLast();

	public int popFirst();

	public int size();// antall som er i lista, ikke størrelsen på den interne
						// tabellen
}
