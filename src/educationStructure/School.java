package educationStructure;

public class School extends College{
	@Override
	public String info(String stName, String DOB, int age) {
		String all=stName+" "+age;
		this.DOB=DOB;
		this.age=age;
		System.out.println(stName+ " "+DOB+" "+age);
		return all;
	}
}
