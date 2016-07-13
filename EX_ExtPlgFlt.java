import ij.IJ;
import ij.ImagePlus;
import ij.plugin.filter.PlugInFilterRunner;
import ij.process.ImageProcessor;

/*
 * The MIT License
 *
 * Copyright 2016 WAKU_TAKE_A.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 *
 * @author WAKU_TAKE_A
 */
public class EX_ExtPlgFlt implements ij.plugin.filter.ExtendedPlugInFilter{

    @Override
    public int showDialog(ImagePlus ip, String string, PlugInFilterRunner pifr) {

        IJ.showMessage("showDialog():\r\nthe command name is " + string);
        
        return IJ.setupDialog(ip, DOES_8G);
    }

    @Override
    public void setNPasses(int i) {

        IJ.showMessage("setNpasses():\r\nthe nPasses is " + String.valueOf(i));
    }

    @Override
    public int setup(String string, ImagePlus ip) {

        IJ.showMessage("setup()");
        
        return DOES_8G;
    }

    @Override
    public void run(ImageProcessor ip) {

        IJ.showMessage("run()");
    }
    
}
