package fishShop;

public class Main {

	public static void main(String[] args) {
	
		Fish fish1=new Fish();
		fish1.setName("Zebra danio");
		fish1.setPrice("105 TL");
        fish1.setColor("mor");
        fish1.setLength("2-3 cm");
        
        Aquarium aquarium1=new Aquarium();
        aquarium1.setBrand("fluval");
        aquarium1.setPrice("4.322 TL");
        aquarium1.setColor("siyah");
        aquarium1.setLength("35 cm");
        aquarium1.setLitre("34 Lt");
        
        Bait bait1=new Bait();
        bait1.setBrand("lotus");
        bait1.setPrice("44,90 TL");
        
        Rod rod1=new Rod();
        rod1.setBrand("Shimano");
        rod1.setPrice("716 TL");
        
        System.out.println(fish1.getName()+" "+fish1.getPrice()+" "+fish1.getColor()+" "+fish1.getLength());
        System.out.println(aquarium1.getBrand()+" "+aquarium1.getPrice()+" "+aquarium1.getColor()+" "+aquarium1.getLength()+" "+aquarium1.getLitre());
        System.out.println(bait1.getBrand()+" "+bait1.getPrice());
        System.out.println(rod1.getBrand()+" "+rod1.getPrice());
	}

}
