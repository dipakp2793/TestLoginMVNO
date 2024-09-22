package star;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int p=0;p<=4;p++) {
			for(int q=4;q>=p;q--) {
				System.out.print(" ");
			}
			for(int r=1;r<=p;r++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
