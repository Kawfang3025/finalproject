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
    private String dateRP;
    private String statusHead;
    private String statusTech;

    public Repairing(String repairingID, String img, String detail, String date, String department, String technicainID, String employeeID, String dateRP, String statusHead, String statusTech) {
        this.repairingID = repairingID;
        this.img = img;
        this.detail = detail;
        this.date = date;
        this.department = department;
        this.technicainID = technicainID;
        this.employeeID = employeeID;
        this.dateRP = dateRP;
        this.statusHead = statusHead;
        this.statusTech = statusTech;
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

    public String getDateRP() {
        return dateRP;
    }

    public void setDateRP(String dateRP) {
        this.dateRP = dateRP;
    }

    public String getStatusHead() {
        return statusHead;
    }

    public void setStatusHead(String statusHead) {
        this.statusHead = statusHead;
    }

    public String getStatusTech() {
        return statusTech;
    }

    public void setStatusTech(String statusTech) {
        this.statusTech = statusTech;
    }

    
}

