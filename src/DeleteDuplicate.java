
public class DeleteDuplicate {

	/*
	Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/

	public static Set<Integer> dataSet = new HashSet<Integer>();

	Node RemoveDuplicates(Node head) {
	  // This is a "method-only" submission. 
	  // You only need to complete this method. 
	  dataSet.clear();
	  if (head ==null || head.next ==null)
	      return head;
	  else{
	      Node current = head.next;
	      Node prev = head;
	      this.dataSet.add(prev.data);
	      remove(prev,current);
	  }
	  
	  return head;
	}

	public static void remove(Node previous , Node current){
	    if(current == null){
	        return;
	    }
	    if(dataSet.contains(current.data)){
	        previous.next = current.next;
	        current = current.next;
	        remove(previous,current);
	    }
	    else{
	        dataSet.add(current.data);
	        previous = previous.next;
	        current = current.next;
	        remove(previous,current);
	    }
	    
	}

}
