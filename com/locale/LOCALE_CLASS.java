package com.locale;

import java.util.Locale;

public class LOCALE_CLASS {

	public static void main(String[] args) {
		Locale obj = new Locale("English","Spanish");
							// language, COUNTRY
							//lowercase, UPPERCASE
		System.out.println(obj.getLanguage());
		System.out.println(obj.getCountry());  
	}

}
