package controller;

public class EmptyQueueException extends Exception{
	public String toString() {
		return "Empty Deque!";
	}
}
