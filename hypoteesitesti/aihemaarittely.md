**Aihe**: Hypoteesitestin tarkoituksena on testata nollahypteeseja kerätyn aineiston perusteella. Kyseinen periaate liittyy testiteoriaan: hypoteesin kokhteena on jokin väittämä parametrin arvosta. Esimerkiksi lantin harhattomuutta tutkiessa parametrina on lantin todennäköisyys tuottaa kruunia tai klaavoja. Jos lantti on harhaton, on tämä todennäköisyys 1/2; testillä tutkitaan, onko aineistonkeruun eli n heiton jälkeen syytä epäillä, että lantin todennäköisyys saada kruuna tai klaava, eli parametri, on jotain muuta kuin 1/2.

Aluksi ohjelmaan tehdään t-testi. Myöhemmin myös ohjelmaa laajennetaan tekemään normaalitestejä, jolloin käyttäjä voi itse valita, mitä testiä tahtoo käyttää. Ohjelmaan toteutetaan myös satunnaisgeneraattori, joka tekee testejä satunnaisilla arvoilla.

**Käyttäjät**: Tilastotieteilijä

**Rakenne**:

1. Ohjelma kysyy aineistonkeruuseen liittyviä arvoja ja pyytää käyttäjää määrittämään nollahypoteesinsa
2. Kohdan 1. voi myös ohittaa asettamalla ohjelma generoimaan arvot satunnaisesti.
3. Ohjelma antaa muutaman vaihtoehdon yleisimmistä jakaumista (esim. pudotusvalikko), joista käyttäjä valitsee tutkimansa ilmiön jakauman
4. Ohjelma laskee mm. testiin liittyvät p-arvot
5. Ohjelma lopuksi kertoo, millä merkitsevyystasoilla nollahypoteesi hylätään (0.01, 0.05 ja 0.1) ja onko esim. lantin harhattomuuden tapauksessa syytä epäillä, että lantti olisi harhainen.
