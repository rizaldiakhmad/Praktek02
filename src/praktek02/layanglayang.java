package praktek02;
public class layanglayang {
 double diameter1;
 double diameter2;

    public layanglayang() {
        diameter1=10;
        diameter2=2;
    }

    public layanglayang(double diameter1, double diameter2) {
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;
    }
 
 void cetakinfo(){
     System.out.println("------------------------");
     System.out.println("diameter1 : "+diameter1);
     System.out.println("diameter2 : "+diameter2);
     System.out.println("------------------------");
     
     
 }
 double hitungluas(){
 double luas;
 luas=(diameter1*diameter2)/2;
 return luas;
 }
 void cetakluas(){
     System.out.println("Luas Layang-Layang adalah :"+hitungluas());
 }
}
