# Määrittelydokumentti  16TheGame

## Sovelluksen esittely
16TheGame peli sovellus perustuu vanhaan pasianssityyliseen peliin. Pelissä on palikoita jotka ovat numeroitu 1-16 ja jokaista numeroa on 6 kappaletta. Palikoita nostetaan ruukusta yksi kerrallaan ja sijoitetaan pelialustalle, jossa niitä voidaan manipuloida pasianssityylisten pelisääntöjen tapaisesti. 
Tarkemmat pelisäännot ovat tulossa ja löytyvät seuraavan linkin takaa, [Pelisäännöt](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/rules.md).


## Käyttäjät
Sovelluksessa ei ole erityisiä käyttäjiä sen luonteen takia, joten kaikki ovat sovelluksen normaalikäyttäjiä.

## Käyttöliittymä 
Sovelluksessa on kolme eri näkymää. 
1. Valikko
2. Säännöt
3. Pelinäkymä


![alt text](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/figures/maaritelma-fig1.png)


## Sovelluksen tarjoamat toiminnallisuudet
Sovellus toteutus kieli on englanti mutta sännöt kirjoitetaan myös suomeksi

### Valikko
* Valikossa on 4 eri toimintoa
	- New Game
		- 'New Game' lataa pelinäkymän ja alustaa uden pelin
	- Load Game 
		- 'Load Game' lataa pelinäkymän tiedostosta, johon pelitilanne on tallennettu
	- Rules
		- 'Rules' avaa sääntö näkymän jossa pelin säännöt voidaan lukea 
	- Exit
		- 'Exit' Sulkee sovelluksen

### Pelinäkymä
* Pelinäkymässä on selkeästi eroteltu pelin eri toiminoille oleelliset komponentit
	- Ruukku
		- Ruukku sijoitetaan pelinäkymän oikeaan tai vasempaan reunaan ja ruukkua klikkamalla seuraava pelipalikka tulee näkyviin
	- Kaistat
		- pelissä on neljä 'kaistaa', joihin palikoita voidaan sijoittaa. Jos palikat ovat järjestykssä voidaan niitä siirrellä kaistasta toiseen
			- Siirtely tapahtuu joka klikkausten avulla tai 'drag and drop' tyylisesti
			- kaistat sijoittuvat pelinäkymän keskelle 
	- valmiit pinot 
		- pelinäkymän yläreunassa on 6 palikoille tarkoitettua loppusijoitus paikkaa johon ne lopulta sijoitetaan, jos onnistut samaan kaikkipalikat järjestyksessä pinoihin voitat pelin
	- valikko
		- valikko sijoitetaan pelinäkymän yläosaan ja siinä on seuraavat toiminnot 
			- 'Save Game' tallentaan pelitilanteen tiedostoon
			- 'Rules'  avaa sääntönäkymän
			- 'Main Menu' sirrytään valikkonäkymään

### Sääntönäkymä
* Toteutus joko uusi ikkuna tai sitten vain uusi näkymä
	- Tekstilaatikko jossa ohjeet on selkeästi luettavissa
	- Kieli valikko tai valinta mahdollisuus

## Jatkokehitysideoita
* Ns. huijausmekanismi, jolloin jos ett onnistu saamaan peliä loppuun voit suorittaa huijaussiirtoja.
* Mahdollinen 'replay' järjestelmän jonka avulla voidaan pelata sama järjestys uudelleen.
* Mahdolliset variaation esim. useampi 'kaista'.  
* Kehittää jonku näköinen highscore järjestelmä vaikkakin pelissä ei ole minkään näköistä pisteytystä, ehkä perustuu aikaan 
