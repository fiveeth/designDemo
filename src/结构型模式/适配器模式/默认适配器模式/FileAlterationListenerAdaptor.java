package 结构型模式.适配器模式.默认适配器模式;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

/**
 * FileAlterationListener接口有太多方法是可能用不到的,
 * 这时如果直接实现FileAlterationListener接口则需实现所有的方法,
 * 不合理,所以引入适配器模式
 *
 * @author Administrator
 * @date 2020-06-21 10:04
 */
public class FileAlterationListenerAdaptor implements FileAlterationListener {

    @Override
    public void onStart(FileAlterationObserver fileAlterationObserver) {

    }

    @Override
    public void onDirectoryCreate(File file) {

    }

    @Override
    public void onDirectoryChange(File file) {

    }

    @Override
    public void onDirectoryDelete(File file) {

    }

    @Override
    public void onFileCreate(File file) {

    }

    @Override
    public void onFileChange(File file) {

    }

    @Override
    public void onFileDelete(File file) {

    }

    @Override
    public void onStop(FileAlterationObserver fileAlterationObserver) {

    }
}
