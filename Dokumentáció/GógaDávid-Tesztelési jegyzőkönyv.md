# Tesztelési jegyzőkönyv
Teszteléseket végezte: Góga Dávid

Operációs rendszer: Windows 10

## Alfa teszt
| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | :---: |
| Sakktábla megalkotása | 2024.11.18. | Sakktábla / játéktér elékszítése. | Működik | - |
| Bábuk megjelenítése és felhelyezése a sakktáblára | 2024.11.18. | Bábuk megjelenítése és felhelyezése a sakktáblára, hogy a felhasználói élményt alapszintre hozzuk. | Működik | - |
| Bábuk mozgathatóvá tétele | 2024.11.18. | Bábuk mozognak a felhasználó interakciójában. | Működik | - |

Az Alfa tesztelés során a vizsgált elemek mind hibátlanul működtek mindenféle fennakadások nélkül.

Következő tesztelésnél a többi funkció kerül vizsgálatra illetve elemzésre.


## Béta teszt
| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | :---: |
| Belépési felület | 2024.11.25. | A játék belépési felületének elkészítése -> Login funkció. | Működik | - |
| Regisztrációs felület | 2024.11.25. | A játék regisztrációs felületének elkészítése -> SignUp funkció (Ha még nem lépett be egyszer sem a felhasználó, akkor lérehozza a saját fiókját). | Működik | - |
| Futó mozgásának szabálya | 2024.11.25. | A futó szabályainak implementálása (hogyan léphet és mozoghat a pályán). | Működik | - |
| Bástya mozgásának szabálya | 2024.11.25. | A bástya szabályainak implementálása (hogyan léphet és mozoghat a pályán). | Működik | - |

A Béta teszt során a vizsgált elemek mind hibátlanul működtek mindenféle fennakadás nélkül.

A végleges tesztelés során az összes fent felsorolt vizsgálati elem újra ellenőrzésre kerül.

Ezzel együtt az új funkciók is tesztelésre kerültek.

## Végleges teszt
| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | :---: |
| Adatbázis | 2024.12.04. | Adatbázis működésének ellenőrzése | A táblák a küldött adatokat sikeresen rögzítik, adatvesztés nincs. | Nem tapasztaltam hibát. |
| Regisztráció | 2024.12.04. | Regisztrálás a játék használatához | Fiók regisztrálása sikeres. | Nem tapasztaltam hibát. |
| Belépés | 2024.12.04. | Bejelentkezés a játék használatához | Belépés a játékhoz sikeres. | Nem tapasztaltam hibát. |
| Egymás utáni lépés | 2024.12.04. | A játékosok csak egyszer léphetnek majd a másik játékos következik. | Ha az egyik játékos lép, utána nem léphet addig míg a másik fél nem mozgatja egyik bábuját. | Nem tapasztaltam hibát. |
| Játék vége | 2024.12.04. | Játék végeztével kapunk egy üzenetet a nyertesről! | Megkaptam az üzenetet. | Nem tapasztaltam hibát. |


A Végleges teszt lezajlott és minden funkció rendesen működik, esztétikailag is megfelelő a program.

Átadásra készen áll a megrendelőnek.

Tesztelést végezte és írta: Góga Dávid

Befejezve: 2024.12.04.