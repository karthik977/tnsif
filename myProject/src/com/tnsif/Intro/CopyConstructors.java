package com.tnsif.Intro;

public class CopyConstructors {
	String sname;
	CopyConstructors(String sname){
		this.sname = sname;
	}
	public static void main(String args[]) {
		CopyConstructors cc = new CopyConstructors("abc");
		
	}
}
