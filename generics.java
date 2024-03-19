import java.util.ArrayList;
class mygereric<T1>{
    private int a;
    private T1 t1;
    mygereric(int a,T1 t1)
    {
        this.a=a;
        this.t1=t1;

    }

    int geta(){
      return a;  
    }

    public T1 gett1()
    {
        return t1;

    }
}
public class generics {
    public static void main(String[] args) {
       //GENERICS WILL HELP AVOIDING ERROR FROM USER SIDE WHILE GIVING INPUTS :EG
    mygereric<String> n =new mygereric(11,"hello world ");// instead of string if i use int i can write int value 
    n.gett1();
    System.out.println(n.gett1());
    }
}
