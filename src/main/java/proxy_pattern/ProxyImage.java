package proxy_pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProxyImage implements Image{
    RealImage realImage;
    String fileName;

    public ProxyImage(String file_name){
        realImage = new RealImage(file_name);
        fileName = file_name;

    }
    public String display(){
        return realImage.display();
    }
}
