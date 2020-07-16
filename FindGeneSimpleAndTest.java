
public class FindGeneSimpleAndTest {
	
	public String findGeneSimple(String dna)
	{
		String result="";
		int startIndex = dna.indexOf("ATG");
		if(startIndex == -1){//no ATG
			return "";
		}
		int stopIndex = dna.indexOf("TAA",startIndex+3);
		if(stopIndex == -1){//no TAA
			return "";
		}
		result = dna.substring(startIndex,stopIndex+3);
		return result;
	}
	
	public void testFindGeneSimple(){
		String dna = "AATGCGTAATATGGT";
		System.out.println("DNA standard : "+dna);
		String gene = findGeneSimple(dna);
		System.out.println("Gene is : "+gene);
		
		dna = "AATGCTAGGGTAATATGGT";
		System.out.println("DNA standard : "+dna);
		gene = findGeneSimple(dna);
		System.out.println("Gene is : "+gene);
		
		dna = "CGATGGTTTG";
		System.out.println("DNA standard : "+dna);
		gene = findGeneSimple(dna);
		System.out.println("Gene is : "+gene);
		
		//dna = "ATGTAA";
		dna = "TTATAA";
		System.out.println("DNA standard : "+dna);
		gene = findGeneSimple(dna);
		System.out.println("Gene is : "+gene);
	}
	
	public static void main(String[] args) {
		FindGeneSimpleAndTest obj = new FindGeneSimpleAndTest();
		obj.testFindGeneSimple();
	}
}
