/**
 * Artikel , der die Menge , die Artikelnummer und den Bestand darstellt
 * 
 * @author Basel Saad , Anas Zahra 
 * @version 0.1
 */

public class Artikel
{
    public static final int STD_BESTAND = 0;
    private int artikelNr; 
    private String art ; 
    private int bestandss;
    
    /**
     * Neues Artikel-Object wird erzeugt 
     * 
     * @param artikel : Artikelnummer
     * @param art : Art der Artikel (Z.B Handy , Laptop)
     * @param bestand : wie viele sind Verfügbar
     */
    public Artikel (int artikel,String art,int bestand){
        
        if (art == null || art.equals("null")){
            throw new IllegalArgumentException ("Sie duerfen kein null hinzufuegen");
        }
        
        if (artikel <= 0 ){
            throw new IllegalArgumentException ("Die Artikelnummer muss groesser als null sein und nur aus positiven Zahlen bestehen");
        }
        this.artikelNr = artikel ;
        this.art = art;
        this.bestand = bestand;
    }
    
     /**
     * Neues Artikel-Object wird erzeugt
     * @param artikel : Artikelnummer
     * @param art : Art der Artikel (Z.B Handy , Laptop)
     */
    public Artikel (int artikelnr , String art ){
        this(artikelnr,art,STD_BESTAND);
    }
    
    
    /**
     * erhoeht den Bestand um eine bestimmte Menge
     * @param menge , um wie viel erhoeht werden soll
     */
    public void bucheZugang (int menge){
        if (menge > 0) {
            bestand += menge;
        }else{
            throw new IllegalArgumentException ("Sie können keine negative Zahlen oder null hinzufuegen");
        }
        
    }
    
    /**
     * vermindert den Bestand um eine bestimmte Menge
     * @param menge um wie viel vermindert werden soll
     */
    
    public void bucheAbgang (int menge){
        if (menge <= 0 ){
            throw new IllegalArgumentException ("Sie können keine negative Zahlen oder null eingeben!");
        }
        else if (bestand >= menge){
            bestand -= menge;
        }else {
            throw new IllegalArgumentException ("Menge "+menge+" ist groeßer als bestand: "+this.bestand);
        }
        
    }
    
    /**
     * Set Neuen String fuer art 
     * @param art Neuer Art
     */
    public void setArt (String art){
        if (art.strip().isEmpty()){
            System.out.println ("Sie duerfen Keine Leerzeichen eingeben!");
        }else{
             this.art = art.strip();
        }
       
    }
    
    /**
     * Neue Artikelnummer
     * @param nr , Neue Artikelnummer
     */
    public void setArtikelNr(int nr){
        if (nr <= 0 ){
            System.out.println ("\nSie koennen keine Negative Zahlen oder null hinzufuegen!");
        }else{
            this.artikelNr = nr; 
        }
         
    }
    
    /**
     * Bestand wird gezeigt
     */
    public int getBestand(){
        return this.bestand;
    }
    
    /**
     * Artikelnummer wird gezeigt
     */
    public int getArtikelNr (){
        return this.artikelNr;
    }
    
    /**
     * Artikelart wird gezeigt
     */
    public String getArt (){
        return this.art;
    }
    
    /**
     * Bereitet ein Artikel-Objekt als eine Zeichenkette auf
     */
    public String toString(){
        return "Artikel: "+artikelNr+",Art: "+art+", Bestand: "+bestand; 
    }
    


    
}
