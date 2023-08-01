import java.util.ArrayList;

public class ClassLoaderExample {

    public static void main(String[] args) {

        Class cab = ClassLoaderExample.class;

        System.out.println(cab.getClassLoader());
        System.out.println(String.class.getClassLoader());

        int x=10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10

    }
}
