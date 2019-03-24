package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti != null);
    }

    @Test
    public void saldoOikeinAlussa() {
        assertEquals(10, kortti.saldo());
    }

    @Test
    public void saldonKasvattaminenOnnistuu() {
        kortti.lataaRahaa(10);
        //HUOM toi on senteissa
        assertEquals("saldo: 0.20", kortti.toString());
    }

    @Test
    public void saldoVaheneeKunOtetaanRahaa() {
        kortti.otaRahaa(10);
        assertEquals("saldo: 0.0", kortti.toString());
    }
    
    
    @Test
    public void saldoEiVaheneKunOtetaanRahaaLikaa() {
        kortti.otaRahaa(20);
        assertEquals("saldo: 0.10", kortti.toString());
    }
    
    
    @Test
    public void metodiPalauttaaTrueKunRahatRiittavat(){
        assertTrue(kortti.otaRahaa(7));
    }
    
        @Test
    public void metodiPalauttaaFalseKunRahatEiRiita(){
        assertFalse(kortti.otaRahaa(20));
    }
    
    
}
