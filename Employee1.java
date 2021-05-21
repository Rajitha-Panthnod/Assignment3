import java.util.Scanner;
abstract class Employee
{
    String name,desig;
    int age,sal;
     
    Scanner sc=new Scanner(System.in);
    
    public Employee()
    {
     System.out.println("\nEnter Name:");
     name=sc.next();
     System.out.println("\nEnter Age:");
     age=sc.nextInt();
     }
     public void display()
     {
      System.out.println("\nName :"+name);
      System.out.println("Age    :"+age);
      System.out.println("Salary :"+sal);
      System.out.println("Designation:"+desig);
      }
      public abstract void raise();
    }
    final class clerk extends Employee
    {
        public clerk()
        {
                 sal=20000;
                 desig="clerk";
         }
     
          public void raise()
          {
           sal+=15000;
           System.out.println("\nSalary Raised....");
           }
      }
      final class Programmer extends Employee
    {
        public Programmer()
        {
                 sal=25000;
                 desig="Programmer";
         }
     
          public void raise()
         {
           sal+=10000;
           System.out.println("\nSalary Raised....");
          }
      }
        final class Manager extends Employee
    {
        public Manager()
        {
                 sal=30000;
                 desig="Manager";
         }
     
          public void raise()
         {
           sal+=35000;
           System.out.println("\nSalary Raised....");
          }
      }
       class Emp
      {
          public static void main(String args[])
          { 
             Scanner sc=new Scanner(System.in);
             Employee[] e=new Employee[10];
             int ch=0,c2=0,i=0;
             do
             {
                System.out.println("\n 1.create \n 2.display \n 3.RaiseSalary\n 4.Exit\n Enter your choice");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:   do
                                {
                                  System.out.println("\n 1.Clerk \n 2.Manager \n 3.Programmer\n 4.Exit\n Enter your choice");
                                  c2=sc.nextInt();
                                  switch(c2)
                                  {
                                    case 1:e[i]=new clerk();
                                            i++;
                                            break;
                                    case 2:e[i]=new Programmer();
                                            i++;
                                            break;
                                    case 3:e[i]=new Manager();
                                            i++;
                                            break;
                  }
             }while(c2!=4);
       break;
    case 2: try
            {
               for(Employee x:e)
               {
                  if(x!=null)
                    x.display();
                }
             }catch(Exception ex){
                  System.out.println("No Records are Present.....!");
             }
           break;
        case 3: try
                {
                  for(Employee x:e)
                   {
                    if(x!=null)
                      x.raise();
                    }
                 }
                   catch (Exception ex)
                  {
                    System.out.println("No Records Present....");
                  }
              break;
           case 4: System.out.println("Exiting.....");
               break;
           default: System.out.println("Invalid choice....");
         }
       }while(ch>0 && ch<4);
    }
 }
           
             



           
