# Követelmény specifikáció

## 1. Áttekintés

A szoftver célja egy sakk játék fejlesztése Android platformra, amely offline is játszható. A piacon elérhető sakk játékok többsége reklámokkal van tele, és sok esetben nem biztosítanak megfelelő felhasználói élményt. A cél egy olyan letölthető alkalmazás létrehozása, amely bármikor, internetkapcsolat nélkül elérhető, lehetővé téve a felhasználók számára, hogy élvezhessék a sakk játékát anélkül, hogy zavaró hirdetésekkel találkoznának.

## 2. A jelenlegi helyzet leírása

Jelenleg a felhasználóknak nehézségeik vannak a minőségi sakk játékok megtalálásában, amelyeket offline is használhatnak. A legtöbb elérhető alkalmazás vagy online platformokon érhető el, ahol a hirdetések folyamatosan zavarják a játékélményt. Ezen kívül a sok különböző verzió és platform miatt a felhasználók gyakran csalódnak, mert nem találják meg a számukra megfelelő játékot. Az igény egy letölthető, könnyen kezelhető sakk játékra egyértelmű, és ez a projekt ezt a piaci rést célozza meg.

## 3. Vágyálomrendszer

A cél egy intuitív és felhasználóbarát sakk játék létrehozása. A felhasználóknak egy érthető, jól megtervezett felhasználói felületen kell játszaniuk. A játék indítása után a felhasználó egy klasszikus sakk táblát lát, amelyen a bábuk a megfelelő helyeken állnak. A játék során a felhasználó a bábuk mozgatásával lépéseket tehet, és a rendszer folyamatosan figyeli a lépéseket, értesítve a játékost a matt, döntetlen vagy egyéb játékszabályokról. A játék végén a felhasználó értesítést kap a játék állásáról és statisztikákról, például a lépések számáról és a játék időtartamáról.

## 4. Jelenlegi üzleti folyamatok modellje

Jelenleg, ha a felhasználónak kedve támad sakkozni, gyakran az interneten kell keresgélnie, és olyan online platformokra kell belépnie, ahol a játék élvezete közben folyamatosan hirdetések jelennek meg. Az elérhető játékok minősége nagyon változó, és sok időt vehet igénybe, amíg egy igazán szórakoztató és színvonalas sakk játékot talál. Továbbá, ezek a játékok gyakran nem kínálnak offline játék lehetőséget, így a felhasználók nem tudják élvezni a játékot utazás közben vagy internetkapcsolat nélküli helyzetekben.

## 5. Igényelt üzleti folyamatok modellje

A felhasználó, ha letöltötte a játékot, akkor bármikor megnyithatja azt, és zavartalanul játszhat, ameddig szeretne. A játék befejezése után egyszerűen bezárhatja az alkalmazást. A játékhoz csak két ember kell akik felváltva tudnak játszani egymás ellen.

## 6. Követelménylista

| Id | Modul | Név | Leírás |
| :---: | --- | --- | --- |
| K1 | Játék | Sakk tábla megjelenítése | A játékos lát egy sakk táblát, amelyen a bábuk elhelyezkednek. |
| K2 | Játék | Bábuk mozgatása | A játékos kiválaszthat egy bábút, és elmozdíthatja egy érvényes mezőre. |
| K3 | Játék | Játék vége | Ha az egyik játékos mattolja a másikat, a játék értesíti a felhasználót. |
| K4 | Játék | Bábú leütése | A bábúk le tudnak ütni az ellenfél bábúit. |

## 7. Fogalomtár

| Fogalom | Leírás |
| :---: | --- |
| Kotlin | programozási nyelv, amely az Android fejlesztéséhez használható |
| Sakk | stratégiai táblajáték, két játékos részére |
| Offline játék | Olyan játék, amelyhez nincs szükség internetkapcsolatra, lehetővé téve a zavartalan játékot. |
| Felhasználói élmény | A felhasználók által a játék használata során szerzett összes tapasztalat, beleértve az interakciót, a felületet és a játékélményt. |
