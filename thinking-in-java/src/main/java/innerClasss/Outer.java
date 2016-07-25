package innerClasss;

/**
 * @author yanliang
 */
public class Outer {
    public int id;
    public Outer(int id){
        this.id = id;
    }
    public class Inner implements InnerInterfa{
        public Outer getOuter(){
            return Outer.this;
        }
        public void innerDoSomething(){

        }
    }
    public int getId(){
        return id;
    }
    public Inner generInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer out = new Outer(1);
        Outer.Inner i = out.new Inner();
        System.out.print(i.getOuter().getId());
    }

    public AbstractIdClass getAbsIdObj(int id){
        return new AbstractIdClass(id) {
            @Override
            public void doSomething() {

            }
        };
    }

    public static class StaticInnerClass implements InnerInterfa{

        public StaticInnerClass(){
            System.out.println("Static Inner Class initiated...");
        }

        public void doSomething(){
        }
        public static void staticDoSomething(){

        }
    }

    public static void doThis(){

    }

//    public static InnerInterfa getInnerFer(){
//        //!compile error innerClass.Outer.this can't reference from static context
//        return new Inner();
//    }

    public interface innerFace{

    }

}
