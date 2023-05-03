import java.util.Scanner;
public class online_exam {
    public static void main(String[] args) {
        int no=4;
        int choice;
        String stu_name;
        int id=0;
        Scanner sc = new Scanner(System.in);
      
          System.out.print("Enter student name:");
                stu_name = sc.next();
                System.out.print("Enter roll no:");
                id = sc.nextInt();
                int count = 0;
                 System.out.println("Welcome "+stu_name+" to Online Examination");
        
        do{
        System.out.println("1.Take Exam");
        System.out.println("2.View Marks");
        System.out.println("3.Exit");
            System.out.print("Enter your choice:");
        no=sc.nextInt();
        if(no==4)
        {
            System.out.println("Thanks for taking exam!!");
            break;
        }
        switch(no)
        {
            case 1:
            {
                System.out.println("Select programming language:");
                System.out.println("1.Java \n2.C++");
                System.out.println("Enter your choice:");
                int sub=sc.nextInt();
                System.out.println("There are five questions in the examination");
            
                if(sub==1)
                {
                    count=0;
                    System.out.println("Q.1.Who invented Java Programming:");
                
                System.out.println("1.James Gosling \n2.Dennis Ritchie\n3.Guido van Rossum\n4.Ken Thompson");
                System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                System.out.println("Q.2.Number of primitive data types in Java are?");
                System.out.println("1.6\n2.7\n3.8\n4.9");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==3)
                {
                    ++count;
                }
                  System.out.println("Q.3. What is the size of float and double in java?");
                System.out.println("1.32 and 64\n2.32 and 32\n3.64 and 64\n4.64 and 32");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.4.Arrays in java are-");
                System.out.println("1.Object References\n2.Objects\n3.Primitive Data Type\n4.None");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==2)
                {
                    ++count;
                }
                  System.out.println("Q.5.In which of the following is toString() method defined?");
                System.out.println("1.java.lang.Object\n2.java.lang.String\n3.java.lang.util\n4.None");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                
                  if(choice==1)
                {
                    ++count;
                }
                }
                else
                {
                    count=0;
                       System.out.println("Q.1.C++ is developed by:");
                
                System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                System.out.println("Q.2.Identify the correct extension of the user-defined header file in C++");
                System.out.println("1. .cpp\n2. .hg\n3. .h\n4. .c");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.3.C++ uses which approach?");
                System.out.println("1.Right-left\n2.Top-dowm\n3.Left-right\n4.Bottom-up");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==4)
                {
                    ++count;
                }
                  System.out.println("Q.4.Which of the following data type is supported in C++ but not in C?");
                System.out.println("1.int\n2.bool\n3.double\n4.float");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==2)
                {
                    ++count;
                }
                  System.out.println("Q.5.C++ is:");
                System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();   
                if(choice==1)
                {
                    ++count;
                }
                }                
                break;
            }
            case 2:
            {
                System.out.println("You scored "+count+" out of 5");
            }
        }    
    }while(true);
}
    public online_exam() {
    }
}