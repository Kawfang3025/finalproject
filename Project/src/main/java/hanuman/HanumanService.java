package hanuman;

import java.sql.*;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class HanumanService implements IHanumanService{
    private ArrayList<Repairing> Repairing;
    private ArrayList<Employees> Employees;
    private ArrayList<Technicains> Technicains;
    public HanumanService() {
        Repairing = new ArrayList();
        Employees = new ArrayList();
        Technicains = new ArrayList();
    }
    
    @Override
    public ArrayList<Repairing> selectRepairingAll() {
        PreparedStatement stmt = null;
        Connection con = null;
        Repairing = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM repairing";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Repairing newRepair = new Repairing(
                        rs.getString("repairingID"),
                        rs.getString("img"),
                        rs.getString("detail"),
                        rs.getString("date"),
                        rs.getString("department"),
                        rs.getString("technicainID"),
                        rs.getString("employeeID"),
                        rs.getString("dateRP"),
                        rs.getString("statusHead"),
                        rs.getString("statusTech"));
                Repairing.add(newRepair);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Repairing;
    }
    public ArrayList<Repairing> selectRepairingByID(String repairingID) {
        PreparedStatement stmt = null;
        Connection con = null;
        Repairing = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM repairing WHERE repairingID Like '%" + repairingID + "%'";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Repairing newRepair = new Repairing(
                        rs.getString("repairingID"),
                        rs.getString("img"),
                        rs.getString("detail"),
                        rs.getString("date"),
                        rs.getString("department"),
                        rs.getString("technicainID"),
                        rs.getString("employeeID"),
                        rs.getString("dateRP"),
                        rs.getString("statusHead"),
                        rs.getString("statusTech"));
                Repairing.add(newRepair);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Repairing;
    }

    @Override
    public ArrayList<Repairing> selectRepairingByDepartment(String department) {
       PreparedStatement stmt = null;
        Connection con = null;
        Repairing = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM repairing WHERE department Like '%" + department + "%'";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Repairing newRepair = new Repairing(
                        rs.getString("repairingID"),
                        rs.getString("img"),
                        rs.getString("detail"),
                        rs.getString("date"),
                        rs.getString("department"),
                        rs.getString("technicainID"),
                        rs.getString("employeeID"),
                        rs.getString("dateRP"),
                        rs.getString("statusHead"),
                        rs.getString("statusTech"));
                Repairing.add(newRepair);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Repairing;
    }
    

    @Override
    public ArrayList<Repairing> selectRepairingByTechnicain(String technicainID) {
        PreparedStatement stmt = null;
        Connection con = null;
        Repairing = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM repairing WHERE technicainID Like '%" + technicainID + "%'";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Repairing newRepair = new Repairing(
                        rs.getString("repairingID"),
                        rs.getString("img"),
                        rs.getString("detail"),
                        rs.getString("date"),
                        rs.getString("department"),
                        rs.getString("technicainID"),
                        rs.getString("employeeID"),
                        rs.getString("dateRP"),
                        rs.getString("statusHead"),
                        rs.getString("statusTech"));
                Repairing.add(newRepair);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Repairing;
    }
    @Override
    public ArrayList<Employees> selectEmployeesAll() {
        PreparedStatement stmt = null;
        Connection con = null;
        Employees = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM employees";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Employees newEmployees = new Employees(
                        rs.getString("employeeID"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("nickname"),
                        rs.getString("department"),
                        rs.getString("positions"),
                        rs.getString("telNumber"),
                        rs.getString("e_mail"),
                        rs.getString("password"),
                        rs.getString("img"));
                Employees.add(newEmployees);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Employees;
    }
    
    @Override
    public ArrayList<Employees> selectEmployeesByID(String employeeID) {
        PreparedStatement stmt = null;
        Connection con = null;
        Employees = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM employees WHERE employeeID Like '%" + employeeID + "%' ";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Employees newEmployees = new Employees(
                        rs.getString("employeeID"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("nickname"),
                        rs.getString("department"),
                        rs.getString("positions"),
                        rs.getString("telNumber"),
                        rs.getString("e_mail"),
                        rs.getString("password"),
                        rs.getString("img"));
                Employees.add(newEmployees);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Employees;
    }
    

    @Override
    public ArrayList<Employees> selectEmployeesByDepartment(String department) {
        PreparedStatement stmt = null;
        Connection con = null;
        Employees = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM employees WHERE department Like '%" + department + "%' ";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Employees newEmployees = new Employees(
                        rs.getString("employeeID"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("nickname"),
                        rs.getString("department"),
                        rs.getString("positions"),
                        rs.getString("telNumber"),
                        rs.getString("e_mail"),
                        rs.getString("password"),
                        rs.getString("img"));
                Employees.add(newEmployees);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Employees;
    }
    
    @Override
    public ArrayList<Technicains> selectTechnicainsAll() {
       PreparedStatement stmt = null;
        Connection con = null;
        Technicains = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM technicains";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Technicains newTechnicains = new Technicains(
                        rs.getString("TechnicainID"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("nickname"),
                        rs.getString("department"),
                        rs.getString("positions"),
                        rs.getString("telNumber"),
                        rs.getString("e_mail"),
                        rs.getString("password"),
                        rs.getString("img"));
                Technicains.add(newTechnicains);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Technicains;
    }

    @Override
    public ArrayList<Technicains> selectTechnicainsByID(String technicainID) {
        PreparedStatement stmt = null;
        Connection con = null;
        Technicains = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM technicains WHERE technicainID Like '%" + technicainID + "%' ";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Technicains newTechnicains = new Technicains(
                        rs.getString("TechnicainID"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("nickname"),
                        rs.getString("department"),
                        rs.getString("positions"),
                        rs.getString("telNumber"),
                        rs.getString("e_mail"),
                        rs.getString("password"),
                        rs.getString("img"));
                Technicains.add(newTechnicains);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Technicains;
    }

    @Override
    public ArrayList<Technicains> selectTechnicainsByDepartment(String department) {
         PreparedStatement stmt = null;
        Connection con = null;
        Technicains = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "SELECT * FROM technicain WHERE department Like '%" + department + "%' ";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs != null) && (rs.next())) {
                Technicains newTechnicains = new Technicains(
                        rs.getString("TechnicainID"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("nickname"),
                        rs.getString("department"),
                        rs.getString("positions"),
                        rs.getString("telNumber"),
                        rs.getString("e_mail"),
                        rs.getString("password"),
                        rs.getString("img"));
                Technicains.add(newTechnicains);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return Technicains;
    }
    
    @Override
    public void deleteRepairingByID(String repairingID) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "DELETE FROM repairing WHERE repairingID ="+repairingID;
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
     @Override
    public void deleteEmployeesByID(String employeeID) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "DELETE FROM employees  WHERE employeeID ="+employeeID;
            stmt = con.prepareStatement(sql);
             stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    @Override
    public void deleteTechnicainsByID(String technicainID) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "DELETE FROM technicains  WHERE technicainID ="+technicainID;
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    @Override
    public void insertRepairing( String img, String detail, String date, String department, String technicainID, String employeeID) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "INSERT INTO repairing"+"(img, detail, date, department, technicainID, employeeID) "+"VALUES(?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, img);
            stmt.setString(2, detail);
            stmt.setString(3, date);
            stmt.setString(4, department);
            stmt.setString(5, technicainID);
            stmt.setString(6, employeeID);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    @Override
    public void insertEmployee(String firstName, String lastName, String nickname, String department, String positions, String telNumber, String e_mail, String password, String img) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "INSERT INTO employees"+"( firstName, lastName, nickname, department, positions, telNumber, e_mail, password, img) "+"VALUES(?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, nickname);
            stmt.setString(4, department);
            stmt.setString(5, positions);
            stmt.setString(6, telNumber);
            stmt.setString(7, e_mail);
            stmt.setString(8, password);
            stmt.setString(9, img);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    @Override
    public void insertTechnicain(String firstName, String lastName, String nickname, String department, String positions, String telNumber, String e_mail, String password, String img) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "INSERT INTO technicains "+"(firstName, lastName, nickname, department, positions, telNumber, e_mail, password, img) "+"VALUES(?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, nickname);
            stmt.setString(4, department);
            stmt.setString(5, positions);
            stmt.setString(6, telNumber);
            stmt.setString(7, e_mail);
            stmt.setString(8, password);
            stmt.setString(9, img);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void updateRepairing(String repairingID, String img, String detail, String date, String department, String technicainID, String employeeID) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "UPDATE repairing SET img ='"+ img +"',detail ='"+detail+"',date ='"+date+"',department ='"+department+"',technicainID ='"+technicainID+"',employeeID ='"+employeeID+"' WHERE repairingID = "+repairingID;
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    @Override
    public void updateEmployee(String employeeID,String firstName,String lastName,String nickname,String department,String positions,String telNumber,String e_mail,String password,String img) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "UPDATE employees SET firstName ='"+ firstName +"',lastName ='"+lastName+"',nickname ='"+nickname+"',department ='"+department+"',positions ='"+positions+"',telNumber ='"+telNumber+"',e_mail ='"+e_mail+"',password ='"+password+"',img ='"+img+"'WHERE employeeID = "+employeeID;
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    @Override
    public void updateTechnicain(String technicainID,String firstName,String lastName,String nickname,String department,String positions,String telNumber,String e_mail,String password,String img){
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "UPDATE technicains SET firstName ='"+ firstName +"',lastName ='"+lastName+"',nickname ='"+nickname+"',department ='"+department+"',positions ='"+positions+"',telNumber ='"+telNumber+"',e_mail ='"+e_mail+"',password ='"+password+"',img ='"+img+"'WHERE technicainID = "+technicainID;
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void updateStatusHead(String repairingID, String statusHead) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "UPDATE repairing SET statusHead ='"+ statusHead+"' WHERE repairingID = "+repairingID;
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void updateStatusTech(String repairingID, String statusTech) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "UPDATE repairing SET statusTech ='"+ statusTech+"' WHERE repairingID = "+repairingID;
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public void updateDateRP(String repairingID, String dateRP) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hanuman?user=root&password=root");
            String sql = "UPDATE repairing SET dateRP ='"+ dateRP+"' WHERE repairingID = "+repairingID;
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }
}