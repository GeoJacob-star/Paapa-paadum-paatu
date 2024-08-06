package org.phone;

public class Phone {
  private void phoneInfo(String brand) {
	System.out.println("Mobile brand is "+brand);
	this.phoneInfo(40000, "Galaxy S21 FE");
}
  private void phoneInfo(int price, String model) {
	  this.phoneInfo("Poorvika", 6);
	System.out.println("Mobile price is "+price+"\n"+"Mobile model is "+model);
}
  private void phoneInfo(String shopName,int displaySize) {
    System.out.println("Shop name is "+shopName+"\n"+"Display size is "+displaySize);
}
  public static void main(String[] args) {
	  Phone p = new Phone();
	  p.phoneInfo("Samsung");
}
}
