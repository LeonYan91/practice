package innerClasss;

/**
 * @author yanliang
 */
public class DerivedInnerClass extends Outer.Inner implements Outer.innerFace{
    public DerivedInnerClass(){
        new Outer(1).super();
    }
    public DerivedInnerClass(Outer outer){
        outer.super();
    }
    static {

    }
}
