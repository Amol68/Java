package amol_package;

class midfielder
{
	void show_role()
	{
	System.out.println("I PLAY MIDFIELD");
	}
}
 class CDM extends midfielder{
	 
	 void show_specific_role()
		{
		System.out.println("I PLAY DEFENSIVE MIDFIELD");
		}

	 public static void main(String[] args)
	 {
		 CDM pirlo = new CDM ();
		 pirlo.show_role();
		 pirlo.show_specific_role();
	 }
}
