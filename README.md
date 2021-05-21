# Assignment3
This Emplyoee program with a business and logic and real entity.
In this business logic we have some properties like name, salary, age and designation.
These program realated to a business logic and real entity In this Project we have to done on java programing language first we can thing how to implement our application and what are the methods and varaibles required and come with our logic implement the our project.
In this business logic first we have take abstract class and declare the all varaibles and methods varaibles like name,designation, salary,age and methods are Emplyoee,display,yraise. 
In these we can read the all the name,age,salary desiganation, and by using the methods we can implement the our project.
Every time execution start from main method and step by step we go through and compile and execute the our promgram successfully In these first we have take the abstract class and
 all properties like varaibles such as

    String name,desig;
    int age,sal;
    
by dynamic way reading purpose we have to import the scanner class and create scanner class object.

      Scanner sc=new Scanner(System.in);
      
Next we have employee method in this employee(); we can enter the name and age of the the emplyoee. 

                             public Employee()
                              {
                              System.out.println("\nEnter Name:");
                              name=sc.next();
                              System.out.println("\nEnter Age:");
                              age=sc.nextInt();
                              }
                                                          
By using display method we have to what ever values we enter those are display on the screen like name,salary,age,desgnation                              
                              
       public void display()
     {
      System.out.println("\nName :"+name);
      System.out.println("Age    :"+age);
      System.out.println("Salary :"+sal);
      System.out.println("Designation:"+desig);
      }
next we have another method it is only define that metho not declare the and it override the in sub classes 
       
       public abstract void raise();
       
In these business logic we have the emplyoees like clerk, Programmer, Manager.In this class we assign the their salaries and desinations.      
once we are declare the final class in this business logic we can not the inherited other class and class clerk extends from employee class what ever properties are in employee class those properties are come to the clerk class.In these we have one more method that is employee raise salary purpose.
       
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
           
once we are declare the final class in this business logic we can not the inherited other class and class Programmer extends from employee class what ever properties are in employee class those properties are come to the Programmer class.In these we have one more method that is employee raise salary purpose.
                  
           
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
      
once we are declare the final class in this business logic we can not the inherited other class and class Manager extends from employee class what ever properties are in employee class those properties are come to the Manager class.In these we have one more method that is employee raise salary purpose.
          
     
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
  
In this business logic we one more class that is class Emp;
This class have main method and every program execution start from main method and step by step we will continue the process.


       public static void main(String args[]);
       
Next we have create the array of the employee object.

       Employee[] e=new Employee[10];
       
In this Progam next display on the screen create,diplay,raisesalary and exit based our choice we have to enter the numbers and it will contain switch loop and based on our choice we have enter the values emplyoees 


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
   we can enetr the all name age salary and all the emplyoee deatais are displayed on the screen and then choose exit optin we come from the out of the loop.
     
       
       
       
      
       
 
       
           

    
