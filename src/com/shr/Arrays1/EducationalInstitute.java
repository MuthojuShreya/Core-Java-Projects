package com.shr.Arrays1;

public record EducationalInstitute(Course[] courses,Offer[] offers) {
	public void enrollStudentInCourse(int courseId,String studentName) {
		for(Course cours : courses) {
			if(cours.id()==courseId)
			{
			System.out.println("Enrolled in: "+cours.name());
			}			
		}
		System.out.println("Course with ID "+courseId+" not found");
			
		}
}
