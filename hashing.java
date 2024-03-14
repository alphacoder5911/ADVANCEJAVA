import java.util.HashSet;

public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> myhash=new HashSet<>(10,0.5f);
        myhash.add(10);
        myhash.add(11);
        myhash.add(12);
        myhash.add(13);
        myhash.add(14);
        myhash.add(15);
        myhash.add(16);
        myhash.add(21);
        System.out.println(myhash);
        System.out.println(myhash.hashCode());
         
     
    }
}
