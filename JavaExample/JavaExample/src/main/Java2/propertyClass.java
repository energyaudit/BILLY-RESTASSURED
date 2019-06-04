package src.main.Java2;

/**
 * Created by byang on 2018-06-12.
 */

import java.util.Iterator;
        import java.util.Properties;
        import java.util.Set;

/**
 * This class is used to show the simple
 * Properties class example.
 * @author codesjava
 */
public class propertyClass {//Properties class is a subclass of Hashtable
    public static void main(String[] args) {

        Properties prop = new Properties();
        Set props;
        String str;

        //Set the properties value
        prop.setProperty("database", "oracle10g");
        prop.setProperty("username", "system");
        prop.setProperty("password", "oracle");

        //Get key set,Get Set view of Keys
        props = prop.keySet();
        System.out.println("Set view of Keys, Keys contains :");
        //iterate through the Set of keys
        Iterator itr = props.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        //Print the properties
        Iterator iterator = props.iterator();
        while(iterator.hasNext()) {
            str = (String) iterator.next();
            System.out.println("Prpperty: " + str +
                    ", Property Value: " + prop.getProperty(str));
        }

    }
}