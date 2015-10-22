package proxy;
import magick.MagickImage;
import magick.ImageInfo;

public class ImagickProxy {
	public static void main(String args[]){
	    try
	    {
	        ImageInfo origInfo = new ImageInfo(args[0]); //load image info
	        MagickImage image = new MagickImage(origInfo); 
	        image = image.scaleImage(1000, 1000);
	        image.setFileName("output.jpg"); 
	        image.writeImage(origInfo);
	    }
	    catch (Exception e)
	    {
	            e.printStackTrace();
	    }
	}
}
