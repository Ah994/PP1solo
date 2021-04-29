import java.io.File; 
import java.io.FileNotFoundException;

class Student2
{

   private String name;
   private double Test1;
   private double Test2;
   private double Test3;
   private double Test4;
   private double avg;
   public Student2(String name, double test1, double test2, double test3, double test4) {
       super();
       this.name = name;
       Test1 = test1;
       Test2 = test2;
       Test3 = test3;
       Test4=test4;
   }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public double getTest1() {
       return Test1;
   }
   public void setTest1(double test1) {
       Test1 = test1;
   }
   public double getTest2() {
       return Test2;
   }
   public void setTest2(double test2) {
       Test2 = test2;
   }
   public double getTest3() {
       return Test3;
   }
   public void setTest3(double test3) {
       Test3 = test3;
   }
   public double getTest4() {
       return Test4;
   }
   public void setTest4(double test4) {
       Test4 = test4;
    
   public void setTest5(double test5) {
       Test5 = test5;   
   }
   @Override
   public String toString() {
       return "Student2 [name=" + name + ", Test1=" + Test1 + ", Test2=" + Test2 + ", Test3=" + Test3 +", Test4=" + Test4 + "Test5="+ Test5 +];
   }
   public double average()
   {
   return (Test1+Test2+Test3+Test4)/3;  
   }
  
   public double highest()
   {
       if(Test1>Test2 && Test1 >Test3 && Test1>Test4)
       {return Test1;}
       else if (Test2>Test1 && Test2>Test3 && Test2>Test4)
       {
           return Test2;
       }
       else if (Test3>Test1 && Test3>Test2 && Test3>Test4)
       {return Test3;}
       else return Test4;
   }
   public static void main(String[] args) 
   {
       

FileReader fr =
new FileReader("C:\\users\\anhzzz\\Desktop\\pp1");
  
int i;
while ((i=fr.read()) != -1)
System.out.print((char) i);
      
       Student2 s1= new Student2("Andrew",87.5,89,67.75,37,98.5);
       Student2 s2= new Student2("John",86,88,85.25,90,95);
System.out.println(s1.toString());
System.out.println(s2.toString());
System.out.println("Average of student 1= "+ s1.average());
System.out.println("Maximum score of student 1= "+s1.highest());
  

System.out.println("Average of student 2= "+ s2.average());
System.out.println("Maximum score of student2= "+s2.highest());
  

   }
  
}