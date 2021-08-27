package com.bridgelabz.email;

public class Email {

	public static void main(String[] args) {
		String regex="^[a-z]{3}";
		String regex1="@[a-zA-Z]{3,20}(.+)$";
		String str="@Bridgelabz.co";
       System.out.println(str.matches(regex1));
	}

}
