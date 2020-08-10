package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Department obj = new Department(1, "Books");

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("12/07/2001");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", date, 3000.0, obj);
		System.out.println(seller);
		
	}
}