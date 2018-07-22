package sett04;


public class Stack implements dequeue
{

	int[] tab;
	int start;
	int end;

	
	public Stack()
	{
		tab = new int[2];
		start = 0;
		end = 0;
	}
	/**
	 * Push given value to end of stack
	 * @param value Value added to end of stack
	 */
	public void pushLast(int value)
	{
		// stack is getting too large we increase the size
		if (size() == tab.length)	
		{
		
			tab = increaseSize(tab);
			//System.out.println("tab length "+ tab.length);
		}
		// add the value to end of stack and increase number of items in list
		tab[end] = value;	
		end++;
	}

	/**
	 * push given value to start of list
	 * @param value Value to be added to start of stack
	 */
	public void pushFirst(int value)
	{
		// stack is getting too large we increase the size
		if (size() == tab.length)
		{
		
			tab = increaseSize(tab);
		}
		// store values into tempArray
		// and place them one index higher than they originally were in tab
		// leaving tempArray[0] available for new input
		int[] tempArray = new int[tab.length];
				
		for(int i = 0; i <= size(); i++)
		{
			tempArray[i+1] = tab[i];
		}
		// we insert value, make tab equal to new array and increment number of items in stack
		tempArray[0] = value;
		tab = tempArray;
		end++;

	}

	/**
	 * pops last item in stack
	 * @return temp value at end of stack
	 */
	public int popLast()
	{
		int temp = tab[end];
		tab[end] = 0;
		end--;
		return temp;
	}

	/**
	 * pops first item in stack
	 * @return temp value at end of stack
	 */
	public int popFirst() 
	{
		// Create new array and copy all values from
		// tab[1] - tab[tab.length-1] effectively overwriting the 
		// value at tab[0]
		int[] tempArray = new int[tab.length];
		
		// overwriting in new array
		for(int i = 1; i <= size(); i++)
		{
			tempArray[i-1] = tab[i];
		}
		// store value to be removed before it is gone
		int temp = tab[0];
		// removed and number of values in list is decremented
		tab = tempArray;
		end--;
		
		return temp;
	}

	/**
	 * the available number of items in stack
	 * @return counter the number of items in stack
	 */
	public int size() 
	{
		
		return end;
	}
	
	/**
	 * increases size of array by current length*2
	 * @param tabIn The array to be resized
	 * @return newSizeTab the new and larger array
	 */
	public int[] increaseSize(int[] tabIn)
	{
		// create new array with twice as much space
		// copy all values of old array into new and return new array
		int[] newSizeTab = new int[tabIn.length*2];
		for (int i = 0; i< tabIn.length; i++)
		{
			newSizeTab[i] = tabIn[i];
		}
		return newSizeTab;
	}
	
	/**
	 * Print stack size and all items in stack
	 */
	public void printdata(){
		
		System.out.println("Size:"+ size() );
		
		for(int i = 0; i < size(); i++)
		{
			
			System.out.println(tab[i]);
		}
		
		
		
	}
	

}
