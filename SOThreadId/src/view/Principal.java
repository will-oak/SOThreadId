package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		ThreadController tc1 = new ThreadController();
		ThreadController tc2 = new ThreadController();
		ThreadController tc3 = new ThreadController();
		ThreadController tc4 = new ThreadController();
		ThreadController tc5 = new ThreadController();
		
		tc1.start();
		tc2.start();
		tc3.start();
		tc4.start();
		tc5.start();
	}

}
