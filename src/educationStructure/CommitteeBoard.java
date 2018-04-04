package educationStructure;
public abstract class CommitteeBoard {
	static String changeRules;
	
	public static String newRules() {
		return changeRules;	
	}
	public abstract void getJob();
}
