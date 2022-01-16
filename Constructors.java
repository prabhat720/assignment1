package pp1;



public class Constructors {

	public static void main(String[] args) {
		
			laptop one = new laptop("lenovo", 1234);
			laptop three = new laptop("apple", 1678);
			laptop two = new laptop("viao", 567);
			System.out.println(one.name+", imeno: "+ one.imeno);
			System.out.println(two.name+", imeno: "+ two.imeno);
			System.out.println(three.name+", imeno: "+ three.imeno);
		}
	}
		class laptop{
			String name;
			long imeno;
			laptop(String name,long imeno){
				this.name= name;
				this.imeno= imeno;

	}

}
