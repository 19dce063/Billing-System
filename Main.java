import java.io.*;
import java.util.*;
public class Main
{
    // extraa
    static String usname = "123";
    static String pawd = "123";
    static String[] Item = new String[2];
    static int[] price = new int[2];
    static Scanner kb = new Scanner(System.in);


    public static void insert(String uname,String pwd)
    {
        for(int i=0;i<2;i++)
        {
            if(usname == "")
            {
                usname = uname;
                pawd = pwd;
                System.out.println(usname+" "+pawd);
            }
            else
                continue;
        }
    }
    public static void check(String uname,String pwd)
    {
        for(int i=0;i<2;i++)
        {
            if(usname == uname & pawd == pwd)
            {
                System.out.println("Details are Correct");
                break;
            }
            else
            {
                System.out.println("Details are Incorrect");
                break;
            }
        }
    }
    public static void remove(String uname,String pwd)
    {
        for(int i=0;i<2;i++)
        {
            if(usname == uname & pawd == pwd)
            {
                usname="";
                pawd="";
            }
            else{
                System.out.println("User does not exists");
                break;
            }
        }
    }

    public static void addItem()
    {
        String uname,pwd;
        System.out.println("Enter uname and password");
        uname=kb.next();
        pwd=kb.next();
        
        for(int i=0;i<2;i++)
        {
            if(uname.equals("admin") && pwd.equals("admin"))
            {
                String ite;
                int pric;
                System.out.println("Enter item and price");
                ite = kb.next();
                pric = kb.nextInt();

                Item[i] = ite;
                price[i] = pric;
                    
            }
            else{
                System.out.println("You are not admin");
            }
        }
    }

    public static void showItem()
    {
        for(int j=0;j<Item.length;j++)
        {
            System.out.println(i+". "+Item[i]+"         "+price[i]);
        }
    }

    public static void delItem(String item)
    {
        String uname,password;
        System.out.println("Enter username: ");
        uname = kb.next();
        System.out.println("Enter password: ");
        password = kb.next();
        for(int i=0;i<2;i++)
        {
            if(uname.equals("admin") && password.equals("admin"))
            {
                if(Item[i].equals(item))
                {
                    Item[i] = "";
                    price[i]= 0;
                }
                else
                    continue;
            }
            else{
                System.out.println("You are not admin");
            }
            
        }
    }

    public static void changeuser(String a)
    {
        String un,pw,usn,pwn;
        System.out.println("Enter uname and pwd");
        un = kb.next();
        pw = kb.next();
        int num,pn;
        float total=0;
        for(int i=0;i<2;i++)
        {   
            if(usname.equals(un) && pawd.equals(pw))
            {
                for(i=0;i<Item.length;i++)
                {
                    System.out.println(i+". "+Item[i]+"        "+price[i]);
                }
            }
        }
        do{
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
                    while(n!=2){
                        System.out.println("Enter product number"); 
                        pn = kb.nextInt(); 
                        switch(num)
                        {
                            case 1:
                            {
                                total = total + price[pn];
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
                        System.out.println("Your bill is "+total);
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
    }

    static int i=1;

    //Main
    public static void main(String args[])
    {
        String uname,password;
        String user,pwd;
        System.out.println("Enter username: ");
        uname = kb.next();
        System.out.println("Enter password: ");
        password = kb.next();
        do
        {
            if(uname.equals("admin") && password.equals("admin"))
            {
                System.out.println("1.Add user");
                System.out.println("2.Check users");
                System.out.println("3.Change password");
                System.out.println("4.Add Item");
                System.out.println("5.Show all  Items");
                System.out.println("6.Remove Item");
                System.out.println("7.Change user");
                System.out.println("8.Exit");
                int n = kb.nextInt();
                switch(n)
                {
                    case 1:
                    {
                        System.out.println("Enter password: ");
                        password = kb.next();
                        if(password.equals("admin"))
                        {
                            System.out.println("Enter username: & password :");
                            user = kb.next();
                            pwd = kb.next();
                            insert(user,pwd);
                            System.out.println("user added");
                        }
                        else{
                            System.exit(0);
                        }
                        break;
                    }
                    case 2:
                    {
                        user = kb.next();
                        pwd = kb.next();
                        check(user,pwd);
                        break;
                    }
                    case 3:
                    {
                        break;
                    }
                    case 4:
                    {
                        addItem();
                        break;
                    }
                    case 5:
                    {
                        showItem();
                        break;
                    }
                    case 6:
                    {
                        // removeuser();
                        break;
                    }
                    case 7:
                    {
                        changeuser("add");
                        break;
                    }
                    case 8:
                    {
                        System.exit(0);
                        }
                    default:
                    {
                        System.out.println("wrong");
                        System.exit(0);
                    }
                }
                    
            }
            else{
                System.out.println(uname+" "+password);
                System.out.println("Mismatch");
                System.exit(0);
            }
        }
        while(true);
    }
}