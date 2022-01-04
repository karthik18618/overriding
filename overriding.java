
    class trees
    {
        void distance(int a)
        {
            System.out.println("distance of a:");
            System.out.println("a is ="+a);
        }
    }
    class plants extends trees {
        void distance(int a) {
            System.out.println("length of a:");
            System.out.println("a is ="+a);
        }

    }
   public class overriding
    {
    public static void main(String args[])
    {
        trees obj1 = new trees();
        obj1.distance(100);
        plants obj2 = new plants();
        obj2.distance(200);
    }

}
