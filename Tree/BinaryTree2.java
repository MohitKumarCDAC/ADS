package Tree;

public class BinaryTree2 {
	//write a function to build tree and find root node
	int index=-1;
	public Node buildTree(int node[])
	{
		index++;
		//here we assign -1 =null
		if(node[index]==-1)
		{
			return null;
		}
		Node newNode=new Node(node[index]);
		newNode.left=buildTree(node);
		newNode.right=buildTree(node);
		return newNode;
	}

	//find greater element from the tree
	public int greaterElement(Node root)
	{
		//this method is return min value
		int max_value=Integer.MIN_VALUE;
		//base case
		if(root == null)
		{
			return 0;
		}
		//find greater value through recursion
		int leftMax=greaterElement(root.left);
		int rightMax=greaterElement(root.right);
		
		if(leftMax >rightMax)
		{
			max_value=leftMax;
		}
		else
		{
			max_value=rightMax;
		}
		
		if(root.data >max_value)
			max_value=root.data;
		return max_value;
	}
	
	//searching an element in the binary tree
	
	public boolean search(Node root,int data)
	{
		//base case
		if(root == null)
		{
			return false;
		}
		if(root.data == data)
		{
			return true;
		}
		return search(root.left, data) || search(root.right, data);
	}
	public static void main(String[] args) {
		//first we assign nodes value in the array
		//here -1 means null node
		int node[]= {1,2,11,-1,-1,15,-1,-1,13,-1,16,-1,-1};
		//and then create class instance
		BinaryTree2 tree=new BinaryTree2();
		Node root=tree.buildTree(node);
		System.out.println("root="+root.data);
		
		System.out.println("Maximum value of the Tree:"+tree.greaterElement(root));
		System.out.println("search the given value in our tree:"+tree.search(root, 16));
		

	}

}
