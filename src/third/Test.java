package third;

import java.util.LinkedList;
import java.util.Scanner;

import javax.sound.midi.Receiver;

public class Test {
	public static void main(String[] args){
		System.out.println("Welcome!");
		System.out.println("Hello,my friends");
		Notebook notebook = new Notebook(new LinkedList());
		while(true){
			System.out.println("You can use it as a notebook and it provides the following functions:");
			System.out.println("p for printing all elements");
			System.out.println("s for getting the amount of the recoders");
			System.out.println("g for getting the specific elements with the index");
			System.out.println("a for adding a recoder to the tail of the notebook");
			//System.out.println("am for adding a collection to the tail of the notebook");
			System.out.println("d for deleting a recoder to the tail of the notebook");
			System.out.println("da for delete all recoders of the notebook");
			System.out.println("e for exiting");
			System.out.println("Please input the character to choose");
			Scanner scanner = new Scanner(System.in);
			String string = scanner.nextLine();
			
			if(string.equals("p")){
				notebook.printAllRecoder();
			}else if(string.equals("g")){
				System.out.println("please input the index(1-"+notebook.getRecoderAmount()+")");
				Scanner scanner2 = new Scanner(System.in);
				int x = scanner2.nextInt();
				System.out.println(notebook.getRecoder(x));
			}else if(string.equals("a")){
				System.out.println("please input the recoder you want to add");
				Scanner scanner3 = new Scanner(System.in);
				String xString = scanner3.nextLine();
				if(notebook.addOne(xString)){
					System.out.println("add successfully!");
				}else{
					System.out.println("sorry,add failed");
				}
			}else if(string.equals("d")){
				System.out.println("please input the index(1-"+notebook.getRecoderAmount()+")");
				Scanner scanner4 = new Scanner(System.in);
				int x = scanner4.nextInt();
				if(x<=0||x>notebook.getRecoderAmount()){
					System.out.println("sorry,the number you input is not in the right range.");
				}else{
					notebook.deleteOne(x);					
				}
			}else if(string.equals("da")){
				notebook.deleteAll();
			}else if(string.equals("s")){
				System.out.println(notebook.getRecoderAmount());
			}else if(string.equals("e")){
			}else{
				System.out.println("please input the right character.");
			}
		}
	}
}
