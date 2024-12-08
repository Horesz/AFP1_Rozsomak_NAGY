## Tesztelési jegyzőkönyv
Teszteléseket végezte: Deme Bence

Operációs rendszer: Windows 11

## Alfa teszt   
Vizsgálat	                Tesztelés időpontja	                    Elvárás	                                            Eredmény	                                                Hibák
Sakktábla létrehozása	        2024.11.19.	            A sakktábla és a kezdő pozíciók helyes megjelenítése.           Működik 	    -
Bábuk mozgatása	                2024.11.19.         	A bábuk mozgatása a felhasználói interakció alapján.	        Működik	        -
Bábuk megjelenítése	            2024.11.19.	            A bábuk grafikáinak helyes megjelenítése a sakktáblán.	        Működik	        -
Tábla méretezése	            2024.11.19.	            A sakktábla arányainak megtartása különböző eszközökön.	        Működik	        -
Alapvető játéklogika	        2024.11.19.	            A játék alapvető szabályai megfelelően működnek.	            A felhasználó bugokat tapasztalhat egyes lépéseknél	        A játékos le tudja ütni saját bábúját, futó nem tud épni  

Az Alfa tesztelés során az alapfunkciók megfelelően működtek, a játék alapjai stabilak.

## Béta teszt
Vizsgálat	                    Tesztelés időpontja	                        Elvárás	                                                    Eredmény                                                        Hibák
Sakk szabályok alkalmazása	    2024.11.28.	                A bábuk csak a szabályos lépéseket tehetik meg.	                            Nem minden szabály van implementálva                   A király sakkba léphet még
Sakkhelyzet kezelése	        2024.11.28.	                Sakk esetén a játékos figyelmeztetést kap.	                                Nem Működik                                            Nem kapok figyelmeztetést                  
Sakkmatt felismerése	        2024.11.28.	                A játék vége, ha sakkmatt van.	                                            Nem Működik	                                           A program nem érzékeli a sakkmatt helyzetet
Üzenetek megjelenítése	        2024.11.28.	                A figyelmeztetések és üzenetek megfelelő megjelenítése a felhasználónak.	Nem minden üzenet jelenik meg.                         Az előző hibák alapján nem minden hibáról kap üzenetet a felhasználó.                                                

Felhasználói élmény javítása	2024.11.28.             	A játék végigjátszható a szabályok ismeretében           Működik	    -

A Béta teszt során a játék logikája tovább finomodott, a felhasználói élmény javult.

## Végleges teszt
Vizsgálat	                            Tesztelés időpontja	                    Elvárás	                                                                           Eredmény	                            Hibák
Sakkban bármely bábuval lépés	        2024.12.04.	            Sakkhelyzetben bármely bábuval lehet lépni, ha az megszünteti a sakkot.	                Csak a Királlyal lehet lépni            Nem lehet más bábuval léni 
Saját bábuk leütésének megakadályozása	2024.12.04.         	A játékos nem tudja leütni a saját bábuit.	                                            Le tudja ütni a saját bábuit            A játékos le tudja ütni a saját bábuit       
Nem blokkoló figyelmeztetések	        2024.12.04.	            A figyelmeztetések nem szakítják meg a játékot (pl. Toast üzenetek).	                Megszakítják a játékot                  Ki kell x-elni minden üzenetet            
Győzelmi üzenet megjelenítése	        2024.12.04.	            A játék végeztével megjelenik egy üzenet a nyertes játékosról.	                        Működik	Nem tapasztaltam hibát.             -   
Játék vége utáni blokkolás	            2024.12.04.	            A játék vége után nem lehet további lépéseket tenni resetelés vagy kilépés nélkül.	    Működik	Nem tapasztaltam hibát.             -
displayMessage függvény működése	    2024.12.04.	            A displayMessage megfelelően jeleníti meg a győzelmi üzenetet.	                        Működik	Nem tapasztaltam hibát.             -
Játékállapot kezelése	                2024.12.04.	            A játékállapot helyesen frissül a játék folyamán (folyamatban, befejezett).	            Működik	Nem tapasztaltam hibát.             -
Lépések érvényességének ellenőrzése	    2024.12.04.	            Csak szabályos lépéseket lehet végrehajtani, amelyek nem hagyják a királyt sakkban.	    Működik	Nem tapasztaltam hibát.             -
Felhasználói felület frissítése	        2024.12.04.	            A játék újraindításakor a sakktábla megfelelően frissül.	                            Működik	Nem tapasztaltam hibát.             -        
Hibakezelés	                            2024.12.04.	            Hibás lépés esetén a játék megfelelően reagál és értesíti a felhasználót.	            Működik	Nem tapasztaltam hibát.             -

A végleges teszt során a játékban találtam még pár bugot, de a módosítások után javultak a problémák. A játékélmény gördülékeny és megfelel a sakk szabályainak.

## Megjegyzések:

Sakkhelyzet kezelése: A korábbi hibát, miszerint sakkban csak a királlyal lehetett lépni, sikeresen javítotam. Mostantól bármely bábuval lehet lépni, ha az megszünteti a sakkot.
Saját bábuk leütése: Beépítettük az ellenőrzést, hogy a játékos ne tudja leütni a saját bábuit. A canMove függvény megfelelően ellenőrzi ezt.
Üzenetek megjelenítése: Az üzenetek Toast formában jelennek meg, nem szakítják meg a játék folyamatát, így a felhasználói élmény javult.
Győzelmi üzenet és játékállapot: A displayMessage függvény használatával a játék végeztével egy felugró ablak jelenik meg, amely tájékoztatja a játékost a győzelemről, és lehetőséget ad új játék indítására vagy kilépésre. A játék nem folytatható, amíg a játékos nem dönt.
Felhasználói felület: Az újraindítás és kilépés funkciók megfelelően működnek, a sakktábla és a bábuk állapota helyesen frissül.
A szoftver átadásra készen áll, megfelel a követelményeknek és a sakk szabályainak.

Tesztelést végezte és írta: Deme Bence

Befejezve: 2024.12.04.