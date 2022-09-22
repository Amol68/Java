 class lamborghini
{
	private String model;
	private int max_speed;
	
	void set_data(String m, int s)
	{
		model=m;
		max_speed=s;
	}
	
	String get_model()
	{
		return model;
	}
	
	int get_max_speed()
	{
		return max_speed;
	}
}


public class get&set {
	
	public static void main(String[] args)
	{
		lamborghini urus = new lamborghini();
		
		urus.set_data("Urus",305);
		System.out.println(urus.get_model());
		System.out.println(urus.get_max_speed());

                lamborghini huracan = new lamborghini();
                huracan.set_data("Huracan",325);
                 System.out.println(huracan.get_model());
		System.out.println(huracan.get_max_speed());

	}

}