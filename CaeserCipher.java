import java.util.*;
public class CaeserCipher
{
	public void encrypt(String input,int key)
	{
		StringBuilder encrypted = new StringBuilder(input);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String shiftedAlphabet = (alphabet.substring(key)+alphabet.substring(0,key));
		for(int i=0;i<encrypted.length();i++)
		{
			char currChar = encrypted.charAt(i);
			if(Character.isLowerCase(currChar))
			{
				currChar=Character.toUpperCase(currChar);
				int idx = alphabet.indexOf(currChar);
				if(idx!=-1)
				{
					char newChar = shiftedAlphabet.charAt(idx);
					newChar = Character.toLowerCase(newChar);
					encrypted.setCharAt(i, newChar);
				}
			}
			else
			{
				int idx = alphabet.indexOf(currChar);
				if(idx!=-1)
				{
					char newChar = shiftedAlphabet.charAt(idx);
					encrypted.setCharAt(i, newChar);
				}
			}
		}
		 System.out.println(encrypted.toString());
	}
	
	public static void main(String[] args) {
		CaeserCipher obj = new CaeserCipher();
		String input = "Jai Kumar Singh";
		String input1 = "JAI KUMAR SINGH";
		String input2 = "jai kumar singh";
		obj.encrypt(input, 17);
		obj.encrypt(input1, 17);
		obj.encrypt(input2, 17);
	}
	
}
