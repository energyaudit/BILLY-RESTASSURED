package WEB1;


import WEB1.util.DBIntParameter;
import WEB1.util.DBStringParameter;
import WEB1.util.OutPutResult;

public class DBCallUtiIIntStr {

    public static void main(String[] args) throws Exception {

        DBIntParameter sqlquery = new DBIntParameter();
        String DBRESULT = sqlquery.inputInt(20607);//Call Utility int parameter
        System.out.println(DBRESULT);

        DBStringParameter sqlquery1 = new DBStringParameter();
        String DBRESULT1 = sqlquery1.inputStr("'rick gu'");////Call Utility String parameter
        System.out.println(DBRESULT1);

        OutPutResult outR = new OutPutResult();//Out put test result
        outR.inputStr("TestCase1");

    }

}
