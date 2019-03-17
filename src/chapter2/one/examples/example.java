package chapter2.one.examples;

/**
 * @Author slowgenius
 * @Date 2019/3/17 17:30
 * @Description
 */
public class example {
    //静态工厂方法代替构造器
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
