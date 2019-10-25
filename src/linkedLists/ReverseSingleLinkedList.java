/**
 * 
 */
package linkedLists;

import java.util.Stack;

/**
 * @author sakkenapelly
 *
 */
public class ReverseSingleLinkedList {

	public Node reverse(Node head) {
		Stack stack = new Stack();
		SingleLinkedList list = new SingleLinkedList();
		Node newNode=null;
		Node recentNode=null;
		while (head != null) {
			stack.push(head);
			head=head.next;
		}
		int stackSize=stack.size();
		for (int i=0;i<stackSize;i++) {
			if(i==0)
			{
				list.head=(Node)stack.pop();
				recentNode = list.head;
			}else
			{
				newNode=(Node)stack.pop();
				System.out.println("printing while popping stack "+newNode.data );
				recentNode.next=newNode;
				newNode.next=null;
				recentNode=newNode;
			}
		}
		return list.head;
	}
}
