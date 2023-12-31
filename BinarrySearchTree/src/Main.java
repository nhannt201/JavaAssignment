
public class Main {

	public static void main(String[] args) {
		BinarySearchTree bTree = new BinarySearchTree();
		bTree.insert(6);
		
		bTree.insert(4);
		System.out.println(bTree.root.left.value);

		bTree.insert(8);
		bTree.insert(3);
		bTree.insert(5);
		bTree.insert(7);
		bTree.insert(9);
		
		
		System.out.println("Thuat toan duyet cay theo chieu sau: "+bTree.root);
		bTree.inOrder(bTree.root);
		//bTree.preOrder(bTree.root);
		//bTree.postOrder(bTree.root);
		
		System.out.println("Thuat toan tim kiem tren cay: ");
		Node p = bTree.search(bTree.root, 6);
		if(p!=null)
			System.out.println("Da ra: " + p.value);
		else
			System.out.println("Ko tim ra");
	}

}
