package 结构型模式.适配器模式.默认适配器模式;

import java.io.File;

/**
 * @author Administrator
 * @date 2020-06-21 10:19
 */
public class HelloTest {

    public static void main(String[] args) {
        FileDefault fileDefault = new FileDefault();
        File file = new File("/");
        fileDefault.onFileCreate(file);
        fileDefault.onFileCreate(file);
    }
}
