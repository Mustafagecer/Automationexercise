package utilities;

import org.openqa.selenium.WebDriver;

public abstract class TestBase {

    // abstract yaparak bu class'dan obje olusturulmasinin onune geceriz


    protected static WebDriver driver;

    // biz test base class'i sadece extends ile inherit ederek kullanacagiz
    // dolayisiyla olusturdugumuz driver variable'i icin protected access modifier'i seciyoruz

    /*
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        driver.close();
    }

     */

}
