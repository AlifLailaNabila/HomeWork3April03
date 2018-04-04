package educationStructure;

public class TestStructure {

	public static void main(String[] args) {
//Single level inheritance
		College college = new College();
		college.levelOfEducation();
		School school = new School();
		school.position();
		school.levelOfEducation();
//Multilevel inheritance
		University university = new University();
		university.highKnowledge();
		college.major();
		college.levelOfEducation();
		school.highKnowledge();
		school.position();
//Hierarchical inheritance
		MinistryOfEducation me = new MinistryOfEducation();
		me.power();
		BoardOfEducation be = new BoardOfEducation();
		be.power();
		university.power();
//Encapsulation
		be.setHead("Mr. Bean");
		System.out.println(be.getHead());
		be.setIncome(50000);
		System.out.println(be.getIncome());
		BoardOfEducation.setBudget(10000000);
		System.out.println(BoardOfEducation.getBudget());
//Interface
		EducationPlan ep = new MinistryOfEducation();
		System.out.println(EducationPlan.totalComplain);
		System.out.println(ep.feedback("Student's complain will be recorded",50));
		ep.patentsMeeting();
		ep.patentsMeeting();
		
		AddedFeatures af = new MinistryOfEducation();
		af.website();
		af.projector();
		
		CommitteeBoard cb = new MinistryOfEducation();
		CommitteeBoard.changeRules="Changed rules should be declared.";
		System.out.println(CommitteeBoard.newRules());
		cb.getJob();
		
		me.feedback("fedback", 20);
		me.getJob();
//Polymorphism	
	//Overloading
		System.out.println("Total students in three class is "+College.info(5, 6, 7));
		college.info("Alif", "20 November", 100);
	//Overriding
		System.out.println(school.info("Alif", "20 November", 5));
		
		
		
	}
}
