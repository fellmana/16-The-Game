# 16 The Game

16 The Game on peli sovellus joka on tietokone implementaatio klassisesta 1800-luvun pasianssipelistä. 

## Releaset
* [V1.0](https://github.com/fellmana/ot-harjoitustyo/releases/tag/V1.0)

## Asennus ja ajaminen

Lataa ohjelman [jar](https://github.com/fellmana/ot-harjoitustyo/releases/tag/V1.0) paketti ja aja ohjelman komennolla `java -jar 16TheGame.jar`

## Dokumentaatio
1. [Määrittelydokumentti](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/maarittelydokumentti.md)
1. [työaikakirjanpito](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/tyoaikakirjanpito.md)
1. [Pelisäännöt](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/rules.md)
1. [Käyttöohje](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/instructions.md) 
1. [arkkitehtuurikuvaus](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/arkkitehtuuri.md)
1. [testausdokumentti](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/testaus.md)
## Komentorivitoiminnot

### ohjelman ajaminen
Komentorivissä ohjelman ajaminen on suoritettu esimerkiksi komennolla 
  `mvn compile exec:java -Dexec.mainClass=thegame.thegame.Game` 
### Testaaminen 
Ohjelman Testaamista varten voidaan sen juurihakemistossa suorittaa seuraava komento  `mvn test `

  Lisäksi voidaan testikattavuus raportti luoda seuraavalla komennolla  
`mvn test jacoco:report `
### Checkstyle 
Tiedostoon [checkstyle.xml](https://github.com/fellmana/ot-harjoitustyo/blob/master/16TheGame/checkstyle.xml) määrittelemät tarkistukset suoritetaan komennolla
`mvn jxr:jxr checkstyle:checkstyle`
Ja virheilmoitukset tallentuva *target/site/checkstyle.html* tiedostoon  


### Pakkauksen luominen
Ohjelmansta voidaan muodostaan jar pakkaus kommennolla `mvn package`

### JavaDoc
JavaDocin generoiti onnistuu komennolla `mvn javadoc:javadoc` 

