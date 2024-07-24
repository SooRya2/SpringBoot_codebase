package com;

import java.util.Scanner;

public class InterestRate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option:\n1. Interest Calculator –SB\r\n"
				+ "2. Interest Calculator –FD\r\n"
				+ "3. Interest Calculator –RD\r\n"
				+ "4. Exit");
		int n = sc.nextInt();

		SBAccount sba = new SBAccount();
		

		if (n == 1) {
			System.out.println("Enter the Average amount in your account: ");
			int s = sc.nextInt();
			sba.setAmount(s);
			System.out.println(sba.calculateInterest());
		} else if (n == 2) {
			System.out.println("Enter the FD amount: ");
			double f = sc.nextDouble();
			System.out.println("Enter the number of days: ");
			int d = sc.nextInt();
			System.out.println("Enter your age");
			int a = sc.nextInt();
			FDAccount fd = new FDAccount();
			fd.setAmount(f);
			fd.setAgeOfACHolder(a);
			fd.setNoOfDays(d);
			System.out.println(fd.calculateInterest());
		} else if (n == 3) {
			RDAccount rda = new RDAccount();
			System.out.println("Enter the RD amount: ");
			double f = sc.nextDouble();
			System.out.println("Enter the number of months: ");
			int d = sc.nextInt();
			System.out.println("Enter your age: ");
			int a=sc.nextInt();
		    rda.setAmount(f);
			rda.setNoOfMonths(d);
			rda.setAge(a);
			System.out.println(rda.calculateInterest());
		} else {
			System.out.println("Invalid");
		}

	}

}
