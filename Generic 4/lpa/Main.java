package dev.lpa;


public class Main {

    public interface Showable{
         void print(int x);
    }
    static void display(Showable s){
        s.print(7);
    }

    public static void main(String[]args){




    var test = new Test(67){

        {
            System.out.println("Init Blook");
        }
        @Override
        public void test(){
            System.out.println("TEST@2026");
        }
        public void test(int x){
            System.out.println("test$" + x);
        }
    }
            ;
    test.test(3);















//        Showable sh;
//        // Lambda Expression
//        sh = (int x) -> System.out.println("Hello Inner Anonymous class interface$" + x);
//        sh.print(5);


//        display( (int x) -> System.out.println("Hello Inner Anonymous class interface$" + x));
//
//        display(new Showable() {
//            @Override
//            public void print(int x) {
//                System.out.printf("hhhhhhhhhhhhhhhhhhhhhhhh" + x);
//            }
//        });




















//        RewordClass rewordClass = new RewordClass();
//        rewordClass.rewordMethod();
//        RewordClass r1 = new RewordClass(){ // Anonymous Inner Class
//            @Override
//            public void rewordMethod(){
//                System.out.println("Your reward is $19");
//            }
//        };
//
//        r1.rewordMethod();
//        System.out.println(rewordClass.getClass().getName());
//        System.out.println(r1.getClass().getName());
    }

}

