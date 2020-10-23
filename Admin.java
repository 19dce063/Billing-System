import java.util.*;

public class Admin extends User
{
    static Scanner kb = new Scanner(System.in);
    static protected String Username="admin";
    static protected String Password="admin";
    static int temp=0,temp1=0,temp2=0,temp3=0,temp4=0;
    public static void insert(String usname,String passwd)
    {
        try
        {
            for(int i=0;i<uname.length;i++)
            {
                if((uname[i] == "" && pwd[i] == "") || (uname[i] == null && pwd[i] == null))
                {
                    uname[i] = usname;
                    pwd[i] = passwd;
                    System.out.println(uname[i]+" "+pwd[i]);
                    break;
                }
                else
                {
                    temp++;
                }
                    
            }
            if(temp>0)
            {
                for(int j=0;j<uname.length;j++)
                {
                    dummy[j] = uname[j];
                    dummyp[j] = pwd[j];

                }
                a=uname.length+1;
                uname = new String[a];
                pwd = new String[a];
                for(int j=0;j<dummy.length;j++)
                {
                    uname[j] = dummy[j];
                    pwd[j] = dummyp[j];
                }
                dummy = new String[a];
                dummyp = new String[a];
                uname[a-1] = usname;
                pwd[a-1] = passwd;
            }
        }
        catch(Exception e)
        {
            System.out.println("Error occured" + e);
        }
        
    }

    //To check User
    public static void check()
    {
        temp1=0;
        String usname,passwd;
        usname = kb.next();
        passwd = kb.next();
        for(int i=0;i<uname.length;i++)
        {
            if(uname[i].equals(usname) && pwd[i].equals(passwd))
            {
                System.out.println("Details are Correct");
                temp1++;
                break;
            }
            else
            {
                temp1=0;
            }
        }
        if(temp1 == 0)
        {
            System.out.println("Details are Incorrect");
        }
    }

    //delete User

    public static void remove(String usname,String passwd)
    {
        int t=0; 
        for(int i=0;i<uname.length;i++)
        {
            if(uname[i].equals(usname) && pwd[i].equals(passwd))
            {
                uname[i]="";
                pwd[i]="";
                t=0;
                break;
            }
            else{
                t++;
            }
        }
        if(t>0)
        {
            System.out.println("User does not exists");
        }
    }


    //Items 
    public static void addItem()
    {
        String item;
        int prices;
        System.out.println("Enter item and price");
        item = kb.next();
        prices = kb.nextInt();
        for(int i=0;i<products.length;i++)
        {
            if((products[i] == null && price[i] == 0) || (products[i] == "" && price[i] == 0))
            {
                    products[i] = item;
                    price[i] = prices;
                    System.out.println(products[i]+" "+price[i]);
                    break;
            }
            else
            {
                temp3++;
            }
        }
        if(temp3 > 0)
        {
            dummy1 = Arrays.copyOf(products,products.length);
            dumm = Arrays.copyOf(price,price.length);
            products = Arrays.copyOf(dummy1,products.length+1);
            price = Arrays.copyOf(dumm,price.length+1);
            products[products.length-1] = item;
        }
    }
    public static void showUsers()
    {
        int j=0;
        for(j=0;j<uname.length;j++)
        {
            System.out.println(j+". "+uname[j]);
        }
        System.out.println("Total Users are: "+j);
    }
    public static void showItem()
    {
        for(int j=0;j<products.length;j++)
        {
            System.out.println(j+". "+products[j]+"         "+price[j]);
        }
    }

    public static void delItem()
    {
        String item;
        int prices;
        System.out.println("Enter username: ");
        item = kb.next();
        System.out.println("Enter password: ");
        prices = kb.nextInt();
        for(int i=0;i<products.length;i++)
        {
            if(products[i].equals(item))
            {
                products[i] = "";
                price[i]= 0;
            }
            else
                temp4++;
        }
        if(temp4>0)
        {
            System.out.println("Product not found");
        }
    }

}