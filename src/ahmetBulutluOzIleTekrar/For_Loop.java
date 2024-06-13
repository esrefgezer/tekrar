package ahmetBulutluOzIleTekrar;

public class For_Loop {
    public static void main(String[] args) {

        // for(int i=1; i<100 ; i++){
        // System.out.println(i+" ");}


        // birden 100'e kadar olan tamsayilari toplayin

        int toplam =0;

        for (int i = 1; i <= 100; i++) {
            toplam +=i;

        }
        System.out.println(toplam+ " tam sayilarin toplamidir");



        //verilen iki sayinin ilkinden baslayip ikinciye kadar
        //3'er 3'er yazdirin(ikinci sayilari saglamiyorsa yazdirilmayabilir)

        int bas =20;
        int bitis=61;

        for (int i = bas; i <=bitis; i+=3) {
            System.out.print(i+" ");

        }
        System.out.println(" ");


        // verilen sayidan baslayarak geriye 1'e dogru

        //3 ile bolunebilen sayilari yazdirin

        int input=100;

        for (int i = 100; i >=1; i--) {

            if (i%3==0){
                System.out.print(i+ " ");

            }

        }



    }
}
