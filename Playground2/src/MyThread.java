//import java.util.Arrays;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//import java.util.regex.*;

/*
public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello world!");
        //System.out.println("-------------***--------------");
        //Pattern usernamePattern = Pattern.compile("[a-z]{3}\\d{1}|[a-z]{4}\\d{1}");
        //String regex = "[a-z]{3}\d{1}|[a-z]{4}\d{1}";
        /*String regex1 = "[a-zA-Z0-9]{2,4}";
        Pattern pattern1 = Pattern.compile(regex1);
        System.out.println(pattern1.matcher("doc").matches()); // true
        System.out.println(pattern1.matcher("docx").matches()); // true
        System.out.println(pattern1.matcher("7z").matches()); // true
        System.out.println(pattern1.matcher("dir").matches()); // true
        System.out.println(pattern1.matcher("properties").matches()); // false
        System.out.println("------------***-------------");
        String regex = "^[a-zA-Z0-9]{2,4}$";
        Pattern pattern = Pattern.compile(regex);

        // Test file endings individually against the regular expression
        String fileEnding = "zip";
        Matcher matcher = pattern.matcher(fileEnding);
        System.out.println(fileEnding + " : " + matcher.matches());

        fileEnding = "docx";
        matcher = pattern.matcher(fileEnding);
        System.out.println(fileEnding + " : " + matcher.matches());

        fileEnding = "png";
        matcher = pattern.matcher(fileEnding);
        System.out.println(fileEnding + " : " + matcher.matches());

        fileEnding = "pdf";
        matcher = pattern.matcher(fileEnding);
        System.out.println(fileEnding + " : " + matcher.matches());

        fileEnding = "7z";
        matcher = pattern.matcher(fileEnding);
        System.out.println(fileEnding + " : " + matcher.matches());

        fileEnding = "properties";
        matcher = pattern.matcher(fileEnding);
        System.out.println(fileEnding + " : " + matcher.matches());

        System.out.println("----------------*****---------------");
        Pattern fileEnding2 = Pattern.compile("[a-zA-Z0-9]{2,4}");
        var fileEndingTests = Arrays.asList("zip","docx","png","pdf","7z","document");
        fileEndingTests.forEach(test -> {
                System.out.println(test +": " + fileEnding2.matcher(test).matches());
        });


    }
}

*/


public class MyThread extends Thread {
    public void hello(String str) {
        System.out.println(str);
    }
    @Override
    public void run() {
        hello("I'm running ...");
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Thread has been started ...");
    }
}