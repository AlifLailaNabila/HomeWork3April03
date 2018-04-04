package educationStructure;

public class MinistryOfEducation extends CommitteeBoard implements EducationPlan,AddedFeatures {
	static String studentsComplain = "Student's feedback";
	public void power() {
		System.out.println("Ministry of education holds the power to change rules");
	}
	public void website() {
		System.out.println("We can have own website.");
	}
	public void projector() {
		System.out.println("Projector can be set up in class.");
	}
	public void studentFriendly() {
		System.out.println("Rules should be student friendly.");
	}
	public String feedback(String studentsComplain, int totalComplain) {
		System.out.println("Total complain is 0");
		return studentsComplain;
	}
	public void patentsMeeting() {
		System.out.println("Parents meeting should be called monthly.");
	}
	public void getJob() {
		System.out.println("Alumny can help to get job");
	
	}
}
