package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image.jpg");

		Product product2 = new Product();
		product2.setName("Smeg kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen aid kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("5645454545");
		individualCustomer.setCustomerNumber("54544545");
		individualCustomer.setFirstName("Ömer");
		individualCustomer.setLastName("Kurtuldu");
		
		
		CorparateCustomer corparateCustomer = new CorparateCustomer();
		corparateCustomer.setId(2);
		corparateCustomer.setCompanyName("Kodlama.io");
		corparateCustomer.setPhone("645665");
		corparateCustomer.setTaxNumber("111111111");
		corparateCustomer.setCustomerNumber("54321");
		

		
		Customer[] customers = {individualCustomer,corparateCustomer};
		
		
		
	}

}
