/*'Program Info
'----------------------------------------------------------------------------
/*
'Program:   Part2.java
'Date:      02/15/2021
'Author:    Mashuk Chowdhury
'Operation: Finding a gene from a DNA strand (Coursera Course :Java Programming: Solving Problems with Software)
'-----------------------------------------------------------------------------
'Change Log 
'-----------------------------------------------------------------------------
'Date           Programmer          Change
'-----------------------------------------------------------------------------
02/15/2021    Mashuk Chowdhury    Initial Version
*
* 
*/
public class Part2 {
	//I haven't defined testSimpleGene, as Eclipse requires a main class to execute the program.
	public static void main(String[] args) {
		String gene = " ";
		String startCodon = "ATG";  //start and stop codons have been defined to pass it on to function findSimpleGene as a parameter
		String stopCodon = "TAA";
		
		String dna = "ATGATATACCAGTACCACTAAGGAT";
		System.out.println("The DNA stand is " +dna);
		if (dna.equals(dna.toUpperCase())) {                  /*checks if dna is uppercase*/                 
			startCodon = startCodon.toUpperCase();              /*if yes, converts parameters to uppercase*/
			stopCodon = stopCodon.toUpperCase();
			gene = gene.toUpperCase();                          // gene is being converted to uppercase
			}else if (dna.equals(dna.toLowerCase())){          /*checks if dna is lowercase*/
				startCodon = startCodon.toLowerCase();         /*if yes, converts parameters to lowercase*/
				stopCodon = stopCodon.toLowerCase();
			gene = gene.toLowerCase();                       // gene is being converted to lowercase
			}
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);         //valid
		
		
		
		dna = "atgatataccagtaccactaaggat";
		System.out.println("The DNA stand is " +dna);
		if (dna.equals(dna.toUpperCase())) {
			startCodon = startCodon.toUpperCase();
			stopCodon = stopCodon.toUpperCase();
			gene = gene.toUpperCase();
			}else if (dna.equals(dna.toLowerCase())){ 
				startCodon = startCodon.toLowerCase();
				stopCodon = stopCodon.toLowerCase();
			gene = gene.toLowerCase();
			}
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);         //valid
		
		dna = "GTCTAAAAGTACCAACGGA";
		System.out.println("The DNA stand is " +dna);
		if (dna.equals(dna.toUpperCase())) {
			startCodon = startCodon.toUpperCase();
			stopCodon = stopCodon.toUpperCase();
			gene = gene.toUpperCase();
			}else if (dna.equals(dna.toLowerCase())){ 
				startCodon = startCodon.toLowerCase();
				stopCodon = stopCodon.toLowerCase();
			gene = gene.toLowerCase();
			}
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);         //no TAA
		
		dna = "CTCGAAGACAATCCAAT";
		System.out.println("The DNA stand is " +dna);
		if (dna.equals(dna.toUpperCase())) {
			startCodon = startCodon.toUpperCase();
			stopCodon = stopCodon.toUpperCase();
			gene = gene.toUpperCase();
			}else if (dna.equals(dna.toLowerCase())){ 
				startCodon = startCodon.toLowerCase();
				stopCodon = stopCodon.toLowerCase();
			gene = gene.toLowerCase();
			}
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);        //no ATG or TAA
		
		dna = "ATCATGATGACCGTGGTTGAC";
		System.out.println("The DNA stand is " +dna);
		if (dna.equals(dna.toUpperCase())) {
			startCodon = startCodon.toUpperCase();
			stopCodon = stopCodon.toUpperCase();
			gene = gene.toUpperCase();
			}else if (dna.equals(dna.toLowerCase())){ 
				startCodon = startCodon.toLowerCase();
				stopCodon = stopCodon.toLowerCase();
			gene = gene.toLowerCase();
			}
		gene = findSimpleGene(dna,startCodon,stopCodon);
		System.out.println(gene);         //no TAA
		
		dna = "ATGCGCAGCGTAA";
		System.out.println("The DNA stand is " +dna);
		if (dna.equals(dna.toUpperCase())) {
			startCodon = startCodon.toUpperCase();
			stopCodon = stopCodon.toUpperCase();
			gene = gene.toUpperCase();
			}else if (dna.equals(dna.toLowerCase())){ 
				startCodon = startCodon.toLowerCase();
				stopCodon = stopCodon.toLowerCase();
			gene = gene.toLowerCase();
			}
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
