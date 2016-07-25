package innerClasss;

/**
 * @author yanliang
 */
public class InnerClassTest {
    public static void main(String[] args) {
        Outer out = new Outer(1);
        out.doThis();
        Outer.Inner inner = out.new Inner();
        Outer.StaticInnerClass staticInnerClass = new Outer.StaticInnerClass();
        Outer.StaticInnerClass staticInnerClass1 = new Outer.StaticInnerClass();
        staticInnerClass1.staticDoSomething();
//        staticInnerClass.doSomething();
    }
}
