package src.main.Java0;

/**
 * Created by byang on 1/19/2018.
 */
public class Switch
{
    public static void main(String[] args) {
        int number=20;
        switch(number){//switch on number
            case 10: System.out.println("10");break;
            case 20: System.out.println("20");break;
            case 30: System.out.println("30");break;
            default:System.out.println("Not in 10, 20 or 30");
        }

        String game = "java";
        switch(game){//switch on string
            case "sql":
                System.out.println("Learn sql");
                break;
            case "java":
                System.out.println("Learn java");
                break;
            case "angularjs":
                System.out.println("Learn angularjs");
        }
    }
}