/**
 * Created by wwh on 15-5-8.
 */
public class ManagerConet {

    static Conet func(){
        return new Conet();
    }
}

class Conet{
    public Conet() {
        fd = 0;
    }
    private int fd;
    public int ret_func(){
        return fd;
    }


}