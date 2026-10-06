import java.util.*;

public class Student{
   int usn;
   String name;
   
   void accept(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter USN : ");
      usn = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter Name : ");
      name = sc.nextLine();
   }
   
   void display(){
      System.out.println("Name : " + name + "\nUSN : " + usn + "\n");
   }
   
   // public static void main(String args[]){
//       Student[] s = new Student[3];
//       
//       for(int i = 0; i < 3; i++){
//          s[i] = new Student();
//          s[i].accept();
//       }
//       
//       for(int i = 0; i < 3; i++){
//          s[i].display();
//       }
//    }
   
   public static void main(String args[]){
      Student s1 = new Student();
      Student s2 = new Student();
      Student s3 = new Student();
      
      s1.accept();  
      s2.accept();    
      s3.accept();
      
      s1.display();
      s2.display();
      s3.display();
   }
}