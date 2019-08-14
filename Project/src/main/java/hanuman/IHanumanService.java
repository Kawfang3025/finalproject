package hanuman;

import java.util.ArrayList;
import hanuman.Repairing;
import hanuman.Employees;
import java.util.List;

public interface IHanumanService {
    public ArrayList<Repairing> selectRepairingAll();
    public ArrayList<Repairing> selectRepairingByID(String repairingID);
    public ArrayList<Repairing> selectRepairingByTechnicain(String technicainID);
    public ArrayList<Repairing> selectRepairingByDepartment(String department);
    public ArrayList<Employees> selectEmployeesAll();
    public ArrayList<Employees> selectEmployeesByID(String  employeesID);
    public ArrayList<Employees> selectEmployeesByDepartment(String department);
    public ArrayList<Technicains> selectTechnicainsAll();
    public ArrayList<Technicains> selectTechnicainsByID(String technicainID);
    public ArrayList<Technicains> selectTechnicainsByDepartment(String department);
    public abstract void deleteRepairingByID(String repairingID);
    public abstract void deleteEmployeesByID(String employeesID);
    public abstract void deleteTechnicainsByID(String TechnicainsID);
    public  abstract void insertRepairing(String img, String detail, String date, String department, String technicainID, String employeeID);    
    public abstract void insertEmployee(String firstName,String lastName,String nickname,String department,String positions,String telNumber,String e_mail,String password,String img);
    public abstract void insertTechnicain(String firstName,String lastName,String nickname,String department,String positions,String telNumber,String e_mail,String password,String img);
    public abstract void updateRepairing(String repairingID,String img,String detail,String date,String department,String technicainID,String employeeID);
    public abstract void updateEmployee(String employeeID,String firstName,String lastName,String nickname,String department,String positions,String telNumber,String e_mail,String password,String img);
    public abstract void updateTechnicain(String technicainID,String firstName,String lastName,String nickname,String department,String positions,String telNumber,String e_mail,String password,String img);
    public abstract void updateStatusHead(String repairingID,String statusHead);
    public abstract void updateStatusTech(String repairingID,String statusTech);
    public abstract void updateDateRP(String repairingID,String dateRP);
}