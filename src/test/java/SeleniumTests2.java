import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumTests2 {

    private WebDriver driver;

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






// Задание 1:
//    В первом уроке мы разбирали пять браузерных тестов на сайте-приветствии с тремя полями ввода
//    и кнопкой. Вынесите в этих тестах в setUp- и tearDown-методы подготовительную работу
//    по настройке драйвера, открытию и закрытию браузера
    @Test
    public void Homework1() {
//            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, .\n" +
                    "На вашу почту () отправлено письмо.\n" +
                    "Наш сотрудник свяжется с вами по телефону: .";
        Assert.assertEquals("Неправильный текст приветствия !", actualResult, expectedResult);
    }

    @Test
    public void Homework2() {
    //            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Городнов Александр Васильевич");
        driver.findElement(By.name("email")).sendKeys("test@mail.ru");
        driver.findElement(By.name("phone")).sendKeys("89993456789");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Городнов Александр Васильевич.\n" +
                    "На вашу почту (test@mail.ru) отправлено письмо.\n" +
                    "Наш сотрудник свяжется с вами по телефону: 89993456789.";
        Assert.assertEquals("Неправильный текст приветствия !", actualResult, expectedResult);
    }

    @Test
    public void Homework3() {
    //            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Заполните поля для ввода данных !";
        Assert.assertEquals("Неправильный текст приветствия !", actualResult, expectedResult);
    }

    @Test
    public void Homework4() {
    //            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Городнов Александр Васильевич");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Заполните поля E-mail, Телефон ";
        Assert.assertEquals("Неправильный текст приветствия !", actualResult, expectedResult);
    }

    @Test
    public void Homework5() {
    //            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
    //        driver.findElement(By.name("name")).sendKeys("Городнов Александр Васильевич");
        driver.findElement(By.name("email")).sendKeys("test@mail.ru");
    //        driver.findElement(By.name("phone")).sendKeys("89993456789");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Заполните поля ФИО, Телефон ";
        Assert.assertEquals("Неправильный текст приветствия !", actualResult, expectedResult);
    }

    @Test
    public void Homework6() {
    //            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("phone")).sendKeys("89993456789");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Заполните поля ФИО, E-mail ";
        Assert.assertEquals("Неправильный теКст приветствия !", actualResult, expectedResult);
    }






// Задание 2:
// Добавьте два новых браузерных теста для сайта-регистрации в онлайн-кинотеатре,
// осуществляя поиск элементов по их атрибуту name, а в случае его отсутствия — по классу:
    @Test
    public void Homework7()
    {
            // переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module06/register/");
        driver.findElement(By.name("name")).sendKeys("Городнов Александр Васильевич");
        driver.findElement(By.name("email")).sendKeys("skillbox@test.ru");
        driver.findElement(By.name("password")).sendKeys("qwerty!123");
        driver.findElement(By.className("form-submit")).click();
        var actualResult = driver.findElement(By.className("form-result")).getText();
        var expectedResult = "Вам на почту skillbox@test.ru отправлено письмо";
        Assert.assertEquals("Неправильный текст приветствия !", actualResult, expectedResult);
    }

//    form-error
    @Test
    public void Homework8()
    {
            // переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module06/register/");
        driver.findElement(By.className("form-submit")).click();
        var actualResult = driver.findElement(By.className("form-error")).getText();
        var expectedResult = "Введите имя";
        Assert.assertEquals("Неправильный текст приветствия !", actualResult, expectedResult);
    }


}
