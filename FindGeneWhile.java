
public class FindGeneWhile 
{
	public String findGene(String dna)
	{
		int startIndex = dna.indexOf("ATG");
		int currIndex = dna.indexOf("TAA",startIndex+3);
		while(currIndex != -1)
		{
			if((currIndex - startIndex)%3 == 0)
			{
				return dna.substring(startIndex,currIndex+3);
			}
			else
			{
				currIndex = dna.indexOf(currIndex+1);
			}
		}
		return "Not a Gene";
	}
	public void testFindGeneSimple(){
		String dna = "AATGCGTAATATGGT";
		System.out.println("DNA standard : "+dna);
		String gene = findGene(dna);
		System.out.println("Gene is : "+gene);
		
		dna = "AATGCTAGGGTAATATGGT";
		System.out.println("DNA standard : "+dna);
		gene = findGene(dna);
		System.out.println("Gene is : "+gene);
		
		dna = "CGATGGTTTG";
		System.out.println("DNA standard : "+dna);
		gene = findGene(dna);
		System.out.println("Gene is : "+gene);
		
		//dna = "ATGTAA";
		dna = "TTATAA";
		System.out.println("DNA standard : "+dna);
		gene = findGene(dna);
		System.out.println("Gene is : "+gene);
		
		dna = "AAATGCCCTAACTAGATTAAGAAACC";
		System.out.println("DNA standard : "+dna);
		gene = findGene(dna);
		System.out.println("Gene is : "+gene);
	}
	
	public static void main(String [] args)
	{
		FindGeneWhile obj = new FindGeneWhile();
		obj.testFindGeneSimple();
	}
}
