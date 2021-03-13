package Application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitties.Department;
import model.entitties.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Department depto = new Department(1,"books");
		//Seller seller = new Seller(1,"Wagner","wagnerdsodre@gmail.com",new Date(),3500.0,depto);
		//System.out.println(seller);
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("=== Return object Seller findByIde ===");
		Seller seller = sellerdao.FindById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Return object Seller findByIde ===");
		Department department = new Department(2,null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Return object Seller findAll ===");
	    list = sellerdao.findAll();
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n=== Return object Seller findAll ===");
	    list = sellerdao.findAll();
		for(Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Return object Seller findAll ===");
	    Seller newSeller = new Seller(null,"Wagner Sodré","wagnerdsodre@gmail.com",new Date(),4000.0,department);
	    sellerdao.insert(newSeller);
		System.out.println("Inserted! New Id= " + newSeller.getId());
		
		System.out.println("\n===Update ===");
		seller = sellerdao.FindById(1);
		seller.setName("Maria bonita");
		seller.setEmail("mariabonita@gmail.com");
		sellerdao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n===teste 6 : DELETE ===");
		System.out.println("Enter Id for delete test:");
		int id = sc.nextInt();
		sellerdao.deleteById(id);
		System.out.println("Delete completed!");
		
		
    sc.close();
	}

}
