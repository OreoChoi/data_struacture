import linkedlist.*;
import user.User;

import java.util.LinkedList;

public class TEST {

    public static void main(String[] args) {
        //singleLinkedListTestDataTypeString();
        //singleLinkedListTestDataTypeClass();
        //doublyLinkedListTestDataTypeString();
        //singleCircularListTestDataTypeString();
        doublyCircularLinkedListTestDataTypeString();
    }

    private static void doublyCircularLinkedListTestDataTypeString() {
        CustomLinkedList<String> array = new DoublyCircularLinkedList<>();
        array.insert("1");
        array.insert("2");
        array.insert("3");
        array.insert("4");
        array.insert("5");
        System.out.println(array);
    }

    private static void doublyLinkedListTestDataTypeString() {
        CustomLinkedList<String> array = new DoublyLinkedList<>();
        array.insert("1");
        array.insert("2");
        array.insert("3");
        array.insert("4");
        array.insert("5");
        array.remove("3");
        array.remove("4");
        System.out.println(array);
    }
    private static void singleCircularListTestDataTypeString() {
        CustomLinkedList<String> array = new SingleCircularLinkedList<>();
        array.insert("1");
        array.insert("2");
        array.insert("3");
        array.insert("4");
        array.insert("5");
        System.out.println(array);
    }

    private static void singleLinkedListTestDataTypeString() {
        String three = "3";
        CustomLinkedList<String> array = new SingleLinkedList<>();
        array.insert("1");
        array.insert("2");
        array.insert(three);
        array.insert("4");
        array.insert("5");
        array.remove("1");
        array.remove("2");
        array.remove("5");
        array.remove("3");

        System.out.println(array);
    }

    private static void singleLinkedListTestDataTypeClass() {
        CustomLinkedList<User> array = new SingleLinkedList<>();
        User user1 = new User("홍길순", "29");
        User user2 = new User("뚜뚜", "5");
        User user3 = new User("초코", "12");
        User user4 = new User("원숭이", "100");
        array.insert(user1);
        array.insert(user2);
        array.insert(user3);
        array.insert(user4);
        array.remove(user2);
        array.remove(user3);

        System.out.println(array);
    }


}


