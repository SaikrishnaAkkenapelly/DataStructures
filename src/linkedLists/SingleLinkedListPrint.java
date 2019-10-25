/**
 * 
 */
package linkedLists;

/**
 * @author sakkenapelly
 *
 */
public class SingleLinkedListPrint {

	public void printElements(Node head)
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			while(head!=null)
			{
				System.out.println(head.data);
				head=head.next;
			}
		}
	}
}
