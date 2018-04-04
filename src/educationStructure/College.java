package educationStructure;

public class College extends University{
	String stName;
	String DOB="20 November";
	int age =50;
	public void position () {
		System.out.println("Principal is the highest position");
	}
	public void levelOfEducation() {
		System.out.println("We consider it as high school completion");
	}
	public String info(String stName, String DOB, int age) {
		String all=stName;
		this.DOB=DOB;
		this.age=age;
		System.out.println(stName+ " "+DOB+" "+age);
		return all;
	}
	public static int info (int a, int b) {
		int total= a + b;
		return total;
	}
	public static int info (int a, int b, int c) {
		int total= a+b+c;
		return total;
	}
}
