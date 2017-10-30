package combination;

public class Combination_lib {
		
	public int getFactorial(int s) {
			int r = 1;
			for(int i = 1; i <= s; i++) {
				r = r * i;	
			}
			return r ;
	}
}
