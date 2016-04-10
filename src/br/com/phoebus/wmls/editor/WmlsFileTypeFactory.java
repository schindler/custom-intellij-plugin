package br.com.phoebus.wmls.editor;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by raunysouza on 4/8/16.
 */
public class WmlsFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(WmlsFileType.INSTANCE, "wmls");
    }
}
