import java.util.*;
import java.io.*;
public class Driver {
	public static void main(String[] args) {
		Tree t = new Tree();
		Scanner inputData = null;
		try {
			inputData = new Scanner(new BufferedReader(new FileReader("data.txt")));
			//System.out.println(inputData.nextLine());
		} catch (Exception e) {
			System.out.println("No file found");
		}
		TreeNode root = t.constructTree(inputData);
		//System.out.println("Root: " + root.getQuestion());
		//System.out.println("Root Yes: " + root.getYes().getQuestion());
		System.out.println("Welcome to my kingdom. Let's first play a small game");
		System.out.println("Let's think of a thing (can be an animal, an objec or anything)");
		System.out.println("I'll ask you some questions and what you have to do is just type in y for yes and n for no. Please do not type in anything stupid. We are smart people");
		t.out(root);
	}
}