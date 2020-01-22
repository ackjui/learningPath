import java.io.*;

//Java Program to implement Linked List public class SinglyLinkedList{

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
			System.out.println(current.data + " ");
			
			//Go to the next node
			current = current.next;
		}
			System.out.println("\n");
	}

	//Delete from LinkedList using Key
	public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key)
	{
		Node currentNode = list.head;
		if(currentNode != null && currentNode.data == key)
		{
			if(currentNode.next != null)
			{
				list.head = currentNode.next;					
				return list;

			}
			else
			{
				list.head = null;
				return list;
			}
		}
		else
		{
			while(currentNode.next != null)
			{
				if(currentNode.next.data == key)
				{
					currentNode.next = currentNode.next.next;
					return list;
				}
				currentNode = currentNode.next;
			}
		}

		return list;
	}

	//deletion at a position by index
	public static SinglyLinkedList deleteByPosition(SinglyLinkedList list, int idx)
	{
		Node currentNode = list.head;
		Node prevNode = null;
		int counter = 0;

		if(idx == 0 && currentNode != null)
		{
			list.head = currentNode.next;
			return list;
			
		}
	
		while(currentNode != null)
		{
			if(counter == idx)
			{
				prevNode.next = currentNode.next;
				break;		
			}
			else
			{
				prevNode = currentNode;
				currentNode = currentNode.next;
				counter++;
			}				
		}

		if(currentNode == null)
		{
			System.out.println(idx + " element in the Linked List Not Found.");
		}

		return list;
	}
	

	public static void main(String[] args)
	{
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);

		printList(list);

		list.deleteByPosition(list, 1);
		
		printList(list);

		list.deleteByKey(list, 1);

		printList(list);

		list.deleteByKey(list, 3);

		printList(list);
	}

}
