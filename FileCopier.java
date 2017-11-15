/**
 * Created by mchinigi on 9/26/2016.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileCopier
{
    public void copyFile(File source, File dest) throws IOException
    {

        OutputStream out = new FileOutputStream(dest);
        byte[] buffer = new byte[(int) source.length()];
        FileInputStream in = new FileInputStream(source);
        in.read(buffer);

        try
        {
            out.write(buffer);
        }
        finally
        {
            out.close();
            in.close();
        }
    }
}