找出10~1000能同时被7，11整除并且十位是3的数
package class1;
public class Test {
	public static void main(String[] args){
		int n=10;
		do{
		if(n/10%10==3 && n%77==0){ System.out.println(n);}
    ++n;}
		while (n<1000 );
		}
	}
  
  
package class1;
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		int n ;
		int a,b,c,d;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三位数：");
		n=input.nextInt();
		a=n/100; b=n/10%10; c=n%10; d=c*100+b*10+a; 
		System.out.println(d);
		}
	}


package class1;
public class Test {
	public static void main(String[] args){
		int sum=0 ;
		int i;
		for(i=0;i<=100;i++){
			if( i%3==0 && i%7!=0 ){
				sum += i;}
			}
		System.out.println(sum);
		}
	}




package class1;

public class test1 {
	public static void main(String[] args){
		int n,sum;
		int a,b,c;
		System.out.println("水仙花数：");
		for(n=100;n<1000;n++){
			a = n/100;
			b = n/10%10;
			c = n%10;
			sum = a*a*a+b*b*b+c*c*c;
			if(sum==n){		
				System.out.println(sum);
}
		}
	}
			
}




package class1;
public class Test {
	public static void main(String[] args){
		int i=1;
		int sum=0;
		do{sum += i;
			System.out.println(sum);
		i++;
		}while( i<=100);
		}
	}




package class1;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		System.out.println("数入一个数：");
		long  n = scanner.nextInt();
		int  count = 0;
		while( n!= 0 ){
			n=n/10;
			count= count + 1;
		}
		System.out.println(count);
	}
	
}
