import java.util.*;
class restaurant
{
	static String username;
	static String pass;
	static String phone;
	static ArrayList<String > cart= new ArrayList();
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		for(; ;)
		{
		System.out.println();
		System.out.println("                     welcom to taj              ");
		System.out.println();
		System.out.println("1. Sign In");
		System.out.println("2. Sign Up");
		System.out.println();
		System.out.println("Enter an option");
		int option= sc.nextInt();
		switch(option)
		{
			case 1: createAccount(sc);
			break;
			case 2: login(sc);
			break;
			default : System.out.println("wrong choice entered");
		}
		
		}
	}

public static void createAccount(Scanner sc)
{
	System.out.println();
	System.out.println("create a account            " );
	System.out.println();
	System.out.println("username :");
	sc.nextLine();
	username =sc.nextLine();
	System.out.println("Password: ");
	pass = sc.next();
	System.out.println("contact number:    ");
	phone = sc.next();
	System.out.println();
	System.out.println("account created");
	
}
public static void login(Scanner sc)
{
	if (username != null)
	{
		for(int i=1; i<=3; i++)
		{
			System.out.println();
			System.out.println("Login page");
			System.out.println();
			System.out.println("username/ contact:     ");
			sc.nextLine();
			String un1= sc.nextLine();
			System.out.println("Password:    ");
			String pass1= sc.next();
			
			if(((un1.equals(username))||(un1.equals(phone)))&&(pass1.equals(pass)))
			{
				homePage(sc);
			}
			else
			{
				
				System.out.println();
				System.out.println("wrong choice entered");
				System.out.println();
			}
		}
		System.exit(0);
	}
	else
	{
		System.out.println("Create account first");
	}
}
public static void homePage(Scanner sc)
{
	for( ; ;)
	{
		System.out.println();
		System.out.println("Home Page");
		System.out.println();
		System.out.println("1.    VEG MENU      ");
		System.out.println("2. NON VEG MENU      ");
		System.out.println("3. CHECKOUT      ");
		
		System.out.println("4. LONGOUT     ");
		System.out.println();
		System.out.println("enter an option");
		int option= sc.nextInt();
		switch(option)
		{
			case 1: vegMenu(sc);
			break;
			case 2: nonVegMenu(sc);
			break;
			case 3: checkout(sc);
			 break;
			 case 4: System.exit(0);
			 System.out.println("thank you never visit again");
			 break;
			 default: System.out.println("wrong choice");
			 break;
			 
		}
	}
}
public static void vegMenu(Scanner sc)
{
	for(; ;)
	{
		System.out.println();
		System.out.println("VEG DISH");
		System.out.println("101. paneer tikka:     200");
		System.out.println("102. kaju curry  :     300");
		System.out.println("103. veg maratha:     350");
		System.out.println("104. Dal Tadka :   200");
		System.out.println("105:   Veg Biryani:   400");
		System.out.println("106:Menu");
		System.out.println();
		System.out.println("Enter a Dish Id");
		int id= sc.nextInt();
		switch(id)
		{
			case 101: cart.add("PannerTikka:   200");
			System.out.println("panner tikka added inside the cart");
			break;
			case 102: cart.add("kaju curry :   300");
			System.out.println("kaju curry added inside the cart");
			break;
			case 103: cart.add("veg maratha:   350");
			System.out.println("veg maratha added inside the cart");
			break;
			case 104: cart.add("dal tadka:   200");
			System.out.println("dal tadka added inside the cart");
			break;
			case 105: cart.add("veg Biryani:   400");
			System.out.println("Veg Biryani added inside the cart");
			break;
			case 106: //System.exit(0);
			return;
			default: System.out.println("wrong Dish Id");
			
		}
	}
}
public static void nonVegMenu(Scanner sc)
{
	for(;  ; )
	{
		System.out.println();
		System.out.println("Veg Menu Dishes");
		System.out.println("107. Chicken tikka:   200");
		System.out.println("108. Chicken Curry:    300");
		System.out.println("109. Chicken Biryani:   350");
		System.out.println("106. Menu");
		System.out.println();
		System.out.println("Enter a Dish Id");
		int id= sc.nextInt();
		switch(id)
		{
			case 107: cart.add("chicken Tikka :   200");
			System.out.println("Chicken Tikka added inside the cart");
			break;
			case 108: cart.add("chicken curry :   300");
			System.out.println("Chicken Curry added inside the cart");
			break;
			case 109: cart.add("chicken Biryani :   350");
			System.out.println("Chicken Biryani added inside the cart");
			break;
			case 106: return;
			default: System.out.println("wrong dish id");
			
		}
		
	}
}
public static void cart()
{
	System.out.println("Your purchased food");
	System.out.println();
	for(String food  : cart)
	{
		System.out.println(food);
	}
}
public static void checkout(Scanner sc)
{
	System.out.println("check tommo");
	cart();
}
}