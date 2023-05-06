package Testes;

import org.junit.Assert;
import org.junit.Test;

public class TestArchive {

    int vpl = 2000;
    int va = 1000;
    int cr = 700;

    @Test
    public void encontrarVc(){

        int vc = 0;
        vc = va - cr;

        Assert.assertEquals(vc, vc);
    }

    @Test
    public void encontrarVp(){

        int vp = 0;
        vp = va - vpl;

        Assert.assertEquals(vp, vp);


    }

    @Test
    public void calcularIdp(){

        double idp = 0;

        idp = (float)va / (float)vpl;

        Assert.assertEquals(idp>=1.0, idp>0.9);

    }

    @Test
    public void calcularIdc(){

        double idc = 0;

        idc = (float)va / (float)cr;

        Assert.assertEquals(idc>=1.0, idc>0.9);

    }
}
