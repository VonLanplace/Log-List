package view;

import controller.Test;

public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.exec();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
