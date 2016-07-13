import ij.*;
import ij.IJ;
import ij.process.ImageProcessor;

/**
 * Hello World
 * @author WAKU_TAKE_A
 */
public class hello_world implements ij.plugin.PlugIn
{
    @Override
    public void run(String string)
    {
        IJ.showMessage("Hello World");
    }
}