
//public class Main {
//
//
//    public static void main(String[] args) {
//        int[] array = {1,3,5,7};
//        int[] array2 = {1,5,3,7};
//        System.out.println(func(array , 0));
//        System.out.println(func(array2 , 0));
//    }
//    public static boolean func(int[] arr, int index ) {
//        // Base case
//        if (index == arr.length - 1) {
//            return true;
//        }
//        if (arr[index] > arr[index + 1]) {
//            return false;
//        }
//        return func(arr, index + 1);
//    }
//
//
//}

//import java.util.Scanner;

//public class Main {
//
//
//    public static void main(String[] args) {
//        int[] array = {1, 3, 5, 7};
//        System.out.println(func(array, 0, array.length - 1));
//    }
//
//    public static int func(int[] arr, int left, int right) {
//        // Base case
//        if (left == right) {
//            return arr[left];
//        }
//        int mid = (left + right) / 2;
//        int productLeft = func(arr, left, mid);
//        int productRight = func(arr, mid + 1, right);
//
//        return productLeft * productRight;
//    }
//}


//public class Main {
//
//
//    public static void main(String[] args) {
//        System.out.println(func(3,5));
//    }
//    public static int func(int a , int b) {// a < b
//        // Base case:
//        if (a == b) {
//            return a;
//        }
//
//        return a * func(a+1 , b);
//    }
//
//
//
//}


//public class Main {
//
//
//    public static void main(String[] args) {
//        System.out.println(func(123));
//    }
//    public static int func(int number) {
//        // Base case: if the number is a single digit
//        if (number < 10) {
//            return number;
//        }
//        int lastDigit = number % 10;
//        int remainingNumber = number / 10;
//
//        return lastDigit + func(remainingNumber);
//    }
//
//
//
//
//
//}


//
//public class Main {
//
//
//    public static void main(String[] args) {
//        System.out.println(func("level"));
//    }
//    public static boolean func(String str) {
//        // Base case: an empty string or a string with one character
//        // Base case: an empty string or a string with one character is a palindrome
//        if (str.length() <= 1) {
//            return true;
//        }
//
//        // Recursive case: check if the first and last characters are equal,
//        // and recursively check if the substring between them is a palindrome
//        char firstChar = str.charAt(0);
//        char lastChar = str.charAt(str.length() - 1);
//
//        if (firstChar != lastChar) {
//            return false;
//        }
//
//        String remainingSubstring = str.substring(1, str.length() - 1);
//        return func(remainingSubstring);
//    }
//
//
//
//
//
//}