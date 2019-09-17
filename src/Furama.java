import java.util.*;

public class Furama {
    public static void main(String[] args) {
        Customer[] customers=new Customer[10];
        customers[0]= new Customer ();
        customers[1]= new Customer ();
        customers[2]= new Customer ();
        customers[3]= new Customer ();
        customers[4]= new Customer ();
        customers[5]= new Customer ();
        customers[6]= new Customer ();
        customers[7]= new Customer ();
        customers[8]= new Customer ();
        customers[9]= new Customer ();

        Map<Integer, Customer> map = new HashMap<Integer, Customer> ();
        map.put ( 001, customers[0] );
        map.put ( 002, customers[1] );
        map.put ( 003, customers[2] );
        map.put ( 004, customers[3] );
        map.put ( 005, customers[4] );
        map.put ( 006, customers[5] );
        map.put ( 007, customers[6] );
        map.put ( 011, customers[7] );
        map.put ( 012, customers[8] );
        map.put ( 010, customers[9] );

        //show map
        Set set = map.keySet ();
        for (Object key : set) {
            System.out.println ( key + "-" + map.get ( key ) );
        }

    }
}
