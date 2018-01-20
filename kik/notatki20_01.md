I teraz będę notować

 tablica:

 `int [100] cosie;`

 typ [ile] nazwa
 element pierwszy ma nr 0

 ```
 cosie[6]=2;
 cosie[7]=15;
 cosie[100]= kaboooom!;
 ```

 każda tablica jest obiektem, a ponieważ jest to obiekt to się go tworzy przez new


Program się urochamia najpierw inicjując klasy,
a następnie instrukcja po instrukcji

== operator 'jest równe'
!= 'nie jest równe'
 \> 'większy'
 < 'mniejszy'
 \>= 'wiekszy równy'
and
or
not

np.` if  ((x==7) and (y==8)){ z= 500}`

## **switch case**
```
switch (a) {
case 0:
zrób takoś
//fall through
case 1:
cos;
cos2;
cos3;
break;

case 7:
innos;
innos;
innos;
break;

case 9:
cos innego;
cos inszego;
break;

default:
o tak zrob domyslnie;
]
```
 pod a moze byc  int long string
 case is of the same type as switch a

 czasem case jest lepszy od if, jeśli mamy te samą zmienną,
 a if gdy mamy inne zmienne if is preferable

## **operator trójargumentowy**
 ```
b= a==3? 5:19;
    if (a==3){
    b=5;
    }
    else{
    b=19
    }
   ```

b równe gdy a to trzy, hm?
5  a jak nie to 19

prosty ternary jest prosty
ale ternary z ternary w środku nawet dla mnie jest skomplikowany
 O_O.

## **pętla for**
```
for (int i=0; i<10;++i){
System.out.println(i);
}
```
weź se i and increment it until you get to 10, then print i
returns 9 as final i

można też:
` int i
for (i=0; i<10;++1)`
dla i  gdy i mniejsze niż 10 inkrementuj

```
int[] cosie = new int[10];
for (int c:cosie){
System.out.println(c);
}
```
ta petla przeleci się po wsztstkich elementach tablicy

robienie pętli w pętli nie jest grzechem.

## **iterator** - wskazuje na miejsce w tabeli

```
int i=0;
while (i<10){
++i;
}
```
```
int i=1000;
do{
}
while (i<10);
```
to się wykona raz, bo warunek wyjścia z pętli jest poza pętlą
na wyjściu jest 1001
```
for (int  i=0;i<10, ++i){
if(i==5){
break;
}
System.out.printline(i);
}
```
```while (true) {
if (eof()){break;}
}
```
for (){
 if (i==3){
continue;
}
System.out.printline(I)
}

continue nie wydrukuje 3 i pójdzie dalej

# **Praca domowa**
 S Single responsibility
 O
 L
 I
 D

  klasa może miec 6-8 metod, no naście z getterami/setterami
  klasa nie może być za tłusta.
Taka klasa, która ma 400 metod to tzw. "klasa boska", wszystko można.

 Prefer composition over inheritance

 zatem w konstrukutorze przekazujemy mu aspekty
 Man (Person Person, Student Student, Employee Employee, Instructor Instructor)

 P= new Person (Ada, Banaszczyk);
 S =  new Student (Faculty, year,...);
 E =  null;
 I =  null;
  Man (P, S, Null, Null)

```
Class Man
  Person person;
  Man (Person person, ...)
  Get Person(){
  return Person}
  ```
  ```
  GetName(){
  return Person.getName()
  }
  ```
  to jest delegacja

# Interface
```

public interface IPerson {
        abstract String GetName ();
        abstract Long GetPesel();
        abstract void SetName(String s);
        abstract void SetPesel(Long p);
```

IPeson y = new Person (Ada, Banaszczyk, ...)
Y.GetPesel()

@override- lubimy jak nam inteliJ podpowiada to brać!

String s,s1
if (s==s1)
 **tak nie robimy**

s= ala
s1=ala
ale to mogą być dwa obiekty na heapie, a operator == porównuje referencje,
dlatego wszystko, co ma w sobie klasę, czyli nie int (mały) porównujemy metodami, czyli np. equals
s1.equals(s2)

ijou desu!
# 14.01.2017

```
class Car {
private Wheel wheel;
public car (...., Wheel wheel,
this.Wheel= wheel;
}
wheel Wheel = new wheel ( )
car Car = new car  (...., wheel)
```

KOntrolę nad komponentami ma mieć program głowny, a nie obiekt,
czyli ja mam wiedzieć jak zrobić samochód, a nie sam samochód.

Inversion of control
dependency inversion principle

# wzroce projektowe
Wymagania wobec progamów:
* wymagania funkcjonalne
* wymagania niefunkcjonalne (fast, stable, Uex secure)
 (z grupy "ability" "-ość")
 Architekture first and code second


Zaczynamy od wymagań niefunkcjonalnych, bo zmiana  założeń w  ramach wymagań
niefunkcjonalnych powoduje zmianę całego kodu.

np. niech się da po sieci (niefunckjonalne- jak coś zrobić a nie co zrobić)

Przykładowo zasady SOLID są wzorcem projektowym.

Założenia bywają sprzeczne, UWAGA!
antywzorce:
* SINGLETON
* SERVICE LOCATOR

Gang of four (GOF) - elementarz " **design patterns**
 wzorce
 kreacjonistyczne
 strukturalne
 behavioralne

dobre praktyki:
funkcja nie powinna mieć więcej niż 3/4 argumentów

Testowalność- wiele argumentów
w przypadku kompozycji, należy obiekt komponować z mniejszych obiektów,
czyli samochód z podwozia, karoserii silnika.

# Unit testy - testy jednostkowe
testowanie pojedynczych klas czy też metod.

*Dobra praktyka*
jednocześnie z pisaniem dorobić do niego proste nudne testy jednostkowe

w każdym tescie robimy nowy obiekt
80% to rozsądne minimum
każda linika musi być przetestowana.

#Mockowanie
zastępowanie długich przetestowanych już funkcji
wtedy test funkcji f2 która operuje na f1- **test funkcjonalny**
Wincej później.

## wzorce projektowe ** design pattern**
** builder  pattern**

``` person P3 = new Person ()
.setFirstName("ja")
.setPesel(123)
.setSurName("jakaś");
```
ale najpierw trzeba zrobić pusty kostruktor
` public Person () {} `
a następnie metode get person
```
 public static Person getPerson(){
        Person p = new Person();
        return p;

    }
```
 ta klasa ma być statyczna, bo nie operuje na danych Person

BUILDER
```
FatMan p =  getFatMan()
. GetPerson()
.setFirstName()
.setPesel()
.setSurName()
.and()
.getStudent()
.setFaculty()
.setIndex()
.and
```

wymaganie niefunkcjonalne:
* trzeba wieloosobowo
* klasa, która pokazuje na boku wynikn chwilowy (obserwator)
ułady wzorców też mają swoje nazwy i są skatalogowane (architektura gwiazda, mash)
a tutaj: MVC (Model View Controler) wariant aktywny i pasywny
**mamy trzy role:**  gracz- kontroler (wydaje polecenia)
dane- model
obserwator- view;
* jak najmniej relacji między obiektami (ergo mniej testów)
    * kontroler wpływa tylko na model
    * view pyta co w środku siedzi,
    * a model przy zmianie informuje widok.
* oddzielamy trzymanie danych od ich używania.

Trzy klasy:
Model- dane;
controler - metody;
view - metody;

enum XO {
yes, no, empty}

Zaprogramować API!

 class Model
  XO [][] Board
 final int Dim = 3;
 public enum winner XO
 public enum XO{
                       YES, NO, EMPTY;
                       }
 boolean is empty (x,y);
 void setBoard(x,y, XO); if (XO = empty);
 XO [][] getBoard();
 boolean aiWin ();
 boolean manWin ();
 boolean draw ();
 void reset();
 boolean isPlaying();
xo won ();
void changed ();

 #kompozyt vs. dziedziczenie
 has-a : kompozyt
 is-a : dziedziczenie

 czyli kontroler bedzie w dwóch wersjach: człowiek i AI
  klasa może być abstract

 ```
 abstract class Controler{
 void make_ruch (),
 ]
 ```
 **klasa abstrakcyjna** - można dziedziczyć po jednej a implementować wiele interfaceów

class Controller : Class Ai (AI agile, Ai dummy), Man

controller tylko wklikuje.
**View**
model może pytać, ale jedyne co musi mieć
```
void print();
void event();
```

## notyfikacja
robimy setterami - na końcu setBoard odpalamy metodę event, ktora ma print.

najpierw widok,
potem model
referencja do widoku w konstryktorze modelu.
Misa skończyła.

##19_01_2018

enum jest klasą.
Enum jest  singletonem, dlatego nie można mu zrobić settera.
Można mu nadać parametry
możne mieć klasy w sobie

XOXO xoxo = XOXO.TIC;

//TODO znaczy to do=]

## do Javy podstawowej
adnotacje mają @ na początku

misa think:
 Long czy long?
 Integer czy int?
 Float czy float?
 do każdego typu generycznego dorobiono typ obiektowy

```
class Long {
private final value long;
public getLong();
}
```

każda klasa reprezentująca klasy generyczne ma w sobie private final value.

`Long l = new Long (123L);
L=17;`
boxing
`long a = l
a = l.getValue();`
unboxing

w pętli zawsze małe int'y
typy w klasach moga miec null,
czyli możemy mieć dużego Integera który ma null,
lepiej
Boolean może mieć trzy wartości null albo nie null, a jak nie null t/f

```
long a1;
long a2;
if( a1==a2);
```
ale
```
Long a1;
Long a2;
if (a1!=null and a1.equals(a2));
```
== to odniesienie do referencji i moze sie okazać, ze 1500 nie jest równe 1500

każdy duży Integer extends: Object
implements: iNumber ( interfejs)

dlatgo dzidziczy wszstkie metody związnae z obiektem
 każdy obiekt każdej klasy ma metode to.String
Object ma metodę equals,

equals należy override'ować, bo np kiedy dwie tablice są takie same?
 wyróznia się dwa rodzaje porównań:
 deep and shallow
 deep- wszystkie atrybuty, shallow- tyko kilka atrybutów.

 ```
   public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Person person = (Person) o;
         return pesel == person.pesel &&
                 Objects.equals(firstName, person.firstName) &&
                 Objects.equals(surName, person.surName);
     }
```

jeśli wskazujemy na tę samą referencję, to nie ma takiej opcji, żeby było różne

Ada z przyczłapami.
Ada to człowiek ale Ada ma jeszcze przyczłapy.

funkcje hashujace - liczą jakąś liczbę dla pliku, którą następnie porównuja.
np nadajemy liczby literkom przesówamy, mnożymy (najlepiej przez liczbę pierwszą większą niż nasze liczby)
jesli hashe są takie same to na pewno są tożsame.

notyfikacje będa nam potrzebne przy MVC- View - są wbydowane w obiekt

pewne clasy mają atrybuty o właściwości final - takie sa IMMUTABLE.
i jak chcemy zmienić PESEL, to tworzymy nowy obiekt o tych samych atrybutach poza PESELem

refleksja pozawala zajrzeć do pola final i wybuchnie.
kompilator nie ustrzeże was od strzelenia sobie w stope.

#Wyjątki
obsługa wyjatków w Javie jest kosztowna pamięcią i czasem
ale tam gdzie trzeba to trzeba
 jak dane przeczą wszstkiemu co jesteście w stanie

 należy wyrzucić wyjątek i pozuciś przetwarzanie
 wyjątki są w ramach toku przetwarzania
```
 if (PESEL = null){
 throw  new()
 }
 ```
```
try {

 x.setPesel (-19);

 catch ()
 }
 ```
```
fun f1

...
 ...
 throw (new Exc1())
 }
 fun f2{
 f1 ()
 {
 catch (Exc2()){
 }
 catch (Exc3()){
 }
 }
  fun f3
  f2 ()
  catch(Exc1()){
  }
  ```

 wyjatki żeby zostały wyłapane muszą być w bloku try/catch

 exc11 extends exc1
try
thow Exc 11
catch Exc1
[pułapki na tatusiów też działają]

wyjątki należy pisać pasujące do nieszczęścia

```
Exception {
Exception  (String)
}
throw (new Exception ("dupa");

try
catch (Exception e ){
System.out.printLine (e. getMessage())
throw e;
}
```
 deklaracja throws obowiązuje tylko dla exceptionsów, a
 runtime error'sy nie muszą się deklarować
