import edu.duke.*;
public class Part1 {

	public static void main(String[] args) {
		String gene = " ";
		
		String dna = "ATGAAATACCAGTACCACTAAGGAT";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);
		
		dna = "ATCATGAACAACGGA";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);
		
		dna = "ATCGAATCCAAT";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);
		
		dna = "ATCATCATGGTGGTTTAAGAC";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);
		
		dna = "ATGCGCCGTAA";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);
		
		
	
		
		
	}
	
	public static String findSimpleGene(String dna) {
		String result = "";
		int startCodon = dna.indexOf("ATG");
		int stopCodon = dna.indexOf("TAA",startCodon+3);
		if (startCodon == -1) {
			return "No ATG";
		}
		
		if (stopCodon == -1){
			return "No TAA";
		}
		
		if (startCodon == -1 && stopCodon == -1){
			return "No ATG/TAA";
		}
		{
		result = dna.substring(startCodon,stopCodon+3);
		int compare = result.length()%3;
		if (compare == 0){
		     return result;
		  }
            else {
                return "Invalid Strain";
            }
        }
	
		
	}

}
