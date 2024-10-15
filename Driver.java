package mobileshop;

import java.util.*;

class MobileShopy
{
	String Color;     
	String RAM;
	String Camera;
	String Display;
	String Storage;
	String Battery;
    double price; 

	public String toString()//Method Overriding
	{
		System.out.println("COLOR: "+Color);
    	System.out.println("RAM : "+RAM);
    	System.out.println("CAMERA: "+Camera);
    	System.out.println("DISPLAY: "+Display);
    	System.out.println("STORAGE: "+Storage);
    	System.out.println("BATTERY : "+Battery);
    	System.out.println("PRICE : "+price);
		return"";
	}
	public void Buy() 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("============================================================================");
		System.out.println("ENTER YOUR NAME:	");
		String s1=sc.nextLine();
		System.out.println("ENTER YOUR ADDRESS:	");
		String s2=sc.nextLine();
		try
		{
		System.out.println("ENTER YOUR MOBILE NO:	");
		long s3=sc.nextLong();
		}
		catch(Exception e)
		{
			System.out.println("Invalid Mobile Number");
		}
	}
	
	static String s;
	static long l;
	
	static 
	{
		System.out.println("            		---WELCOME TO MY MOBILE SHOP---         ");
		System.out.println("==========================================================================");
		System.out.println("			!! Please Place Your order Details !!			");
		System.out.println("		");
		Scanner Sc = new Scanner(System.in);
		System.out.print("ENTER NAME : ");
		 s = Sc.nextLine();
 try
	{
		 System.out.print("ENTER MOBILE NO : ");
		 l = Sc.nextLong();
	}
 catch(Exception e )
    {
	 	 System.out.println("Invalid Mobile Number");
    }
	
}
	static String p;
	static 
	{
        
		Scanner Sc1 = new Scanner(System.in);
		System.out.print("ENTER GMAIL : ");
		p = Sc1.nextLine();

		Scanner Sc2 = new Scanner(System.in);
		System.out.print("ENTER YOUR CITY : ");
		String s2 = Sc2.nextLine();

		System.out.print("CREATE PASSWORD :  ");
		String s3 = Sc2.nextLine();
		
		System.out.print("CONFIRM PASSWORD :  ");
		String s4 = Sc2.nextLine();

		System.out.println("			");

	}

	static 
	{
		System.out.println("			**** REGISTRATION COMPLETE SUCCESSFULLY ****			");
	}
	static 
	{
		System.out.println("=========================================================================== ");

		System.out.println("ENTER lOGIN DETAILS ");
		System.out.println("  ");

		Scanner Sc3 = new Scanner(System.in);
		System.out.print("ENTER USERNAME :  ");
		String s3 = Sc3.nextLine();

		System.out.println("		");
		Scanner Sc4 = new Scanner(System.in);
		System.out.print("ENTER PASSWORD :  ");
		String s4 = Sc4.nextLine();
		System.out.println(" ");

	}
	static 
	{
		System.out.println("		//// YOU GOT LOGGEDIN SUCCEFULLY ////		");
		System.out.println("========================================================================  ");

	}
	public void MainSwitch()
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Apple Mobile");
		System.out.println("Enter 2 for Vivo Mobile");
		System.out.println("Enter 3 for Oppo Mobile");
		System.out.println("Enter 4 for Samsung Mobile");
		System.out.println("Enter 5 for One Plus Mobile");
		System.out.println("Enter 6 for Redmi Mobile");
		System.out.println("Enter 7 for Alcatel Mobile");
		System.out.println("Enter 8 for Nokia Mobile");
		System.out.println("Enter 9 for Infinix Mobile");
		System.out.println("Enter 10 for Motorola Mobile");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
		{
			Apple ref2=new Apple();
			ref2.appleSwitch();		//Call To Apple Method
		}
			break;
		case 2:
		{
			Vivo ref3=new Vivo();
			ref3.VivoSwitch();		//Call To Vivo Method
		}
			break;
		case 3:
		{
			Oppo ref4=new Oppo();
			ref4.OppoSwitch();		//Call To Oppo Method
		}
			break;
		case 4:
		{
			Samsung ref5=new Samsung();
			ref5.SamsungSwitch();	//Call To Samsung Method
		}
			break;
		case 5:
		{
			OnePlus ref6=new OnePlus();
			ref6.OnePlusSwitch();	//Call To OnePlus Method
		}
			break;
		case 6:
		{
			Redmi ref7=new Redmi();
			ref7.RedmiSwitch();		//Call To Redmi Method
		}
			break;
		case 7:
		{
			Alcatel ref8=new Alcatel();
			ref8.AlcatelSwitch();	//Call To Alcatel Method
		}
			break;
		case 8:
		{
			Nokia ref9=new Nokia();
			ref9.NokiaSwitch();	//Call To Nokia Method
		}
			break;
		case 9:
		{
			Infinix ref10=new Infinix();
			ref10.InfinixSwitch();	//Call To Infinix Method
		}
			break;
		case 10:
		{
			Motorola ref11=new Motorola();
			ref11.MotorolaSwitch();	//Call To Motorola Method
		}
			break;
		default:
		{
			System.out.println("Enter Correct Choice");
			MainSwitch();
			break;
		}
		}
	}	
//class Apple Started
class Apple extends MobileShopy
		{
			public void appleSwitch()
			{
			
				Scanner sc=new Scanner(System.in);
				System.out.println("================================================================================");
				System.out.println("	--: ENTER YOUR CHOICE :--	");
				System.out.println("     -------------------------------	");
				System.out.println("	");
				System.out.println("Enter 1 for Iphone13");
				System.out.println("Enter 2 for Iphone13Pro");
				System.out.println("Enter 3 for Iphone12");
				System.out.println("Enter 4 for Iphone11");
				System.out.println("Enter 5 for Iphone11Pro");
				System.out.println("----------------------------------");
				System.out.println("Enter 6 Back To home Page");
				 int b=sc.nextInt();
				 switch(b)
				 {
				 case 1:
				 {
					 System.out.println("	");
					 System.out.println("===============================================================================");
					 System.out.println("Iphone13 ");
					 System.out.println("------------------------------");
					 Iphone13 a1=new Iphone13("Red","3GB","8MP","4.7 inches","64GB","5000mAh",38999);
					System.out.println(a1);
					Scanner sc3=new Scanner(System.in);
					System.out.println("=====================================================================================");
					System.out.println("Are You Want to buy Press 1");
					System.out.println("---------------------------------");
					System.out.println("You Want to Check Another Model Press 2");
					int a=sc.nextInt();
					if(a==1)
					{
						Buy();
					}
					else
					{
						System.out.println("===================");
						appleSwitch();
					}
					break;
				 }	
				 
				case 2:
				{
				 System.out.println("	");
				 System.out.println("===============================================================================");
				 System.out.println("Iphone13Pro ");
				 System.out.println("------------------------------");
				 Iphone13Pro a1=new Iphone13Pro("White","8GB","64MP","4.7 inches","64GB","5000mAh",37999);
				 System.out.println(a1);	
				 Scanner sc3=new Scanner(System.in);
				 System.out.println("=====================================================================================");
					System.out.println("Are You Want to buy Press 1");
					System.out.println("---------------------------------");
					System.out.println("You Want to Check Another Model Press 2");
					int a=sc.nextInt();
					if(a==1)
					{
						Buy();
					}
					else
					{
						System.out.println("===================");
						appleSwitch();
					}
				break;
				}
				case 3:
				{
				 System.out.println("	");
				 System.out.println("===============================================================================");
				 System.out.println("Iphone12 ");
				 System.out.println("------------------------------");
				 Iphone12 a1=new Iphone12("White","8GB","64 MP","4.7 inches","128GB","5000mAh",54999);
				 System.out.println(a1);	
				 Scanner sc3=new Scanner(System.in);
				 System.out.println("=====================================================================================");
					System.out.println("Are You Want to buy Press 1");
					System.out.println("---------------------------------");
					System.out.println("You Want to Check Another Model Press 2");
					int a=sc.nextInt();
					if(a==1)
					{
						Buy();
					}
					else
					{
						System.out.println("===================");
						appleSwitch();
					}
				break;
				}
				case 4:
				{
				 System.out.println("	");
				 System.out.println("===============================================================================");
				 System.out.println("Iphone11 ");
				 System.out.println("------------------------------");
				 Iphone11 a1=new Iphone11("White","4 GB","110 MP","4.7 inches","128GB","5000mAh",45000);
				 System.out.println(a1);
				 Scanner sc3=new Scanner(System.in);
				 System.out.println("=====================================================================================");
					System.out.println("Are You Want to buy Press 1");
					System.out.println("---------------------------------");
					System.out.println("You Want to Check Another Model Press 2");
					int a=sc.nextInt();
					if(a==1)
					{
						Buy();
					}
					else
					{
						System.out.println("===================");
						appleSwitch();
					}
				break;
				}
				case 5:
				{
				 System.out.println("	");
				 System.out.println("===============================================================================");
				 System.out.println("Iphone11Pro ");
				 System.out.println("------------------------------");
				 Iphone11Pro a1=new Iphone11Pro("Black","8GB","50MP","4.7 inches","64GB","5000mAh",79999);
				 System.out.println(a1);	
				 Scanner sc3=new Scanner(System.in);
				 System.out.println("=====================================================================================");
					System.out.println("Are You Want to buy Press 1");
					System.out.println("---------------------------------");
					System.out.println("You Want to Check Another Model Press 2");
					int a=sc.nextInt();
					if(a==1)
					{
						Buy();
					}
					else
					{
						System.out.println("===================");
						appleSwitch();
					};
				}
				case 6:
				{
				 MainSwitch();		 	
				}
				default:
				{
					System.out.println("Enter Correct Choice Number:	");
					appleSwitch();
					break;
				}
			}
		}
class Iphone13 extends Apple				
{
	 Iphone13(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
		{
		 	this.Color=Color;
			this.RAM=RAM;
			this.Camera=Camera;
			this.Display=Display;
			this.Storage=Storage;
			this.Battery=Battery;
			this.price=price;
		}
				
 }
class Iphone13Pro extends Apple
			
{
		Iphone13Pro(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
		 {
			 this.Color=Color;
			 this.RAM=RAM;
			 this.Camera=Camera;
			 this.Display=Display;
			 this.Storage=Storage;
			 this.Battery=Battery;
			 this.price=price;
		 }
			
}
class Iphone12 extends Apple	
{
		Iphone12(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
				 }
			
}
class Iphone11 extends Apple
			
{
		 Iphone11(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
			
}
class Iphone11Pro extends Apple

{
		Iphone11Pro(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
					 this.Color=Color;
					 this.RAM=RAM;
					 this.Camera=Camera;
				     this.Display=Display;
					 this.Storage=Storage;
				     this.Battery=Battery;
					 this.price=price;
			 }
		}
	}
}
//class Vivo Started
class Vivo extends MobileShopy
{
	public void VivoSwitch()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("	--: ENTER YOUR CHOICE :--	");
		System.out.println("     -------------------------------	");
		System.out.println("	");
		System.out.println("Enter 1 for Vivo F15");
		System.out.println("Enter 2 for Vivo F17");
		System.out.println("Enter 3 for Vivo P15");
		System.out.println("Enter 4 for Vivo T1");
		System.out.println("Enter 5 for Vivo T1Pro");
		System.out.println("----------------------------------");
		System.out.println("Enter 6 Back To home Page");
		 int b=sc.nextInt();
		 switch(b)
		 {
		 case 1:
		 {
			 System.out.println("	");
			 System.out.println("===============================================================================");
			 System.out.println("Vivo F15");
			 System.out.println("------------------------------");
			 VivoF15 a1=new VivoF15("Red","4GB","24MP","5.5 inches","64GB","5000mAh",15999);
			System.out.println(a1);
			Scanner sc3=new Scanner(System.in);
			System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				VivoSwitch();
			}
			break;
		 }	
		 
		case 2:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Vivo F17");
		 System.out.println("------------------------------");
		 VivoF17 a1=new VivoF17("White","8GB","64MP","4.7 inches","128GB","5000mAh",25999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				VivoSwitch();
			}
		break;
		}
		case 3:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Vivo P15");
		 System.out.println("------------------------------");
		 VivoP15 a1=new VivoP15("Blue","4GB","18MP","4.7 inches","64GB","5000mAh",12000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				VivoSwitch();
			}
		break;
		}
		case 4:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Vivo T1");
		 System.out.println("------------------------------");
		 VivoT1 a1=new VivoT1("Gray","8GB","64MP","4.7 inches","64GB","5000mAh",16000);
		 System.out.println(a1);
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				VivoSwitch();
			}
		break;
		}
		case 5:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Vivo T1Pro ");
		 System.out.println("------------------------------");
		 VivoT1Pro a1=new VivoT1Pro("Black","8GB","64MP","4.7 inches","64GB","5000mAh",23999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				VivoSwitch();
			};
		}
		case 6:
		{
		 MainSwitch();		 	
		}
		default:
		{
			System.out.println("Enter Correct Choice Number:	");
			VivoSwitch();
			break;
		}
	}
}
}
class VivoF15 extends Vivo				
{
	 VivoF15(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
		{
		 	this.Color=Color;
			this.RAM=RAM;
			this.Camera=Camera;
			this.Display=Display;
			this.Storage=Storage;
			this.Battery=Battery;
			this.price=price;
		}
				
 }
class VivoF17 extends Vivo
			
{
		VivoF17(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
		 {
			 this.Color=Color;
			 this.RAM=RAM;
			 this.Camera=Camera;
			 this.Display=Display;
			 this.Storage=Storage;
			 this.Battery=Battery;
			 this.price=price;
		 }
			
}
class VivoP15 extends Vivo	
{
		VivoP15(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
				 }
			
}
class VivoT1 extends Vivo
			
{
		 VivoT1(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
			
}
class VivoT1Pro extends Vivo

{
	VivoT1Pro(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
					 this.Color=Color;
					 this.RAM=RAM;
					 this.Camera=Camera;
				     this.Display=Display;
					 this.Storage=Storage;
				     this.Battery=Battery;
					 this.price=price;
			 }
	}
//class Oppo Started
class Oppo extends MobileShopy
{
	public void OppoSwitch()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("	--: ENTER YOUR CHOICE :--	");
		System.out.println("     -------------------------------	");
		System.out.println("	");
		System.out.println("Enter 1 for Oppo F11");
		System.out.println("Enter 2 for Oppo F11 Pro");
		System.out.println("Enter 3 for Oppo A74");
		System.out.println("Enter 4 for Oppo Reno8");
		System.out.println("Enter 5 for Oppo A77");
		System.out.println("----------------------------------");
		System.out.println("Enter 6 Back To home Page");
		 int b=sc.nextInt();
		 switch(b)
		 {
		 case 1:
		 {
			 System.out.println("	");
			 System.out.println("===============================================================================");
			 System.out.println("Oppo F11 ");
			 System.out.println("------------------------------");
			 OppoF11 a1=new OppoF11("Red","8GB","12MP","4.7 inches","64GB","1821mAh",12999);
			System.out.println(a1);
			Scanner sc3=new Scanner(System.in);
			System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OppoSwitch();
			}
			break;
		 }	
		 
		case 2:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Oppo F11 Pro ");
		 System.out.println("------------------------------");
		 OppoF11Pro a1=new OppoF11Pro("Gray","4GB","20MP","5.5 inches","32GB","5000mAh",21999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OppoSwitch();
			}
		break;
		}
		case 3:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Oppo A74");
		 System.out.println("------------------------------");
		 OppoA74 a1=new OppoA74("White","8GB","40MP","4.7 inches","128GB","5000mAh",27999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OppoSwitch();
			}
		break;
		}
		case 4:
		{
	 	 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Oppo Reno 8 ");
		 System.out.println("------------------------------");
		 OppoReno8 a1=new OppoReno8("Blue","8GB","64MP","4.7 inches","64GB","5000mAh",45999);
		 System.out.println(a1);
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OppoSwitch();
			}
		break;
		}
		case 5:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Oppo A77 ");
		 System.out.println("------------------------------");
		 OppoA77 a1=new OppoA77("White","4GB","32MP","5.5 inches","64GB","5000mAh",11999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OppoSwitch();
			};
		}
		case 6:
		{
		 MainSwitch();		 	
		}
		default:
		{
			System.out.println("Enter Correct Choice Number:	");
			OppoSwitch();
		}
	}
}
}
class OppoF11 extends Vivo				
{
	OppoF11(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
		{
		 	this.Color=Color;
			this.RAM=RAM;
			this.Camera=Camera;
			this.Display=Display;
			this.Storage=Storage;
			this.Battery=Battery;
			this.price=price;
		}
				
 }
class OppoF11Pro extends Vivo
			
{
		OppoF11Pro(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
		 {
			 this.Color=Color;
			 this.RAM=RAM;
			 this.Camera=Camera;
			 this.Display=Display;
			 this.Storage=Storage;
			 this.Battery=Battery;
			 this.price=price;
		 }
			
}
class OppoA74 extends Vivo	
{
		OppoA74(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
				 }
			
}
class OppoReno8 extends Vivo
			
{
		 OppoReno8(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
			
}
class OppoA77 extends Vivo

{
	OppoA77(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
					 this.Color=Color;
					 this.RAM=RAM;
					 this.Camera=Camera;
				     this.Display=Display;
					 this.Storage=Storage;
				     this.Battery=Battery;
					 this.price=price;
			 }
	}
//class Samsung Started
class Samsung extends MobileShopy
{
	public void SamsungSwitch() 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("	--: ENTER YOUR CHOICE :--	");
		System.out.println("     -------------------------------	");
		System.out.println("	");
		System.out.println("Enter 1 for GalaxyS20");
		System.out.println("Enter 2 for GalaxyA23");
		System.out.println("Enter 3 for GalaxyM33");
		System.out.println("Enter 4 for GalaxyF23");
		System.out.println("Enter 5 for GalaxyFlip");
		System.out.println("----------------------------------");
		System.out.println("Enter 6 Back To home Page");
		 int b=sc.nextInt();
		 switch(b)
		 {
		 case 1:
		 {
			 System.out.println("	");
			 System.out.println("===============================================================================");
			 System.out.println("GalaxyS20");
			 System.out.println("------------------------------");
			 GalaxyS20 a1=new GalaxyS20("Red","4GB","12MP","5.8 inches","64GB","5000mAh",16000);
			System.out.println(a1);
			Scanner sc3=new Scanner(System.in);
			System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				SamsungSwitch();
			}
			break;
		 }	
		 
		case 2:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("GalaxyA23");
		 System.out.println("------------------------------");
		 GalaxyA23 a1=new GalaxyA23("White","8GB","64MP","4.7 inches","64GB","5000mAh",14000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				SamsungSwitch();
			}
		break;
		}
		case 3:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("GalaxyM33");
		 System.out.println("------------------------------");
		 GalaxyM33 a1=new GalaxyM33("Blue","8GB","64MP","5.7 inches","128GB","5000mAh",32000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				SamsungSwitch();
			}
		break;
		}
		case 4:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("GalaxyF23 ");
		 System.out.println("------------------------------");
		 GalaxyF23 a1=new GalaxyF23("Gray","8GB","64MP","5.7 inches","264GB","5000mAh",55000);
		 System.out.println(a1);
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				SamsungSwitch();
			}
		break;
		}
		case 5:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("GalaxyFlip3");
		 System.out.println("------------------------------");
		 GalaxyFlip3 a1=new GalaxyFlip3("BlueBerry","8GB","64MP","4.7 inches","64GB","5000mAh",32000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				SamsungSwitch();
			};
		}
		case 6:
		{
		 MainSwitch();		 	
		}
		default:
		{
			System.out.println("Enter Correct Choice Number:	");
			SamsungSwitch();
			break;
		}
	}

	}
}
class GalaxyS20 extends MobileShopy

{
	GalaxyS20(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
		 {
			 this.Color=Color;
			 this.RAM=RAM;
			 this.Camera=Camera;
			 this.Display=Display;
			 this.Storage=Storage;
			 this.Battery=Battery;
			 this.price=price;
		 }
			
}
class GalaxyA23 extends MobileShopy	
{
	GalaxyA23(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
				 }
			
}
class GalaxyM33 extends MobileShopy
			
{
	GalaxyM33(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
			
}
class GalaxyF23 extends MobileShopy

{
	GalaxyF23(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
					 this.Color=Color;
					 this.RAM=RAM;
					 this.Camera=Camera;
				     this.Display=Display;
					 this.Storage=Storage;
				     this.Battery=Battery;
					 this.price=price;
			 }
		
	}
class GalaxyFlip3 extends MobileShopy

{
	GalaxyFlip3(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
					 this.Color=Color;
					 this.RAM=RAM;
					 this.Camera=Camera;
				     this.Display=Display;
					 this.Storage=Storage;
				     this.Battery=Battery;
					 this.price=price;
			 }
}
//class OnePlus Started
class OnePlus extends MobileShopy
{
	public void OnePlusSwitch() 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("	--: ENTER YOUR CHOICE :--	");
		System.out.println("     -------------------------------	");
		System.out.println("	");
		System.out.println("Enter 1 for 1+ NORD CE");
		System.out.println("Enter 2 for 1+ NORD 2");
		System.out.println("Enter 3 for 1+ NORD");
		System.out.println("Enter 4 for 1+ 10T");
		System.out.println("Enter 5 for 1+ NORD N200");
		System.out.println("----------------------------------");
		System.out.println("Enter 6 Back To home Page");
		 int b=sc.nextInt();
		 switch(b)
		 {
		 case 1:
		 {
			 System.out.println("	");
			 System.out.println("===============================================================================");
			 System.out.println("1+ NORD CE ");
			 System.out.println("------------------------------");
			 NORDCE a1=new NORDCE("Red","4GB","64MP","5.8 inches","64GB","1821mAh",34999);
			System.out.println(a1);
			Scanner sc3=new Scanner(System.in);
			System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OnePlusSwitch();
			}
			break;
		 }	
		 
		case 2:
		{
	 	 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("1+ NORD 2 ");
		 System.out.println("------------------------------");
		 NORD2 a1=new NORD2("White","8GB","18MP","5.5 inches","128GB","5000mAh",36000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OnePlusSwitch();
			}
		break;
		}
		case 3:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("1+ NORD ");
		 System.out.println("------------------------------");
		 NORD a1=new NORD("Gray","8GB","64MP","5.7 inches","64GB","3000mAh",41000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OnePlusSwitch();
			}
		break;
		}
		case 4:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("1+ 10T ");
		 System.out.println("------------------------------");
		 N10T a1=new N10T("Blue","8GB","28MP","4.7 inches","64GB","5000mAh",21700);
		 System.out.println(a1);
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OnePlusSwitch();
			}
		break;
		}
		case 5:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("1+ NORD N200 ");
		 System.out.println("------------------------------");
		 NORDN200 a1=new NORDN200("White","8GB","64MP","4.7 inches","128GB","5000mAh",49000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				OnePlusSwitch();
			};
		}
		case 6:
		{
		 MainSwitch();		 	
		}
		default:
		{
			System.out.println("Enter Correct Choice Number:	");
			OnePlusSwitch();
			break;
		}
	}
}
	class NORDCE extends MobileShopy				
	{
		NORDCE(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
			 	this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
					
	 }
	class NORD2 extends MobileShopy
				
	{
		NORD2(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			 {
				 this.Color=Color;
				 this.RAM=RAM;
				 this.Camera=Camera;
				 this.Display=Display;
				 this.Storage=Storage;
				 this.Battery=Battery;
				 this.price=price;
			 }
				
	}
	class NORD extends MobileShopy	
	{
		NORD(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
					 }
				
	}
	class N10T extends MobileShopy
				
	{
		N10T(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
				}
				
	}
	class NORDN200 extends MobileShopy

	{
		NORDN200(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
						 this.Color=Color;
						 this.RAM=RAM;
						 this.Camera=Camera;
					     this.Display=Display;
						 this.Storage=Storage;
					     this.Battery=Battery;
						 this.price=price;
				 }
		}
}
//class Redmi Started
class Redmi extends MobileShopy
{
	public void RedmiSwitch()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("	--: ENTER YOUR CHOICE :--	");
		System.out.println("     -------------------------------	");
		System.out.println("	");
		System.out.println("Enter 1 for Redmi Note 11 Prime");
		System.out.println("Enter 2 for Redmi Note 11 Pro");
		System.out.println("Enter 3 for Redmi 12 Pro");
		System.out.println("Enter 4 for Redmi Note 11T");
		System.out.println("Enter 5 for Redmi K501");
		System.out.println("----------------------------------");
		System.out.println("Enter 6 Back To home Page");
		 int b=sc.nextInt();
		 switch(b)
		 {
		 case 1:
		 {
			 System.out.println("	");
			 System.out.println("===============================================================================");
			 System.out.println("Redmi Note 11 Prime ");
			 System.out.println("------------------------------");
			 RedmiNote11Prime a1=new RedmiNote11Prime("Black","8GB","30MP","5.4 inches","64GB","3000mAh",14900);
			System.out.println(a1);
			Scanner sc3=new Scanner(System.in);
			System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				RedmiSwitch();
			}
			break;
		 }	
		 
		case 2:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Redmi Note 11 Pro ");
		 System.out.println("------------------------------");
		 RedmiNote11Pro a1=new RedmiNote11Pro("White","4GB","18MP","5.7 inches","16GB","5000mAh",9000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				RedmiSwitch();
			}
		break;
		}
		case 3:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Redmi 12 Pro ");
		 System.out.println("------------------------------");
		 Redmi12Pro a1=new Redmi12Pro("Gray","8GB","64MP","4.7 inches","64GB","5000mAh",23000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				RedmiSwitch();
			}
		break;
		}
		case 4:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Redmi Note 11T ");
		 System.out.println("------------------------------");
		 RedmiNote11T a1=new RedmiNote11T("BlueBerry","8GB","64MP","5.8 inches","128GB","5000mAh",31950);
		 System.out.println(a1);
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				RedmiSwitch();
			}
		break;
		}
		case 5:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Redmi K501 ");
		 System.out.println("------------------------------");
		 RedmiK501 a1=new RedmiK501("Black","8GB","64MP","4.7 inches","32GB","5000mAh",16000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				RedmiSwitch();
			};
		}
		case 6:
		{
		 MainSwitch();		 	
		}
		default:
		{
			System.out.println("Enter Correct Choice Number:	");
			RedmiSwitch();
			break;
		}
	}
}
	class RedmiNote11Prime extends Redmi				
	{
		RedmiNote11Prime(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
			 	this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
					
	 }
	class RedmiNote11Pro extends Redmi
				
	{
		RedmiNote11Pro(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			 {
				 this.Color=Color;
				 this.RAM=RAM;
				 this.Camera=Camera;
				 this.Display=Display;
				 this.Storage=Storage;
				 this.Battery=Battery;
				 this.price=price;
			 }
				
	}
	class Redmi12Pro extends Redmi	
	{
		Redmi12Pro(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
					 }
				
	}
	class RedmiNote11T extends Redmi
				
	{
		RedmiNote11T(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
				}
				
	}
	class RedmiK501 extends Redmi
	{
		RedmiK501(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
						 this.Color=Color;
						 this.RAM=RAM;
						 this.Camera=Camera;
					     this.Display=Display;
						 this.Storage=Storage;
					     this.Battery=Battery;
						 this.price=price;
				 }
			}
		}
//class Alcatel Started
class Alcatel extends MobileShopy
{
	public void AlcatelSwitch() 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("	--: ENTER YOUR CHOICE :--	");
		System.out.println("     -------------------------------	");
		System.out.println("	");
		System.out.println("Enter 1 for Alcatel 1L Pro");
		System.out.println("Enter 2 for Alcatel 1");
		System.out.println("Enter 3 for Alcatel 3L");
		System.out.println("Enter 4 for Alcatel 5x");
		System.out.println("Enter 5 for Alcatel 1SE");
		System.out.println("----------------------------------");
		System.out.println("Enter 6 Back To home Page");
		 int b=sc.nextInt();
		 switch(b)
		 {
		 case 1:
		 {
			 System.out.println("	");
			 System.out.println("===============================================================================");
			 System.out.println("Alcatel 1L Pro ");
			 System.out.println("------------------------------");
			 Alcatel1LPro a1=new Alcatel1LPro("Red","4GB","8MP","5.8 inches","64GB","3000mAh",20999);
			System.out.println(a1);
			Scanner sc3=new Scanner(System.in);
			System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				AlcatelSwitch();
			}
			break;
		 }	
		 
		case 2:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Alcatel 1 ");
		 System.out.println("------------------------------");
		 Alcatel1 a1=new Alcatel1("White","8GB","64MP","5.5 inches","32GB","5000mAh",15000);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				AlcatelSwitch();
			}
		break;
		}
		case 3:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Alcatel 3L ");
		 System.out.println("------------------------------");
		 Alcatel3L a1=new Alcatel3L("Blue","16GB","32 MP","4.8 inches","64GB","5000mAh",18999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				AlcatelSwitch();
			}
		break;
		}
		case 4:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Alcatel 5x ");
		 System.out.println("------------------------------");
		 Alcatel5x a1=new Alcatel5x("BlueBerry","32GB","110 MP","5.8 inches","128GB","35000mAh",24999);
		 System.out.println(a1);
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				AlcatelSwitch();
			}
		break;
		}
		case 5:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Alcatel 1SE ");
		 System.out.println("------------------------------");
		 Alcatel1SE a1=new Alcatel1SE("Black","8GB","50MP","5.8 inches","64GB","5000mAh",28999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				AlcatelSwitch();
			};
		}
		case 6:
		{
		 MainSwitch();		 	
		}
		default:
		{
			System.out.println("Enter Correct Choice Number:	");
			AlcatelSwitch();
			break;
		}
	}
}
	class Alcatel1LPro extends Alcatel				
	{
		Alcatel1LPro(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
			 	this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
					
	 }
	class Alcatel1 extends Alcatel
				
	{
		Alcatel1(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			 {
				 this.Color=Color;
				 this.RAM=RAM;
				 this.Camera=Camera;
				 this.Display=Display;
				 this.Storage=Storage;
				 this.Battery=Battery;
				 this.price=price;
			 }
				
	}
	class Alcatel3L extends Alcatel	
	{
		Alcatel3L(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
					 }
				
	}
	class Alcatel5x extends Alcatel
				
	{
		Alcatel5x(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
				}
				
	}
	class Alcatel1SE extends Alcatel

	{
		Alcatel1SE(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
						 this.Color=Color;
						 this.RAM=RAM;
						 this.Camera=Camera;
					     this.Display=Display;
						 this.Storage=Storage;
					     this.Battery=Battery;
						 this.price=price;
				 }
			}
		}
//class Nokia Started
class Nokia extends MobileShopy
{
	public void NokiaSwitch()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("	--: ENTER YOUR CHOICE :--	");
		System.out.println("     -------------------------------	");
		System.out.println("	");
		System.out.println("Enter 1 for Nokia G21");
		System.out.println("Enter 2 for Nokia 8");
		System.out.println("Enter 3 for Nokia T20");
		System.out.println("Enter 4 for Nokia G50");
		System.out.println("Enter 5 for Nokia C21 Plus");
		System.out.println("----------------------------------");
		System.out.println("Enter 6 Back To home Page");
		 int b=sc.nextInt();
		 switch(b)
		 {
		 case 1:
		 {
			 System.out.println("	");
			 System.out.println("===============================================================================");
			 System.out.println("Nokia G21 ");
			 System.out.println("------------------------------");
			 NokiaG21 a1=new NokiaG21("Black","8GB","128MP","5.8 inches","64GB","4500mAh",41599);
			System.out.println(a1);
			Scanner sc3=new Scanner(System.in);
			System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				NokiaSwitch();
			}
			break;
		 }	
		 
		case 2:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Nokia 8 ");
		 System.out.println("------------------------------");
		 Nokia8 a1=new Nokia8("White","4GB","64MP","5.2 inches","128GB","5000mAh",37999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				NokiaSwitch();
			}
		break;
		}
		case 3:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Nokia T20 ");
		 System.out.println("------------------------------");
		 NokiaT20 a1=new NokiaT20("Nordic Blue","8GB","64 MP","4.8 inches","128GB","3500mAh",26999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				NokiaSwitch();
			}
		break;
		}
		case 4:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Nokia G50 ");
		 System.out.println("------------------------------");
		 NokiaG50 a1=new NokiaG50("Blue","4GB","110 MP","4.7 inches","32GB","25000mAh",12000);
		 System.out.println(a1);
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				NokiaSwitch();
			}
		break;
		}
		case 5:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Nokia C21 Plus ");
		 System.out.println("------------------------------");
		 NokiaC21Plus a1=new NokiaC21Plus("Black","8GB","50MP","4.7 inches","64GB","5000mAh",79999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				NokiaSwitch();
			};
		}
		case 6:
		{
		 MainSwitch();		 	
		}
		default:
		{
			System.out.println("Enter Correct Choice Number:	");
			NokiaSwitch();
			break;
		}
	}
}
	class NokiaG21 extends Nokia				
	{
		NokiaG21(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
			 	this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
					
	 }
	class Nokia8 extends Nokia
				
	{
		Nokia8(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			 {
				 this.Color=Color;
				 this.RAM=RAM;
				 this.Camera=Camera;
				 this.Display=Display;
				 this.Storage=Storage;
				 this.Battery=Battery;
				 this.price=price;
			 }
				
	}
	class NokiaT20 extends Nokia	
	{
		NokiaT20(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
					 }
				
	}
	class NokiaG50 extends Nokia
				
	{
		NokiaG50(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
				}
				
	}
	class NokiaC21Plus extends Nokia

	{
		NokiaC21Plus(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
						 this.Color=Color;
						 this.RAM=RAM;
						 this.Camera=Camera;
					     this.Display=Display;
						 this.Storage=Storage;
					     this.Battery=Battery;
						 this.price=price;
				 }
			}
		}
//class Infinix Started
class Infinix extends MobileShopy
{
	public void InfinixSwitch()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("	--: ENTER YOUR CHOICE :--	");
		System.out.println("     -------------------------------	");
		System.out.println("	");
		System.out.println("Enter 1 for Infinix Note 10");
		System.out.println("Enter 2 for Infinix Smart");
		System.out.println("Enter 3 for Infinix Zero 8i");
		System.out.println("Enter 4 for Infinix HOT 12 Play");
		System.out.println("Enter 5 for Infinix HYPER Note 12");
		System.out.println("----------------------------------");
		System.out.println("Enter 6 Back To home Page");
		 int b=sc.nextInt();
		 switch(b)
		 {
		 case 1:
		 {
			 System.out.println("	");
			 System.out.println("===============================================================================");
			 System.out.println("Infinix Note 10 ");
			 System.out.println("------------------------------");
			 InfinixNote10 a1=new InfinixNote10("Red","3GB","8MP","4.7 inches","64GB","5000mAh",38999);
			System.out.println(a1);
			Scanner sc3=new Scanner(System.in);
			System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				InfinixSwitch();
			}
			break;
		 }	
		 
		case 2:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Infinix Smart ");
		 System.out.println("------------------------------");
		 InfinixSmart a1=new InfinixSmart("White","8GB","64MP","4.7 inches","64GB","5000mAh",37999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				InfinixSwitch();
			}
		break;
		}
		case 3:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Infinix Zero 8i ");
		 System.out.println("------------------------------");
		 InfinixZero8i a1=new InfinixZero8i("White","8GB","64 MP","4.7 inches","128GB","5000mAh",54999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				InfinixSwitch();
			}
		break;
		}
		case 4:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Infinix HOT 12 Play ");
		 System.out.println("------------------------------");
		 InfinixHOT12Play a1=new InfinixHOT12Play("White","4 GB","110 MP","4.7 inches","128GB","5000mAh",45000);
		 System.out.println(a1);
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				InfinixSwitch();
			}
		break;
		}
		case 5:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Infinix HYPER Note 12 ");
		 System.out.println("------------------------------");
		 InfinixHYPERNote12 a1=new InfinixHYPERNote12("Black","8GB","50MP","4.7 inches","64GB","5000mAh",79999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				InfinixSwitch();
			};
		}
		case 6:
		{
		 MainSwitch();		 	
		}
		default:
		{
			System.out.println("Enter Correct Choice Number:	");
			InfinixSwitch();
			break;
		}
	}
}
	class InfinixNote10 extends Infinix				
	{
		InfinixNote10(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
			 	this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
					
	 }
	class InfinixSmart extends Infinix
				
	{
		InfinixSmart(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			 {
				 this.Color=Color;
				 this.RAM=RAM;
				 this.Camera=Camera;
				 this.Display=Display;
				 this.Storage=Storage;
				 this.Battery=Battery;
				 this.price=price;
			 }
				
	}
	class InfinixZero8i extends Infinix	
	{
		InfinixZero8i(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
					 }
				
	}
	class InfinixHOT12Play extends Infinix
				
	{
		InfinixHOT12Play(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
					this.Color=Color;
					this.RAM=RAM;
					this.Camera=Camera;
					this.Display=Display;
					this.Storage=Storage;
					this.Battery=Battery;
					this.price=price;
				}
				
	}
	class InfinixHYPERNote12 extends Infinix

	{
		InfinixHYPERNote12(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
				{
						 this.Color=Color;
						 this.RAM=RAM;
						 this.Camera=Camera;
					     this.Display=Display;
						 this.Storage=Storage;
					     this.Battery=Battery;
						 this.price=price;
				 }
			}
		}
//class Motorola Started
class Motorola extends MobileShopy
{
	public void MotorolaSwitch()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================================");
		System.out.println("	--: ENTER YOUR CHOICE :--	");
		System.out.println("     -------------------------------	");
		System.out.println("	");
		System.out.println("Enter 1 for Motorola e32s");
		System.out.println("Enter 2 for Motorola G31");
		System.out.println("Enter 3 for Motorola G62");
		System.out.println("Enter 4 for Motorola G40");
		System.out.println("Enter 5 for Motorola One Fusion+");
		System.out.println("----------------------------------");
		System.out.println("Enter 6 Back To home Page");
		 int b=sc.nextInt();
		 switch(b)
		 {
		 case 1:
		 {
			 System.out.println("	");
			 System.out.println("===============================================================================");
			 System.out.println("Motorola e32s ");
			 System.out.println("------------------------------");
			 Motorolae32s a1=new Motorolae32s("Red","4GB","12MP","5.5 inches","32GB","35001mAh",12999);
			System.out.println(a1);
			Scanner sc3=new Scanner(System.in);
			System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				MotorolaSwitch();
			}
			break;
		 }	
		 
		case 2:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Motorola G31 ");
		 System.out.println("------------------------------");
		 MotorolaG31 a1=new MotorolaG31("Gray","8GB","20MP","4.9 inches","16GB","5000mAh",24499);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				MotorolaSwitch();
			}
		break;
		}
		case 3:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Motorola G62");
		 System.out.println("------------------------------");
		 MotorolaG62 a1=new MotorolaG62("White","16GB","40MP","5.9 inches","264GB","5000mAh",41599);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				MotorolaSwitch();
			}
		break;
		}
		case 4:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Motorola G40 ");
		 System.out.println("------------------------------");
		 MotorolaG40 a1=new MotorolaG40("Blue","4GB","64MP","4.7 inches","32GB","4000mAh",13000);
		 System.out.println(a1);
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				MotorolaSwitch();
			}
		break;
		}
		case 5:
		{
		 System.out.println("	");
		 System.out.println("===============================================================================");
		 System.out.println("Motorola One FusionPlus ");
		 System.out.println("------------------------------");
		 MotorolaOneFusionPlus a1=new MotorolaOneFusionPlus("White","4GB","32MP","5.5 inches","64GB","5000mAh",11999);
		 System.out.println(a1);	
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("=====================================================================================");
			System.out.println("Are You Want to buy Press 1");
			System.out.println("---------------------------------");
			System.out.println("You Want to Check Another Model Press 2");
			int a=sc.nextInt();
			if(a==1)
			{
				Buy();
			}
			else
			{
				System.out.println("===================");
				MotorolaSwitch();
			};
		}
		case 6:
		{
		 MainSwitch();		 	
		}
		default:
		{
			System.out.println("Enter Correct Choice Number:	");
			MotorolaSwitch();
		}
	}
}
}
class Motorolae32s extends Motorola			
{
	Motorolae32s(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
		{
		 	this.Color=Color;
			this.RAM=RAM;
			this.Camera=Camera;
			this.Display=Display;
			this.Storage=Storage;
			this.Battery=Battery;
			this.price=price;
		}
				
 }
class MotorolaG31 extends Motorola
			
{
	MotorolaG31(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
		 {
			 this.Color=Color;
			 this.RAM=RAM;
			 this.Camera=Camera;
			 this.Display=Display;
			 this.Storage=Storage;
			 this.Battery=Battery;
			 this.price=price;
		 }
			
}
class MotorolaG62 extends Motorola	
{
	MotorolaG62(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
				 }
			
}
class MotorolaG40 extends Motorola
			
{
	MotorolaG40(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
				this.Color=Color;
				this.RAM=RAM;
				this.Camera=Camera;
				this.Display=Display;
				this.Storage=Storage;
				this.Battery=Battery;
				this.price=price;
			}
			
}
class MotorolaOneFusionPlus extends Motorola

{
	MotorolaOneFusionPlus(String Color,String RAM,String Camera,String Display,String Storage,String Battery,double price)
			{
					 this.Color=Color;
					 this.RAM=RAM;
					 this.Camera=Camera;
				     this.Display=Display;
					 this.Storage=Storage;
				     this.Battery=Battery;
					 this.price=price;
			 }
	}
public class Driver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MobileShopy ref=new MobileShopy();
		ref.MainSwitch();
		System.out.println("====================================================================================");
		System.out.println("		...... Thank You For Buying Mobile ......		");
		System.out.println("=======================================================================================");
		System.out.println("		     !! Thanks For Visit Our Store !!		");
	}
}