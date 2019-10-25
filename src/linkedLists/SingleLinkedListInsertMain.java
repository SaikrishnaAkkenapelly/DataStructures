/**
 * 
 */
package linkedLists;

import java.util.Scanner;

/**
 * @author sakkenapelly
 *
 */
public class SingleLinkedListInsertMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedListInsert singleLinkedListInsert = new SingleLinkedListInsert();
		SingleLinkedListPrint singleLinkedListPrint = new SingleLinkedListPrint();
		System.out.println("Enter number of elements to insert");
		Scanner scanner = new Scanner(System.in);
		int numberOfElements = Integer.parseInt(scanner.nextLine());
		Node head = singleLinkedListInsert.insertElements(numberOfElements, scanner);
		singleLinkedListPrint.printElements(head);
	}

}
