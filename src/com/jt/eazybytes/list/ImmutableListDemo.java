package com.jt.eazybytes.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> accountNums = new ArrayList<>();
		accountNums.add(53455);
		accountNums.add(53456);
		accountNums.add(53457);
		//List<Integer> immutableList = Collections.unmodifiableList(accountNums);
		//addTenDollars(immutableList);
		accountNums = List.of(53455, 53456, 53457);
		addTenDollars(accountNums);
	}

	public static List<Integer> addTenDollars(List<Integer> accountNums) {
		accountNums.add(53467);
		for(Integer account: accountNums) {
			System.out.println("Credited $10 to the account number " +account);
		}
		return accountNums;
	}
}
