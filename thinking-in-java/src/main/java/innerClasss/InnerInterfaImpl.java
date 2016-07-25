package innerClasss;

/**
 * @author yanliang
 */
public class InnerInterfaImpl extends Outer implements InnerInterfa{
    public int getIdAndName(String name){
        return id;
    }

    public InnerInterfaImpl(int id){
        super(id);
    }
}
