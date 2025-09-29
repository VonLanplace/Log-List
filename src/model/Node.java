package model;

public class Node<T> {
	private T content;
	private Node<T> next;
	private Node<T> previous;

	public Node(Node<T> previous, T content, Node<T> next) {
		this.content = content;
		this.next = next;
		this.previous = previous;
	}

	public Node(T content, Node<T> next) {
		this(null, content, next);
	}

	public Node(Node<T> previous, T content) {
		this(previous, content, null);
	}

	public Node(T content) {
		this(null, content, null);
	}

	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		if (this.content == null) {
			return null;
		} else {
			return content;
		}
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getNext() {
		if (this.next == null) {
			return null;
		} else {
			return next;
		}
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	public Node<T> getPrevious() {
		if (this.previous == null) {
			return null;
		} else {
			return previous;
		}
	}

	public void clearNode() {
		this.content = null;
		this.next = null;
		this.previous = null;
	}

	public String toString() {
		return this.content.toString();
	}
}
