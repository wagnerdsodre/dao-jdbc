package model.dao;

import java.util.List;

import model.entitties.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update (Department obj);
	void deleteById (Integer id);
	Department FindById (Integer id);
	List<Department> findAll();

}
