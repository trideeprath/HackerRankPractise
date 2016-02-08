
public class insertFromBAck {

	/*
	  Get Nth element from the end in a linked list of integers
	  Number of elements in the list will always be greater than N.
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	    
	public static int count = 0;
	public static int datum = 0;
	int GetNode(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method.
	     this.count =0;
	     this.datum =0;
	     //System.out.println("Required position : " + n);
	     get(head,n);
	    return this.datum;

	}

	public static void get(Node head, int n){
	    
	     if(head == null)
	         return;
	     
	     get(head.next,n);
	     if(count == n)
	         datum =  head.data;
	     count++; 
	     //System.out.println(head.data + " " + (count-1) );
	}

}
