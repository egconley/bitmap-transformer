package bitmapTransformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    // instance variables
    String infile;
    String outfile;
    String transform;
    // access the bitmap file
    BufferedImage image;
    File savedImage;

    // define the constructor
    public Bitmap(String infile, String outfile, String transform) {
        this.infile = infile;
        this.outfile = outfile;
        this.transform = transform;
        // read the input bitmap file
        try {
            this.image = ImageIO.read(new File("assets/" + infile));
        } catch (IOException e) {
            System.out.println("invalid file name " + e);
        }
        try {
            savedImage = new File("assets/" + outfile);
            ImageIO.write(image, "bmp", savedImage);
        } catch (IOException e) {
            System.out.println("could not make new file" + e);
        }
    }
    // use Scanner
    // parse the bitmap's data into a Bitmap object

    // helper methods
    // practice transform
    public BufferedImage practiceTransform(image) {
        BufferedImage transformed = new BufferedImage(image);
    }


    // verified we are accessing CLI arguments
//    public String printUserInputs() {
//        return infile + outfile + transform;
//    }

}
