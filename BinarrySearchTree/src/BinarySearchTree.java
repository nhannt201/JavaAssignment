
public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree(int rootValue) {
		this.root = new Node(rootValue);
	}
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	
	public void insert(int x) {
		if(root==null) {
			root = new Node(x);
			return;
		}
		Node prev = root, p = root;;
		while(p!=null) {
			if (p.value==x) 
				System.out.println("They key already exists");
				
				prev = p;
				if (x<p.value) 
					p = p.left;
				else
					p = p.right;
			
		}	
			if (x<prev.value)
				prev.left = new Node(x);
			else
				prev.right = new Node(x);
		
	}
	
	public Node search(Node p, int x) {	
		if(p==null)
			return null;
		if(p.value==x)
			return p;
		if (x<p.value)
			return search(p.left, x);
		else
			return search(p.right, x);
	}
	public void visit(Node p) {
		System.out.print(p.value);
	}
	
	void preOrder(Node p) {
		if (p == null)
			return;
		visit(p);
		preOrder(p.left);
		preOrder(p.right);
	}

	void inOrder(Node p) {
		if (p == null)
			return;
		inOrder(p.left);
		visit(p);
		inOrder(p.right);
	}

	void postOrder(Node p) {
		if (p == null)
			return;
		postOrder(p.left);
		postOrder(p.right);
		visit(p);
	}
	
	
}
