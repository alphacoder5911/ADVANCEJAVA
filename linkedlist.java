import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        //SAME AS LINKED LIST IN DATA STRUCTURES 
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add( 3,22);
        l1.add(4,33);
        l1.addFirst(11);
        l1.addLast(10101);
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
        System.out.println("INDEX OF 4 IS "+l1.indexOf(4));//INDEX OF ELEMENT IS RETURNED
        System.out.println("PEEKING "+l1.peek());//GIVES THE FIRST ELEMENT 
        System.out.println("POPED "+l1.pop());//POPS THE FIRST ELEMENT 
    }
}//ITS BETTER TO REFER JAVA 14 DOCUMENTATION FOR ALL THE METODS OF LL