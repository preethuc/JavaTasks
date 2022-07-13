package org.rough;
class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld!");
		Bill b = new Bill(2);
		System.out.println("Current Customer : " + b.getUserName());
		
	}
}

