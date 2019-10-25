/**
 * 
 */
package linkedLists;

import java.util.Scanner;

/**
 * @author sakkenapelly
 *
 */
public class SingleLinkedListInsert {

	public Node insertElements( int numberOfElements,Scanner scanner)
	{
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		Node newNode=null;
		Node recentNode=null;
		for(int i=0;i<numberOfElements;i++)
		{
			if(i==0)
			{
				singleLinkedList.head=new Node(Integer.parseInt(scanner.nextLine()));
				recentNode=singleLinkedList.head;
			}
			else
			{
				newNode=new Node(Integer.parseInt(scanner.nextLine()));
				recentNode.next=newNode;
				recentNode=newNode;
			}
		}
		return singleLinkedList.head;
	}
}
