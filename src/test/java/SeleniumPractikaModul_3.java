import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.Assert;





public class SeleniumPractikaModul_3 {

//    Задание 1

    private WebDriver driver;

    @Before
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void TestMagazinObuvi()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        var VashRazmer = driver.findElement(By.id("size"));
        var ButtonElementProverit = driver.findElement(By.id("check-size-button"));
        var razmer = "60";
        VashRazmer.sendKeys(razmer);
        ButtonElementProverit.click();
        var ResultElement = driver.findElement(By.id("size-error"));
        Assert.assertEquals("неверный текст при вводе размера обуви", "В нашем магазине есть обувь вашего размера",
                ResultElement.getText());
    }

    @Test
    public void ShoeStore()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        var checkElementId = driver.findElement(By.id("size"));
        driver.findElement(By.id("size")).sendKeys("35");
        var buttonElementId = driver.findElement(By.id("check-size-button"));
        driver.findElement(By.id("check-size-button")).click();
        var ActualResult = driver.findElement(By.id("size-success")).getText();
        var ExpectedResult = "В нашем магазине есть обувь вашего размера";
        Assert.assertEquals("Неправильный текст", ActualResult, ExpectedResult);
    }
// _____________________________________________________________________________________________________________________

// Задание 2


    @Test
    public void KnijnMagazinPoiskElement()
    {
        driver.navigate().to("http://qajava.skillbox.ru/");
        var ObratnSvyz = driver.findElements(By.tagName("a")).get(18).getText();
        var Predskazy  = driver.findElements(By.tagName("a")).get(19).getText();
        var ButtonElementV_Korzinu = driver.findElements(By.className("book-add")).get(0).getText();
        var KolichestwoTovarovVkorzin = driver.findElement(By.id("cart_count"));
        var PunktMenuKnigi = driver.findElement(By.id("genres")).getText();
        var PolePoiska = driver.findElement(By.id("search-input"));
//        Assert.assertEquals("Книги", PunktMenuKnigi);
    }
//______________________________________________________________________________________________________________________


//    Задание 3
    @Test
    public void KnijnMagazinTest()
    {
        driver.navigate().to("http://qajava.skillbox.ru/");
        var ElementBookInfo = driver.findElements(By.className("book-info")).size();
        Assert.assertEquals(15, ElementBookInfo);
    }
//_____________________________________________________________________________________________________________________
}
