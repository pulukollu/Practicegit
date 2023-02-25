
class Banks {
	public static int go() {
		return 10;
	}
	public static void main(String[] args) {
		int p = 1000, t = 3, r;
		System.out.println(t > 5);
		System.out.println(t < 10);
		if (t < 5) {
			r = 20;
		} else if (t > 5 && t < 10) {
			r = 10;
		} else {
			r = 5;
		}
		int interest = (p * t * r) / 100;
		System.out.println(interest); 
		go();
	}
}