package linked;

import node.SingleNode;

public class SinglyLinkedList<T> {
	SingleNode<T> head;
	SingleNode<T> tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	public void add(T info) {
		SingleNode<T> newNode = new SingleNode<T>(info);

		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		SingleNode<T> temp = head;

		while (!temp.equals(tail)) {
			temp = temp.getNext();
		}

		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		if (newNode.getNext() == null) {
			tail = newNode;
		}
	}

	public void remove(T info) {
		if (head == null) {
			return;
		}

		if (head.getInfo().equals(info)) {
			if (tail.equals(head)) {
				tail = null;
			}
			head = head.getNext();
			return;
		}

		if (tail.equals(head)) {
			return;
		}

		SingleNode<T> temp = head;

		while (temp.getNext() != null) {
			if (temp.getNext().getInfo().equals(info)) {
				temp.setNext(temp.getNext().getNext());
				if (temp.getNext() == null) {
					tail = temp;
				}
			}

			temp = temp.getNext();
		}
	}
}
