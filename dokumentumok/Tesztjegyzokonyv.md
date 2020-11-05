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
- Leírás: ingatlanhozzáadás funkció tesztelése
    0. lépés: Nyissuk meg az alkalmazást, jelentkezzünk be a Log in felületen és indítsuk el az ingatlanhozzáadás funkciót az `Upload your own ad` gombot megnyomva
    1. lépés: Az `Name` szövegbeviteli mezőbe írjuk be az `name` karakterláncot
    3. lépés: Az `Address` szövegbeviteli mezőbe írjuk be az `address` karakterláncot
    4. lépés: Az `Description` szövegbeviteli mezőbe írjuk be az `description` karakterláncot
    7. lépés: A `Price ($)` szövegbeviteli mezőbe írjuk be az `price` számokból álló karakterláncot
    8. lépés: Nyomjuk meg az `Upload` gombot 
    9. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Egy újabb sor a Home felületen: `name` `address` `details`

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

### 3.3. Ingatlanhozzáadás funkció tesztriportjai

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


​    