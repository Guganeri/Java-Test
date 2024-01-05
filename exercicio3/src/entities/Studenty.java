package entities;

public class Studenty {

	public String aluno;
	public double media1, media2, media3;

		public String calcMedia() {
			double total = media1 + media2 + media3;			
			if (total >= 60.00) {
				//return "FINAL GRADE = " + total + "\nPASS";
				return String.format("FINAL GRADE = %.2f", total);
			} 
			else {
				//return "FINAL GRADE = " + total + "\nFAILED\n" + "MISSING " + (60 - total);
				return String.format("FINAL GRADE %.2f \nFAILED\nMISSING %.2f POINTS",total, 60-total );
			}		
	
	}

}
