package fit.hutech.tranhuynhhainam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fit.hutech.tranhuynhhainam.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}