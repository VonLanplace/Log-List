package controller;

import model.CircleList;

public class Test {
	public Test() {
		super();
	}

	public void exec() throws Exception {
		CircleList<String> lista = new CircleList<String>(6);
		lista.add(" Item 1");
		lista.add(" Item 2");
		lista.add(" Item 3");
		lista.add(" Item 4");
		lista.add(" Item 5");
		lista.add(" Item 6");
		lista.add(" Item 7");
		lista.add(" Item 8");
		lista.add(" Item 9");
		lista.add(" Item 10");
		System.out.println(lista.toString());
	}
}
