package fit.hutech.tranhuynhhainam.sevice;

import java.util.List;

import fit.hutech.tranhuynhhainam.model.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}