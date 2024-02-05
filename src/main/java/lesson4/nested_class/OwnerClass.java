package lesson4.nested_class;

public class OwnerClass {
    public String string = "StringFromOwnerClass";
    static String string2 = "StaticStringFromOwnerClass";

    private void methodFromOwner(){
        System.out.println("methodFromOwner");
    }

    private static void staticMethodFromOwner(){
        System.out.println("staticMethodFromOwner");
    }

    public static class URL {
        public static final String url1 = "www.www";
        public static final String url2 = "www.xxx";
    }


    public static class NestedClass {
        public String test;
        static String nestedString = string2 + "test";

        public static void nestedStaticMethod(){
            staticMethodFromOwner();
        }

        public void nestedMethod(){
            staticMethodFromOwner();
        }

    }
}
