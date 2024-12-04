# Tesztelési jegyzõkönyv
Teszteléseket végezte: Bobák Martin, Bogáthy Péter, Deme Bence, Góga Dávid

Operációs rendszer: Windows 10

## Alfa teszt
| Vizsgálat | Tesztelés idõpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | :---: |
| Sakktábla megalkotása | 2024.11.18. | Sakktábla / játéktér elékszítése. | Mûködik | - |
| Tábla méretezhetõvé tétele | 2024.11.18. | Tábla méretezhetõvé tétele, a különbözõ méretû eszközökön az arányok megtartása. | Mûködik | - |
| Bábuk megjelenítése és felhelyezése a sakktáblára | 2024.11.18. | Bábuk megjelenítése és felhelyezése a sakktáblára, hogy a felhasználói élményt alapszintre hozzuk. | Mûködik | - |
| Bábuk mozgathatóvá tétele | 2024.11.18. | Bábuk mozognak a felhasználó interakciójában. | Mûködik | - |
| RESET gomb | 2024.11.18. | RESET gomb implementálása a sakktábla visszaállításához játék közben (az újrakezdés gombja). | Mûködik | - |

Az Alfa tesztelés során a vizsgált elemek mind hibátlanul mûködtek mindenféle fennakadások nélkül.

Következõ tesztelésnél a többi funkció kerül vizsgálatra illetve elemzésre.


## Béta teszt
| Vizsgálat | Tesztelés idõpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | :---: |
| Játék menü | 2024.11.25. | A játék menüjének elkészítése. | Mûködik | - |
| Belépési felület | 2024.11.25. | A játék belépési felületének elkészítése -> Login funkció. | Mûködik | - |
| Regisztrációs felület | 2024.11.25. | A játék regisztrációs felületének elkészítése -> SignUp funkció (Ha még nem lépett be egyszer sem a felhasználó, akkor lérehozza a saját fiókját). | Mûködik | - |
| Bejelentkezési / regisztációs felület véglegesítése | 2024.11.25. | Bejelentkezési és regisztációs felület kinézetének véglegesítése, hogy a játékélmény magasszintû legyen. | Mûködik | - |
| Új játék opció | 2024.11.25. | Új játék opció elkészítése, hogy a user bármikor újrakezdhesse a sakkot. (Akár használata közben, akár új játék indítása az alkalmazásban) | Mûködik | - |
| Bábuk szabálya | 2024.11.25. | Az összes bábu szabályainak implementálása (hogyan léphet és mozoghat a pályán). | Mûködik | - |
| Gombok létrehozása | 2024.11.25. | Kisebb gombok létrehozása és mûködési hátterének megvalósítása. | Mûködik | - |
| Adatbázis megalkotása | 2024.11.25. | A felhasználó adatainak eltárolása (felhasználónév és jelszó) a késõbbi belépéshez és a játékban nyújtott teljesítményének rögzítése. | Mûködik | - |

A Béta teszt során a vizsgált elemek mind hibátlanul mûködtek mindenféle fennakadás nélkül.

A végleges tesztelés során az összes fent felsorolt vizsgálati elem újra ellenõrzésre kerül.

Ezzel együtt az új funkciók is tesztelésre kerültek.

## Végleges teszt
| Vizsgálat | Tesztelés idõpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | :---: |
| Adatbázis | 2024.12.04. | Adatbázis mûködésének ellenõrzése | A táblák a küldött adatokat sikeresen rögzítik, adatvesztés nincs. | Nem tapasztaltam hibát. |
| Regisztráció | 2024.12.04. | Regisztrálás a játék használatához | Fiók regisztrálása sikeres. | Nem tapasztaltam hibát. |
| Belépés | 2024.12.04. | Bejelentkezés a játék használatához | Belépés a játékhoz sikeres. | Nem tapasztaltam hibát. |
| Adatellenõrzés | 2024.12.04. | Felhasználó adatainak ellenõrzése | Létezik-e olyan nevû felhasználó és ha igen, volt-e már korábbi játékrekordja? | Nem tapasztaltam hibát. |
| Felhasználó rekordlistája | 2024.12.04. | Felhasználó megtekintheti korábbi rekordjait.| Saját adatok visszanézése mûködik. | Nem tapasztaltam hibát. |
| Új játék | 2024.12.04. | Gombra kattintva a játék elindul.| Elindult játék és a funkció mûködik. | Nem tapasztaltam hibát. |
| Játék vége | 2024.12.04. | Játék végeztével (amikor a két játékos küzül az egyik nyer a sakk szabályai szerint) a nyertes félhez eltároljuk a pontszámát, új játékra vagy kilépésre van lehetõség. | Sikerült a nyertes adatait lekezelni és eltárolni. | Nem tapasztaltam hibát. |

?
| Szûrõk | 2024.12.04. | A termékek oldalon lehet méret és ár szerint szûrni a termékek közt | A szûrõk megfelelõen mûködnek. | Nem tapasztaltam hibát. |
| Saját rendelések | 2024.12.04. | Minden felhasználó a saját rendelésit meg tudja nézni | Rendeléseim oldalon megjelennek a megfelelõ adatok. | Nem tapasztaltam hibát. |
?



A Végleges teszt lezajlott és minden funkció rendesen mûködik, esztétikailag is megfelelõ a program.

Átadásra készen áll a megrendelõnek.

Tesztelést végezte és írta: Bobák Martin, Bogáthy Péter, Deme Bence, Góga Dávid

Befejezve: 2024.12.04.