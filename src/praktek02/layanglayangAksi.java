package praktek02;

public class layanglayangAksi {
    public static void main(String[] args) {
        layanglayang l1 = new layanglayang();
            l1.diameter1 = 20;
            l1.diameter2 = 5;
            
            l1.cetakinfo();
            System.out.println("Luasnya adalah : "+l1.hitungluas());
            l1.cetakluas();
            
            layanglayang l2 = new layanglayang();
            l2.cetakinfo();
            
            layanglayang l3 = new layanglayang(30,15);
            l3.cetakinfo();
    }
}
