package src.main.Java1;

/**
 * Created by byang on 1/30/2018.
 */
public class AggregateOutClass//employee has object address: AdreetoAggreagate
 {
    int id;
    String name;
     AddreToAggreagate address;//declare, address type is class address to aggregate

    public AggregateOutClass(int id, String name,AddreToAggreagate address) {//constructor
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println("constructor parameter address1 is object of AddreToAggreagate,id name: "+id+" "+name);
        System.out.println("City State country:"+address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        AddreToAggreagate address1=new AddreToAggreagate("gzb","UP","india");
        AddreToAggreagate address2=new AddreToAggreagate("gno","UP","india");

        AggregateOutClass e=new AggregateOutClass(111,"varun",address1);//constructor parameter address1 is object of AddreToAggreagate
        AggregateOutClass e2=new AggregateOutClass(112,"arun",address2);

        e.display();
        e2.display();

    }
}
