**Aihe**: Hypoteesitestin tarkoituksena on testata nollahypteeseja kerätyn aineiston perusteella. Kyseinen periaate liittyy testiteoriaan: hypoteesin kokhteena on jokin väittämä parametrin arvosta. Esimerkiksi lantin harhattomuutta tutkiessa parametrina on lantin todennäköisyys tuottaa kruunia tai klaavoja. Jos lantti on harhaton, on tämä todennäköisyys 1/2; testillä tutkitaan, onko aineistonkeruun eli n heiton jälkeen syytä epäillä, että lantin todennäköisyys saada kruuna tai klaava, eli parametri, on jotain muuta kuin 1/2.

**Käyttäjät**: Tilastotieteilijä

**Rakenne nyt**

**Rakenne suunnitteluvaiheessa (kiinnostuneille)**
Aluksi ohjelma antaa käyttäjälle kaksi erilaista testivaihtoehtoa: binomitesti tai normaalijakauman testit. Tämä erottelu tehdään, sillä binomijakauma on diskreetti ja hyvin erilainen normaalijakaumaan verrattuna.

Kun käyttäjä on syöttänyt ohjelmalle arvonsa, GUI kutsuu Testaaja-luokkan metodeja. Jos Käyttäjä on aluksi klikannut Binomitesti-painiketta, suorittaa Testaaja metodin teeBinomiTesti(). Sama juttu normaalijakauman testien kanssa.

Testaaja kutsuu joko Binomi-luokan teeBinomiTesti- tai Normaali-luokan teeNormaaliTesti()-metodia. 

Binomitesti käyttää math3-commons -kirjastoa testien suorittamiseen.

Normaaliluokan testeissä on kolme eri vaihtoehtoa testeille. Kun käyttäjä on alussa valinnut esimerkiksi testaavansa varianssia, kutsuu Normaali-luokka Testisuure-luokan varianssi() -metodia. Odotusarvon testeissä on vielä lisäksi vaihtoehtona päättää, haluaako suorittaa yksi- vai kaksihäntäisen testin.

Lopuksi luokat lähettävät laskemansa p-arvon muuttujana (double) parvo. Arvo kulkeutuu reittiä (Testisuure->)Normaali/Binomi->Testaaja->Main. 

![Luokkakaavio](https://raw.githubusercontent.com/lecromine/hypoteesitesti/master/dokumentointi/luokkakaavio2.jpg "luokkakaavio")

1. Ohjelma pyytää aineistonkeruussa saatuja arvoja
  - Vaihtoehtoisesti voidaan asettaa ohjelma generoimaan arvot satunnaisesti
2. Ohjelma kysyy käyttäjän nollahypoteesia ja mahdollista vastahypoteesia sekä antaa valikon, josta käyttäjä valitsee tutkimansa ilmiön jakauman. Valikossa on muutama yleisin jakauma.
3. Ohjelma laskee testaukseen liittyvät arvot, kuten p-arvon
4. Ohjelma kertoo käyttäjälle, millä merkitsevyystasoilla nollahypoteesi hylätään jos hylätään, eli kertoo, onko käyttäjän syytä epäillä esimerkiksi lantin harhattomuutta aineistonsa perusteella.



