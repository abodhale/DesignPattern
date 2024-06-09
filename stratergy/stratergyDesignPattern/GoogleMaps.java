package stratergyDesignPattern;

public class GoogleMaps {
	public void findPath(String from,String to,String mode) 
	{
		pathCalculatorStratergy pathcal=pathcalculatorFactor.getPathCalculatorForMode(mode);
		
		pathcal.findpath(from, to);
	}
	

}
