package proxy_pattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage pr_image = new ProxyImage("hello.png");
        System.out.println(pr_image.display());
        System.out.println(pr_image.getFileName());
    }
}
