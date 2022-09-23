class bike
{
  void show()
  {
    System.out.println("Bike is Running");
  }
}

 class Main extends bike
{
	 void show()
  {
    System.out.println("Ducati is Running");
  }  

  public static void main(String[] args)
   {
     Main d1 = new Main();
     d1.show();
   }
}
