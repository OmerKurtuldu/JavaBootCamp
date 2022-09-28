package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop", "asus", 3 , 2 );
		
		product.setName("laptop");
		product.setId(1);
		product.setStockAmount(78);
		product.setDescription("dizüstü"); 
		product.setPrice(14500);
		
		
		
		
		
		System.out.println(product.getName());
		System.out.println(product.getId());
		System.out.println(product.getStockAmount());
		System.out.println(product.getPrice());
		System.out.println(product.getDescription());
		
		
		ProductManager productManager = new ProductManager();
		
		productManager.Add(product);
		
				

	}

}
