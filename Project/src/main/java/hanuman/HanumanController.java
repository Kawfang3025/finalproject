package hanuman;
import hanuman.Repairing;
import hanuman.Employees;
import hanuman.Technicains;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*" , allowedHeaders ="*")
public class HanumanController {
    @Autowired
    private IHanumanService Repairing;
    @Autowired
    private IHanumanService Employees;
    @Autowired
    private IHanumanService Technicains;
    
    @RequestMapping("/repairing")
    public List<Repairing> listRepairing() {
        return Repairing.selectRepairingAll();
    }
    
    @RequestMapping("/repairing/repairingID/{id}")
    public List<Repairing> selectRepairingByID(@PathVariable("id") String id) {
        return Repairing.selectRepairingByID(id); 
    }
    
    @RequestMapping("/repairing/technicain/{technicainID}")
    public List<Repairing> selectRepairingByTechnicain(@PathVariable("technicainID") String id) {
        return Repairing.selectRepairingByTechnicain(id);
    }
    
    @RequestMapping("/repairing/department/{department}")
    public List<Repairing> selectRepairingByDepartment(@PathVariable("department") String department) {
        return Repairing.selectRepairingByDepartment(department);
    }
    
    @RequestMapping("/employees")
    public List<Employees> listEmployees() {
        return Employees.selectEmployeesAll();
    }
    @RequestMapping("/employees/employeeID/{id}")
    public List<Employees> selectEmployeesByID(@PathVariable("id") String id) {
        return Employees.selectEmployeesByID(id);
    }
    
    @RequestMapping("/employees/department/{department}")
    public List<Employees> selectEmployeesByDepartment(@PathVariable("department") String department) {
        return Employees.selectEmployeesByDepartment(department);   
    }
    
    @RequestMapping("/technicains")
    public List<Technicains> listTechnicains() {
        return Technicains.selectTechnicainsAll();
    }
    
    @RequestMapping("/technicains/technicainID/{id}")
    public List<Technicains> selectTechnicainsByID(@PathVariable("id") String id) {
        return Technicains.selectTechnicainsByID(id);
    }
    
    @RequestMapping("/technicains/department/{department}")
    public List<Technicains> selectTechnicainsByDepartment(@PathVariable("department") String department) {
        return Technicains.selectTechnicainsByDepartment(department);
    }
    
    @RequestMapping("/repairing/delete/{id}")
    public void deleteRepairingByID(@PathVariable("id") String id) {
        Repairing.deleteRepairingByID(id);
    }
    
    @RequestMapping("/employees/delete/{id}")
    public void deleteEmployeesByID(@PathVariable("id") String id) {
        Employees.deleteEmployeesByID(id);
    }
    
     @RequestMapping("/technicains/delete/{id}")
    public void deleteTechnicainsByID(@PathVariable("id") String id) {
        Technicains.deleteTechnicainsByID(id);
    }
    
    @RequestMapping("/repairing/insert/{img},{detail},{date},{department},{technicainID},{employeeID}")
    public void insertRepairing(@PathVariable("img") String img, @PathVariable("detail") String detail, @PathVariable("date") String date, @PathVariable("department") String department,@PathVariable("technicainID") String technicainID, @PathVariable("employeeID") String employeeID) {
       Repairing.insertRepairing( img, detail, date, department, technicainID, employeeID);
    }
    
    @RequestMapping("/employees/insert/{firstName},{lastName},{nickname},{department},{positions},{telNumber},{e_mail},{password},{img}")
    public void insertEmployee( @PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName, @PathVariable("nickname") String nickname, @PathVariable("department") String department,@PathVariable("positions") String positions, @PathVariable("telNumber") String telNumber, @PathVariable("e_mail") String e_mail, @PathVariable("password") String password, @PathVariable("img") String img) {
       Employees.insertEmployee( firstName, lastName, nickname, department, positions, telNumber, e_mail, password, img);
    }
    
    @RequestMapping("/technicains/insert/{firstName},{lastName},{nickname},{department},{positions},{telNumber},{e_mail},{password},{img}")
    public void insertTechnicain(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName, @PathVariable("nickname") String nickname, @PathVariable("department") String department,@PathVariable("positions") String positions, @PathVariable("telNumber") String telNumber, @PathVariable("e_mail") String e_mail, @PathVariable("password") String password, @PathVariable("img") String img) {
       Technicains.insertTechnicain(firstName, lastName, nickname, department, positions, telNumber, e_mail, password, img);
    }
    
    @RequestMapping("/repairing/update/{img},{detail},{date},{department},{technicainID},{employeeID}")
    public void updateRepairing(@PathVariable("repairingID") String repairingID, @PathVariable("img") String img, @PathVariable("detail") String detail, @PathVariable("date") String date, @PathVariable("department") String department,@PathVariable("technicainID") String technicainID, @PathVariable("employeeID") String employeeID) {
       Repairing.updateRepairing(repairingID, img, detail, date, department, technicainID, employeeID);
    }
    
    @RequestMapping("/employees/update/{employeeID},{firstName},{lastName},{date},{department},{positions},{telNumber},{e_mail},{password},{img}")
    public void updateEmployee(@PathVariable("employeeID") String employeeID,@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName, @PathVariable("date") String date, @PathVariable("department") String department,@PathVariable("positions") String positions, @PathVariable("telNumber") String telNumber, @PathVariable("e_mail") String e_mail, @PathVariable("password") String password, @PathVariable("img") String img) {
       Employees.updateEmployee(employeeID, firstName, lastName, date, department, positions, telNumber, e_mail, password, img);
    }
    
    @RequestMapping("/technicains/update/{technicainID},{firstName},{lastName},{date},{department},{positions},{telNumber},{e_mail},{password},{img}")
    public void updateTechnicain(@PathVariable("technicainID") String technicainID, @PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName, @PathVariable("date") String date, @PathVariable("department") String department,@PathVariable("positions") String positions, @PathVariable("telNumber") String telNumber, @PathVariable("e_mail") String e_mail, @PathVariable("password") String password, @PathVariable("img") String img) {
       Technicains.updateTechnicain(technicainID, firstName, lastName, date, department, positions, telNumber, e_mail, password, img);
    }
    
    @RequestMapping("/repairing/update/statusHead/{repairingID}")
    public void updateStatusHead(@PathVariable("repairingID") String repairingID) {
       Repairing.updateStatusHead(repairingID);
    }
    
    @RequestMapping("/repairing/update/statusTech/{repairingID}")
    public void updateStatusTech(@PathVariable("repairingID") String repairingID) {
       Repairing.updateStatusTech(repairingID);
    }
    
    @RequestMapping("/repairing/update/dateRP/{repairingID},{dateRP}")
    public void updateDateRP(@PathVariable("repairingID") String repairingID, @PathVariable("dateRP") String dateRP) {
       Repairing.updateDateRP(repairingID,dateRP);
    }
    
    @RequestMapping("/repairing/update/technicainID/{repairingID},{technicainID}")
    public void updateDateTechnicainRP(@PathVariable("repairingID") String repairingID, @PathVariable("technicainID") String technicainID) {
       Repairing.updateDateTechnicainRP(repairingID,technicainID);
    }
}