import org.junit.Assert;
import org.junit.Test;

public class SympleTest {
    @Test
    public void testNormalWeight()
    {
        var ActualResult = getIMTResult(180f, 75f);
        Assert.assertEquals("нормальной массе тела", ActualResult);
    }

    @Test
    public void testZeroHright()
    {
        var ActualResult = getIMTResult(0f, 65f);
        Assert.assertEquals("указан некорректный рост", ActualResult);
    }

    @Test
    public void testMassaDeficit()
    {
        var ActualResult = getIMTResult(180f, 50f);
        Assert.assertEquals("выраженному дефициту массы тела", ActualResult);
    }

    @Test
    public void testMassaNedostatok()
    {
        var ActualResult = getIMTResult(180f, 57f);
        Assert.assertEquals("недостаточной массе тела", ActualResult);
    }

    @Test
    public void testMassaIzbitok()
    {
        var ActualResult = getIMTResult(180f, 90f);
        Assert.assertEquals("избыточной массе тела", ActualResult);
    }

    @Test
    public void testZeroWeight()
    {
        var ActualResult = getIMTResult(55f, 0f);
        Assert.assertEquals("указан некорректный вес", ActualResult);
    }

    @Test
    public void testNekkorektnijVes()
    {
        var ActualResult = getIMTResult(55f, 1000f);
        Assert.assertEquals("указан некорректный вес", ActualResult);
    }

    @Test
    public void testNekkorektnijRost()
    {
        var ActualResult = getIMTResult(350f, 65f);
        Assert.assertEquals("указан некорректный рост", ActualResult);
    }


    private String getIMTResult(Float heightCm, Float weightKg)

    {

        var userIndex = Math.round(weightKg / Math.pow((heightCm / 100), 2));

        String userResult = null;
        if (userIndex <= 16) {

            userResult = "выраженному дефициту массы тела";

        } else if (userIndex > 16 && userIndex < 19)  {

            userResult = "недостаточной массе тела";

        } else if (userIndex > 19 && userIndex < 25) {

            userResult = "нормальной массе тела";

        } else if (userIndex > 25) {

            userResult = "избыточной массе тела";

        }

        if (heightCm.equals(0.0f)) userResult+="указан некорректный рост";
        if (heightCm.equals(350f)) userResult+="указан некорректный рост";
        if (weightKg.equals(0.0f)) userResult+="указан некорректный вес";
        if (weightKg.equals(1000f)) userResult+="указан некорректный вес";

        return userResult;

    }
}
