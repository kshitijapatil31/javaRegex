package com.bridgelabz.pincode;

public class PinCode {

	public static void main(String[] args) {
		String regex="[0-9]{6}";
		String str="400008";
        System.out.println(str.matches(regex));
	}

}
