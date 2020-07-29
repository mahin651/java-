import java.util.Scanner;

    class Employee
    {

        String Name;

        long Salary;

        void getdata()
        {

            Scanner sc = new Scanner(System.in);

            System.out.print("\n\tEnter Employee Name : ");
            Name = sc.nextLine();


            System.out.print("\n\tEnter Employee Salary : ");
            Salary = Long.parseLong(sc.nextLine());

        }

        void showdata()
        {


            System.out.print("\n\tEmployee Name : "+Name);

            System.out.print("\n\tEmployee Salary : "+Salary);
             }

        public static void main(String args[])
        {

            Employee E = new Employee();// Creating Object

            E.getdata();
            E.showdata();

        }
    }
