package com.jt.eazybytes.enumeration;

public class TaskUtil {

	/*
	 * public static int getCompletionTime(int priority) { return switch(priority) {
	 * case Priority.LOW -> 7; case Priority.HIGH -> 5; case Priority.MEDIUM -> 3;
	 * case Priority.URGENT -> 1; default -> throw new
	 * IllegalStateException("unexpected value: " +priority); }; }
	 */
	
	public static int getCompletionTime(PriorityEnum priority) {
		return switch (priority) {
			case PriorityEnum.LOW -> 7;
			case PriorityEnum.MEDIUM -> 5;
			case PriorityEnum.HIGH -> 3;
			case PriorityEnum.URGENT -> 1;
		};
	}
}
