package com.threads;

public class RunThread extends Thread {
	Train train;
	RunThread(Train train){
		this.train = train;
	}
	
	public void run(){
		train.move();
	}
	

}
