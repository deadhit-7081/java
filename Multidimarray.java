import java.util.*;
public class Multidimarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int grid[][] = new int [n][n];
		System.out.println("Enter element : ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				grid[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.nextLine();
		
		String str[][] = new String[n][n];
		System.out.println("Enter String");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				str[i][j] = sc.nextLine();
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}
	}
}
