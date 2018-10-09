package test;


import java.io.*;

import Monkey.monkey;
import cat.Cat;
import dog.Dog;



public class Animal {
	public  void method() {
		
		
	}
	
	public static void main(String args[]) {
		Animal arr[] = new Animal[5];
		arr[0] = new Cat();
		arr[1] = new Dog();
		arr[2] = new monkey();

		for (int i = 0; i < 3; i++) {
			arr[i].method();
		}
	}
}