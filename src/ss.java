import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Andra on 16.03.2016.
 */
public class ss {

    public static double suurus;                                                                                        //staatilised muutujad
    public static String ühik;
    public static String eesliide1;
    public static double väärtus;
    public static String eesliide2;


    public ss(double suurus, String ühik, String eesliide1, double väärtus,String eesliide2) {                          //konstruktor, et klassile ss omastada muutujad
        ss.suurus = suurus;
        ss.ühik = ühik;
        ss.eesliide1 = eesliide1;
        ss.väärtus = väärtus;
        ss.eesliide2 = eesliide2;
    }

    public static double getSuurus() {                                                                                   //getter
        return suurus;
    }

    //public static String getÜhik() {                                                                                   //pole vaja
    //    return ühik;
    //}

    public static String getEesliide1() {
        return eesliide1;
    }
    public static double getVäärtus(){
        return väärtus;
    }
    //public  static String getEesliide2(){                                                                             //pole vaja
    //    return eesliide2;
    //}

    public static double setVäärtus(double väärtus) {                                                                   //setter, pole kindel selle vajlikkuses
        ss.väärtus = väärtus;
        return väärtus;
    }



    /*void ekraanile() {                                                                                                //kontrolliks, kas töötab
        System.out.println("Sisestasid suuruseks " + suurus);
        System.out.println("Sisestasid ühikuks " + ühik);
        System.out.println("Sisestasid eesliite " + eesliide1);
        System.out.println("prindin hetkel eesliite väärtuse: " );
        System.out.println("prindin teise eesliite " + eesliide2);
    }*/


    public static void main(String[] args) {                                                                            //peameetod
        Scanner scan = new Scanner(System.in);                                                                          //skännib numbrit
        Scanner scan1 = new Scanner(System.in);                                                                         //skännib ühikut
        Scanner scan2 = new Scanner(System.in);                                                                         //skännib eesliidet, kui see on olemas
        Scanner scan3 = new Scanner(System.in);                                                                         //skännib seda, kuhu teisendatakse

        try {                                                                                                           //kontrollib, et sisend oleks ikka int
            System.out.println("Sisesta number: ");
            suurus = scan.nextDouble();
        } catch (InputMismatchException exception) {

            System.out.println("See ei ole number");
        }


        try {
            System.out.println("Sisesta ühik(default ühik meeter, sellel hetkel tähtsust pole): ");                     //kontrollib, kas ühik on String
            ss.ühik = scan1.nextLine();
        } catch (NumberFormatException ex) {                                                                            //see on prktiliselt mõttetu siin
            System.out.println("See ei ole ühik!");                                                                     //aga see võiks ikkagi kontrollida, kas on String
        }

        try {
            //System.out.println(java.util.Arrays.asList(Eesliited.Eesliiteid.values()));
            System.out.println("Kirjuta ühiku eesliide: GIGA, MEGA, KILO, SENTI, MILLI, NANO, PIKO"+"\n"+"Kui see puudub, sisesta NULL(sõnadega paluks) ");
            eesliide1 = scan2.next();
        } catch (NumberFormatException ex) {
            System.out.println("See ei ole eesliide!");
        }

        try {
            System.out.println("Kirjuta, mis eesliiteks tahad teisendada: GIGA, MEGA, KILO, SENTI, MILLI, NANO, PIKO. "+"\n"+ "Kui ei soovi eesliidet lisada, sisesta NULL ");
            eesliide2 = scan3.next();
        }
        catch(NumberFormatException exc) {
            System.out.println("See ei ole eesliide!");
        }



        //ss s = new ss(suurus, ühik, eesliide1, väärtus, eesliide2);                                                   //kontrollimiseks, kas töötab
        //s.ekraanile();

        Eesliited v1 = new Eesliited(Eesliited.nimi);
            v1.prindi();

    }


}

