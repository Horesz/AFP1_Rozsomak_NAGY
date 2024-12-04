# Tesztel�si jegyz�k�nyv
Tesztel�seket v�gezte: Bob�k Martin, Bog�thy P�ter, Deme Bence, G�ga D�vid

Oper�ci�s rendszer: Windows 10

## Alfa teszt
| Vizsg�lat | Tesztel�s id�pontja | Elv�r�s | Eredm�ny | Hib�k |
| :---: | --- | --- | --- | :---: |
| Sakkt�bla megalkot�sa | 2024.11.18. | Sakkt�bla / j�t�kt�r el�ksz�t�se. | M�k�dik | - |
| T�bla m�retezhet�v� t�tele | 2024.11.18. | T�bla m�retezhet�v� t�tele, a k�l�nb�z� m�ret� eszk�z�k�n az ar�nyok megtart�sa. | M�k�dik | - |
| B�buk megjelen�t�se �s felhelyez�se a sakkt�bl�ra | 2024.11.18. | B�buk megjelen�t�se �s felhelyez�se a sakkt�bl�ra, hogy a felhaszn�l�i �lm�nyt alapszintre hozzuk. | M�k�dik | - |
| B�buk mozgathat�v� t�tele | 2024.11.18. | B�buk mozognak a felhaszn�l� interakci�j�ban. | M�k�dik | - |
| RESET gomb | 2024.11.18. | RESET gomb implement�l�sa a sakkt�bla vissza�ll�t�s�hoz j�t�k k�zben (az �jrakezd�s gombja). | M�k�dik | - |

Az Alfa tesztel�s sor�n a vizsg�lt elemek mind hib�tlanul m�k�dtek mindenf�le fennakad�sok n�lk�l.

K�vetkez� tesztel�sn�l a t�bbi funkci� ker�l vizsg�latra illetve elemz�sre.


## B�ta teszt
| Vizsg�lat | Tesztel�s id�pontja | Elv�r�s | Eredm�ny | Hib�k |
| :---: | --- | --- | --- | :---: |
| J�t�k men� | 2024.11.25. | A j�t�k men�j�nek elk�sz�t�se. | M�k�dik | - |
| Bel�p�si fel�let | 2024.11.25. | A j�t�k bel�p�si fel�let�nek elk�sz�t�se -> Login funkci�. | M�k�dik | - |
| Regisztr�ci�s fel�let | 2024.11.25. | A j�t�k regisztr�ci�s fel�let�nek elk�sz�t�se -> SignUp funkci� (Ha m�g nem l�pett be egyszer sem a felhaszn�l�, akkor l�rehozza a saj�t fi�kj�t). | M�k�dik | - |
| Bejelentkez�si / regiszt�ci�s fel�let v�gleges�t�se | 2024.11.25. | Bejelentkez�si �s regiszt�ci�s fel�let kin�zet�nek v�gleges�t�se, hogy a j�t�k�lm�ny magasszint� legyen. | M�k�dik | - |
| �j j�t�k opci� | 2024.11.25. | �j j�t�k opci� elk�sz�t�se, hogy a user b�rmikor �jrakezdhesse a sakkot. (Ak�r haszn�lata k�zben, ak�r �j j�t�k ind�t�sa az alkalmaz�sban) | M�k�dik | - |
| B�buk szab�lya | 2024.11.25. | Az �sszes b�bu szab�lyainak implement�l�sa (hogyan l�phet �s mozoghat a p�ly�n). | M�k�dik | - |
| Gombok l�trehoz�sa | 2024.11.25. | Kisebb gombok l�trehoz�sa �s m�k�d�si h�tter�nek megval�s�t�sa. | M�k�dik | - |
| Adatb�zis megalkot�sa | 2024.11.25. | A felhaszn�l� adatainak elt�rol�sa (felhaszn�l�n�v �s jelsz�) a k�s�bbi bel�p�shez �s a j�t�kban ny�jtott teljes�tm�ny�nek r�gz�t�se. | M�k�dik | - |

A B�ta teszt sor�n a vizsg�lt elemek mind hib�tlanul m�k�dtek mindenf�le fennakad�s n�lk�l.

A v�gleges tesztel�s sor�n az �sszes fent felsorolt vizsg�lati elem �jra ellen�rz�sre ker�l.

Ezzel egy�tt az �j funkci�k is tesztel�sre ker�ltek.

## V�gleges teszt
| Vizsg�lat | Tesztel�s id�pontja | Elv�r�s | Eredm�ny | Hib�k |
| :---: | --- | --- | --- | :---: |
| Adatb�zis | 2024.12.04. | Adatb�zis m�k�d�s�nek ellen�rz�se | A t�bl�k a k�ld�tt adatokat sikeresen r�gz�tik, adatveszt�s nincs. | Nem tapasztaltam hib�t. |
| Regisztr�ci� | 2024.12.04. | Regisztr�l�s a j�t�k haszn�lat�hoz | Fi�k regisztr�l�sa sikeres. | Nem tapasztaltam hib�t. |
| Bel�p�s | 2024.12.04. | Bejelentkez�s a j�t�k haszn�lat�hoz | Bel�p�s a j�t�khoz sikeres. | Nem tapasztaltam hib�t. |
| Adatellen�rz�s | 2024.12.04. | Felhaszn�l� adatainak ellen�rz�se | L�tezik-e olyan nev� felhaszn�l� �s ha igen, volt-e m�r kor�bbi j�t�krekordja? | Nem tapasztaltam hib�t. |
| Felhaszn�l� rekordlist�ja | 2024.12.04. | Felhaszn�l� megtekintheti kor�bbi rekordjait.| Saj�t adatok visszan�z�se m�k�dik. | Nem tapasztaltam hib�t. |
| �j j�t�k | 2024.12.04. | Gombra kattintva a j�t�k elindul.| Elindult j�t�k �s a funkci� m�k�dik. | Nem tapasztaltam hib�t. |
| J�t�k v�ge | 2024.12.04. | J�t�k v�gezt�vel (amikor a k�t j�t�kos k�z�l az egyik nyer a sakk szab�lyai szerint) a nyertes f�lhez elt�roljuk a pontsz�m�t, �j j�t�kra vagy kil�p�sre van lehet�s�g. | Siker�lt a nyertes adatait lekezelni �s elt�rolni. | Nem tapasztaltam hib�t. |

?
| Sz�r�k | 2024.12.04. | A term�kek oldalon lehet m�ret �s �r szerint sz�rni a term�kek k�zt | A sz�r�k megfelel�en m�k�dnek. | Nem tapasztaltam hib�t. |
| Saj�t rendel�sek | 2024.12.04. | Minden felhaszn�l� a saj�t rendel�sit meg tudja n�zni | Rendel�seim oldalon megjelennek a megfelel� adatok. | Nem tapasztaltam hib�t. |
?



A V�gleges teszt lezajlott �s minden funkci� rendesen m�k�dik, eszt�tikailag is megfelel� a program.

�tad�sra k�szen �ll a megrendel�nek.

Tesztel�st v�gezte �s �rta: Bob�k Martin, Bog�thy P�ter, Deme Bence, G�ga D�vid

Befejezve: 2024.12.04.