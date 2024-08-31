
package models;

public class Section {
    private String sectionName;
    private int room;
    private Course course;

    public Section() {
        this("", 0, null);
    }

    public Section(String sectionName, int room, Course course) {
        this.sectionName = sectionName;
        this.room = room;
        this.course = course;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }


    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    
}
