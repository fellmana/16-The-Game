# OT-Harjoitustyö 2019

## 16 The Game

16 The Game on peli sovellus joka on tietokone implementaatio klassisesta 1800-luvun pasianssipelistä. 

## Sovelluksen status

Tällä hetkella ohjelmalle on toteutettu yksinkertainen käyttöliittymä seka ruukun ominaisuuksia on alustettu. 
1. Ohjelmassa on määrittely dokumentin 3 näkymään, vaikkakin toiminallisuudet puuttuvat
1. Ohjelma alustaa ruukun ja Pelinäkymässä on mahdollista nostaa ruukusta palikoita
1. Ruukusta nostaminen antaa satunnaisen elementin ja poistaa sen ruukusta. 


## Dokumentaatio
1. [Määrittelydokumentti](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/maarittelydokumentti.md)
1. [työaikakirjanpito](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/tyoaikakirjanpito.md)
1. [Pelisäännöt](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/rules.md)


## Komentorivitoiminnot

### ohjelman ajaminen
Komentorivissä ohjelman ajaminen on suoritettu esimerkiksi komennolla 
  `mvn compile exec:java -Dexec.mainClass=thegame.thegame.Game` 
### Testaaminen 
Ohjelman Testaamista varten voidaan sen juurihakemistossa suorittaa seuraava komento  `mvn test `

  Lisäksi voidaan testikattavuus raportti luoda seuraavalla komennolla  
`mvn test jacoco:report `
### 
