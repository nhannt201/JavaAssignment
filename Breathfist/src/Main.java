
public class Main {

	public static void main(String[] args) {
		Tree myTree = new Tree();
		Node nodeA = new Node('A');
		Node nodeB = new Node('B');
		Node nodeC = new Node('C');
		Node nodeD = new Node('D');
		Node nodeE = new Node('E');
		Node nodeF = new Node('F');
		Node nodeG = new Node('G');
		Node nodeH = new Node('H');
		Node nodeI = new Node('I');

		myTree.root = nodeF;
		nodeF.left = nodeB;
		nodeF.right = nodeG;

		nodeB.left = nodeA;
		nodeB.right = nodeD;

		nodeD.left = nodeC;
		nodeD.right = nodeE;

		nodeG.right = nodeI;

		nodeI.left = nodeH;

		System.out.println("Breath First");
		myTree.breath();

		System.out.println("\n\nDepth First");
		System.out.println("\nIn order");
		myTree.inOrder(nodeF);

		System.out.println("\nPost Order");
		myTree.postOrder(nodeF);

		System.out.println("\nPre order");
		myTree.preOrder(nodeF);
	}

}
