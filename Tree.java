import java.util.*;
import java.io.*;
public class Tree {
	private TreeNode root;
	private Scanner scan;

	public Tree() {
		scan = new Scanner(System.in);
		root = new TreeNode("start");
	}

	public TreeNode constructTree(Scanner inputData) {
		root = constructTreeHelper(inputData);
		return root;
	}

	public TreeNode constructTreeHelper(Scanner inputData) {
		if (inputData.hasNext()) {
			String kind = inputData.nextLine();
			String context = inputData.nextLine();

			//System.out.println("Kind " + kind + " Context " + context);

			if (kind.equals("Q:")) {
				return new TreeNode(context, constructTreeHelper(inputData), constructTreeHelper(inputData));
			}
			return new TreeNode(context);
		}
		return null;
	}

	public void out(TreeNode root) {
		outHelper(root);
	}

	public void outHelper(TreeNode root) {
		if (root == null) {
			System.out.println("Error");
			return;
		}
		if (root.getYes() == null && root.getNo() == null) {
			System.out.printf("The answer is %s\n", root.getQuestion());
			return;
		}
		System.out.printf("Q: %s\n", root.getQuestion());
		String in = scan.nextLine();
		if (in.equals("y")) {
			outHelper(root.getYes());
		} else {
			outHelper(root.getNo());
		}
	}

}