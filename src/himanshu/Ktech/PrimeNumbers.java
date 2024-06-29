package himanshu.Ktech;

import java.util.*;

class PrimeNumbers{

public static void main(String... a){
	System.out.println(primeNumbers(11));
}

	public static List<Integer> primeNumbers(int number){
		List<Integer> primeNumbers = new ArrayList();
		for(int i=2;i<=number;i++){
			boolean noIsPrime=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					noIsPrime=false;
					break;
                }
			}
			if(noIsPrime){
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
}
