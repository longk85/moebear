package moebear;

public class Fetchballs {
	private int[] weight = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	private int totalWeight = 78;
	
	public Fetchballs() {};
	
	public double firstFetch(int ballIndex) {
		double result = 0;
		result = (double) this.weight[ballIndex] / this.totalWeight;
		return result;
	}
	
	public double secondFetch(int ballIndex) {
		double result = 0;
		for(int i=0; i<12; i++) {
			if(i != ballIndex) {
				result = result +   (double) this.weight[i] / this.totalWeight * this.weight[ballIndex] / (this.totalWeight - this.weight[i]);
			}
		}
		return result;
	}
	
	public double thirdFetch(int ballIndex) {
		double result = 0;
		for(int i=0; i<12; i++) {
			if(i != ballIndex){
				for(int j=0; j<12; j++) {
					if(j != ballIndex && i != j) {
						result = result +   (double) this.weight[i] / this.totalWeight * this.weight[j] / (this.totalWeight - this.weight[i]) * this.weight[ballIndex] / (this.totalWeight - this.weight[i] - this.weight[j]);
					}
				}
			}
		}
		return result;
	}
	
	public double ballP (int ballIndex) {
		double result = 0;
		result = this.firstFetch(ballIndex) + this.secondFetch(ballIndex) + this.thirdFetch(ballIndex);
		return result;
	}

}
