import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class PractikaModul_3_Zadanie_4 {


    public WebDriver driver;

    @Before
    public void setUp()
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
    public void SajtKinoteatr()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var VashiLubimFilm = driver.findElement(By.id("films"));
        var VashuLubimSerial = driver.findElement(By.id("serials"));
        var ButtonSohranit = driver.findElement(By.id("save"));
        var Button_2 = driver.findElement(By.id("two"));
        var name_film =  "Леон";
        var name_serial =  "Бригада";
        VashiLubimFilm.sendKeys(name_film);
        VashuLubimSerial.sendKeys(name_serial);
        ButtonSohranit.click();
        Button_2.click();
        var ButtonVVod = driver.findElement(By.id("save"));
        var ButtonOk = driver.findElement(By.id("ok"));
        ButtonVVod.click();
        ButtonOk.click();
        var ResultElementFilm = driver.findElement(By.id("best_films"));
        var ResultElementSerial = driver.findElement(By.id("best_serials"));
        Assert.assertEquals("Некорректный текст", name_film, ResultElementFilm.getText());
        Assert.assertEquals("Некорректный текст", name_serial, ResultElementSerial.getText());
    }

    @Test
    public void SajtKinoteatr_2()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var VashiLubimFilm = driver.findElement(By.id("films"));
        var VashuLubimSerial = driver.findElement(By.id("serials"));
        var ButtonSohranit = driver.findElement(By.id("save"));
        var Button_2 = driver.findElement(By.id("two"));
        var name_film =  "Леон";
        var name_serial =  "Бригада";
        VashiLubimFilm.sendKeys(name_film);
        VashuLubimSerial.sendKeys(name_serial);
        ButtonSohranit.click();
        Button_2.click();
        var Text_1 = driver.findElements(By.className("module__input")).get(0).getText();
        var CheckBox_1 = driver.findElements(By.className("fake-checkbox")).get(0);
        var CheckBox_2 = driver.findElements(By.className("fake-checkbox")).get(1);
        var CheckBox_3 = driver.findElements(By.className("fake-checkbox")).get(2);
        var CheckBox_4 = driver.findElements(By.className("fake-checkbox")).get(3);
        var RadioButton_3 = driver.findElements(By.className("fake-radiobutton")).get(2);
        CheckBox_1.click();
        CheckBox_2.click();
        CheckBox_3.click();
        CheckBox_4.click();
        RadioButton_3.click();
        var ButtonVVod = driver.findElement(By.id("save"));
        var ButtonOk = driver.findElement(By.id("ok"));
        ButtonVVod.click();
        ButtonOk.click();
        var ResultElementFilm = driver.findElement(By.id("best_films"));
        var ResultElementSerial = driver.findElement(By.id("best_serials"));
        var ResultPredpochtenie = driver.findElement(By.id("language"));
        var ResulAge = driver.findElement(By.id("age"));

        Assert.assertEquals("Некорректный текст", name_film, ResultElementFilm.getText());
        Assert.assertEquals("Некорректный текст", name_serial, ResultElementSerial.getText());
        Assert.assertEquals("С русскими субтитрами, С английскими субтитрами, В оригинале, В дубляже", ResultPredpochtenie.getText());
        Assert.assertEquals("26-30", ResulAge.getText());
    }

    @Test
    public void SajtKinoteatr_3()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var ButtonSohranit = driver.findElement(By.id("save"));
        var Button_2 = driver.findElement(By.id("two"));
        ButtonSohranit.click();
        Button_2.click();
        var ButtonVVod = driver.findElement(By.id("save"));
        var ButtonOk = driver.findElement(By.id("ok"));
        ButtonVVod.click();
        ButtonOk.click();
        var Result = driver.findElements(By.className("header__content")).get(1);
        Assert.assertEquals("Ваши ответы:", Result.getText());
    }


}
