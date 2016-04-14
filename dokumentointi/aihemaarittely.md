**Aihe**: Hypoteesitestin tarkoituksena on testata nollahypteeseja kerätyn aineiston perusteella. Kyseinen periaate liittyy testiteoriaan: hypoteesin kokhteena on jokin väittämä parametrin arvosta. Esimerkiksi lantin harhattomuutta tutkiessa parametrina on lantin todennäköisyys tuottaa kruunia tai klaavoja. Jos lantti on harhaton, on tämä todennäköisyys 1/2; testillä tutkitaan, onko aineistonkeruun eli n heiton jälkeen syytä epäillä, että lantin todennäköisyys saada kruuna tai klaava, eli parametri, on jotain muuta kuin 1/2.

**Käyttäjät**: Tilastotieteilijä

**Rakenne**

1. Ohjelma pyytää aineistonkeruussa saatuja arvoja
  - Vaihtoehtoisesti voidaan asettaa ohjelma generoimaan arvot satunnaisesti
2. Ohjelma kysyy käyttäjän nollahypoteesia ja mahdollista vastahypoteesia sekä antaa valikon, josta käyttäjä valitsee tutkimansa ilmiön jakauman. Valikossa on muutama yleisin jakauma.
3. Ohjelma laskee testaukseen liittyvät arvot, kuten p-arvon
4. Ohjelma kertoo käyttäjälle, millä merkitsevyystasoilla nollahypoteesi hylätään jos hylätään, eli kertoo, onko käyttäjän syytä epäillä esimerkiksi lantin harhattomuutta aineistonsa perusteella.

![Luokkakaavio](https://raw.githubusercontent.com/lecromine/hypoteesitesti/master/dokumentointi/luokkakaavio.jpg "luokkakaavio")