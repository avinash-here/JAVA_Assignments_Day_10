package com.question2;

public class ScienceStudent extends Student{	
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
		
	public ScienceStudent(String name, String address, int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}


	@Override
	void getPercentage() {		
		int total = physicsMarks + chemistryMarks + mathsMarks;
		System.out.println("Percentege of marks = "+ (float)(total/3) + "%");
	}
	
	

}
