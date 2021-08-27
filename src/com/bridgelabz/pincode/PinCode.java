package com.bridgelabz.pincode;

public class PinCode {

	public static void main(String[] args) {
		String regex="^[0-9]{3}\\s{0,1}[0-9]{3}$";
		String str="400 008";
        System.out.println(str.matches(regex));
	}

}
