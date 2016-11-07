package main;

import db.DataBase;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Open the database and launch the main window
		DataBase db = new DataBase();
		db.createTables();
		
		//launch window and pass in db

	}

}
