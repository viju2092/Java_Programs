package com.whizlabs;

interface Cookable {

    default void cook() {
    	System.out.println("Lets start Cooking!!!!!");
    }
}
