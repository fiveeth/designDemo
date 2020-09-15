package 结构型模式.享元模式;

/**
 * @author guoyihua
 * @date 2020-07-24 10:08
 */
public class Connection {

    private boolean isAlive = true;

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void doTest(){
        System.out.println("connection");
    }
}
