/* Generated by Together */

package model;

import java.sql.Date;
public class Course {
    public Course() {
    }

    public int getId() {
    }

    public void setId(int id) {
    }

    public String getName() {
    }

    public void setName(String name) {
    }

    public Teacher getTeacher() {
    }

    public Date getRegisterDate() {
    }

    public Date getStartDate() {
    }

    public Course registerCourse() {
    }

    public Boolean registerStudent(Member student) {
    }

    public Session addSession() {
    }

    public float calculateAttendanceRate() {
    }

    public Session getSession() {
    }

    public void setSession(Session session) {
    }

    public Student getRegisteredStudents() {
    }

    public void setRegisteredStudents(Student registeredStudents) {
    }

    private int id;
    private String name;
    private Date registerDate;
    private Date startDate;

    /**
     * @label consists of many
     * @supplierCardinality 0..*
     * @link aggregationByValue 
     */
    private Session session;
}
