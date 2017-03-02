public class TreeNode {
	private String question;
	private TreeNode yes;
	private TreeNode no;


	public TreeNode(String question) {
		this(question, null, null);
	}

	public TreeNode(String question, TreeNode yes, TreeNode no) {
		this.question = question;
		this.yes = yes;
		this.no = no;
	}

	public String getQuestion() {
		return question;
	}

	public TreeNode getYes() {
		return yes;
	}

	public TreeNode getNo() {
		return no;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setYes(TreeNode yes) {
		this.yes = yes;
	}

	public void setNo(TreeNode no) {
		this.no = no;
	}
}