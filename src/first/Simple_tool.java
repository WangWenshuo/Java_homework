package first;

import java.util.Scanner;

/*
 1．用户输入一个整数，程序计算并输出从1开始到该整数的所有整数之和；同时，计算并输出不大于该整数的所有素数的数目。
2．用户输入一个数字串，程序判断该数字串各位上数字的奇偶性，并分别输出奇、偶数位的计数值及各位的加和值。
 */
public class Simple_tool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi,firends.Welcome!");
		while(true){
			System.out.println("The program provides 2 functions,please input the number to choose.");
			System.out.println("1.Input a integer n then it will return the sum from 1 to n and the number of prime number less than n.");
			System.out.println("2.Input a string and it will output the number of odd and even and the sum of them.");
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			if(x==1){
				System.out.println("please input the n");
				Scanner scanner2 = new Scanner(System.in);
				int n = scanner2.nextInt();
				Prime_n prime_n = Simple_tool_tools.prime_calcu(n);
				System.out.println("The number of the prime less than "+n+" is "+prime_n.getN());
				System.out.println("The sum from 1 to n is "+prime_n.getSum());
				
			}else if(x==2){
				System.out.println("please input the string");
				Scanner scanner3 = new Scanner(System.in);
				String string = scanner3.nextLine();
				oddAndeven odd_even = Simple_tool_tools.oddAndeven_calcu(string);
				System.out.println("The number of the odds is "+odd_even.getOdd_n());
				System.out.println("The sum of odds is "+odd_even.getOdd_sum());
				System.out.println("The number of the evens is "+odd_even.getEven_n());
				System.out.println("The sum of evens is "+odd_even.getEven_sum());
			}else{
				System.out.println("Sorry,please input the right proper number.");
			}
		}
	}

}
