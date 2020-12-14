package java_project_final;

import java.util.Random;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         Random rand=new Random();
         int n=scan.nextInt();
         int[] v=new int[n];
         for(int i=0;i<n;i++) {
            v[i]=rand.nextInt();
         }
         int K=scan.nextInt();
         long t = System.currentTimeMillis();
         for(int k=0;k<K;k++) {
            int a=rand.nextInt(n)+1;
            int b=rand.nextInt(n)+1;
            int min=v[a-1];
            int max=v[a-1];
            int sum=v[a-1];
            for(int i=a;i<b;i++) {
               if(max>v[i]) min=v[i];
               if(max<v[i]) max=v[i];
               sum+=v[i];
            }
            //System.out.print(min);
            //System.out.print(max);
            //System.out.println(sum);
         }
      long f = System.currentTimeMillis();
      //   실행후 시간에서 실행전 시간을 빼면 경과시간이 나오며, 이를 출력합니다.
      System.out.println("Elapsed time is "+(f-t)+"ms.");
   }

}