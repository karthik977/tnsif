package com.tnsif.Intro;

	public class Generics<T> {
	    private T item;

	    public void set(T item) {
	        this.item = item;
	    }

	    public T get() {
	        return item;
	    }

	    public static void main(String[] args) {
	        Generics<String> stringBox = new Generics<>();
	        stringBox.set("Hello");
	        System.out.println(stringBox.get());

	        Generics<Integer> intBox = new Generics<>();
	        intBox.set(123);
	        System.out.println(intBox.get());
	    }
	}


