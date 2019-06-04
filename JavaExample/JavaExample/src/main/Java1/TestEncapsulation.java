package src.main.Java1;

/**
 * Created by byang on 2/8/2018.
 */
public class TestEncapsulation {//same package as encapsulationStudent to call the encapsulationClass
    public static void main(String[] args){
        encapsulationStudent s=new encapsulationStudent();//Public lass ,so can access outside the class but its member is private
        s.setName("vijay");
        System.out.println("set:this.name=name;\ngetName:"+s.getName());
    }
}
