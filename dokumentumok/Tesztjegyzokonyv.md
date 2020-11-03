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
    1. lépés: Az `Email` szövegbeviteli mezőbe írjuk be az `email` karakterláncot
    2. lépés: A `Password` szövegbeviteli mezőbe írjuk be az `password` karakterláncot
    3. lépés: Az `Address` szövegbeviteli mezőbe írjuk be az `address` karakterláncot
    4. lépés: Az `Address2` szövegbeviteli mezőbe írjuk be az `address2` karakterláncot
    5. lépés: A `City` szövegbeviteli mezőbe írjuk be az `city` karakterláncot
    6. lépés: A `State` legördülő menüben válasszuk ki a `state` karakterláncot
    7. lépés: A `Zip` szövegbeviteli mezőbe írjuk be az `zip` karakterláncot
    8. lépés: Nyomjuk meg az `Sign in` gombot 
    9. lépés: Ellenőrizzük az eredményt. Elvárt eredmény: Egy újabb sor a Home felületen: `email` `address` `details`

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
- Elvárt kimenet: az eredmény mező tartalma: `NUMBER3` = 3

#### 2.1.5. TC-05
- TP: TP-01
- Leírás: bejelentkezés funkció tesztelése "manager" jogkörű felhasználó számára
- Bemenet: `Username` = manager ; `Password` = manager123 
- Művelet: nyomjuk meg az `Log in` gombot 
- Elvárt kimenet: az eredmény mező tartalma: `NUMBER3`= HIBA (`NUMBER1` értéke nem szám)

#### 2.1.6. TC-06

- TP: TP-01
- Leírás: bejelentkezés funkció tesztelése "user" jogkörű felhasználó számára
- Bemenet: `Username` = dan ; `Password` = dan123  
- Művelet: nyomjuk meg az `Log in` gombot 
- Elvárt kimenet: az eredmény mező tartalma: `NUMBER3`= HIBA (`NUMBER1` értéke nem szám)

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
- Leírás: négyzetre emelés funkció tesztelése
- Bemenet: `NUMBER1` = 2 
- Művelet: nyomjuk meg az `NEGYZETREEMEL` gombot 
- Elvárt kimenet: az eredmény mező tartalma: `NUMBER2` = 4

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
  1. lépés: `Logout` gombot megnyomtam egyszer
  2. lépés: helyes eredményt kaptam (Visszairányított a Login oldalra és nem voltam bejelentkezve)


​    