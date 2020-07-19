
public class FindAllGene {
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
		return -1;
	}
	
	public String findGene(String dna,int where)
	{
		int startIndex = dna.indexOf("ATG",where);
		if(startIndex == -1)
		{
			return "";
		}
		
		int taa = findStopCodon(dna,startIndex,"TAA");
		int tag = findStopCodon(dna,startIndex,"TAG");
		int tga = findStopCodon(dna,startIndex,"TGA");
		
		//int temp = Math.min(taa, tag);
		//int min = Math.min(temp, tga);
		int min=0;
		
		if(taa == -1 || tga!=-1 && tga<taa)
		{
			min = tga;
		}
		else
		{
			min = taa;
		}
		
		if(min == -1 || tag!=-1 && tga<min)
		{
			min = tag;
		}
		if(min == -1)
		{
			return "";
		}
		else
		{
			return dna.substring(startIndex,min+3);
		}
	}
	
	public void printAllGene(String dna)
	{
		int startIndex = 0;
		while(true)
		{
			String currentGene = findGene(dna,startIndex);
			if(currentGene.isEmpty())
			{
				break;
			}
			System.out.println(currentGene);
			startIndex = dna.indexOf(currentGene,startIndex)+currentGene.length();
		}
	}
	
	public void testOn(String dna)
	{
		System.out.println("Testing printall Gene " +dna);
		printAllGene(dna);
	}
	
	public void test()
	{
		testOn("ATGATCTAATTTATGCTGCAACGGTGAAGa");
		testOn("");
		testOn("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
	}
	public static void main(String[] args) {
		FindAllGene obj = new FindAllGene();
		obj.test();
	}
}
