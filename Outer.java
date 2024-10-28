public class Outer {
     int x =10;
     static int y = 30;
    public static void add(){
        System.out.println("add-method");
    }
    public  class Inner{
       public static void main(String [] args){
         add();
         System.out.println("Inner Class Main Method");
       }
    }
    public static void main(String[] args) {
         new Outer().new Inner();
         String[] a = {"A"};
       Inner.main(a);
    }

}