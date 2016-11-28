package first;

public class Simple_tool_tools {
	private Simple_tool_tools(){	
	}
	public static Prime_n prime_calcu(int n){
		int sum=0;
		boolean recoder[] = new boolean[n+1];
		for(int i=0;i<=n;i++){
			recoder[i]=true;
		}
		recoder[1]=false;
		recoder[0]=false;
		int p = 2;
		for(int j = p*p;j<=n;j=p*p){
			while(j<=n){
				recoder[j]=false;
				j=j+p;
			}
			while(recoder[++p]==false){
			}
		}
		int rec = 2;
		while(rec<=n){
			sum+=recoder[rec++]?1:0;
		}
		System.out.println("sum:"+sum);
		return new Prime_n(sum,(n+1)*n/2);
	}
	public static oddAndeven oddAndeven_calcu(String n){
		int length = n.length();
		int number[] = new int[length];
		int odd_n=0,even_n=0,oddsum=0,evensum=0;
		for(int i=0;i<length;i++){
			number[i]=n.charAt(i)-'0';
			if(number[i]%2==0){
				odd_n++;
				oddsum+=number[i];
			}else{
				even_n++;
				evensum+=number[i];
			}
		}
		return new oddAndeven(odd_n,even_n,oddsum,evensum);
	}
}
