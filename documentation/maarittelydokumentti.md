# Määrittelydokumentti  16TheGame

## Sovelluksen esittely
16TheGame peli sovellus perustuu vanhaan pasianssityyliseen peliin. Pelissä on palikoita jotka ovat numeroitu 1-16 ja jokaista numeroa on 6 kappaletta. Palikoita nostetaan ruukusta yksi kerrallaan ja sijoitetaan pelialustalle, jossa niitä voidaan manipuloida pasianssityylisten pelisääntöjen tapaisesti. 
Tarkemmat pelisäännot ovat tulossa ja löytyvät seuraavan linkin takaa, [Pelisäännöt](https://www.google.com).


## Käyttäjat
Sovelluksessa ei ole erityisiä käyttäjiä sen luonteen takia joten kaikki ovat sovelluksen normaalikäyttäjiä

## Käyttöliittymä 
Sovelluksessa on kolme eri näkymää. 
1. Valikko
2. Säännöt
3. Pelinäkymä


lisää kuva eri näkymistä


## Sovelluksen tarjoamat toiminnallisuudet
Sovellus toteutus kieli on englanti mutta sännöt kirjoitetaan myös suomeksi

### Valikko
* Valikossa on 4 eri toimintoa
	- New Game
		- 'New Game' lataa pelinäkymän ja alustaa uden pelin
	- Load Game 
		- 'Load Game' lataa pelinäkymän tiedostosta johon pelitilanne on tallennettu
	- Rules
		- 'Rules' avaa sääntö näkymän jossa pelin säännöt voidaan lukea 
	- Exit
		- 'Exit' Sulkee sovelluksen

### Pelinäkymä
* Pelinäkymässä on selkeästi eroteltu pelin eri toiminoille oleelliset komponentit
	- Ruukku
		- Ruukku sijoitetaan pelinäkymän oikeaan tai vasempaan reunaan ja ruukkua klikkamalla seuraava pelipalikka tulee näkyviin
	- Kaistat
		- pelissä on neljä 'kaistaa' 
