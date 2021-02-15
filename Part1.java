/*'Program Info
'----------------------------------------------------------------------------
/*
'Program:   Part1.java
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

public class Part1 {
	//I haven't defined testSimpleGene, as Eclipse requires a main class to execute the program.
	public static void main(String[] args) {
		String gene = " ";
		
		String dna = "ATGAAATACCAGTACCACTAAGGAT";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);         //valid
		
		dna = "ATCATGAACAACGGA";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);         //no TAA
		
		dna = "ATCGAATCCAAT";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);        //no ATG or TAA
		
		dna = "ATCATGATCGTGGTTGAC";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);         //no TAA
		
		dna = "ATGCGCCGTAA";
		System.out.println("The DNA stand is " +dna);
		gene = findSimpleGene(dna);
		System.out.println(gene);         //Invalid
		
	}
	//findSImpleGene is set to static as main class is static
	public static String findSimpleGene(String dna) {
		String result = "";
		int startCodon = dna.indexOf("ATG");
		int stopCodon = dna.indexOf("TAA",startCodon+3);
		if (startCodon == -1 && stopCodon == -1){    //if both start and stop codons are absent
			return "No ATG or TAA";
		}else if (startCodon == -1) {          //if start codon is absent
			return "No ATG";
		}else if (stopCodon == -1){          //if stop codon is absent
			return "No TAA";
		}else
		{
		result = dna.substring(startCodon,stopCodon+3);
		int compare = result.length()%3;         //Validating Strain
		if (compare == 0){
		     return result;
		  }
            else {
                return "Invalid Strain";        //if the remainder doesn't yield 0, this is an invalid strand
            }
        }
	
		
	}

}
