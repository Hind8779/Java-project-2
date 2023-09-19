package JavaProject2;

public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver []arr={new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver a : arr) {
          a.open();
          a.navigate();
          System.out.println(a.getTitle());
          a.getScreenshot();
          a.close();


        }


        }

       }
