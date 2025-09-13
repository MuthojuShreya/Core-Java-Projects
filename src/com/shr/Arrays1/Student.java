package com.shr.Arrays1;

public record Student(String name,EducationalInstitute institute) {
	
	public void viewCoursesAndFees() {
		for(Course cours :institute.courses()) {
			System.out.println(cours.id()+";"+cours.name()+";"+cours.fee());
		}
	}
	public void viewOffers() {
		for(Offer offer :institute.offers()) {
			System.out.println(offer.offerText());
		}
	}
	public void enrollInCourse(int courseId) {
		institute.enrollStudentInCourse(courseId, name);
		
	
	}
}
