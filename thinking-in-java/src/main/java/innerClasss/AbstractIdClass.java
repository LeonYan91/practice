package innerClasss;

/**
 * @author yanliang
 */
public abstract class AbstractIdClass {
    public int id;
    public AbstractIdClass(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public abstract void doSomething();

}
