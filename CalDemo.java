package ImpConcepts;

public class CalDemo {

	public static void main(String[] args)
	{
// anonymous inner class
		Calculator cal=new Calculator() {
			
			@Override
			public void sub(int a, int b) {
				System.out.println(a-b);
				
			}
			
			@Override
			public void mul(int a, int b) {
				System.out.println(a*b);
				
			}
			
			@Override
			public void div(int a, int b) {
				System.out.println(a/b);
				
			}
			
			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
				
			}
		};
		cal.add(22, 20);
		cal.sub(28333, 2000);
		cal.mul(120, 80);
		cal.div(340000, 12);
	}

}
