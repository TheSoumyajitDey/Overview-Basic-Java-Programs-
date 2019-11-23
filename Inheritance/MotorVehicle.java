public abstract class MotorVehicle{
   protected String modelName;
   protected int modelNumber;
   protected double modelPrice;
   
   public MotorVehicle(String modelName, int modelNumber , double modelPrice){
   this. modelName = modelName;
   this.modelNumber = modelNumber;
   this.modelPrice = modelPrice;
}
 abstract public void display();
}
