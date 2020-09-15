package 结构型模式.适配器模式.默认适配器模式;

import java.io.File;

/**
 * @author Administrator
 * @date 2020-06-21 10:17
 */
public class FileDefault extends FileAlterationListenerAdaptor{

    public void onFileCreate(final File file) {
        // 文件创建
        System.out.println("文件创建");
    }

    public void onFileDelete(final File file) {
        // 文件删除
        System.out.println("文件删除");
    }
}
