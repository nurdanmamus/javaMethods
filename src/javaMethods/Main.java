package javaMethods;

public class Main {

	public static void main(String[] args) {
		// Methods
		sayiBulmaca();
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		Product product = new Product();
		product.setId(1);;
		product.setName("Asus");
		product.setDescription("Asus Lptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
	    productManager.Add(product);
		
		
		System.out.println(product.getKod());
		
		
		
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,5,6};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi==aranacak) {
				varMi = true;
				break;
			} 
			
		}
			
			if (varMi) {
				mesajVer("Sayý mevcuttur. " +aranacak); 
			}else {
				System.out.println("Sayý mevcut deðildir."); 
			}
			
			String mesaj = "Bugün hava çok güzeþ";
			String yeniMesaj = sehirVer();
			System.out.println(yeniMesaj);
			int sayi = topla(5,7);
			System.out.println(sayi);
			int sayi2 = topla2(1,2,3,4);
			System.out.println(sayi2);
		
	}
	
	//void and return
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
	public static void ekle() {
		System.out.println("Ekle");
	}
	
	public static int topla(int x, int y) {
		return x + y;
	}
	
	//variable arguments
	public static int topla2(int... sayilar) {
		int toplam = 0;
	    for (int sayi : sayilar) {
			toplam+=sayi;
		}
	    return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
}


