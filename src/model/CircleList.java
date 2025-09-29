package model;

public class CircleList<T> {
	private int MAX_ELEMENTS;
	private Node<T> lastIn;
	private int size;

	public CircleList(int maxElements) {
		super();
		this.MAX_ELEMENTS = maxElements;
		this.size = 0;
		this.lastIn = null;
	}

	public String toString() {
		if (this.lastIn == null) {
			return "[]";
		}
		StringBuilder text = new StringBuilder("[\n");
		Node<T> buffer = this.lastIn;
		for (int i = 0; i < this.size; i++) {
			text.append(buffer.toString()).append("\n");
			buffer = buffer.getPrevious();
		}
		text.append("]");
		return text.toString();
	}

	public void add(T content) throws Exception {
		if (content == null || content.equals("")) {
			throw new IllegalArgumentException("Content cannot be null");
		}
		if (this.lastIn == null) {
			Node<T> newNode = new Node<T>(content);
			newNode.setNext(newNode);
			newNode.setPrevious(newNode);
			this.lastIn = newNode;
			this.size++;
		} else {
			if (size < MAX_ELEMENTS) {
				Node<T> newNode = new Node<T>(content);
				newNode.setNext(this.lastIn.getNext());
				newNode.setPrevious(this.lastIn);

				this.lastIn.setNext(newNode);
				newNode.getNext().setPrevious(newNode);

				this.lastIn = newNode;
				this.size++;
			} else {
				Node<T> oldNode = lastIn.getNext();
				oldNode.setContent(content);
				this.lastIn = oldNode;
			}
		}
	}
}
