package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author sagred
 */
public class SystemConfig {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();
        
        Employee employee = ecosystem.getEmpDir().createEmployee("sysadmin");
        
        UserAccount userAccount = ecosystem.getUsrAccDir().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return ecosystem;
    }
    
}
