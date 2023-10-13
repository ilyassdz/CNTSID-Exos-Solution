package charik;

public class Exo01 {

	//08/10/2023
			//sommeEvenNumbers 
			public int sommeEvenNumbers(int max) {
				int sum=0;
				for(int i=1;i<=max;i++)
					if(i%2==0)
					 sum+=i;
					
				return sum;
				
			}
}
