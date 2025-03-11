package node;

public class SingleNode<T> {
	T info;
	SingleNode<T> next;

	public SingleNode(T info, SingleNode<T> next) {
		setInfo(info);
		setNext(next);
	}

	public SingleNode(T info) {
		setInfo(info);
		this.next = null;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public void setNext(SingleNode<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public SingleNode<T> getNext() {
		return next;
	}
}
