package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";

		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrince(7500);
		product1.setUnitsInstock(3);
		product1.setImageUrl("image1.jpg");

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrince(6500);
		product2.setUnitsInstock(4);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrince(5500);
		product3.setUnitsInstock(5);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05451231426");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Burak");
		individualCustomer.setLastName("Dünya");

		CorparateCustomer corparateCustomer = new CorparateCustomer();
		corparateCustomer.setId(2);
		corparateCustomer.setCompanyName("Kodlama.io");
		corparateCustomer.setPhone("05000000000");
		corparateCustomer.setTaxtNumber("111111");
		corparateCustomer.setCustomerNumber("54321");

		Customer[] customers = { individualCustomer, corparateCustomer };

	}
}
