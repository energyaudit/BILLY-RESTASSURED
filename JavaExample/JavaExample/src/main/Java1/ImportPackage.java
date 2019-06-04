package src.main.Java1;

/**
 * Created by byang on 2/5/2018.
 */

import src.main.Java3.*;//import package of of parent class



class BImportPackageProtectedA extends ProtectedA{//parent class-ProtectedA is from another package,so import package of of parent class is done to extend direclty.
    public static void main(String args[]){
        BImportPackageProtectedA obj = new BImportPackageProtectedA();
        System.out.println("parent class-ProtectedA is from another package,so import package of of parent class is done to extend direclty.");
        obj.msg();//method of parent Protected class
    }
}