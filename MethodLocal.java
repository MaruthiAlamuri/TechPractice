public class MethodLocal{
    int x = 10;
    static int y = 20;
    public static void add(){
         class Inner{
             public static void sub(){
                  System.out.println(y);
             }
         }
         Inner.sub();
     }
  public static void main(String[] args){
       MethodLocal.add();
  }

} 