package pp1;

public class InnerClass {

	public static void main(String[] args) {
		
			
			new Outer().func();
		}

	}


	class Outer{
		final int VAL = 9;
		int LENGTH = 70;
		void func() {
			boolean flag;
			flag = true;

			class Inner{ 
				void in() {
					System.out.println("Inside Inner's in...");
					System.out.println(flag);
				}
			}
			new Inner().in();
		}
	

	

}
