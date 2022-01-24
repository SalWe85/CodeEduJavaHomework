package imdb;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Film> imdb = new ArrayList<>();

        if (movies(imdb)) {
            printArray(imdb);
            printYear(imdb);
            printGenre(imdb);
        }
    }

    //metoda za stampanje svega
    public static void print(String x) {
        System.out.println(x);
    }

    //metoda za stampanje niza
    public static void printArray(ArrayList<Film> imdb) {
        for (int i = 0; i < imdb.size(); i++) {
            print("Naziv filma je: " + yellow + imdb.get(i).getNaziv() + reset + ", zanr je: " + yellow + imdb.get(i).getZanr() + reset + ", snimljen godine: " + yellow + imdb.get(i).getGodina() + reset);
        }
    }

    //metoda za unos filmova
    public static boolean movies (ArrayList<Film> imdb) {

        Scanner scan = new Scanner(System.in);

        print("\nDa li zelite da dodate novi film (" + green + "da" + reset + "/" + red + "ne" + reset + ")?" + "\nOtkucajte " + red + "\"x\"" + reset + " za izlazak iz programa!");
        String answer = scan.next();
        boolean f;
        if (answer.equals("da")) {
            String name, genre;
            int year;
            print("Unesite " + blue + "naziv " + reset + "filma:");
            name = scan.next();
            print("unesite " + blue + "žanr " + reset + "filma:");
            genre = scan.next();
            print("Unesite " + blue + "godinu " + reset + "filma:");
            year = scan.nextInt();
            Film movie = new Film(name, genre, year);
            imdb.add(movie);
            movies(imdb);
            return f = true;
        }else if (answer.equals("ne")){
            print("-----------------------------------");
            return f = true;
        }else if (answer.equals("x")){
            print(red + "Ugasili ste program!" + reset);
            return f = false;
        }else {
            print("Molim Vas potvrdite sa " + green + "\"da\"" + reset + " ili otkažite sa " + red + "\"ne\"!" + reset + "\n-----------------------------------");
            movies(imdb);
            return f= true;
        }
    }

    //metoda za stampanje po godini
    public static void printYear(ArrayList<Film> imdb) {
            Scanner scan = new Scanner(System.in);
            print("\n-----------------------------------");
            print("Da li želite da pretražujete filmove po " + blue + "GODINI" + reset + "? (" + green + "da" + reset + "/" + red + "ne" + reset + ")!");
            String daNe = scan.next();

            if (daNe.equals("da")) {
            print(blue + "Unesite željenu godinu: " + reset);
            int godina = scan.nextInt();
            boolean match = false;
            for (int i = 0; i < imdb.size(); i++) {
                if (imdb.get(i).getGodina() == godina) {
                    print("Naziv filma je: " + yellow + imdb.get(i).getNaziv() + reset + ", zanr je: " + yellow + imdb.get(i).getZanr() + reset + ", snimljen godine: "
                            + yellow + imdb.get(i).getGodina() + reset);
                    match = true;
                }
            }
            if (match != true) {
                print(red + "Nije pronadjena tražena godina." + reset);
                printYear(imdb);
            }
            }else if (daNe.equals("ne"))
                 {
                   return;
            }else {
                print("Molim Vas potvrdite sa " + green + "\"da\"" + reset + " ili otkazite sa " + red + "\"ne\"" + reset);
                printYear(imdb);
            }

    }

    //metoda za stampanje po zanru
    public static void printGenre(ArrayList<Film> imdb) {
        Scanner scan = new Scanner(System.in);
            print("\n-----------------------------------");
            print("Da li želite da pretražujete filmove po " + blue + "ŽANRU" + reset + "? (" + green + "da" + reset + "/" + red + "ne" + reset + ")!");
            String daNe = scan.next();

        if (daNe.equals("da")) {
            print(blue + "Unesite željeni žanr: " + reset);
            String zanr = scan.next();
            boolean match = false;
            for (int i = 0; i < imdb.size(); i++) {
                if (imdb.get(i).getZanr().equals(zanr)) {
                    print("Naziv filma je: " + yellow + imdb.get(i).getNaziv() + reset + ", zanr je: " + yellow + imdb.get(i).getZanr() + reset+ ", snimljen godine: "
                          + yellow + imdb.get(i).getGodina() + reset);
                    match = true;
                }
            }
            if (match != true) {
                print(red + "Ne postoji film sa željenim žanrom." + reset);
                printGenre(imdb);
            }
            print("-----------------------------------");
            print(blue + "Program je zavrsen, hvala na učešću." + reset + "\nAutor = " + yellow + "SalWe {HTML => prrogramer}" + reset);
            }else if (daNe.equals("ne")){
                    print(blue + "Program je zavrsen, hvala na učešću." + reset + "\nAutor = " + yellow + "SalWe {HTML => prrogramer}" + reset);
                    return;
            }else {
            print("Molim Vas potvrdite sa " + green + "\"da\"" + reset + " ili otkazite sa " + red + "\"ne\"!" + reset);
                    printGenre(imdb);
                }

            }
        public static final String reset = "\u001B[0m";
        public static final String blue = "\u001B[34m";
        public static final String red = "\u001B[31m";
        public static final String green = "\u001B[32m";
        public static final String yellow = "\u001B[33m";

        }



