/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rep;

/**
 *
 * @author riste
 */
public class faltMedObjekt {

    public static void main(String[] args) {

        Bil[] bilar = new Bil[3];
        
        for (int i = 0; i < bilar.length; i++) {
            bilar[i] = new Bil();
        }

        bilar[0].Ägare.fornamn = "Olle";
        bilar[0].Ägare.efternamn = "Ristenstrand";
        bilar[0].Ägare.föddÅr = 1998;
        bilar[0].Ägare.stad = "Linköping";
        bilar[0].regNrText = "ABC";
        bilar[0].regNr = 123;
        bilar[0].fab = "Ford";
        bilar[0].arsModell = 2002;
        bilar[0].motorEffekt = 150;
        bilar[0].tjansteVikt = 2000;

        bilar[1].Ägare.fornamn = "Danne";
        bilar[1].Ägare.efternamn = "Persson";
        bilar[1].Ägare.föddÅr = 1998;
        bilar[1].Ägare.stad = "Visby";
        bilar[1].regNrText = "OCB";
        bilar[1].regNr = 112;
        bilar[1].fab = "Kia";
        bilar[1].arsModell = 2012;
        bilar[1].motorEffekt = 200;
        bilar[1].tjansteVikt = 2500;

        bilar[2].Ägare.fornamn = "Jasper";
        bilar[2].Ägare.efternamn = "Hilleborg";
        bilar[2].Ägare.föddÅr = 1998;
        bilar[2].Ägare.stad = "Linköping";
        bilar[2].regNrText = "KUK";
        bilar[2].regNr = 732;
        bilar[2].fab = "BMW";
        bilar[2].arsModell = 2007;
        bilar[2].motorEffekt = 175;
        bilar[2].tjansteVikt = 2300;
        
        
        for (int i = 0; i < bilar.length; i++) {
            System.out.print("Ägare: " + bilar[i].Ägare.fornamn + " " + bilar[i].Ägare.efternamn + "\nFödd år " + bilar[i].Ägare.föddÅr + ", från " + 
            bilar[i].Ägare.stad + "\n" + bilar[i].fab + ": " + bilar[i].regNrText + " " + bilar[i].regNr + " Årsmodell: "  + bilar[i].arsModell + " Effekt: " + 
            bilar[i].motorEffekt + "hk" + " Tjänstevikt: " +  bilar[i].tjansteVikt +"kg" + "\n\n");
            
        }

    }
}
