import java.util.Scanner;

    class createclass
    {

        String Name;

        void getdata()
        {

            Scanner sc = new Scanner(System.in);

            System.out.print("\n\tEnter your Name : ");
            Name = sc.nextLine();


            System.out.print("\n\tyour name is : "+Name);


        }
  public static void main(String args[]){
createclass C=new createclass();
C.getdata();
}
}



