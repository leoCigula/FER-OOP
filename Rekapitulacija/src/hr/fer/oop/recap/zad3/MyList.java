package hr.fer.oop.recap.zad3;

public class MyList  {
	
	private final static int LIST_SIZE_MAX=1000;

	private Object objs[]=new Object[LIST_SIZE_MAX];
	private static int counter=0;
	
	for(int i=0;i<LIST_SIZE_MAX;i++)
		objs[i]=new Object();
	
	
	public int addLast(Object o) {
		objs[counter]=o;
		counter++;
		return (counter-1);
	}

	
	public void removeAt(int index) {
		objs[index]=null;
		for(int i=index;i<counter;i++){
			objs[i]=objs[i+1];
		}
		objs[counter-1]=null;
		counter--;
		
	}

	
	public Object elementAt(int index) {
		Object o=objs[index];
		return o;
	}


	public int size() {
		return counter;
	}
	
	
}
}
