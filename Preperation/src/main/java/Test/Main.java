package Test;

public class Main {

	public static void main(String args[]) {
		/*Login log = new Login();
		CrmSfa crm = new CrmSfa();
		Create_Lead cl = new Create_Lead();
		FindLead ml = new FindLead();*/
		MergeLead ml = new MergeLead();
		ml.login();
		ml.crmsfa();
		ml.createLead();
		ml.findlead();
		ml.editLead();
		ml.callMergeLead();
 	}
}
