import java.io.*;

//Java Program to implement Linked List
public class SinglyLinkedList{

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	//Method to insert a new node
	public static SinglyLinkedList insert(SinglyLinkedList list, int data)
	{
		//Create a new Node with given data
		Node newNode = new Node(data);

		//If the Linked List is empty
		//then make the newNode as head
		if(list.head == null)
		{
			list.head = newNode;
		}
		else
		{
			//Else traverse till the last node
			//and insert the newNode there
			Node last = list.head;
			while(last.next != null)
			{
				last = last.next;		
			}
			
			//Insert newNode at last node
			last.next = newNode;
		}
	//Return the list by Head
	return list;
	}

	public static void printList(SinglyLinkedList list)
	{
		Node current = list.head;
		System.out.println("\nLinkedList: ");

		//Traverse through the LinkedList
		while(current != null)
		{
			//Print the data at the current node
			System.out.println("current.data" + " ");
			
			//Go to the next node
			current = current.next;		
		}
			System.out.println("\n");
	}

	public static void main(String[] args)
	{
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);

		printList(list);
	}

}
