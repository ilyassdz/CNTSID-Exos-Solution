package TPString;

public class Demensional {
	
	
	
	int [][]  exo07()
	{
		int array[][] = new int[10][10];
		
		for(int i=0;i<array.length; i++)
		for(int j=0;j<array.length; j++) {
			
			 array[i][j] = 0;
			 if(i==j)
				 array[i][j] = i;
		}
		
		
		return array;
	}

}
