import java.util.ArrayList;

public class ArrayList_Java1 {

    public static void main(String args[])
    {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        int l = ar.size();
        System.out.println(ar.get(2)+" "+l);
    }
    
}
