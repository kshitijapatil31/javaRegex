package com.bridgelabz.email;

public class Email {

	public static void main(String[] args) {
		
		String regex1="^[a-z]{3}(.+)[a-zA-z_+-]{0,8}@([a-zA-Z]{3,14}(.+))([a-zA-z]{2})$";
		String str="abc.xy_z@Bridgelabz.co";
       System.out.println(str.matches(regex1));
	}

}
