import java.io.*;
import java.util.*;
public class Main1 extends Admin
{
    public static void main(String aregs[])
    {
        Scanner kb = new Scanner(System.in);
        String username,password;
        System.out.println("Enter username: ");
        username = kb.next();
        System.out.println("Enter password: ");
        password = kb.next();

        do
        {
            if(Username.equals(username) && Password.equals(password))
            {
                System.out.println("1.Add user");
                System.out.println("2.Check users");
                System.out.println("3.Delete user");
                System.out.println("4.Add Item");
                System.out.println("5.Show all  Items");
                System.out.println("6.Remove Item");
                System.out.println("7.Total users");
                System.out.println("8.Exit");
                System.out.println("9.User change");

                int n = kb.nextInt();
                String user,pwd;
                switch(n)
                {
                    case 1:
                    {
                        System.out.println("Enter password: ");
                        password = kb.next();
                        if(password.equals(Password))
                        {
                            System.out.println("Enter username: & password :");
                            user = kb.next();
                            pwd = kb.next();
                            insert(user,pwd);
                            System.out.println("user added");
                        }
                        else{
                            System.out.println("Wrong Password ");
                            break;
                        }
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter password: ");
                        password = kb.next();
                        if(password.equals(Password))
                        {
                            System.out.println("Enter username: & password :");
                            check();
                        }
                        else{
                            System.out.println("Wrong Password ");
                            break;
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Enter password: ");
                        password = kb.next();
                        if(password.equals(Password))
                        {
                            System.out.println("Enter username: & password :");
                            user = kb.next();
                            pwd = kb.next();
                            remove(user,pwd);
                        }
                        else{
                            System.out.println("Wrong Password ");
                            break;
                        }
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
                        delItem();
                        break;
                    }
                    case 7:
                    {
                        showUsers();
                        break;
                    }
                    case 8:
                    {
                        System.exit(0);
                    }
                    case 9:
                    {
                        System.out.println("Enter username: ");
                        username = kb.next();
                        System.out.println("Enter password: ");
                        password = kb.next();
                        checkUser(username,password);
                    }
                    default:
                    {
                        System.out.println("wrong");
                        System.exit(0);
                    }
                }
                    
            }
            //User functionalitys
            else{
                try
                {
                    checkUser(username,password);
                }
                catch(Exception e)
                {
                    System.out.println("Wrong Details.");
                    System.exit(0);
                }                
            }
        }
        while(true);
    }
}