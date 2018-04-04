package educationStructure;

public class BoardOfEducation extends MinistryOfEducation{
	private String head;
	private int income;
	private static double budget;
	
	public static double getBudget() {
		return budget;
	}
	public static void setBudget(double budget) {
		BoardOfEducation.budget = budget;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
}
