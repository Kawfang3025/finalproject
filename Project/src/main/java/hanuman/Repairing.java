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
public class Repairing {
    
    private String repairingID;
    private String img;
    private String detail;
    private String date;
    private String department;
    private String technicainID;
    private String employeeID;

    public Repairing(String repairingID, String img, String detail, String date, String department, String technicainID, String employeeID) {
        this.repairingID = repairingID;
        this.img = img;
        this.detail = detail;
        this.date = date;
        this.department = department;
        this.technicainID = technicainID;
        this.employeeID = employeeID;
    }

    public String getRepairingID() {
        return repairingID;
    }

    public void setRepairingID(String repairingID) {
        this.repairingID = repairingID;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTechnicainID() {
        return technicainID;
    }

    public void setTechnicainID(String technicainID) {
        this.technicainID = technicainID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

}
