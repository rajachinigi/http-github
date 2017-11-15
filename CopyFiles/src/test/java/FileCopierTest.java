/**
 * Created by mchinigi on 9/26/2016.
 */

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileCopierTest
{

    @Test
    public void testCopyDirectory()
    {
        File inboxDir = new File("/Users/johndunning/Desktop/Camel/CamelIn");
        File outboxDir = new File("/Users/johndunning/Desktop/Camel/CamelOut");

        FileCopier fileCopier = new FileCopier();

        try
        {
            outboxDir.mkdir();
            File[] files = inboxDir.listFiles();

            for (File source : files)
            {
                if (source.isFile())
                {
                    File dest = new File(outboxDir.getPath() + File.separator + source.getName());
                    fileCopier.copyFile(source, dest);
                }
            }
        }
        catch (IOException e)
        {
            fail(e.getMessage());
        }
    }

}
