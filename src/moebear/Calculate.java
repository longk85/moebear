package moebear;

public class Calculate {

	public static void main(String[] args) {
		Fetchballs fb = new Fetchballs();
		String result;
		double p1, p2, p3, p;
		int index = 1;
		
		for(int i=0; i<12; i++) {
			index = i;
			
			p1 = fb.firstFetch(index);
			p2 = fb.secondFetch(index);
			p3 = fb.thirdFetch(index);
			
			p = p1 + p2 + p3;
			
			result = "The result is " + p;
			
			System.out.println(result);
		}

	}

}
