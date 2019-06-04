package src.main.Java2;

/**
 * Created by byang on 2018-06-08.
 */


class AddressD implements Cloneable{
    private String city;
    private String pinCode;

    public AddressD(String city, String pinCode) {
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPinCode() {
        return pinCode;
    }
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}

class CustomerD implements Cloneable {
    private String name;
    private AddressD address;
    public CustomerD(String name, AddressD address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public AddressD getAddress() {
        return address;
    }
    public void setAddress(AddressD address) {
        this.address = address;
    }
    public Object clone()throws CloneNotSupportedException{//super.clone() call returns a shallow copy of an object, but we set deep copies of mutable fields manually, so the result is correct
        CustomerD customer = (CustomerD) super.clone();//Different from shallow clone
        customer.address = (AddressD)this.address.clone();//Different from shallow clone
        return customer;
    }
}

public class DeepClone {
    public static void main(String args[]){
        try{
            CustomerD originalObj = new CustomerD("Vivek", new AddressD("Gurgaon", "122001"));
            CustomerD clonedObj=(CustomerD)originalObj.clone();
            System.out.println("Original Object properties: ");
            System.out.println(originalObj.getName());
            System.out.println(originalObj.getAddress().getCity());
            System.out.println(originalObj.getAddress().getPinCode());
            System.out.println("Cloned Object properties: ");
            System.out.println(clonedObj.getName());
            System.out.println(clonedObj.getAddress().getCity());
            System.out.println(clonedObj.getAddress().getPinCode());

            //Change in cloned object
            clonedObj.getAddress().setPinCode("122002");

            //Changes will not reflect in original object also
            System.out.println("Original Object pincode after changes in cloned object: ");
            System.out.println(originalObj.getAddress().getPinCode());

        }catch(CloneNotSupportedException c){

        }
    }
}