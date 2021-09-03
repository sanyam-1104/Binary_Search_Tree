class BinarySearchTree
{
  class Node    
  {
     int data;
     Node left;
     Node right;
     
     Node(int data)
     {
         this.data=data;
         this.left=null;
         this.right=null;
     }
  }
  
  Node root;
  
  BinarySearchTree()
  {
    root=null;    
  }
  
  void insert(int data)
  {
    root=insertRecord(root,data);    
  }
  
  Node insertRecord(Node root,int data)
  {
    if(root==null)
    {
        root=new Node(data);
        return root;
    }
    
    
        if(data>root.data)
        {
            root.right=insertRecord(root.right,data);   
        }
        
        else if(data<root.data)
        {
            root.left=insertRecord(root.left,data);
        }
    
    
    
    return root;
  }
  
  void inOrder(Node root)
  {
    if(root!=null)
    {
       inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
    }
    
    
  }

  void search(Node root,int data)
  {
    if(root==null)
    {
       System.out.print("key "+data+" does not exists");
       return;
    }   
       
    if(data>root.data)
       search(root.right,data);
       
    else if(data<root.data)
       search(root.left,data);
       
    else
       System.out.print("key "+data+" exists");
  }
}

public class bst
{
	public static void main(String[] args) {
	   BinarySearchTree bst=new BinarySearchTree();
	   bst.insert(10);
	   bst.insert(5);
	   bst.insert(11);
	   bst.insert(7);
	   bst.insert(14);
	   bst.insert(8);
	   
	   bst.inOrder(bst.root);

           bst.inOrder(bst.root);
	   System.out.println();
	   
	   bst.search(bst.root,20);
	   System.out.println();

	   bst.search(bst.root,11);
	}
}

