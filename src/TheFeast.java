
public class TheFeast {
	public static void main(String[] args) {
		int n = 6;
		int c = 2;
		int m = 2;
		System.out.println(chocolateFeast(n,c,m));
	}
	public static int chocolateFeast(int n ,int c,int m) {
		int numbersOfBar = n/c;
		int wrappers = numbersOfBar;
		
		if(wrappers < m) {
			return numbersOfBar;
		}

		while(wrappers >= m) {
			numbersOfBar = numbersOfBar + 1;
			wrappers = wrappers - m +1;
		}
		return numbersOfBar;
		
	}
	
}
