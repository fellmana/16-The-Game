# OT-Harjoitustyö 2019

## 16 The Game

16 The Game on peli sovellus joka on tietokone implementaatio klassisesta 1800-luvun pasianssipelistä. 

## Sovelluksen status

 
1. Ohjelmassa on nyt toimiva peli joka toteuttaa pelisääntöjen mukaisen pelaamisen.
1. Ohjelmassa pystyy pelaamaan pelin alusta loppuun asti ja näyttävästi toimiin odotetusti.
1. Save game ja load Game toiminnallisuus työnalla
1. Rules näkymä työnalla
1. Koodin siistiminen kesken
1. luokkien testausta on laajennettu mutta laajennusta tarvitaan


## Dokumentaatio
1. [Määrittelydokumentti](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/maarittelydokumentti.md)
1. [työaikakirjanpito](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/tyoaikakirjanpito.md)
1. [Pelisäännöt](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/rules.md)
1. [arkkitehtuurikuvaus](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/arkkitehtuuri.md)

## Komentorivitoiminnot

### ohjelman ajaminen
Komentorivissä ohjelman ajaminen on suoritettu esimerkiksi komennolla 
  `mvn compile exec:java -Dexec.mainClass=thegame.thegame.Game` 
### Testaaminen 
Ohjelman Testaamista varten voidaan sen juurihakemistossa suorittaa seuraava komento  `mvn test `

  Lisäksi voidaan testikattavuus raportti luoda seuraavalla komennolla  
`mvn test jacoco:report `
### Checkstyle 
Tiedostoon [Pelisäännöt](https://github.com/fellmana/ot-harjoitustyo/tree/master/16TheGame/checkstyles.xml) määrittelemät tarkistukset suoritetaan komennolla
`mvn jxr:jxr checkstyle:checkstyle`
Ja virheilmoitukset tallentuva *target/site/checkstyle.html* tiedostoon  
           
