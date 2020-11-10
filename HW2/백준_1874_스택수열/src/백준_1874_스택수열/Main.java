package 백준_1874_스택수열;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		sc.nextLine();
		int[] stack=new int[1000];
		int top=-1;
		int k=0;
		Boolean bb=true;
		String result="";
		
		for (int i=1;i<=number;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			for(int j=0;j<number;j++) {
				if (top==-1) {
					stack[++top]=++k;
					result=result+"+";
				}
				else if (a==stack[top]) {
					result=result+"-";
					top--;
					break;
				}
				else {
					k++;
					if (k>number) {
						bb=false;
						break;
					}
					stack[++top]=k;
					result=result+"+";
				}
				}
			}
		if (bb==false) {
			System.out.println("NO");
		}
		else {
			for (int i=0;i<result.length();i++) {
				System.out.println(result.charAt(i));
			}
			
		}
		
	}

}