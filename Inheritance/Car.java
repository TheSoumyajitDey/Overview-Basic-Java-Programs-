public class Car extends MotorVehicle{
	private int discountRate;
	public Car(String modelName, int modelNumber , double modelPrice, int discountRate)
	{
		super(modelName,modelNumber,modelPrice);
		this.discountRate=discountRate;
	}	
	public void display()
	{
		System.out.println("  Car Name:  "+modelName+" \n Model Number "+modelNumber+"  \n Model Price "+modelPrice+" \n Discount: "+discountRate);
	}
	public void discount()
	{
		double finalPrice= modelPrice- (modelPrice*discountRate)/100;
		System.out.println(" \n The final price is : "+finalPrice);
	}
}