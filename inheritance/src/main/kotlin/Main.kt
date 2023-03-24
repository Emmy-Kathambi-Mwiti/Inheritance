/*In a class of 57 students the teacher was collecting data of her students,
 * The data she required was:
 * The gender of the students
 * The course they are doing
 * the feedback on boys playing football
 * the feedback on the ladies playing hockey
 * the feedback on the curriculum
 * Using inheritance, represent the gender and the course as
 * properties and the feedback as methods*/
// Define a base class for students with properties for gender and course
// Define a base class for students with properties for gender and course
open class Student(val gender: String, val course: String) {
    // Feedback methods to be implemented by subclasses
    open fun footballFeedback(): String {
        return "No feedback provided"
    }
    open fun hockeyFeedback(): String {
        return "No feedback provided"
    }
    open fun curriculumFeedback(): String {
        return "No feedback provided"
    }
}

// Subclass for male students with additional football feedback
class MaleStudent(course: String, val football: String) : Student("Male", course) {
    override fun footballFeedback(): String {
        return football
    }
}

// Subclass for female students with additional hockey feedback
class FemaleStudent(course: String, val hockey: String) : Student("Female", course) {
    override fun hockeyFeedback(): String {
        return hockey
    }
}

// Create a list of students
fun main(){
    val students = listOf(
        MaleStudent("Maths", "Good"),
        FemaleStudent("Physics", "Excellent"),
        MaleStudent("English", "Average"),
        FemaleStudent("Biology", "Poor"),
    )

    for (student in students) {
        println("${student.gender} student doing ${student.course}")
        println("Football feedback: ${student.footballFeedback()}")
        println("Hockey feedback: ${student.hockeyFeedback()}")
        println("Curriculum feedback: ${student.curriculumFeedback()}")
    }

}
