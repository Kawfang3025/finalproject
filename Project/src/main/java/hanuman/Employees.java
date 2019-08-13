/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanuman;
/**
 *
 * @author win
 */
public class Employees {
    
    private String employeeID;
    private String firstName;
    private String lastName;
    private String nickname;
    private String department;
    private String positions;
    private String telNumber;
    private String e_mail;
    private String password;
    private String img;

    public Employees(String employeeID, String firstName, String lastName, String nickname, String department, String positions, String telNumber, String e_mail, String password, String img) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.department = department;
        this.positions = positions;
        this.telNumber = telNumber;
        this.e_mail = e_mail;
        this.password = password;
        this.img = img;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
