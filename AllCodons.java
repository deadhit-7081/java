
public class AllCodons 
{
	public int findStopCodon(String dnaStr,int startIndex,String stopCodon)
	{
		int currIndex = dnaStr.indexOf(stopCodon,startIndex+3);
		while(currIndex!=-1)
		{
			int diff = currIndex - startIndex;
			if(diff%3==0)
			{
				return currIndex;
			}
			else
			{
				currIndex = dnaStr.indexOf(stopCodon,currIndex+1);
			}
		}
		return dnaStr.length();
	}
	
	public String findGene(String dna)
	{
		int startIndex = dna.indexOf("ATG");
		if(startIndex == -1)
		{
			return "";
		}
		
		int taa = findStopCodon(dna,startIndex,"TAA");
		int tag = findStopCodon(dna,startIndex,"TAG");
		int tga = findStopCodon(dna,startIndex,"TGA");
		
		int temp = Math.min(taa, tag);
		int min = Math.min(temp, tga);
		if(min == dna.length())
		{
			return "";
		}
		else
		{
			return dna.substring(startIndex,min+3);
		}
	}
	
	public void testFindGeneSimple(){
		String dna = "AATGCGTAATATGGT";
		System.out.println("DNA standard : "+dna);
		String gene = findGene(dna);
		System.out.println("Gene is : "+gene);
		
		dna = "ATGTAG";
		System.out.println("DNA standard : "+dna);
		gene = findGene(dna);
		System.out.println("Gene is : "+gene);
		
		dna = "ATGTGA";
		System.out.println("DNA standard : "+dna);
		gene = findGene(dna);
		System.out.println("Gene is : "+gene);
		
		dna = "ATGTAA";
		System.out.println("DNA standard : "+dna);
		gene = findGene(dna);
		System.out.println("Gene is : "+gene);
		

	}
	
	public static void main(String [] args)
	{
		AllCodons obj = new AllCodons();
		obj.testFindGeneSimple();
	}
}
