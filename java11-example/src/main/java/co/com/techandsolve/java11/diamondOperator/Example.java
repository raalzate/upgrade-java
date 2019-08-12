package co.com.techandsolve.java11.diamondOperator;


public class Example {

    static abstract class MyHandler<T> {

        private T content;

        public MyHandler(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        abstract void handle();
    }

    public static void main(String[] args) {
        MyHandler<Integer> intHandler = new MyHandler<>(1) {
            @Override
            public void handle() {
                System.out.println(getContent());
            }
        };
        intHandler.handle();


        MyHandler<? extends Integer> intHandler1 = new MyHandler<>(10) {
            @Override
            void handle() {
                System.out.println(" > " + getContent() + "");
            }
        };
        intHandler1.handle();


        MyHandler<?> handler = new MyHandler<>("String") {
            @Override
            void handle() {
                System.out.println("[" + getContent() + "]");
            }
        };
        handler.handle();

    }

}
