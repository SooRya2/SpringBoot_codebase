package com;

public abstract class Account {
	private double interestrate;
	private double amount;

	public abstract double calculateInterest();

}

class FDAccount extends Account {
	private double interestrate;
	private double amount;
	private int noOfDays;
	private int ageOfACHolder;
	private double r;

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}

	public double calculateInterest() {
		if (amount < 10000000) {
			if (noOfDays >= 61 && noOfDays <= 184) {
				if (ageOfACHolder > 60) {
					interestrate = 8.00;
				} else if (ageOfACHolder < 60) {
					interestrate = 7.50;
				}
			}

			if (noOfDays >= 7 && noOfDays <= 14) {
				if (ageOfACHolder > 60) {
					interestrate = 5.00;
				} else if (ageOfACHolder < 60) {
					interestrate = 4.50;
				}
			}

			if (noOfDays >= 15 && noOfDays <= 29) {
				if (ageOfACHolder > 60) {
					interestrate = 5.25;
				} else if (ageOfACHolder < 60) {
					interestrate = 4.75;
				}
			}

			if (noOfDays >= 30 && noOfDays <= 45) {
				if (ageOfACHolder > 60) {
					interestrate = 6.00;
				} else if (ageOfACHolder < 60) {
					interestrate = 5.50;
				}
			}

			if (noOfDays >= 45 && noOfDays <= 60) {
				if (ageOfACHolder > 60) {
					interestrate = 7.50;
				} else if (ageOfACHolder < 60) {
					interestrate = 7.00;
				}
			}

			if (noOfDays >= 185 && noOfDays <= 365) {
				if (ageOfACHolder > 60) {
					interestrate = 8.50;
				} else if (ageOfACHolder < 60) {
					interestrate = 8.00;
				}
			} else {
				System.out.println("Invalid Number of days. Please enter correct values");
			}
		} else if (amount > 10000000) {
			if (noOfDays >= 61 && noOfDays <= 184) {
				interestrate = 8.50;
			}

			if (noOfDays >= 7 && noOfDays <= 14) {
				interestrate = 6.50;

			}

			if (noOfDays >= 15 && noOfDays <= 29) {
				interestrate = 6.75;

			}

			if (noOfDays >= 30 && noOfDays <= 45) {

				interestrate = 6.75;
			}

			if (noOfDays >= 45 && noOfDays <= 60) {
				interestrate = 8;
			}

			if (noOfDays >= 185 && noOfDays <= 365) {

				interestrate = 10.00;

			}
		}

		r = (amount * interestrate) / 100;
		return r;
	}
}

class SBAccount extends Account {
	private double interestrate=4.00;
	private double amount;
	private double interest;

	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double calculateInterest() {
		interest = (amount*interestrate)/100;
		return interest;
	}

}

class RDAccount extends Account {
	private double interestrate;
	private double amount;
	private int noOfMonths;
	private int monthlyAmount;
	private int age;
	private double interest;

	
	public void setAmount(double amount) {
		// TODO Auto-generated method stub
		this.amount = amount;
	}

	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	
	public void setAge(int age) {
		this.age = age;
	}


	public double calculateInterest() {
		if(noOfMonths==6)
		{
			if (age > 60) {
				interestrate = 8.00;
			} else if (age < 60) {
				interestrate = 7.50;
			}
		}
		if(noOfMonths==9)
		{
			if (age > 60) {
				interestrate = 8.20;
			} else if (age < 60) {
				interestrate = 7.75;
			}
		}
		if(noOfMonths==12)
		{
			if (age > 60) {
				interestrate = 8.00;
			} else if (age < 60) {
				interestrate = 8.50;
			}
		}
		if(noOfMonths==15)
		{
			if (age > 60) {
				interestrate = 8.00;
			} else if (age < 60) {
				interestrate = 9.00;
			}
		}
		if(noOfMonths==18)
		{
			if (age > 60) {
				interestrate = 8.50;
			} else if (age < 60) {
				interestrate = 9.00;
			}
		}
		interest=(noOfMonths*amount)/100;
		return interest;
	}


	
}
