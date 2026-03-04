/**
 * doel: klas maken met student gegevens
 * @author Hakan Bektas
 */

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wat is de naam van je klas?");
        String klasNaam = input.nextLine();

        // klas aanmaken met de klasnaam
        Klas klas = new Klas(klasNaam);

        for (int i = 0; i < klas.MAX_AANTAL_STUDENTEN; i++) {
            System.out.print("Studentnummer: ");
            int studetnNummer = input.nextInt();

            // als studentnummer 0 is stop de loop.
            if (studetnNummer == 0) {
                break;
            }

            System.out.print("Voornaam: ");
            String voornaam = input.next();

            //bug voorkomen
            input.nextLine();


            System.out.print("Achternaam: ");
            String achternaam = input.nextLine();

            System.out.print("Geboortedatum: ");
            String geboortedatum = input.nextLine();
            // Scheid de ingevoerde geboortedatum en stop het in een array
            String[] onderdelen = geboortedatum.split("-");

            System.out.print("Straat: ");
            String straat = input.next();

            System.out.print("Huisnummer: ");
            int huisnummer = input.nextInt();

            input.nextLine();

            // net zo lang postocde vragen tot de juiste is ingevuld.
            String postcode;
            do {
                System.out.println("Postcode: ");
                 postcode = input.nextLine();
            } while (!Adres.isGeldigePostcode(postcode));

            System.out.print("Plaats: ");
            String plaats = input.nextLine();

            //cjdsjklczxjkkjdls
            Adres adres = new Adres(straat, huisnummer, postcode, plaats);
            Student student = new Student(studetnNummer, voornaam, achternaam,
                    LocalDate.of(Integer.parseInt(onderdelen[2]), Integer.parseInt(onderdelen[1]),
                    Integer.parseInt(onderdelen[0])), adres);

            // voeg student toe in de klas
            klas.voegStudentToe(student);
        }
        System.out.println();
        System.out.println(klas.toString());

//        Adres adres = new Adres("Wibautstraat", 2,"1091GM","Amsterdam");
//        Student student = new Student(500905423,"Hakan","Bektas",
//                LocalDate.parse("2005-08-08"),adres);
//
//        Adres adres2 = new Adres("Wibautstraat", 4,"1091GM","Amsterdam");
//        Student student2 = new Student(500905423,"Oguzhan","Bektas",
//                LocalDate.parse("2001-08-08"),adres2);
//
//
////        System.out.print(student.toString());
//
//        Klas klas = new Klas("IS106");
//        klas.voegStudentToe(student);
//        klas.voegStudentToe(student2);
//        System.out.println(klas.toString());

    }
}