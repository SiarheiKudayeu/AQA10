package lesson4.access_modifier.package1;

import lesson4.access_modifier.package2.DClass;

public class BClass {
    public static void main(String[] args) {
        DClass dClass = new DClass();
        System.out.println(dClass.protectedString);
    }
       public void printFromAClass(){
        AClass aClass = new AClass();
        System.out.println(aClass.publicString);
        //System.out.println(aClass.privateString);
        System.out.println(aClass.protectedString);
        System.out.println(aClass.defaultString);


    }
}
