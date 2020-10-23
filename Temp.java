import java.math.BigInteger;
import java.util.Scanner;
/**
 * InnerTemp
 */
interface Data {
    public void getdata();

    public void putdata();
    
}
class Main
{
    int id, pincode, age;
    String name, address;
    String gen;
    static int i = 0;
    static int k=0;
    String studentdata[][] = new String[50][8];
    String facultydata[][] = new String[50][8];
}

class Faculty extends Main implements Data 
{
    int experience;
    String course;

    public void getdata() 
    {
        Scanner kb = new Scanner(System.in);
        id = kb.nextInt();
        name = kb.next();
        address = kb.next();
        pincode = kb.nextInt();
        gen = kb.next();
        age = kb.nextInt();
        experience = kb.nextInt();
        kb.close();
        int j = 1;
        facultydata[i][0] = "Faculty";
        facultydata[i][j] = Integer.toString(id);j++;
        facultydata[i][j] = name;j++;
        facultydata[i][j] = address;j++;
        facultydata[i][j] = Integer.toString(pincode);j++;
        facultydata[i][j] = gen;j++;
        facultydata[i][j] = Integer.toString(age);j++;
        facultydata[i][j] = Integer.toString(experience);
        j++;
        i++;
    }

    public void check(int id)
    {
        String ids = Integer.toString(id);
        for(int x=0;x<50;x++)
        {
            if(facultydata[i][1].equals(ids))
            {
                putdata(x);
            }
        }
    }
    public void putdata()
    {
        System.out.println("The id is: " + id + ",\nname is: " + name + ",\naddress is: " + address + ",\npincode is: "
                + pincode + ",\ngen is: " + gen + ",\nage is: " + age + ",\nExperience is: " + experience);
    }
    
    public void putdata(int x) {
        System.out.println("The id is: " + facultydata[x][1] + ",\nname is: " + facultydata[x][2] + ",\naddress is: " + facultydata[x][3] + ",\npincode is: "
                + facultydata[x][4] + ",\ngen is: " + facultydata[x][5] + ",\nage is: " + facultydata[x][6] + ",\nExperience is: " + facultydata[x][7]);
    }

}
class Student extends Main implements Data
{
    int sem;
    String course;
    
    public void getdata() {
        
        Scanner kb = new Scanner(System.in);
        id = kb.nextInt();
        name = kb.next();
        address = kb.next();
        pincode = kb.nextInt();
        gen = kb.next();
        age = kb.nextInt();
        sem = kb.nextInt();
        kb.close();

        int j = 1;
        studentdata[k][0] = "Students";
        studentdata[k][j] = Integer.toString(id);
        j++;
        studentdata[k][j] = name;
        j++;
        studentdata[k][j] = address;
        j++;
        studentdata[k][j] = Integer.toString(pincode);
        j++;
        studentdata[k][j] = gen;
        j++;
        studentdata[k][j] = Integer.toString(age);
        j++;
        studentdata[k][j] = Integer.toString(sem);
        j++;
        k++;

    }
    public void check(int id)
    {
        String ids = Integer.toString(id);
        for(int x=0;x<50;x++)
        {
            if(studentdata[i][1].equals(ids))
            {
                putdata(x);
            }
        }
    }
    public void putdata() {
        System.out.println("The id is: " + id + ",\nname is: " + name + ",\naddress is: " + address + ",\npincode is: "
                + pincode + ",\ngen is: " + gen + ",\nage is: " + age + ",\nSemester is: " + sem);
    }
    
    public void putdata(int x) {
        System.out.println("The id is: " + studentdata[x][1] + ",\nname is: " + studentdata[x][2] + ",\naddress is: " + studentdata[x][3] + ",\npincode is: "
                + studentdata[x][4] + ",\ngen is: " + studentdata[x][5] + ",\nage is: " + studentdata[x][6] + ",\nExperience is: " + studentdata[x][7]);
    }
}

public class Temp {
    static Scanner kb3 = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.println("1. for Students data Entry");
            System.out.println("2. for Employee data Entry");
            System.out.println("3.for Students data Read");
            System.out.println("4.for Employee data Read");
            System.out.println("5.For no. of records");
            System.out.println("6.exit");

            num = kb3.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("Enter id,name,address,pincode,gen,age,sem");
                    Student s1 = new Student();
                    s1.getdata();
                    break;
                }
                case 2: {
                    System.out.println("Enter id,name,address,pincode,gen,age,Experience");
                    Faculty f1 = new Faculty();
                    f1.getdata();
                    break;

                }
                case 3: {
                    Scanner kb1 = new Scanner(System.in);

                    int id = kb1.nextInt();
                    kb1.close();
                    Student s1 = new Student();
                    s1.check(id);
                    break;

                }
                case 4: {
                    Scanner kb2 = new Scanner(System.in);
                    int id = kb2.nextInt();
                    kb2.close();
                    Faculty f1 = new Faculty();
                    f1.check(id);
                    break;

                }
                case 5: {
                    Student s1 = new Student();
                    System.out.println("The total no of records Student of  are: " + s1.k);
                    System.out.println("The total no of records faculty of  are: " + s1.i);
                    break;

                }
                case 6: {
                    System.out.println("Thanks for visit...");
                    System.exit(0);
                    break;

                }

                default: {
                    System.out.println("Wrong input...");
                    break;

                }
            }
        } while (true);
        
    }
}