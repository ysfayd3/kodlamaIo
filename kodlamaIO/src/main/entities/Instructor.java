package main.entities;

public class Instructor {

    private int ınstructorId;
    private String ınstructorName;

    public Instructor(int ınstructorId, String ınstructorName) {
        this.ınstructorId = ınstructorId;
        this.ınstructorName = ınstructorName;
    }

    public int getInstructorId() {
        return ınstructorId;
    }

    public void setInstructorId(int ınstructorId) {
        this.ınstructorId = ınstructorId;
    }

    public String getInstructorName() {
        return ınstructorName;
    }

    public void setInstructorName(String ınstructorName) {
        this.ınstructorName = ınstructorName;
    }


}
