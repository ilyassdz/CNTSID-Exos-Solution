package charik;

public class Exo04ScorAvreg {
	
	
	
	public double avregScore(int array[]) {
		double sum=0;
		for(int i=0;i<array.length;i++)
			 sum+=array[i];
			
		
		return sum/array.length;
		
	}

}
