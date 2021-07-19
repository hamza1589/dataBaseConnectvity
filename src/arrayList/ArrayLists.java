package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList();
        name.add("paul");
        name.add("jacl");
        name.add("ana");
        name.add("dav");
        //System.out.println(name);
        for(int i=0;i<name.size();i++){
            System.out.println(name.get(i));
        }
//       Iterator it= name.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//
//
//        }
    }
}