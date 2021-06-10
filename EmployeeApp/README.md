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
#### Attribútumok: Long id, String name, Localdate birthday, Division division, int salary
#### Konstruktor:
 - minden adattal
 - name, birthday, division, salary
#### Getterek, setterek
#### toString: Olvashatóan formázott kiíratásra az azonosítón kívül minden adattal (tervezés alatt)
#### equals, hashcode: 2 alkalmazott megegyezik, ha az id-je megegyezik, kivéve ha az id értéke null (adatbázisba mentés után kap id-t)
#### egyéb lekérdező metódusok (pl. életkor, fizetésemelés, bónusz stb. - tervezés alatt)
