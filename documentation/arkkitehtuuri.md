# Arkkitehtuurikuvaus 

## Pakkausrakenne
Ohjelman rakenteessa on kolme pakettia 
![alt text](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/figures/pakkaus.png)
1. Käyttöliittymä on se jonka käyttäjä näkee ja sen elementit asustava `ui` pakkauksessa. Käyttöliittymä puolestaan kommunisoi ohjelman muiden osien kanssa pelilogiikan avulla pelilogiikka sijaitsee `logic` pakkauksessa. `Domain` pakkaus sisältaa luokkia jotka on kaikki elementit joiden avulla pelilogiikka suoritetaan, palikat, ruukku etc.

