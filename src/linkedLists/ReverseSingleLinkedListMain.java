/**
 * 
 */
package linkedLists;

import java.util.Scanner;

/**
 * @author sakkenapelly
 *
 */
public class ReverseSingleLinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList list = new SingleLinkedList();
		SingleLinkedListInsert singleLinkedListInsert = new SingleLinkedListInsert();
		SingleLinkedListPrint singleLinkedListPrint = new SingleLinkedListPrint();
		ReverseSingleLinkedList reverseList = new ReverseSingleLinkedList();
		System.out.println("Enter number of elements to insert");
		Scanner scanner = new Scanner(System.in);
		int numberOfElements = Integer.parseInt(scanner.nextLine());
		Node head = singleLinkedListInsert.insertElements(numberOfElements, scanner);
		System.out.println("before reversing");
		singleLinkedListPrint.printElements(head);
		System.out.println("after reversing");
		head=reverseList.reverse(head);
		singleLinkedListPrint.printElements(head);
	}

}
