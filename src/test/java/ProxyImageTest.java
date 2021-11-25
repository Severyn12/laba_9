import proxy_pattern.ProxyImage;
import proxy_pattern.RealImage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyImageTest {
    private ProxyImage proxyImage = new ProxyImage("data.txt");

    @org.junit.jupiter.api.Test
    void proxy_test(){
        RealImage realImage = new RealImage("data.txt");
        proxyImage.setRealImage(realImage);
        assertEquals("Image is being displayed", proxyImage.display());
        assertEquals("Image is loaded from disk", realImage.load_from_disk());
    }
}
