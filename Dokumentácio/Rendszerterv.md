# Rendszerterv
## 1. A rendszer célja


## 2. Projektterv

### 2.1 Projektszerepkörök, felelőségek:
   * Scrum masters:  Sinka Barnabás
   * Product owner: Tajti Tibor
   * Üzleti szereplő: Penyaskó Dávid
     
### 2.2 Projektmunkások és felelőségek:
   * Frontend: Bobák Martin Ferenc, Bogáthy Péter, Deme Bence, Góga Dávid, Kovács Olivér
   * Backend: Bobák Martin Ferenc, Bogáthy Péter, Deme Bence, Góga Dávid, Kovács Olivér
   * Tesztelés: Bobák Martin Ferenc, Bogáthy Péter, Deme Bence, Góga Dávid, Kovács Olivér
     
### 2.3 Ütemterv:

|Funkció                     | Feladat                                | Prioritás | Becslés (nap) | Aktuális becslés (nap) | Eltelt idő (nap) | Becsült idő (nap)   |
|----------------------------|----------------------------------------|-----------|---------------|------------------------|------------------|---------------------|
|Követelmény specifikáció    |Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |             
|Funkcionális specifikáció   |Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |
|Rendszerterv                |Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |
|Alkalmazásfejlesztés        |Képernyőtervek elkészítése              |         2 |             1 |                      1 |                1 |                   1 |
|Alkalmazásfejlesztés        |Prototípus elkészítése                  |         3 |             8 |                      8 |                8 |                   8 |
|Alkalmazásfejlesztés        |Alapfunkciók elkészítése                |         3 |             8 |                      8 |                8 |                   8 |
|Alkalmazásfejlesztés        |Tesztelés                               |         4 |             3 |                      3 |                3 |                   3 |

### 2.4 Mérföldkövek:


## 3. Üzleti folyamatok modellje

## 4. Követelmények

### Funkcionális követelmények

| Id | Modul | Név | Leírás |
| K1 | Játék | Tábla megjelenítése | A játékos lát egy 8x8-as sakk táblát a képernyőn, amelyen a bábuk kezdő pozícióban vannak. |
| K2 | Játék | Bábuk mozgatása | A játékos kiválaszthat egy bábut, és a sakk szabályai szerint léphet vele. |
| K3 | Játék | Lépések ellenőrzése | A rendszer ellenőrzi, hogy a játékos által kiválasztott lépés szabályos-e.|
| K4 | Játék | Sakk és Matt ellenőrzés | A rendszer folyamatosan ellenőrzi, hogy sakk vagy matt helyzet alakult-e ki. |
| K5 | Játék | Emberi ellenfél | A játékos játszhat egy másik emberi játékos ellen, akik ugyanazon az eszközön felváltva lépnek. |
| K6 | Játék | Eredmény tárolása | A játék végén a rendszer elmenti a játék eredményét egy adatbázisba, amely tartalmazza a győztest és a lépések számát. |
| K7 | Játék | Start menü | A játék indításakor egy egyszerű start menü jelenik meg, amely lehetőséget ad új játék indítására vagy kilépésre. |
| K8 | Játék vége képernyő | A játék végén megjelenik egy egyszerű képernyő, amely mutatja a győztest és lehetőséget ad új játék indítására vagy kilépésre. |

### Nemfunkcionális követelmények

-A felhasználói élmény intuitív legyen, a sakk szabályai következetesen érvényesüljenek.

-Az alkalmazás gyorsan reagáljon a felhasználói műveletekre, minimalizálva a várakozási időt.

-A felhasználók személyes adatai biztonságban maradjanak, mivel az alkalmazás offline működik, és nem igényel személyes adatokat.

### Támogatott eszközök

Ez az alkalmazás kizárólag Android eszközökön futtatható. Internetkapcsolat nem szükséges, mivel offline módban működik.

## 5. Funkcionális terv

### 5.1 Rendszerszereplők

Ebben a projektben két játékos szerepel, akik ugyanazon az eszközön játszanak felváltva.

### 5.2 Menühierarchiák

A játék használatához nincs szükség bejelentkezésre vagy fiók létrehozására.

Főmenü:

   -Új játék: A játékos új játékot kezdhet, ahol két emberi játékos játszik egymás ellen ugyanazon az eszközön.

   -Kilépés: A játékost kilépteti a játékból, és a program futása befejeződik.

Játék vége képernyő:

   -Győztes megjelenítése: A rendszer megjeleníti a győztes színét.

   -Új játék: A játékos új játékot kezdhet.

## 6. Fizikai környezet

### Vásárolt softwarekomponensek és külső rendszerek

### Hardver topológia

### Fizikai alrendszerek

### Fejlesztő eszközök


## 8. Architekturális terv

### Webszerver

### Adatbázis rendszer

### A program elérése, kezelése

## 9. Adatbázis terv

## 10. Implementációs terv

## 11. Tesztterv

### Tesztesetek

 | Teszteset | Elvárt eredmény | 
 |-----------|-----------------| 
 | ... | ... |

### A tesztelési jegyzőkönyv kitöltésére egy sablon:

**Tesztelő:** Vezetéknév Keresztnév

**Tesztelés dátuma:** Év.Hónap.Nap

Tesztszám | Rövid leírás | Várt eredmény | Eredmény | Megjegyzés
----------|--------------|---------------|----------|-----------
például. Teszt #01 | Regisztráció | A felhasználó az adatok megadásával sikeresen regisztrálni tud  | A felhasználó sikeresen regisztrált | Nem találtam problémát.
... | ... | ... | ... | ...

## 12. Telepítési terv

Fizikai telepítési terv: 

Szoftver telepítési terv: 

## 13. Karbantartási terv
