package com.mycompany.unicafe;

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
public class KassapaateTest {

    Kassapaate kassa;
    Maksukortti kortti;

    public KassapaateTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        kassa = new Kassapaate();
        kortti = new Maksukortti(400);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void kassassaOikeaMaaraRahaaAlussa() {
        assertEquals(100000, kassa.kassassaRahaa());
    }

    @Test
    public void kassassaOikeaEdullistenLounaidenMaaraAlussa() {
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }

    @Test
    public void kassassaOikeaMaukkaidenLounaidenMaaraAlussa() {
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }

    @Test
    public void edullisestiOstoToimii() {
        assertEquals(20, kassa.syoEdullisesti(260));
        assertEquals(100240, kassa.kassassaRahaa());

    }

    @Test
    public void edullisestiOstoMuuttaaOstojenMaaraa() {
        kassa.syoEdullisesti(240);
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }

    @Test
    public void maukkaastiOstoToimii() {
        assertEquals(20, kassa.syoMaukkaasti(420));
        assertEquals(100400, kassa.kassassaRahaa());

    }

    @Test
    public void maukkaastiOstoMuuttaaOstojenMaaraa() {
        kassa.syoMaukkaasti(400);
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }

    @Test
    public void mausksuEiRiittavaEdullinen() {
        assertEquals(230, kassa.syoEdullisesti(230));
        assertEquals(100000, kassa.kassassaRahaa());
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }

    @Test
    public void mausksuEiRiittavaMaukkaasti() {
        assertEquals(390, kassa.syoMaukkaasti(390));
        assertEquals(100000, kassa.kassassaRahaa());
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }

    @Test
    public void KorttiOstoEdullinenTarpeeksiRahaa() {
        assertTrue(kassa.syoEdullisesti(kortti));
        assertEquals(160, kortti.saldo());
    }

    @Test
    public void KorttiOstoEdullinenMuttaaMaraa() {
        assertTrue(kassa.syoEdullisesti(kortti));
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }

    @Test
    public void KorttiOstoMaukkaastiTarpeeksiRahaa() {
        assertTrue(kassa.syoMaukkaasti(kortti));
        assertEquals(0, kortti.saldo());
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }

    @Test
    public void KorttiOstoMaukkaastiMuttaaMaraa() {
        assertTrue(kassa.syoMaukkaasti(kortti));
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }

    @Test
    public void KorttiEiTarpeeksiEdullinen(){
        kortti.otaRahaa(200);
        assertFalse(kassa.syoEdullisesti(kortti));
        assertEquals(200, kortti.saldo());  
        assertEquals(0, kassa.edullisiaLounaitaMyyty());        
    }
    
    @Test
    public void KorttiEiTarpeeksiMaukkaasti(){
        kortti.otaRahaa(200);
        assertFalse(kassa.syoMaukkaasti(kortti));
        assertEquals(200, kortti.saldo());  
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }    
    
    @Test
    public void kassaRahaEiMuutuKortillaOstaessaEdullisestiOnRahaa(){
        assertTrue(kassa.syoEdullisesti(kortti));
        assertEquals(100000, kassa.kassassaRahaa());      
    }

    @Test
    public void kassaRahaEiMuutuKortillaOstaessaEdullisestiEiRahaa(){
        kortti.otaRahaa(250);
        assertFalse(kassa.syoEdullisesti(kortti));
        assertEquals(100000, kassa.kassassaRahaa());      
    } 
    
    @Test
    public void kassaRahaEiMuutuKortillaOstaessaMaukkaastiOnRahaa(){
        assertTrue(kassa.syoMaukkaasti(kortti));
        assertEquals(100000, kassa.kassassaRahaa());      
    }

    @Test
    public void kassaRahaEiMuutuKortillaOstaessaMaukkaastiEiRahaa(){
        kortti.otaRahaa(250);
        assertFalse(kassa.syoMaukkaasti(kortti));
        assertEquals(100000, kassa.kassassaRahaa());      
    }     
    
    @Test
    public void kortinLataus(){
        kassa.lataaRahaaKortille(kortti, 100);
        assertEquals(500, kortti.saldo());
        assertEquals(100100, kassa.kassassaRahaa());
    }
    @Test
    public void kortinLatausNegatiivien(){
        kassa.lataaRahaaKortille(kortti, -1);
        assertEquals(400, kortti.saldo());
        assertEquals(100000, kassa.kassassaRahaa());
    } 
}
