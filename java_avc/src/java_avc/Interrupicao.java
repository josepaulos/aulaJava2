package java_avc;

import java.util.Iterator;

public class Interrupicao {
	public static void main(String[] args) {
		String names[]= {"Bernado","Breno","Breno","Carlos"};
		
		String searchName="Bernardo";
		
		boolean foudName = false;
		
	for (int i = 0; i < names.length; i++) {
		if (names[i].equals(searchName)) {
			foudName = true;
			break;
		}
	}
	if (foudName) {
		System.out.println(searchName+"encontrado");
	} else {
		System.out.println(searchName+"não encontrado");
	}
	}
}
