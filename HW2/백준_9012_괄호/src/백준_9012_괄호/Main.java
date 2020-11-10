package น้มุ_9012_ฐýศฃ;

import java.util.Scanner;

public class Main {
	public static boolean isValid(String pp) {
		char[] stack=new char[1000];
		int top=-1;
		
		for(int i=0;i<pp.length();i++) {
			char ch=pp.charAt(i);
			if(ch=='(') {
				stack[++top]=ch;
			}
			else if(ch==')') {
				if(top==-1||stack[top]!='(') return false;
				top--;
			}
		}
		return top==-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		
		for (int i=1;i<=number;i++) {
			String ex=scan.next();
			if (isValid(ex)) System.out.println("YES");
			else System.out.println("NO");
			
		}
	}

}
