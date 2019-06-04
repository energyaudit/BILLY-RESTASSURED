package src.main.Java3;

/**
 * Created by byang on 4/11/2018.
 */
//package com.example.skeletal;
 interface Ivending {
    void start();
    void chooseProduct();
    void stop();
    void process();
}
//package com.example.skeletal;
 class VendingService {
    public void service()
    {
        System.out.println("Clean the vending machine");
    }
}
//package com.example.skeletal;
 abstract class AbstractVending implements Ivending {
    public void start()
    {
        System.out.println("Start Vending machine");
    }
    public void stop()
    {
        System.out.println("Stop Vending machine");
    }
    public void process()
    {
        start();
        chooseProduct();
        stop();
    }
}
//package com.example.skeletal;
 class CandyVending  implements Ivending {
    private class AbstractVendingDelegator extends AbstractVending
    {
        @Override
        public void chooseProduct() {
            System.out.println("Produce diiferent candies");
            System.out.println("Choose a type of candy");
            System.out.println("pay for candy");
            System.out.println("collect candy");
        }
    }
    AbstractVendingDelegator delegator = new AbstractVendingDelegator();
    @Override
    public void start() {
        delegator.start();
    }
    @Override
    public void chooseProduct() {
        delegator.chooseProduct();
    }
    @Override
    public void stop() {
        delegator.stop();
    }
    @Override
    public void process() {
        delegator.process();
    }
}
//package com.example.skeletal;
 //       package com.example.skeletal;
 class DrinkVending extends VendingService  implements Ivending {
    private class AbstractVendingDelegator extends AbstractVending
    {
        @Override
        public void chooseProduct() {
            System.out.println("Produce diiferent soft drinks");
            System.out.println("Choose a type of soft drinks");
            System.out.println("pay for drinks");
            System.out.println("collect drinks");
        }
    }
    AbstractVendingDelegator delegator = new AbstractVendingDelegator();
    @Override
    public void start() {
        delegator.start();
    }
    @Override
    public void chooseProduct() {
        delegator.chooseProduct();
    }
    @Override
    public void stop() {
        delegator.stop();
    }
    @Override
    public void process() {
        delegator.process();
    }
}
//package com.example.skeletal;
 class VendingManager {
    public static void main(String[] args) {
        Ivending candy = new CandyVending();
        Ivending drink = new DrinkVending();
        candy.process();
        System.out.println("*********************");
        drink.process();
        if(drink instanceof VendingService)
        {
            VendingService vs = (VendingService)drink;
            vs.service();
        }
    }//Looking at the above design, I create an interface, then create an abstract class where I define all common implementations. Then, for each subclass, I implement a delegator class.

    //And using that delegator, we forward the call to AbstractVending.
}
/**
 Start Vending machine
 Produce diiferent candies
 Choose a type of candy
 pay for candy
 collect candy
 Stop Vending machine
 *********************
 Start Vending machine
 Produce diiferent soft drinks
 Choose a type of soft drinks
 pay for drinks
 collect drinks
 Stop Vending machine
 Clean the vending machine
 **/