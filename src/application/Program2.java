package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1 - department findById ===");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=== Test 2 - department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department depAll : list) {
			System.out.println(depAll);
		}
		
		System.out.println();
		System.out.println("=== Test 3 - department insert ===");
		Department newDepartment = new Department(null, "Inovation");
		departmentDao.insert(newDepartment);;
		System.out.println("Inserted! New Id = "  + newDepartment.getId());
		
		System.out.println();
		System.out.println("=== Test 4 - department update ===");
		dep = departmentDao.findById(7);
		dep.setName("Inovation & Test");
		departmentDao.update(dep);
		System.out.println("Update by Id completed!");
		
		System.out.println();
		System.out.println("=== Test 5 - department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete by Id completed!");
		
		sc.close();
	}
}