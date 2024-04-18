package com.projekt.controler;

import com.projekt.datenbank.Repository;

public class Controler {
	
	public static void main(String[] args) {
		
		Repository repository = new Repository();
		
		repository.insert("osman");
		repository.del("hans");
		
	}

}
