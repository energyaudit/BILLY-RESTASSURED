package src.main.Java3;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by byang on 4/25/2018.
 */
public class GetProperties {
    public static void main(String[] args)throws Exception{

        Properties p=System.getProperties();
        Set set=p.entrySet();

        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
        System.out.println(System.getSecurityManager());
    }
}

