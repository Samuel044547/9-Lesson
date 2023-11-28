import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 esep
        Scanner in = new Scanner(System.in);
        System.out.println("1-8 аралығынды дәреже таңданыз ");
        int k = in.nextInt();
        if (1<=k && k<=8) {
            switch (k) {
                case 1:
                    System.out.println("номері 6 карта");
                    break;
                case 2:
                    System.out.println("номері 7 карта");
                    break;
                case 3:
                    System.out.println("номері 8 карта");
                    break;
                case 4:
                    System.out.println("номері 9 карта");
                    break;
                case 5:
                    System.out.println("номері  10 карта");
                    break;
                case 6:
                    System.out.println("валет карта");
                    break;
                case 7:
                    System.out.println("Дама карта");
                    break;
                case 8:
                    System.out.println("Туз карта");
                    break;
                default:
                    System.out.println("карта жоқ");
                    break;
            }
        } else {
            System.out.println("дұрыс емес ");
        }
//2 esep
        Scanner tg1= new Scanner(System.in);
        System.out.println("Алма бағасын  енгізініз");
        double alma1=tg1.nextInt();
        Scanner tg2= new Scanner(System.in);
        System.out.println("Кәмпит бағасын енгізініз");
        double kampit1=tg2.nextInt();
        Scanner tg3= new Scanner(System.in);
        System.out.println("Печение бағасын енгізініз");
        double pechenie1=tg3.nextInt();
        // продукт
        Scanner kg1= new Scanner(System.in);
        System.out.println("Алма кг-мын енгізініз");
      double alma=kg1.nextInt();
        Scanner kg2= new Scanner(System.in);
        System.out.println("Кәмпит кг-мын енгізініз");
      double kampit=kg2.nextInt();
        Scanner kg3= new Scanner(System.in);
        System.out.println("Печение кг-мын енгізініз");
      double pechenie=kg3.nextInt();
        double Baga0=(alma*alma1)+(kampit*kampit1)+(pechenie*pechenie1);
        System.out.println("Бағасы"+Baga0+"тг болды");
       // 3 esep
        Scanner k1= new Scanner(System.in);
        System.out.println("Монитор бағасын енгізініз ");
        double monitor=k1.nextInt();
        Scanner k2= new Scanner(System.in);
        System.out.println("Системный блоктың бағасын енгізініз ");
        double procheror=k2.nextInt();
        Scanner k3= new Scanner(System.in);
        System.out.println("клавиатура бағасын енгізініз");
        double klaviatyra=k3.nextInt();
        Scanner k4= new Scanner(System.in);
        System.out.println("Тышқан бағасын енгізініз");
        double mashka=k4.nextInt();
        Scanner in4= new Scanner(System.in);
        System.out.println("компьютер санның енгіз ");
        int san=in4.nextInt();
                double Baga1=(monitor+procheror+klaviatyra+mashka)*san;
                System.out.println("Компьютердің бағасы "+Baga1+"тг болды");
// 4 esep
   Scanner di=new Scanner(System.in);
   System.out.println(" Tana jasa=");
   int Tana=di.nextInt();
   Scanner di2=new Scanner(System.in);
   System.out.println("Miti jasa=");
   int Miti=di2.nextInt();
   int jasorta=(Tana+Miti)/2;
   System.out.println("Мити және Таняның орта жасы= "+jasorta);
   int Mitijas=jasorta-Miti;
   System.out.println("Митидың орта жасынан айырмашылығы="+Mitijas);
   int Tanajas=jasorta-Tana;
   System.out.println("Танның орта жасыныаң айырмашылығы="+Tanajas);
// 5 esep
        int san0=678;
        int san1=san0/100;
        int san2=san0/10%10;
        int san3=san0%10;
        if (san1 >san2 && san1>san3){
          System.out.println("үлкен сан="+san1);
        }else if (san2 >san1 && san2>san3){
            System.out.println("үлкен сан="+san2);
        }else if (san3 >san1 && san3>san2){
        System.out.println("үлкен сан="+san3);
        }else {
                    System.out.println("Есептеуде қате бар");
                }

      if (san1 >san2 && san1>san3){
            System.out.println(" сан кіші="+san1);
      }else if (san2 >san1 && san2>san3){
            System.out.println(" сан кіші="+san2);
      }else if (san3 >san2 && san3>san1){
            System.out.println(" сан кіші="+san3);
            } else {
                System.out.println("Есептеуде қате бар");
            }

        // 6 esep
        Scanner S= new Scanner(System.in);
        System.out.println("Төрт таңбалы сан енгіз");
        int San=S.nextInt();
        int San1=San/1000;
        int San2=San/10%10%10;
        int San3=San/10%10;
        int San4=San%10;
        if (San1 > San2 && San1>San3 && San1>San4){
            System.out.println("үлкен сан="+San1);
        }else if (San2 >San1 && San2>San3 && San2>San4){
            System.out.println("үлкен сан="+San2);
        }else if (San3 >San2 && San3>San1 && San3>San4){
            System.out.println("үлкен сан="+San3);
        }else if (San4 >San1 && San4>San3 && San4>San2){
            System.out.println("үлкен сан="+San4);
        }else {
            System.out.println("Есептеуде қате бар");
        }

        if (San1 < San2 && San1 < San3 && San1 < San4){
            System.out.println("үлкен сан="+San1);
        }else if (San2 < San1 && San2 < San3 && San2 < San4){
            System.out.println("үлкен сан="+San2);
        }else if (San3 < San2 && San3 <San1 && San3 < San4){
            System.out.println("үлкен сан="+San3);
        }else if (San4 < San1 && San4 < San3 && San4 < San2){
            System.out.println("үлкен сан="+San4);
        }else {
            System.out.println("Есептеуде қате бар");
        }
        // 7 esep
        Scanner W1= new Scanner(System.in);
        System.out.println("Бірінші01 санды енгізініз");
        int San01=W1.nextInt();
        Scanner W2= new Scanner(System.in);
        System.out.println("Екінші01 санды енгізініз");
        int San02=W2.nextInt();
        if (San01>San02){
            double kishi1=San01/2;
            System.out.println("Бірінші сан="+kishi1);
        }else{
            double kishi2=San02/2;
            System.out.println("Екінші сан="+kishi2);
        }
// 8 esep
        Scanner W01= new Scanner(System.in);
        System.out.println("Бірінші02 санды енгізініз");
        int San03=W01.nextInt();
        Scanner W02= new Scanner(System.in);
        System.out.println("Екінші02 санды енгізініз");
        int San04=W02.nextInt();
        if (San03>San04){
            double kishi01=Math.sqrt(San03*5);
            System.out.println("Бірінші сан="+kishi01);
        }else {
            double kishi02 =Math.sqrt(San04*5);
            System.out.println("Екінші сан=" + kishi02);
        }
        // 9 esep
        Scanner W03= new Scanner(System.in);
        System.out.println("8сан енгізініз-1");
        int San05=W03.nextInt();
        Scanner W04= new Scanner(System.in);
        System.out.println("сан енгізініз-2");
        int San06=W04.nextInt();
        Scanner W05= new Scanner(System.in);
        System.out.println("сан енгізініз-3");
        int San07=W05.nextInt();
        if (San05%2==0){
            System.out.println("Бүтін сан="+San05);
        }else  {
            System.out.println("Бүтін сан жоқ бірінші санда");
        }

        if (San06%2==0){
            System.out.println("Бүтін сан="+San06);
        } else  {
            System.out.println("Бүтін сан жоқ екінші санда");
        }

        if (San07%2==0){
            System.out.println("Бүтін сан="+San07);
        } else  {
            System.out.println("Бүтін сан жоқ үшінші санда");
        }
    }}