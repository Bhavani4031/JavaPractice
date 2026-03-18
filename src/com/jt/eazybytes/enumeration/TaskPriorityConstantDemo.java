package com.jt.eazybytes.enumeration;

public class TaskPriorityConstantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(TaskUtil.getCompletionTime(PriorityEnum.LOW));
		System.out.println(TaskUtil.getCompletionTime(PriorityEnum.MEDIUM));
		System.out.println(TaskUtil.getCompletionTime(PriorityEnum.HIGH));
		System.out.println(TaskUtil.getCompletionTime(PriorityEnum.URGENT));
		//System.out.println(TaskUtil.getCompletionTime(10)); //compile error
		System.out.println(PriorityEnum.HIGH);
	}

}
