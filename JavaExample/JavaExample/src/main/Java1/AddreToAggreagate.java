package src.main.Java1;

/**
 * Created by byang on 1/30/2018.
 */
public class AddreToAggreagate//If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
 {
    String city,state,country;//declare if all 3 are string, can use one string.address object contains its own informations such as city, state, country etc.

    public AddreToAggreagate(String city, String state, String country) {//address constructor.Employee has an object of Address,--AggregateOutClass-next class in java1//employee
        this.city = city;
        this.state = state;
        this.country = country;
    }

}