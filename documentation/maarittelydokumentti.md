# Määrittelydokumentti  16TheGame

## Sovelluksen esittely
16TheGame pelisovellus perustuu vanhaan pasianssityyliseen peliin. Pelissä on palikoita jotka ovat numeroitu 1-16 ja jokaista numeroa on 6 kappaletta. Palikoita nostetaan ruukusta yksi kerrallaan ja sijoitetaan pelialustalle, jossa niitä voidaan manipuloida pasianssityylisten pelisääntöjen tapaisesti. 
Tarkemmat pelisäännot löytyvät seuraavan linkin takaa, [Pelisäännöt](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/rules.md). Pelistä ei ikävä kyllä löydy oikeastaan mitään ulkoisia viitteitä tai sääntöja joihin voisin viitata ja se on osittain joutunut unohduksiin. Ainoa viittaus peliin minkä löysin oli kuva [Zacharias Topeliuksesta pelaamassa peliä 1800 luvulta.](https://www.finna.fi/Record/sls.SLSA+801_SLSA+801_29).

## Käyttäjät
Sovelluksessa ei ole erityisiä käyttäjiä sen luonteen takia, joten kaikki ovat sovelluksen normaalikäyttäjiä.

## Käyttöliittymä 
Sovelluksessa on kolme eri näkymää. 
1. Valikko
2. Säännöt
3. Pelinäkymä


![alt text](https://github.com/fellmana/ot-harjoitustyo/blob/master/documentation/figures/maaritelma-fig1.png)


## Sovelluksen tarjoamat toiminnallisuudet
Sovellus toteutuskieli on englanti.

### Valikko
* Valikossa on 4 eri toimintoa
	- New Game
		- 'New Game' lataa pelinäkymän ja alustaa uuden pelin
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
* Toteutus; uusi näkymä
	- Tekstilaatikko jossa ohjeet on selkeästi luettavissa

## Pelin Tekninentoiminta ja toteutus
* Ruukku (käytännössä lista) jossa palikat ovat (elementtejä listassa)
* Ruukkua klikkaamalla satunnainen elementti listasta valitaan ja annetaan pelaajan käyttöön ja poistetaan ruukusta
* Pelaaja sijoittaa elementin pelikaistoille (Nämä ovat myös listoja) 
* Siirto kaistalta kaistalle:
	- Siirrettävät elementit on oltava järjestyksessä (eng. Sorted) jotta siirto on sallittu
	- Jotta siirrettävät elementit voidaan sijoittaan on tarkistettava onko kaista tyhjä tai onko sen viimeinen elementti sääntöjen mukainen 
* Pinot: 
	- pinot ovat listoja joiden elementit on pakko lisätä (append) oikeassa järjestyksessä 
	- sallii vain yhden kappaleen tiettyä palikkaa
	- Kun kaikki pinot täynnä tarkistaa onko voitto ehto täyttynyt.

## Jatkokehitysideoita
* Ns. huijausmekanismi, jolla jos et onnistu saamaan peliä loppuun voit suorittaa huijaussiirtoja.
* Mahdollinen 'replay' järjestelmän jonka avulla voidaan pelata sama järjestys uudelleen.
* Mahdolliset variaatiot esim. useampi 'kaista'.  
 
