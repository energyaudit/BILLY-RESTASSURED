package src.main.Java0;




/**
 * Created by byang on 2018-06-26.
 */


public class Rectangle  {
    private int defaultLength = 10;
    private int defaultWidth = 5;


    public void drawShape(String color) {
        System.out.println("Rectangle create with following properties: ");
        System.out.println("Length: " + defaultLength);
        System.out.println("Width: " + defaultWidth);
    }
    int length;
    int width;
   public void insert(int l,int w){//method insert assign length and width from method parameters l and w.
        length=l;
        width=w;
    }
    void calculateArea(){System.out.println(length*width);}
}
