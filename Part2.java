
public class Part2 {
	//I haven't defined testSimpleGene, as Eclipse requires a main class to execute the program.
	public static void main(String[] args) {
		String gene = null;
		String startCodon = "ATG";  //start and stop codons have been defined to pass it on to function findSimpleGene as a parameter
		String stopCodon = "TAA";
		
		String dna = "ATGAAATACCAGTACCACTAAGGAT";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);         //valid
		
		dna = "GTCTAAAAGTACCAACGGA";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);         //no TAA
		
		dna = "CTCGAAGACAATCCAAT";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);        //no ATG or TAA
		
		dna = "ATCATGATGACCGTGGTTGAC";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);         //no TAA
		
		dna = "ATGCGCAGCGTAA";
		startCodon = "ATG";
		stopCodon = "TAA";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);         //Invalid
		
	}
	//findSImpleGene is set to static as main class is static
	public static String findSimpleGene(String dna, String startCodon, String stopCodon) { //function with parameters
		String result = null;
		int startATG,stopTAA;
		
		
		startATG = dna.indexOf(startCodon);
		stopTAA = dna.indexOf(stopCodon,startATG+3);
		
		if (startATG == -1 && stopTAA == -1){
			return "No ATG or TAA";
		}else if (startATG == -1) {
			return "No ATG";
		}else if (stopTAA == -1){
			return "No TAA";
		}else
		{
		result = dna.substring(startATG,stopTAA+3);
		int valid = result.length()%3;         //Validating Strain
		if (valid == 0){
		     return result;
		  }
            else {
                return "Invalid Strain";
            }
        }
	
		
	}

}


