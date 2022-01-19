public class TestLambda1 {
    static class Like2 implements Ilike{

        @Override
        public void lambda() {
            System.out.println("I like Lambda 2");
        }
    }//static inner class

    public static void main(String[] args) {
        class Like3 implements Ilike{

            @Override
            public void lambda() {
                System.out.println("I like Lambda 3");
            }
        }//local inner class

        Ilike like4 = new Ilike(){//anonymous class
            @Override
            public void lambda(){
                System.out.println("I like lambda 4");
            }
        };

        Ilike like5 = ()-> System.out.println("I like lambda 5");
        //必须是函数式接口（接口中只有一个函数）
        //如果lambda表达式只有一行，便可简化成一行，若有多行表达式，要用代码块{}包裹
        //
      Ilike like = new Like();
      like.lambda();

      like = new Like2();
      like.lambda();

      like = new Like3();
      like.lambda();

      like4.lambda();

      like5.lambda();

    }
}

interface Ilike{
    void lambda();
}

class Like implements Ilike{
    @Override
    public void lambda() {
        System.out.println("I like Lambda 1");
    }
}

