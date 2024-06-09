package stratergyDesignPattern;

public class pathcalculatorFactor {
	
	public static pathCalculatorStratergy getPathCalculatorForMode(String mode) 
	{
		if(mode.equals("Car")) {
			return new CarPathCalculator();
		}
		else if(mode.equals("Bike")) {
			return new BikePathCalculator();
		}
		else if(mode.equals("Walk"))
		{
			return new WalkPathCalculator();
		}
		return null;
	}
}
