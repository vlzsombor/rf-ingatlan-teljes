# Tesztjegyzőkönyv

## 1. Teszteljárások (TP)

### 1.1. Bejelentkezés funkció tesztelése 
- Azonosító: TP-01
- Tesztesetek: TC-01, TC-02, TC-03, TC-04, TC-05, TC-06
- Leírás: bejelentkezés funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, és indítsuk el a bejelentkezés funkciót a jobb felső sarokban lévő Login gombra kattintva
    1. lépés: A `Username` szövegbeviteli mezőbe írjuk be a `Username` karakterláncot
    2. lépés: Az`Password` szövegbeviteli mezőbe írjuk be a `Password` karakterláncot
    3. lépés: Nyomjuk meg az `Log in` gombot 
    4. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Sikeres bejelentkezés esetén a megfelelő funkciók megjelenése az adott jogkörű felhasználóhoz (admin, manager, user). Sikertelen bejelentkezés esetén pedig hibaüzenet.

### 1.2. Kijelentkezés funkció tesztelése

- Azonosító: TP-02
- Tesztesetek: TC-01
- Leírás: ingatlanhozzáadás funkció tesztelése
  0. lépés: Nyissuk meg az alkalmazást, jelentkezzünk be a Log in felületen és jelentkezzünk ki a `Logout` gombbal
  1. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: A felhasználó kijelentkeztetése, visszakerülés a Log in felületre.

### 1.3. Ingatlanhozzáadás funkció tesztelése

- Azonosító: TP-03
- Tesztesetek: TC-01, TC-02, TC-03
- Leírás: Az ingatlanhozzáadás funkció tesztelése
  0. lépés: Nyissuk meg az alkalmazást, jelentkezzünk be a Log in felületen és indítsuk el az ingatlanhozzáadás funkciót az `Upload your own ad` gombot megnyomva
  1. lépés: Az `Name` szövegbeviteli mezőbe írjuk be az `name` karakterláncot
  2. lépés: Az `Address` szövegbeviteli mezőbe írjuk be az `address` karakterláncot
  3. lépés: Az `Description` szövegbeviteli mezőbe írjuk be az `description` karakterláncot
  4. lépés: A `Price ($)` szövegbeviteli mezőbe írjuk be az `price` számokból álló karakterláncot
  5. lépés: Nyomjuk meg az `Upload` gombot 
  6. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Egy újabb sor a Home felületen: `name` `address` `details`

### 1.4. Regisztráció funkció tesztelése

- Azonosító: TP-04
- Tesztesetek: TC-01, TC-02
- Leírás: regisztráció funkció tesztelése
  0. lépés: Nyissuk meg az alkalmazást, lépjünk a Log in felületre és kattintsunk a `Registration` gombra
  1. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: A felhasználó kijelentkeztetése, visszakerülés a Log in felületre.
  2. lépés: A `First name` szövegbeviteli mezőbe írjuk be az `first name` karakterláncot
  3. lépés: A `Last name` szövegbeviteli mezőbe írjuk be az `last name` karakterláncot
  4. lépés: Az `E-mail` szövegbeviteli mezőbe írjuk be az `e-mail` karakterláncot
  5. lépés: A `Confirm e-mail` szövegbeviteli mezőbe írjuk be az `confirm e-mail` karakterláncot
  6. lépés: A `Password` szövegbeviteli mezőbe írjuk be a `password` karakterláncot
  7. lépés: A `Confirm password` szövegbeviteli mezőbe írjuk be a `confirm password` karakterláncot
  8. lépés: Fogadjuk el a felhasználási feltételeket a `I agree with the [terms and conditions](http://localhost:8080/registration#) for Registration.` checkboxra kattintva
  9. lépés: Nyomjuk meg a `Register` gombot 
  10. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: sikeres bejelentkezés a Login felületen a megadott e-mail címmel és jelszóval

### 1.5. Az újabb mezőkkel ellátott ingatlanhozzáadás funkció tesztelése

- Azonosító: TP-05
- Tesztesetek: TC-01, TC-02, TC-03
- Leírás: újabb mezőkkel ellátott ingatlanhozzáadás funkció tesztelése
  0. lépés: Nyissuk meg az alkalmazást, jelentkezzünk be a Log in felületen és indítsuk el az ingatlanhozzáadás funkciót az `Hirdetés feltöltése` gombot megnyomva
  1. lépés: A `Hirdetés típusa*` legördülő menüben válasszuk ki az `ad_type` karakterláncot
  2. lépés: Az `Ingatlan típusa*` legördülő menüben válasszuk ki a `house_type` karakterláncot
  3. lépés: Az `Hirdetesed címe*` szövegbeviteli mezőbe írjuk be az `title` karakterláncot
  4. lépés: A `Ingatlan ára *` szövegbeviteli mezőbe írjuk be az `price` számokból álló karakterláncot
  5. lépés: A `Méret (m2)*` szövegbeviteli mezőbe írjuk be az `size` számokból álló karakterláncot
  6. lépés: Az `Szobák száma*` legördülő menüben válasszuk ki a `room_number` karakterláncot
  7. lépés: Az `Félszobák szama` legördülő menüben válasszuk ki a `halfroom_number` karakterláncot
  8. lépés: A `Település*` szövegbeviteli mezőbe írjuk be az `city` számokból álló karakterláncot
  9. lépés: Az `Megye*` legördülő menüben válasszuk ki a `state` karakterláncot
  10. lépés: Az `Ir. szám*` szövegbeviteli mezőbe írjuk be az `zip` számokból álló karakterláncot
  11. lépés: Az `Utca` szövegbeviteli mezőbe írjuk be az `street` számokból álló karakterláncot
  12. lépés: Az `Ingatlan leírás` szövegbeviteli mezőbe írjuk be az `description` számokból álló karakterláncot
  13. lépés: A `Fotó` fájlfeltöltés gomb megnyomása után kiválasztjuk a feltöltendő fényképeket
  14. lépés: Nyomjuk meg az `Upload` gombot 
  15. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Egy újabb rekord a My ads felületen.

### 1.6. Hirdetés részleteinek megtekintése funkció tesztelése

- Azonosító: TP-06
- Tesztesetek: TC-01
- Leírás: A felhasználó által feltöltött ingatlan részleteinek megtekintése
  0. lépés: Nyissuk meg az alkalmazást, jelentkezzünk be a Log in felületen,  és 
  1. lépés: válasszuk ki a hirdetéseket tartalmazó felületet a `My ads` gombra kattintva
  2. lépés: indítsuk el a `Jó kis ház` ingatlan részletei funkciót az `Details` oszlopban elhelyezkedő gombot megnyomva

## 2. Tesztesetek (TC)

### 2.1. Bejelentkezés funkció tesztesetei

#### 2.1.1. TC-01

- TP: TP-01
- Leírás: bejelentkezés funkció tesztelése 
- Bemenet: `Username` = "" ; `Password` = teszt
- Művelet: nyomjuk meg az `Log in` gombot 
- Elvárt kimenet: Hibaüzenet (sikertelen bejelentkezés)

#### 2.1.2. TC-02

- TP: TP-01
- Leírás: bejelentkezés funkció tesztelése 
- Bemenet: `Username` = teszt ; `Password` = ""
- Művelet: nyomjuk meg az `Log in` gombot 
- Elvárt kimenet: Hibaüzenet (sikertelen bejelentkezés)

#### 2.1.3. TC-03

- TP: TP-01
- Leírás: bejelentkezés funkció tesztelése 
- Bemenet: `Username` = "" ; `Password` = ""
- Művelet: nyomjuk meg az `Log in` gombot 
- Elvárt kimenet: Hibaüzenet (sikertelen bejelentkezés)

#### 2.1.4. TC-04
- TP: TP-01
- Leírás: bejelentkezés funkció tesztelése "admin" jogkörű felhasználó számára
- Bemenet: `Username` = admin ; `Password` = admin123 
- Művelet: nyomjuk meg az `Log in` gombot 
- Elvárt kimenet: admin jogkörhöz tartozó funkciók megjelenése: Profile, Admin, Management, Upload your own ad

#### 2.1.5. TC-05
- TP: TP-01
- Leírás: bejelentkezés funkció tesztelése "manager" jogkörű felhasználó számára
- Bemenet: `Username` = manager ; `Password` = manager123 
- Művelet: nyomjuk meg az `Log in` gombot 
- Elvárt kimenet: manager jogkörhöz tartozó funkciók megjelenése: Profile, Management, Upload your own ad

#### 2.1.6. TC-06

- TP: TP-01
- Leírás: bejelentkezés funkció tesztelése "user" jogkörű felhasználó számára
- Bemenet: `Username` = dan ; `Password` = dan123  
- Művelet: nyomjuk meg az `Log in` gombot 
- Elvárt kimenet: user jogkörhöz tartozó funkciók megjelenése: Profile, Upload your own ad

### 2.2. Kijelentkezés funkció tesztesetei

#### 2.2.1. TC-01
- TP: TP-02
- Leírás: kijelentkezés funkció tesztelése
- Bemenet: -
- Művelet: nyomjuk meg az `Logout` gombot 
- Elvárt kimenet: Sikeres kijelentkezés, visszakerülés a Log in felületre

### 2.3. Ingatlanhozzáadás funkció tesztesetei

#### 2.3.1. TC-01

- TP: TP-03
- Leírás: ingatlanhozzáadás funkció tesztelése
- Bemenet: `Name` = Halasi kuckó ; `Address` = 6400 Kiskunhalas, Kossuth utca 18. ; `Description` = Viszonylag takaros otthon ; `Price` = 1999;
- Művelet: nyomjuk meg az `Upload` gombot 
- Elvárt kimenet: újabb sor a Home felületen: `Halasi kuckó` `	6400 Kiskunhalas, Kossuth utca 18.` `details` sorrendben

#### 2.3.2. TC-02

- TP: TP-03
- Leírás: ingatlanhozzáadás funkció tesztelése
- Bemenet: `Name` = Mélykúti lak ; "`Address` = "" ; `Description` = Takaros otthon ; `Price` = 1848;
- Művelet: nyomjuk meg az `Upload` gombot 
- Elvárt kimenet: HIBA (nincs megadva cím)

#### 2.3.3. TC-03

- TP: TP-03
- Leírás: ingatlanhozzáadás funkció tesztelése
- Bemenet: `Name` = Kiskőrösi kunyhó ; "`Address` = "6131 Kiskőrös, Zöld utca 7." ; `Description` = Jó otthon ; `Price` = aaa;
- Művelet: nyomjuk meg az `Upload` gombot 
- Elvárt kimenet: HIBA (`Price`-nak számot kell megadni)

### 2.4. Regisztráció funkció tesztesetei

#### 2.4.1. TC-01

- TP: TP-04
- Leírás: regisztráció funkció tesztelése
- Bemenet:  `First name` = Márton ; `Last name` = Kovács ;  `E-mail` = k.marci@gmail.com  ;  `Confirm e-mail` = k.marci@gmail.com ;  `Password` = alma123 ;  `Confirm password` = alma123 ; `I agree with the terms and conditions for Registration.` = TRUE ; 
- Művelet: nyomjuk meg az `Register` gombot 
- Elvárt kimenet: Sikeres regisztráció. Sikeres bejelentkezés a Log in felületen.

#### 2.4.2. TC-02

- TP: TP-04
- Leírás: regisztráció funkció tesztelése
- Bemenet:  `First name` = Marcell ; `Last name` = Nagy ;  `E-mail` = n.marci@gmail.com  ;  `Confirm e-mail` = n.marci@gmail.com ;  `Password` = korte123 ;  `Confirm password` = korte123 ; `I agree with the terms and conditions for Registration.` = FALSE ; 
- Művelet: nyomjuk meg az `Register` gombot 
- Elvárt kimenet: HIBA: sikertelen regisztráció (nincsenek elfogadva a felhasználási feltételek)

#### 2.4.3. TC-03

- TP: TP-04
- Leírás: regisztráció funkció tesztelése
- Bemenet:  `First name` = Gábor ; `Last name` = Nagy ;  `E-mail` = ""  ;  `Confirm e-mail` = ""  ;  `Password` = barack123 ;  `Confirm password` = barack123 ; `I agree with the terms and conditions for Registration.` = TRUE ; 
- Művelet: nyomjuk meg az `Register` gombot 
- Elvárt kimenet: HIBA: sikertelen regisztráció (nincs e-mail cím megadva)

#### 2.4.4. TC-04

- TP: TP-04
- Leírás: regisztráció funkció tesztelése
- Bemenet:  `First name` = Gábor ; `Last name` = Kovács ;  `E-mail` = k.gabi@gmail.com  ;  `Confirm e-mail` = k.gabi@gmail.com ;  `Password` = "" ;  `Confirm password` = "" ; `I agree with the terms and conditions for Registration.` = TRUE ; 
- Művelet: nyomjuk meg az `Register` gombot 
- Elvárt kimenet: HIBA: sikertelen regisztráció (nincs jelszó megadva)

### 2.5. Ingatlanhozzáadás újabb beviteli mezőkkel  funkció tesztesetei

#### 2.5.1. TC-01

- TP: TP-05
- Leírás: ingatlanhozzáadás funkció tesztelése
- Bemenet: `Hirdetés típusa*` = Eladó ; `Ingatlan típusa*` = Lakás ; `Hirdetesed címe*` = Jó kis ház ; `Ingatlan ára *` = 750000;  `Méret (m2)*` = 16 ; `Szobák száma*` = 4 ; `Félszobák szama` = 1 ; `Település*` = Békéscsaba;  `Megye*` = Békés ; `Ir. szám*` = 5600 ; `Utca` = Orosházi utca 13. ; `Ingatlan leírás` = Ez a legjobb ház;  `Fotó` = "bekescsaba1.jpg", "bekescsaba2.jpg", "bekescsaba3.jpg", "bekescsaba4.jpg", "bekescsaba5.jpg", "bekescsaba6.jpg" ; 
- Művelet: nyomjuk meg az `Upload` gombot 
- Elvárt kimenet: újabb rekord a My ads felületen.

#### 2.5.2. TC-02

- TP: TP-05
- Leírás: ingatlanhozzáadás funkció tesztelése
- Bemenet: `Hirdetés típusa*` = Eladó ; `Ingatlan típusa*` = Lakás ; `Hirdetesed címe*` ="" `Ingatlan ára *` = 450000;  `Méret (m2)*` = 126 ; `Szobák száma*` = 2 ; `Félszobák szama` = 1 ; `Település*` = Békés;  `Megye*` = Békés ; `Ir. szám*` = 5600 ; `Utca` = Orosházi utca 11. ; `Ingatlan leírás` = Ez a legjobb ház;  `Fotó` = "bekescsaba1.jpg", "bekescsaba2.jpg", "bekescsaba3.jpg", "bekescsaba4.jpg", "bekescsaba5.jpg", "bekescsaba6.jpg" ; 
- Művelet: nyomjuk meg az `Upload` gombot 
- Elvárt kimenet: HIBA (nincs megadva cím)

#### 2.5.3. TC-03

- TP: TP-05
- Leírás: ingatlanhozzáadás funkció tesztelése
- Bemenet: `Hirdetés típusa*` = Kiadó ; `Ingatlan típusa*` = Telek ; `Hirdetesed címe*` = Félegyházi csodavilla ; `Ingatlan ára *` = "alma" `Méret (m2)*` = 191 ; `Szobák száma*` = 3 ; `Félszobák szama` = 2 ; `Település*` = Kiskunfélegyháza;  `Megye*` = Bács-Kiskun ; `Ir. szám*` = 6610 ; `Utca` = Petőfi utca 33. ; `Ingatlan leírás` = Keresve se találsz jobbat!;  `Fotó` = "bekescsaba1.jpg", "bekescsaba2.jpg", "bekescsaba3.jpg", "bekescsaba4.jpg", "bekescsaba5.jpg", "bekescsaba6.jpg" ; 
- Művelet: nyomjuk meg az `Upload` gombot 
- Elvárt kimenet: HIBA (`Ingatlan ára*`-nak számot kell megadni)

#### 2.5.4. TC-04

- TP: TP-05
- Leírás: ingatlanhozzáadás funkció tesztelése
- Bemenet: `Hirdetés típusa*` = Eladó ; `Ingatlan típusa*` = Lakás ; `Hirdetesed címe*` = Jó kis ház 2.0 ; `Ingatlan ára *` = 850000;  `Méret (m2)*` = 26 ; `Szobák száma*` = 4 ; `Félszobák szama` = 1 ; `Település*` = Békéscsaba;  `Megye*` = Békés ; `Ir. szám*` = 5600 ; `Utca` = Orosházi utca 43. ; `Ingatlan leírás` = Ez a legjobb ház a környéken!;  `Fotó` = "bekescsaba1.jpg", "bekescsaba2.jpg", "bekescsaba3.jpg" ; 
- Művelet: nyomjuk meg az `Upload` gombot 
- Elvárt kimenet: HIBA (legalább 6 db képet kell feltölteni)

### 2.6. Hirdetés részleteinek megtekintése  funkció tesztesetei

#### 2.6.1. TC-01

- TP: TP-06
- Leírás: hirdetés részleteinek megtekintése funkció tesztelése
- Bemenet: - 
- Művelet: nyomjuk meg a Jó kis ház nevű ingatlanhoz tartozó `details` gombot 
- Elvárt kimenet: az ingatlan ID-jéhez tartozó oldal megjelenítése, melyen az ingatlanhoz tartozó részletek találhatók: `Hirdetés típusa*` `Ingatlan típusa*` `Hirdetesed címe*` `Ingatlan ára *` `Méret (m2)*` `Szobák száma*` `Félszobák szama` `Település*` `Megye*` `Ir. szám*` `Utca` `Ingatlan leírás` `Fotó`

## 3. Tesztriportok (TR)

### 3.1. Bejelentkezés funkció tesztriportjai

#### 3.1.1. TR-01 (TC-01)
- TP: TP-01
    1. lépés: `Username` mezőt üresen hagytam
    2. lépés: "teszt"-et beírtam 
    3. lépés: `Log in` gombot megnyomtam egyszer
    4. lépés: helyes eredményt kaptam (Hibaüzenet (sikertelen bejelentkezés))
    

#### 3.1.2. TR-02 (TC-02)

- TP: TP-01
  1. lépés: "teszt"-et beírtam 
  2. lépés: `Password` mezőt üresen hagytam
  3. lépés: `Log in` gombot megnyomtam egyszer
  4. lépés: helyes eredményt kaptam (Hibaüzenet (sikertelen bejelentkezés))

#### 3.1.3. TR-03 (TC-03)

- TP: TP-01
  1. lépés:`Username` mezőt üresen hagytam
  2. lépés:`Password` mezőt üresen hagytam
  3. lépés: `Log in` gombot megnyomtam egyszer
  4. lépés: helyes eredményt kaptam (Hibaüzenet (sikertelen bejelentkezés))

#### 3.1.4. TR-04 (TC-04)

- TP: TP-01
  1. lépés: "admin"-t beírtam
  2. lépés: "admin123"-at beírtam 
  3. lépés: `Log in` gombot megnyomtam egyszer
  4. lépés: helyes eredményt kaptam (megjelentek a jogkörhöz tartozó funkciók: Profile, Admin, Management, Upload your own ad)

#### 3.1.5. TR-05 (TC-05)

- TP: TP-01
  1. lépés: "manager"-t beírtam
  2. lépés: "manager123"-at beírtam 
  3. lépés: `Log in` gombot megnyomtam egyszer
  4. lépés: helyes eredményt kaptam (megjelentek a jogkörhöz tartozó funkciók: Profile, Management, Upload your own ad)

#### 3.1.6. TR-06 (TC-06)

- TP: TP-01
  1. lépés: "dan"-t beírtam
  2. lépés: "dan123"-t beírtam 
  3. lépés: `Log in` gombot megnyomtam egyszer
  4. lépés: helyes eredményt kaptam (megjelentek a jogkörhöz tartozó funkciók: Profile, Upload your own ad)

### 3.2. Kijelentkezés funkció tesztriportjai

#### 3.2.1. TR-01 (TC-01)
- TP: TP-02
    1. lépés: `Logout` gombot megnyomtam egyszer
    2. lépés: helyes eredményt kaptam (Visszairányított a Login felületre és nem voltam bejelentkezve)

### 3.3. Ingatlanhozzáadás  funkció tesztriportjai

#### 3.3.1. TR-01 (TC-01)

- TP: TP-03
  1. lépés: Megnyitottam az alkalmazást, bejelentkeztem a Log in felületen és elindítottam az ingatlanhozzáadás funkciót az `Upload your own ad` gombot megnyomva
  2. lépés: Halasi kuckó-t beíritam
  3. lépés:  6400 Kiskunhalas, Kossuth utca 18.-t beíritam
  4. lépés:  Viszonylag takaros otthon-t beíritam
  5. lépés: 1999-t beíritam
  6. lépés: Megnyomtam az `Upload` gombot
  7. lépés: helyes eredményt kaptam: megjelent egy újabb sor a Home felületen  `Halasi kuckó` `	6400 Kiskunhalas, Kossuth utca 18.` `details` sorrendben
  
  #### 3.3.2. TR-02 (TC-02)
  
  - TP: TP-03
    1. lépés: Megnyitottam az alkalmazást, bejelentkeztem a Log in felületen és elindítottam az ingatlanhozzáadás funkciót az `Upload your own ad` gombot megnyomva
    2. lépés: Mélykúti lak-ot beírtam
    3. lépés:  `Address` mezőt üresen hagytam
    4. lépés:  Takaros otthon-t beírtam
    5. lépés: 1848-t beírtam
    6. lépés: Megnyomtam az `Upload` gombot
    7. lépés: helytelen végeredményt kaptam: megjelent az újabb sor a Home felületen `address` tartalma pedig üres karakterlánc
  
  #### 3.3.3. TR-03 (TC-03)
  
  - TP: TP-03
    1. lépés: Megnyitottam az alkalmazást, bejelentkeztem a Log in felületen és elindítottam az ingatlanhozzáadás funkciót az `Upload your own ad` gombot megnyomva
    2. lépés: Kiskőrösi kunyhót-ot beírtam
    3. lépés: 6131 Kiskőrös, Zöld utca 7.-t beírtam
    4. lépés:  Jó otthon-t beírtam
    5. lépés: aaa-t nem tudtam beírni: csak számot engedett
    6. lépés: Megnyomtam az `Upload` gombot
    7. lépés: helyes végeredményt adtam: nem fogadott el mást a `Price` mező számon kívül

### 3.4. Regisztráció funkció tesztriportjai

#### 3.4.1. TR-01 (TC-01)

- TP: TP-04
  1. lépés: Megnyitottam az alkalmazást, beléptem a Log in felületre és rákattintottam a `Registration` gombra
  2. lépés: Márton-t beírtam
  3. lépés: Kovács-ot beírtam
  4. lépés: k.marci@gmail.com-ot beírtam
  5. lépés: k.marci@gmail.com-ot beírtam
  6. lépés: alma123-at beírtam
  7. lépés: alma123-at beírtam
  8. lépés: Elfogadtam a felhasználási feltételeket
  9. lépés: Megnyomtam egyszer a `Register` gombot 
  10. lépés: helyes végeredményt kaptam: sikeres volt a regisztráció, a megadott adatokkal be tudtam jelentkezni a Log in felületen

#### 3.4.2. TR-02 (TC-02)

- TP: TP-04
  1. lépés: Megnyitottam az alkalmazást, beléptem a Log in felületre és rákattintottam a `Registration` gombra
  2. lépés: Marcell-t beírtam
  3. lépés: Nagy-ot beírtam
  4. lépés: n.marci@gmail.com-ot beírtam
  5. lépés: n.marci@gmail.com-ot beírtam
  6. lépés: korte123-at beírtam
  7. lépés: korte123-at beírtam
  8. lépés: Nem fogadtam el a felhasználási feltételeket
  9. lépés: Megnyomtam egyszer a `Register` gombot 
  10. lépés: helytelen végeredményt kaptam: sikeres volt a regisztráció, a megadott adatokkal be tudtam jelentkezni a Log in felületen

#### 3.4.3. TR-03 (TC-03)

- TP: TP-04
  1. lépés: Megnyitottam az alkalmazást, beléptem a Log in felületre és rákattintottam a `Registration` gombra
  2. lépés: Gábort-t beírtam
  3. lépés: Nagy-ot beírtam
  4. lépés: `E-mail` mezőt üresen hagytam
  5. lépés:  `Confirm e-mail` mezőt üresen hagytam
  6. lépés: barack123-at beírtam
  7. lépés: barack123-at beírtam
  8. lépés: Elfogadtam a felhasználási feltételeket
  9. lépés: Megnyomtam egyszer a `Register` gombot 
  10. lépés: helytelen végeredményt kaptam: sikeres volt a regisztráció

#### 3.4.4. TR-04 (TC-04)

- TP: TP-04
  1. lépés: Megnyitottam az alkalmazást, beléptem a Log in felületre és rákattintottam a `Registration` gombra
  2. lépés: Gábort-t beírtam
  3. lépés: Kovács-ot beírtam
  4. lépés: k.gabi@gmail.com-ot beírtam
  5. lépés: k.gabi@gmail.com-ot beírtam
  6. lépés:  `Password` mezőt üresen hagytam
  7. lépés: `Confirm password` mezőt üresen hagytam
  8. lépés: Elfogadtam a felhasználási feltételeket
  9. lépés: Megnyomtam egyszer a `Register` gombot 
  10. lépés: helytelen végeredményt kaptam: sikeres volt a regisztráció

### 3.5. Ingatlanhozzáadás újabb beviteli mezőkkel funkció tesztriportjai

#### 3.5.1. TR-01 (TC-01)

- TP: TP-05
  1. lépés: Megnyitottam az alkalmazást, bejelentkeztem a Log in felületen és elindítottam az ingatlanhozzáadás funkciót az `Hirdetés feltöltése` gombot megnyomva
  2. lépés: Eladó-t beírtam
  3. lépés: Lakás-t beírtam
  4. lépés: Jó kis ház-t beírtam
  5. lépés: 750000-t beírtam
  6. lépés: 16-t beírtam
  7. lépés: 4-t beírtam
  8. lépés: 1-t beírtam
  9. lépés: Békéscsaba-t beírtam
  10. lépés: Békés-t beírtam
  11. lépés: 5600-t beírtam
  12. lépés: Orosházi utca 13.-t beírtam
  13. lépés: Ez a legjobb ház-t beírtam
  14. lépés: "bekescsaba1.jpg", "bekescsaba2.jpg", "bekescsaba3.jpg", "bekescsaba4.jpg", "bekescsaba5.jpg", "bekescsaba6.jpg" képeket kiválasztottam
  15. lépés: Megnyomtam az `Upload` gombot
  16. lépés: helyes eredményt kaptam: megjelent egy újabb rekord a My ads felületen  `Jó kis ház` `		Orosházi utca 13.` `details` `update` `remove` sorrendben


#### 3.5.2. TR-02 (TC-02)

- TP: TP-05
  1. lépés: Megnyitottam az alkalmazást, bejelentkeztem a Log in felületen és elindítottam az ingatlanhozzáadás funkciót az `Hirdetés feltöltése` gombot megnyomva
  2. lépés: Eladó-t beírtam
  3. lépés: Lakás-t beírtam
  4. lépés: Hirdetés címét üresen hagytam
  5. lépés: 450000-t beírtam
  6. lépés: 126-t beírtam
  7. lépés: 2-t beírtam
  8. lépés: 1-t beírtam
  9. lépés: Békés-t beírtam
  10. lépés: Békés-t beírtam
  11. lépés: 5600-t beírtam
  12. lépés: Orosházi utca 11.-t beírtam
  13. lépés: Ez a legjobb ház-t beírtam
  14. lépés: "bekescsaba1.jpg", "bekescsaba2.jpg", "bekescsaba3.jpg", "bekescsaba4.jpg", "bekescsaba5.jpg", "bekescsaba6.jpg" képeket kiválasztottam
  15. lépés: Megnyomtam az `Upload` gombot
  16. lépés: helyes eredményt kaptam: hibaüzenetet kaptam a `Hirdetesed címe*` bemenete alatt: `nem lehet üres`

#### 3.5.3. TR-03 (TC-03)

- TP: TP-05
  1. lépés: Megnyitottam az alkalmazást, bejelentkeztem a Log in felületen és elindítottam az ingatlanhozzáadás funkciót az `Hirdetés feltöltése` gombot megnyomva
  2. lépés: Kiadó-t beírtam
  3. lépés: Telek-t beírtam
  4. lépés: Félegyházi csodavilla-t beírtam
  5. lépés: alma-t megpróbáltam beírni
  6. lépés: 191-t beírtam
  7. lépés: 3-t beírtam
  8. lépés: 2-t beírtam
  9. lépés: Kiskunfélegyháza-t beírtam
  10. lépés: Bács-Kiskun-t beírtam
  11. lépés: 6610-t beírtam
  12. lépés: Petőfi utca 33.-t beírtam
  13. lépés: Keresve se találsz jobbat!-t beírtam
  14. lépés: "bekescsaba1.jpg", "bekescsaba2.jpg", "bekescsaba3.jpg", "bekescsaba4.jpg", "bekescsaba5.jpg", "bekescsaba6.jpg" képeket kiválasztottam
  15. lépés: Megnyomtam az `Upload` gombot
  16. lépés: helyes eredményt kaptam: az `Ingatlan ára *` bemeneti mezője nem engedett beírni más karaktert számokon kívül

#### 3.5.4. TR-04 (TC-04)

- TP: TP-05
  1. lépés: Megnyitottam az alkalmazást, bejelentkeztem a Log in felületen és elindítottam az ingatlanhozzáadás funkciót az `Hirdetés feltöltése` gombot megnyomva
  2. lépés: Eladó-t beírtam
  3. lépés: Lakás-t beírtam
  4. lépés: Jó kis ház 2.0-t beírtam
  5. lépés: 850000-t beírtam
  6. lépés: 26-t beírtam
  7. lépés: 4-t beírtam
  8. lépés: 1-t beírtam
  9. lépés: Békéscsaba-t beírtam
  10. lépés: Békés-t beírtam
  11. lépés: 5600-t beírtam
  12. lépés: Orosházi utca 43. -t beírtam
  13. lépés: Ez a legjobb ház a környéken!-t beírtam
  14. lépés: "bekescsaba1.jpg", "bekescsaba2.jpg", "bekescsaba3.jpg" képeket kiválasztottam
  15. lépés: Megnyomtam az `Upload` gombot
  16. lépés: helyes eredményt kaptam: az `Upload` gomb megnyomása után is az ingatlanhozzáadás felületen maradtam, illetve nem jelent meg egy újabb rekord a `My ads` felületen

### 3.6. Hirdetés részleteinek megtekintése funkció tesztriportjai

#### 3.6.1. TR-01 (TC-01)

- TP: TP-06

  1. lépés: Jó kis ház nevű ingatlanhoz tartozó `details` oszlopban lévő gombra egyszer rákattintottam

  2. lépés: helyes eredményt kaptam: új oldalra kerültem, ahol a kiválasztott ingatlan részletei találhatóak.

     


​    