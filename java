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
  
  
  
