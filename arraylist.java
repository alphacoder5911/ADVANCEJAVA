import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        /* WHAT IS ARRAY LIST
         * : IT IS A RESIZABLE FORM OF ARRAY , THROUGH WHICH WE CAN EFFECIENTLY MANAGE A LIST OR ARRAY 
         * OF INTEGERS OR ANY OTHER DATATYPE AND PERFORM SOME OPERATIONS ON THEM FOR FASTER 
         * MEMORY AND TIME MANAGEMENT       */
        Scanner sc=new Scanner(System.in);
        int n;
        n=10;
        int num;
        ArrayList<Integer> l1=new ArrayList<>(n);
        System.out.println("ENTER THE ARRAY LIST ELEMENTS ");
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        ArrayList<Integer> l2=new ArrayList<>(n);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l1.addAll(l2);
        System.out.println(l1.isEmpty());
        l1.remove(7);//index;
        System.out.println(l1.toArray());
        l1.ensureCapacity(22);
        // l1.clear();
        // for(int i=0;i<n;i++)
        // {
        //     num=sc.nextInt();
        //     l1.add(num);
        // }

        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
        }

    }
}
//YET TO DISCOVER ABOUT THE ARRAY LISTS NOT FULLY UNDERSTOOD ;
