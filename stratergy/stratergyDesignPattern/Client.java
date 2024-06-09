package stratergyDesignPattern;

public class Client {
	public static void main(String [] args) {
		GoogleMaps googleMaps=new GoogleMaps();
		googleMaps.findPath("Pune","Benglore","Car");
	}

}
