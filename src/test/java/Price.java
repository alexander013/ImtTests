import org.junit.Assert;
import org.junit.Test;


public class Price {
    @Test
    public void TestPrice_1()
    {
        var Actualresult = getRefundTicketPricePercent(0,true, true);
        Assert.assertEquals((Integer) 100, Actualresult);
    }

    @Test
    public void TestPrice_2()
    {
        var Actualresult = getRefundTicketPricePercent(10,false, false);
        Assert.assertEquals((Integer) 100, Actualresult);
    }

    @Test
    public void TestPrice_3()
    {
        var Actualresult = getRefundTicketPricePercent(300,false, false);
        Assert.assertEquals((Integer) 100, Actualresult);
    }

    @Test
    public void TestPrice_4()
    {
        var Actualresult = getRefundTicketPricePercent(6,false, false);
        Assert.assertEquals((Integer) 50, Actualresult);
    }

    @Test
    public void TestPrice_5()
    {
        var Actualresult = getRefundTicketPricePercent(10,false, false);
        Assert.assertEquals((Integer) 50, Actualresult);
    }

    @Test
    public void TestPrice_6()
    {
        var Actualresult = getRefundTicketPricePercent(8,false, false);
        Assert.assertEquals((Integer) 50, Actualresult);
    }

    @Test
    public void TestPrice_7()
    {
        var Actualresult = getRefundTicketPricePercent(3,false, false);
        Assert.assertEquals((Integer) 30, Actualresult);
    }

    @Test
    public void TestPrice_8()
    {
        var Actualresult = getRefundTicketPricePercent(5,false, false);
        Assert.assertEquals((Integer) 30, Actualresult);
    }

    @Test
    public void TestPrice_9()
    {
        var Actualresult = getRefundTicketPricePercent(3,false, false);
        Assert.assertEquals((Integer) 0, Actualresult);
    }

    @Test
    public void TestPrice_10()
    {
        var Actualresult = getRefundTicketPricePercent(1,false, false);
        Assert.assertEquals((Integer) 0, Actualresult);
    }
    private Integer getRefundTicketPricePercent(Integer hoursBeforeConcert, Boolean wasConcertCancelled, Boolean wasConcertRescheduled)

    {

        if(wasConcertCancelled && wasConcertRescheduled) return 100;
        if(hoursBeforeConcert>240) return 100;
        if(hoursBeforeConcert>=144 && hoursBeforeConcert<=240) return 50;
        if(hoursBeforeConcert>3 && hoursBeforeConcert<=144) return 30;
        return 0;

    }
}
