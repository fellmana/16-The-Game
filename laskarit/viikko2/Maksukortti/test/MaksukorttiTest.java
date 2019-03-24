/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author afellman
 */
public class MaksukorttiTest {

    public MaksukorttiTest() {
    }

    Maksukortti kortti;
    Maksukortti korttiEdullinen;
    Maksukortti korttiMaukkaasti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
        korttiEdullinen = new Maksukortti(2.5);
        korttiMaukkaasti = new Maksukortti(4.0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
    }

    @Test
    public void konstruktoriAsettaaSaldonOikein() {
        assertEquals("Kortilla on rahaa 10.0 euroa", kortti.toString());
    }

    @Test
    public void syoEdullisestiVahentaaSaldoaOikein() {
        kortti.syoEdullisesti();
        assertEquals("Kortilla on rahaa 7.5 euroa", kortti.toString());
    }

    @Test
    public void syoMaukkaastiVahentaaSaldoaOikein() {
        kortti.syoMaukkaasti();
        assertEquals("Kortilla on rahaa 6.0 euroa", kortti.toString());
    }

    @Test
    public void syoEdullisestiEiVieSaldoaNegatiiviseksi() {
        kortti.syoMaukkaasti();
        kortti.syoMaukkaasti();
        kortti.syoEdullisesti();
        assertEquals("Kortilla on rahaa 2.0 euroa", kortti.toString());
    }
    @Test
    public void kortilleVoiLadataRahaa() {
        kortti.lataaRahaa(25);
        assertEquals("Kortilla on rahaa 35.0 euroa", kortti.toString());
    }

    @Test
    public void kortinSaldoEiYlitaMaksimiarvoa() {
        kortti.lataaRahaa(200);
        assertEquals("Kortilla on rahaa 150.0 euroa", kortti.toString());
    }
    
    
    
    
    @Test
    public void syoMaukkaastiEiVieSaldoaNegatiiviseksi() {
        kortti.syoMaukkaasti();
        kortti.syoMaukkaasti();
        //Kortilla taman jalkeen  2e joten seuraavan ei tulisi onnistua
        kortti.syoMaukkaasti();
        assertEquals("Kortilla on rahaa 2.0 euroa", kortti.toString());
    }
    
    @Test
    public void kortilleEiVoiLadataNegatiivistaArvoa(){
        kortti.lataaRahaa(-5);
        assertEquals("Kortilla on rahaa 10.0 euroa", kortti.toString());
    }
    
    
    @Test 
    public void kortillaVoiOstaaEdullinenLounas(){
        korttiEdullinen.syoEdullisesti();
        assertEquals("Kortilla on rahaa 0.0 euroa", korttiEdullinen.toString());
    }
    
    @Test 
    public void kortillaVoiOstaaMaukkaastiLounas(){
        korttiMaukkaasti.syoMaukkaasti();
        assertEquals("Kortilla on rahaa 0.0 euroa", korttiMaukkaasti.toString());        
    }
    
}
