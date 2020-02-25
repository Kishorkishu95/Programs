package com.threads;

public class Train {
	
	synchronized public void move(){
		for(int i=0; i<3; i++){
			System.out.println(i);
			try{
				Thread.sleep(2000);
				
			}
			catch(Exception e){
				System.out.println(e);
				
			}
			
		}
		System.out.println("Sync has been done!!");
		
	}

	public static void main(String[] args) {
		Train t = new Train();
		
		RunThread rt1 = new RunThread(t);
		RunThread rt2 = new RunThread(t);
		
		rt1.start();
		rt2.start();

		
		

	}

}
