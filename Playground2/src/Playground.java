
//import io.reactivex.rxjava3.core.Observable;


public class Playground {


    /*
   //Thread
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("I'm running ..."));
        thread.start();
        System.out.println("Thread has been started ...");
    }

    */


    public static int sum(int n) { //recursive
        if (n > 0) {
            n += sum(n - 1);
        }

        return n;
    }

    public static int iterativeSum(int n) {
        int i = n - 1;
        for (; i > 0; i--) {
            n += i;
        }

        return n;
    }

    public static void main(String[] args) {

        System.out.println("sum: " + sum(5));
        System.out.println("iterative sum: " + iterativeSum(5));

    }
}

//Observable<String> observable = Observable.just("Hello Reactive World");
//observable.subscribe(System.out::println);

/*

public class Playground2 {
    public static void main(String[] args) {
        String[] letters = { "a", "b", "c", "d", "e", "f", "g" };
        Observable<String> observable = Observable.fromArray(letters);
        observable.subscribe(System.out::print, //OnNext
                Throwable::printStackTrace, //OnError
                () -> System.out.println("_Completed") //OnCompleted
        );
    }
}*/