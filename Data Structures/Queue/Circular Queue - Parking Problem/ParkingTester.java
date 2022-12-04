package com.queueImpl2;

import java.util.Scanner;

public class ParkingTester {
	public static void main(String[] args) throws MyQueueException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Circular Queue: ");
		MyCircularQueue parkingSlot = new MyCircularQueue(3);
		MyCircularQueue waitingQueue = new MyCircularQueue(2);

		int choice=0;
		do {
			System.out.println("\n1.Park vehicle \n2.Remove vehicle \n3.Display parking Queue \n10.Exit");
			choice = sc.nextInt();
			try{
				switch(choice) {
				case 1: 
					if(!parkingSlot.isFull()) {
						System.out.println("Enter 4 digit vehicle number: ");
						parkingSlot.enqueue(sc.nextInt());
					}
					else if(parkingSlot.isFull() && !waitingQueue.isFull()) {
						System.out.println("You will be put in waiting queue.");
						System.out.println("Enter 4 digit vehicle number: ");
						waitingQueue.enqueue(sc.nextInt());
					}
					else System.out.println("No parking spot available.");
					break;

				case 2: 
					System.out.println(parkingSlot.dequeue());
					if(!waitingQueue.isEmpty())
						parkingSlot.enqueue(waitingQueue.dequeue());
					break;
					
				case 3:
					System.out.println("Parking spot:");
					parkingSlot.display();
					System.out.println("Waiting Queue:");
					waitingQueue.display();
					break;

				case 10: 
					System.out.println("Enter 4 digit vehicle number: ");
					break;
				
				default:
					System.out.println("Invalid choice.");
					break;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}while(choice!=10);
	}
}