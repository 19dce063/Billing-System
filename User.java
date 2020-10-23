import java.util.*;

public class User 
{
    static int temp1=0,total=0,num=0,pn=0;
    static Scanner kb = new Scanner(System.in);
    static protected int a=2;
    static protected String uname[] = {"abc"};
    static protected String pwd[] = {"abc"};
    static protected String products[] = {"apple"};
    static protected int price[] = {20};
    static protected String dummy[] = {"abc"};
    static protected String dummyp[] = {"abc"};
    static protected String dummy1[] = {"apple"};
    static protected int dumm[] = {20};

    static protected String products1[] = new String[1];
    static protected int price1[] = new int[1];
    static protected String products2[];
    static protected int price2[];
    
    static int k=0;
    

    public static void checkUser(String usname,String passwd)
    {
        for(int i=0;i<uname.length;i++)
        {
            if(uname[i].equals(usname) && pwd[i].equals(passwd))
            {
                System.out.println("Welcome " + uname[i]);
                break;
            }
            else
            {
                temp1++;
            }
        }
        if(temp1 == 0)
        {
            //User functionality starts
            do
            {
                System.out.println("1. for Entry");
                System.out.println("2. for bill"); 
                System.out.println("3.exit");
                num = kb.nextInt(); 
                int n;
                switch(num)
                {
                    case 1:
                    {
                        System.out.println("1.Continue"); 
                        System.out.println("2.exit");
                        
                        n = kb.nextInt();
                        for(int j=0;j<products.length;j++)
                        {
                            System.out.println(j+". "+products[j]+"         "+price[j]);
                        }
                        while(n!=2)
                        {
                            System.out.println("Enter product number"); 
                            pn = kb.nextInt(); 
                            switch(num)
                            {
                                case 1:
                                {
                                    total = total + price[pn];
                                    products1[k] = products[pn];
                                    price1[k] = price[pn];
                                    k++;
                                    products2 = Arrays.copyOf(products1,products1.length);
                                    price2 = Arrays.copyOf(price1,price1.length);
                                    products1 = Arrays.copyOf(products2,products1.length+1);
                                    price1 = Arrays.copyOf(price2,price1.length+1);
                                    break;
                                }
                                default:
                                    System.out.println("Wrong Number");
                            }

                            System.out.println("1.Continue"); 
                            System.out.println("2.exit");
                            n = kb.nextInt();
                        }             
                            break;                              
                    }
                    case 2:
                    {
                        for(int i=0;i<products2.length;i++)
                        {
                            System.out.println("Item : "+products1[i]+" price is : "+price1[i]);
                        }
                        System.out.println("Your bill is " + total);
		System.out.println("Made by 19DCE007 Snehkumar Bhatt");

		}
                    case 3:
                    {
                        System.exit(0);
                    }
                    default:
                        System.out.println("Wrong Number");
			
                }
            }
            while(true);
		
            //ends
        }
        else
        {
            System.out.println("Details are Incorrect");
        }
    }
}

