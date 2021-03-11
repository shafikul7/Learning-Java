public class Function {
    public static void main(String[] args) {
        add(3,4,6,7);
        add(4,4,7,7); 
        System.out.println(5 + fun(1,2,3,4));
        
    }
    public static void add(int a , int b , int c , int d){
        System.out.println(a+b+c+d);
    }
    public static int fun(int a , int b , int c , int d){
       return a+b+c+d;
    }
   
}
