package JavaBasic;

import java.util.*;

public class FuncList2{
   int a[];
   int n;
 	Scanner sc = new Scanner(System.in);
   public void input(){
       n = sc.nextInt();
       a = new int[n];    
       for(int i=0; i<a.length ;i++){
           a[i]=sc.nextInt();
       }
   }
   public int findx(){
   	int x = sc.nextInt();
       int count = 0;
       for(int i=0; i<a.length; i++){
           if(a[i] == x){
               count++;
           }
       }
       return count;
   }
   public void sort(){
       int tmp = 0;
       for(int i=0; i<a.length-1; i++){
           for(int j=i+1; j<a.length; j++){
               if(a[i]>a[j]){
                   tmp = a[i];
                   a[i] = a[j];
                   a[j] = tmp;
               }
           }
       }
   }
   public void output() {
   	for(int i=0 ;i<a.length; i++) {
   		System.out.print(a[i]+" ");
   	}
   }
   public static void main(String[] args) {
		FuncList2 n = new FuncList2();
		n.input();
		n.sort();
		System.out.println(n.findx());
		n.output();
	}
}