package com.question2;

public class HistoryStudent extends Student{
	
	int historyMarks;
	int civicsMarks;		

	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	void getPercentage() {	
		int total = historyMarks + civicsMarks;
		System.out.println("Percentege of marks = "+ (float)(total/2) + "%");		
	}

}
