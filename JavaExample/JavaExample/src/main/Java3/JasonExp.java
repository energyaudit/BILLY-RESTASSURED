package src.main.Java3;


import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.StringWriter;

class JasonExp {

    public static void main(String[] args) {

        JSONObject obj1 = new JSONObject();

        obj1.put("name", "foo");
        obj1.put("num", new Integer(100));
        obj1.put("balance", new Double(1000.21));
        obj1.put("is_vip", new Boolean(true));

        System.out.print(obj1);
       
       
       
        JSONObject obj = new JSONObject();

        obj.put("name","foo");
        obj.put("num",new Integer(100));
        obj.put("balance",new Double(1000.21));
        obj.put("is_vip",new Boolean(true));

        StringWriter out = new StringWriter();

        try {
            obj.writeJSONString(out);
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        String jsonText = out.toString();
        System.out.print(jsonText);
    }
}