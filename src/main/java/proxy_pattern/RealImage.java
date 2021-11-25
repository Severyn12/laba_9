package proxy_pattern;

public class RealImage implements Image{
    String file_name;

    public RealImage(String fileName){
        file_name = fileName;
    }
    public String display(){
        return "Image is being displayed";
    }
    public String load_from_disk(){
        return "Image is loaded from disk";
    }
}
