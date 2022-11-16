package ch03_interfaces_lambdaExpression.s06_Processing_lambda_expressions;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @usecase: suppose u want to fill an image with color patterns, where the user supplies a function yielding the color for each pixel.
 * @solution: there is no standard type for a mapping (int, int) -> Color. U can use BiFunction<-Integer, Integer, Color-> but that involves autoboxing. => define a new interface
 * @see ch03_interfaces_lambdaExpression.s06_Processing_lambda_expressions.PixelFunction
 */
public class _6_3_Impl_own_functional_interfaces {
    public static BufferedImage createImage(int width, int height, PixelFunction f) {
        var image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x=0; x < width; x++)
            for (int y=0; y<height; y++) {
                Color color = f.apply(x,y);
                image.setRGB(x,y,color.getRGB());
            }
        return image;
    }

    //create france flag
    public static void main(String[] args) throws IOException {
        BufferedImage frenchFlag = _6_3_Impl_own_functional_interfaces.createImage(150,100,(x,y) -> x<50 ? Color.BLUE : x<100 ? Color.WHITE : Color.RED);
        Path path = Path.of("flag.png");
        ImageIO.write(frenchFlag,"PNG",path.toFile());
        System.out.println("Image saved to " + path.toAbsolutePath());
    }
}
