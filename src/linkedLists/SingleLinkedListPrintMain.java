/**
 * 
 */
package linkedLists;

/**
 * @author sakkenapelly
 *
 */
public class SingleLinkedListPrintMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node firstNode = new Node(26);
		Node secondNode = new Node(51);
		Node thirdNode= new Node(87);
		
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.head=firstNode;
		firstNode.next=secondNode;
		secondNode.next=thirdNode;
		SingleLinkedListPrint singleLinkedListPrint = new SingleLinkedListPrint(); 
		singleLinkedListPrint.printElements(singleLinkedList.head);
		
	}

}
