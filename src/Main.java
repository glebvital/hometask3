public class Main{
    public static void main(String[] args) {
        //Q == question
//        Q1(1);
//        Q1(0);
//        Q1(-3);
//        Q2(1);
//        Q2(0);
//        Q2(-3);
//        Q3(1);
//        Q3(0);
//        Q3(-3);
//        Q4(1);
//        Q4(0);
//        Q4(-3);
//        Q5(1);
//        Q5(0);
//        Q5(-3);
//        Q6(1);
//        Q6(0);
//        Q6(-3);
//        Q7("test");
//        Q7("тест");
//        Q7("3");
//        Q8("1");
//        Q8("1");
//        Q8("3");
//        Q9(true);
//        Q9(false);
//        Q9long(true);
//        Q9long(false);
//        Q10(true);
//        Q10(false);
//        Q10long(true);
//        Q10long(false);
//        Q11(5);
//        Q11(0);
//        Q11(-3);
//        Q11(2);
//        Q12(5);
//        Q12(0);
//        Q12(-3);
//        Q12(2);
//        Q13(1,3);
//        Q13(0,6);
//        Q13(3,5);
//        Q14(1,3);
//        Q14(0,6);
//        Q14(3,5);
//        Q15(1,"NaN");
//        Q15(2,"NaN");
//        Q15(3,"NaN");
//        Q15(4,"NaN");
//        Q16(5);
//        Q16(11);
//        Q16(21);
//        Q17(1);
//        Q17(5);
//        Q17(8);
//        Q17(10);

    }
    public static void Q1(int a){
        if (a==0){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q2(int a){
        if (a>0){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q3(int a){
        if (a<0){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q4(int a){
        if (a>=0){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q5(int a){
        if (a<=0){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q6(int a){
        if (a!=0){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q7(String a){//3 cannot be used as number because a is a string
        if (a=="test"){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q8(String a){//1 and 3 cannot be used as numbers because they are numbers, not strings
        if(a == "1" && a instanceof String){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q9(boolean test){
        if(test == true){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q9long(boolean test){
        if (test == true){
            System.out.println("right");
        }
        if (test == false){
            System.out.println("wrong");
        }
    }
    public static void Q10(boolean test){
        if (test != true){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q10long(boolean test){
        if (test != true){
            System.out.println("wrong");
        }
        if (test == false){
            System.out.println("right");
        }
    }
    public static void Q11(int a){
        if (a>0 && a<5){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q12(int a){
        if (a==0 || a==2){
            a = a+7;
            System.out.println(a);
        }else{
            a = a/10;
            System.out.println(a);
        }
    }
    public static void Q13(int a,int b){
        if (a == 1 || a < 1 && b > 3 || b == 3){
            System.out.println(a+b);
        }else{
            System.out.println(a-b);
        }
    }
    public static void Q14(int a,int b){
        if (a>2 && a<11 || b>=6 && b<14){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    public static void Q15(int num,String result){
        switch (num) {
            case 1:
                result = "winter";
                System.out.println(result);
                break;
            case 2:
                result = "spring";
                System.out.println(result);
                break;
            case 3:
                result = "summer";
                System.out.println(result);
                break;
            case 4:
                result = "autumn";
                System.out.println(result);
                break;
            default:
                System.out.println("dosn't exist");
                result = "error";
        }
    }
    public static void Q16(int day){
        if (day>= 1 && day<=9){
            System.out.println("first decade");
        } else if (day>=10 && day<=19) {
            System.out.println("second decade");
        } else if (day>=20 && day<=29) {
            System.out.println("third decade");
        }
    }
    public static void Q17(int month){
        if (month == 12 || month >= 1 && month <= 2){
            System.out.println("winter");
        } else if (month>=3 && month<=5) {
            System.out.println("spring");
        } else if (month>=6 && month<=8) {
            System.out.println("summer");
        } else if (month>=9 && month<=11) {
            System.out.println("autumn");
        }
    }

}