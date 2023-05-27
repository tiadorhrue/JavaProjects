package GroupProject2;

public interface WebDriver {

    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver {
    void navigate();
}
interface TakesScreenshot extends RemoteWebDriver {
    void getScreenshoot();
}
class ChromeDriver implements RemoteWebDriver {


    @Override
    public void open() {
        System.out.println("Opens in Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Chrome Browser closes");

    }

    @Override
    public String getTitle() {
        return "Chrome Browser";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate in Chrome");

    }

}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opens in Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Firefox Browser closes");

    }

    @Override
    public String getTitle() {
        return "Firefox Browser";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate in Firefox Browser");

    }

}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens in Safari Browser ");
    }

    @Override
    public void close() {
        System.out.println("Safari Browser closes");

    }

    @Override
    public String getTitle() {
        return "Safari Browser";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate in Safari");

    }
}
class WebDriverTester {
    public static void main(String[] args) {

        ChromeDriver chrome=new ChromeDriver();
        System.out.println(chrome.getTitle());
        chrome.open();
        chrome.navigate();
        chrome.close();

        System.out.println();

        FirefoxDriver firefox=new FirefoxDriver();
        System.out.println(firefox.getTitle());
        firefox.open();
        firefox.navigate();
        firefox.close();

        System.out.println();

        SafariDriver safari =new SafariDriver();
        System.out.println(safari.getTitle());
        safari.open();
        safari.navigate();
        safari.close();



    }
}

