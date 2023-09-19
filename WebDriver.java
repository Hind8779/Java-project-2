package JavaProject2;
//Provide Implementation for the diagram below. Then create a test class
//in which you need to create Objects of ChromeDriver, FirefoxDrive and
//SafariDriver classes and see which methods available to them.

import java.sql.SQLOutput;

public interface WebDriver {
    void open();
    void close();
    String getTitle();

}
interface TakeScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakeScreenshot {
    void navigate();

    @Override
    void getScreenshot();

    @Override
    void open();

    @Override
    void close();

    @Override
    String getTitle();
}
class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("SafariDriver is navigate");
    }

    @Override
    public void getScreenshot() {
        System.out.println("I took screenShot from Safari");
    }

    @Override
    public void open() {
        System.out.println("safariDriver is open");

    }

    @Override
    public void close() {
        System.out.println("safariDriver is close");

    }

    @Override
    public String getTitle() {
        String title ="www.safari.com";

        return title;
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("fireFox Driver is navigate");
    }

    @Override
    public void getScreenshot() {
        System.out.println("I took screenshot from Firefox");
    }

    @Override
    public void open() {
        System.out.println("fireFox Driver is open");

    }

    @Override
    public void close() {
        System.out.println("fireFox Driver is close");

    }

    @Override
    public String getTitle() {
        String title ="www.fireFox.com";
        return title;
    }
}

class ChromeDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("chromeDriver is navigate");

    }

    @Override
    public void getScreenshot() {
        System.out.println("I took screenshot from ChromeDriver");
    }

    @Override
    public void open() {
        System.out.println("ChromeDriver is open");

    }

    @Override
    public void close() {
        System.out.println("Chrome Driver is close");

    }

    @Override
    public String getTitle() {
        String title ="www.chrome.com";
        return title;
    }
}


