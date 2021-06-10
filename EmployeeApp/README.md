# EmployeeApp (*Tervezet*)
### 3-rétegű alkalmazás alkalmazottak nyilvántartására, statisztika készítésére

## Controller réteg
#### Feladata: felhasználói felület
  - alkalmazott rögzítése
  - alkalmazottak listázása (összes vagy néhány, adott feltételek alapján)

## Repository réteg
#### Feladata: adatok tárolása (memória/adatbázis)
  - listában
  - adatbázisban

interfész használatával

## Service réteg
#### Feladata: kapcsolat a Controller és Repository réteg között
  - rögzítés (egy vagy több egyszerre -> varargs)
  - legidősebb lekérése
  - legfiatalabb lekérése
  - adott fizetés fölöttiek lekérése
  - adott fizetés alattiak lekérése
  - Map készítés divízió (cégen belüli osztály, pl. programmer, tester, sales, marketing) szerinti csoportosításban, fizetési nagyság szerint csökkenőben
  - stb.

## Employee osztály
#### Attribútumok: Long id, String name, Enum city, Localdate birthday, Division division, int salary
#### Konstruktor:
  - minden adattal
  - name, city, birthday, division, salary
#### Getterek, setterek
#### toString: Olvashatóan formázott kiíratásra az azonosítón kívül minden adattal (tervezés alatt)
#### equals, hashcode: 2 alkalmazott megegyezik, ha az id-je megegyezik, kivéve ha az id értéke null (adatbázisba mentés után kap id-t)
#### egyéb lekérdező metódusok (pl. életkor, fizetésemelés, bónusz stb. - tervezés alatt)

## City (Enum)
#### Városok felsorolása
#### Attribútumai:
  - BigDecimal distance: távolság Budapesttől (a cég székhelye) - lehetőség szerint a double kerülendő a számítási pontatlansága miatt

### Megoldási javaslatok:
  - Lehetőség szerint Optional-t adjunk vissza (null helyett Optional.empty()).
  - Kivételkezelés - ellenőrizni kell a felhasználótól kapott adatokat.
  - Teszteseteknél JUnit5, AssertJ, Mochito használata (amelyikkel a legegyszerűbben, legrövidebben megoldható).
