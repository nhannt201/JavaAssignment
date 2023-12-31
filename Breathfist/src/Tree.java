import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	Node root;

	public Tree() {
		this.root = null;
	}

	public Tree(int rootValue) {
		this.root = new Node(rootValue);
	}

	public void visit(Node p) {
		System.out.println((char) p.value);
	}

	public void breath() {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		Node p;
		while (!queue.isEmpty()) {
			p = (Node) queue.poll();
			if (p.left != null)
				queue.add(p.left);
			if (p.right != null)
				queue.add(p.right);

			visit(p);
		}

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
