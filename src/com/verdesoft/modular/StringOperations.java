package com.verdesoft.modular;

import java.util.Arrays;

public class StringOperations {
	
	private String[] stringArray;
	
	/* Sobrecarga de métodos en el constructor, vacio, 2 parametros y un array */
	public StringOperations() {

	}
	
	public StringOperations(String string1, String string2) {
		this.stringArray = new String[] {string1, string2};
	}

	public StringOperations(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public String[] getStringArray() {
		return stringArray;
	}


	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	@Override
	public String toString() {
		return "StringOperations [stringArray=" + Arrays.toString(stringArray) + "]";
	}
	
	/* Extra method */
	public String concat() {
		String baseString = "";
		for (String string : stringArray) {
			baseString += string;
		}
		return baseString;
	}

}
