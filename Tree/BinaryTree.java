package Tree;

import java.util.LinkedList;
import java.util.Queue;

import javax.imageio.metadata.IIOMetadataNode;

public class BinaryTree {
	int idx=-1;
	public Node buildTree(int node[])
	{
		idx++;
		if(node[idx] == -1)
		{
			return null;
		}
		Node newNode=new Node(node[idx]);
		newNode.left=buildTree(node);
		newNode.right=buildTree(node);
		return newNode;
	}
	//preorder traversal
	//pass root of tree
	//here we method to static that means this method is call in main without any instance
	//if we make a method withod static then we create a class instance and call that method
	//time complexity O(n)
	public static void preOrder(Node root)
	{
		//base case
		if(root == null)
		{
			return;
		}
		//first we print root
		System.out.print(root.data+" ");
		//then left
		preOrder(root.left);
		//then right
		preOrder(root.right);
	}
	//inorder traversal (LRR)	
	//left root right
	public static void inOrder(Node root)
	{
		//base case
		if(root == null)
		{
			return;
		}
		//first we print left
		inOrder(root.left);
		//then root
		System.out.print(root.data+" ");
		//then right
		inOrder(root.right);
	}
	//post order traversal
	//LRR()left right root
	public static void postOrder(Node root)
	{
		//base case
		if(root == null)
		{
			return;
		}
		//here we first print left the right
		//and then root
		// print left 
		postOrder(root.left);
		//print right
		postOrder(root.right);
		//print root
		System.out.print(root.data+" ");
	}
	
	//level order traversal
	public static void levelOrder(Node root)
	{
		//base case if root is null then return
		if(root == null)
		{
			return;
		}
		//here we use queue to store the data its work on FIFO
		//use Collection Framework queue
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
		//take a loop whenEver our Queue is empty
		while(!q.isEmpty())
		{
			//remove the current node
			Node currentNode=q.remove();
			//and the check if currentNode is null then next line
			if(currentNode == null)
			{ 
				//next line if comes null
				System.out.println();
				
				//then we check q is empty if empty then break
				if(q.isEmpty())
				{
					break;
				}
				//else add null
				else
				{
					q.add(null);
				}
				
			}else
			{
				System.out.print(currentNode.data+" ");
				if(currentNode.left !=null)
				{
					q.add(currentNode.left);
				}
				if(currentNode.right !=null)
				{
					q.add(currentNode.right);
				}
			}
		}
	}
	public static int countNodes(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		//recursion method
		int leftCount=countNodes(root.left);
		int rightCount=countNodes(root.right);
		
		int totalCount=leftCount+rightCount+1;
		return totalCount;
	}
	//height of tree=level of tree
	//here we find height of left and height of right and the +1(in max)
	public static int height(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		//find max
		int mytreeHeight=Math.max(leftHeight, rightHeight);
		//and then +1 root node
		return mytreeHeight+1;
				
	}
	
	public static void main(String[] args) {
		int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		//find root node
	    Node root=tree.buildTree(node);
	    System.out.println("Root Node is="+root.data);
	    
	    System.out.println(".....preorder..."); 
	    preOrder(root);
	    System.out.println("\n.......inorder.......");
	    inOrder(root);
	    System.out.println("\n .....postOrder.....");
	    postOrder(root);
	    System.out.println("\nlevel order traversal....print data level by level");
	    levelOrder(root);
	    
	    System.out.println("Total Count of Nodes="+countNodes(root));
	    System.out.println("Height of Tree="+height(root));
	     
	}

}
