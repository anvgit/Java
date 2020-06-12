package com.anvesh.basic.utility;

public class OberverDemo {
	public static void main(String args[]) {
		BeingWatched observed = new BeingWatched();
		
		Watcher observing = new Watcher();
		
		observed.addObserver(observing);
		observed.counter(10);
		
	}
}
