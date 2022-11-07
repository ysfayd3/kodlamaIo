package main.entities;

public class Course {

    private  int courseId;
    private int coursePrice;
    private String courseName;


    public Course(int courseId, int coursePrice, String courseName) {
        this.courseId = courseId;
        this.coursePrice = coursePrice;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}
