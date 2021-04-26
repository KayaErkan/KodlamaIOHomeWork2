package day2HomeWork;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1,"programlama");
		
		Teacher teacher1 = new Teacher(1234568910,"Engin Demiroð",323536,"+905366989598");
		
		Product product1 = new Product (54568,5455,55262,"JAVA", "Yazýlým Geliþtirici Yetistirme Kampý (JAVA + REACT",0.00);
		Product product2 = new Product (1231,456,96325,"Temel","Programlamaya Giriþ Ýçin Temel Kurs", 0.00);
		Product product3 = new Product (123,456,789,"C#","Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", 0.00);
		
		Category [] categories = {category1};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}
		
		Teacher [] teachers = {teacher1};
		for (Teacher teacher : teachers) {
			System.out.println(teacher.name);
		}
		
		Product [] products = {product1 , product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		ProductManager productManager = new ProductManager ();
		
		productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);
	}

}
