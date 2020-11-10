import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		Random r = new Random(10);
		int[] num=new int[N];
		for(int i=0;i<N;i++) {
	        num[i]=r.nextInt();	
		}
		int a=scan.nextInt();
		int b=scan.nextInt();
		int temp;
        for (int i=a-1;i<b;i++) {
            for (int j=i;j<b;j++) {
                if (num[i]>num[j]) {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
		int sum=0;
		int min=num[a-1];
		int max=num[b-1];
		for(int i=a-1;i<b;i++) {
			sum+=num[i];
		}
		System.out.println(min+" "+max+" "+sum);
	}
}
