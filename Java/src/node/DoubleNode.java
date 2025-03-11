package node;

public class DoubleNode<T> {
	T info;
	DoubleNode<T> next;
	DoubleNode<T> prev;

	public DoubleNode(T info, DoubleNode<T> next, DoubleNode<T> prev) {
		setInfo(info);
		setNext(next);
		setPrev(prev);
	}

	public DoubleNode(T info) {
		setInfo(info);
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}

	public void setPrev(DoubleNode<T> prev) {
		this.prev = prev;
	}

	public T getInfo() {
		return info;
	}

	public DoubleNode<T> getNext() {
		return next;
	}

	public DoubleNode<T> getPrev() {
		return prev;
	}
}
