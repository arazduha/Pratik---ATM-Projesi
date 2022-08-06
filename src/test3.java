import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, passwd;
        int balance = 2000;
        int right = 3;
        int select;
        int price;
        while(right > 0){
            System.out.print("Adinizi Giriniz: ");
            userName = input.nextLine();

            System.out.print("Parolanizi Giriniz: ");
            passwd = input.nextLine();

            if (userName.equals("patika") && passwd.equals("dev")){
                System.out.println("Merhaba, Patika.dev Bank'a Hosgeldiniz.");
                do {
                    System.out.println(" 1- Para Yatir \n 2- Para Cek \n 3- Bakiye Sorgula \n 4- Cikis");
                    System.out.print("Lutfen islem seciniz: ");
                    select = input.nextInt();
                    switch (select){
                        case 1 :
                            if (select==1){
                                System.out.print("Yatirilacak para miktari giriniz: ");
                                price = input.nextInt();
                                if (select > 0){
                                    balance +=price;
                                    System.out.println("Bakiyeniz: "+balance);
                                    System.out.println(" ");
                                }else {
                                    System.out.println("Gecersiz girdi!");
                                    System.out.println(" ");
                                }
                            }
                            break;
                        case 2:
                            if (select==2){
                                System.out.print("Cekilecek para miktarini giriniz: ");
                                price = input.nextInt();
                                if (price<balance){
                                    balance-=price;
                                    System.out.println("Bakiyeniz: "+balance);
                                    System.out.println(" ");
                                }else{
                                    System.out.println("Yetersiz bakiye!");
                                    System.out.println(" ");
                                }
                            }
                            break;
                        case 3:
                            if (select==3){
                                System.out.println("Bakiyeniz: " + balance);
                                System.out.println(" ");
                            }
                            break;
                        default:
                    }
                } while (select!=4);
                System.out.println("Tekrar gorusmek uzere... :)");
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya parola girdiniz. Tekrar deneyiniz.");
                System.out.println("Kalan hakkiniz: " + right);
                if (right==0){
                    System.out.println("Hesabiniz bloke olmustur. Lutfen banka ile iletisime geciniz.");
                }
            }
        }


    }

}





