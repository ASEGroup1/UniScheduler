package entities.people

import entities.course.Course

class Student extends Person{
	var studentId: Int = _
	var course: Course = _
	var currentFehqLevelCompleted: Int = _
	var academicAdvisor: Staff = _
}