package linkedlist;

import utils.MeowTimer;

public class LinkedMain {
	private static MeowTimer meowTimer = new MeowTimer();
	public static void main(String[] args) {
		startSignLinkedList();
	}

	private static void startSignLinkedList() {
		reverseExample();

		System.out.println("1번시작");
		startPointInsertStartPointDelete();

		System.out.println("\n\n\n\n2번시작");
		startPointInsertEndPointDelete();

		System.out.println("\n\n\n\n3번시작");
		startPointInsertMidDelete();
	}

	private static void reverseExample() {
		SingleLinkedList<Item> singleLinkedList = new SingleLinkedList<>();

		System.out.println("역정렬을 위한 삽입");
		for (long i = 0; i < 500; i++) {
			singleLinkedList.insert(Item.of("금화", i));
		}

		System.out.println("역정렬 및 프린트");
		singleLinkedList.reverse();
		singleLinkedList.print();

	}

	private static void startPointInsertEndPointDelete() {
		SingleLinkedList<Item> singleLinkedList = new SingleLinkedList<>();

		System.out.println("삽입시작");
		meowTimer.start();
		for (long i = 0; i < 50000; i++) {
			singleLinkedList.insert(Item.of("금화", i));
		}
		meowTimer.end();
		meowTimer.printTimeAndClear();

		System.out.println("삭제시작");
		meowTimer.start();
		for (long i = singleLinkedList.getSize(); i > 0; i--) {
			singleLinkedList.remove(Item.of("금화", i));
		}
		meowTimer.end();
		meowTimer.printTimeAndClear();
	}

	private static void startPointInsertStartPointDelete() {
		SingleLinkedList<Item> singleLinkedList = new SingleLinkedList<>();

		System.out.println("삽입시작");
		meowTimer.start();
		for (long i = 0; i < 50000; i++) {
			singleLinkedList.insert(Item.of("금화", i));
		}
		meowTimer.end();
		meowTimer.printTimeAndClear();

		System.out.println("삭제시작");
		meowTimer.start();
		for (long i = 0; i < singleLinkedList.getSize(); i++) {
			singleLinkedList.remove(Item.of("금화", i));
		}
		meowTimer.end();
		meowTimer.printTimeAndClear();
	}

	private static void startPointInsertMidDelete() {
		SingleLinkedList<Item> singleLinkedList = new SingleLinkedList<>();

		System.out.println("삽입시작");
		meowTimer.start();
		for (long i = 0; i < 50000; i++) {
			singleLinkedList.insert(Item.of("금화", i));
		}
		meowTimer.end();
		meowTimer.printTimeAndClear();

		System.out.println("삭제시작");
		meowTimer.start();
		for (long i = 30000; i < 40000; i++) {
			singleLinkedList.remove(Item.of("금화", i));
		}
		for (long i = 20000; i < 30000; i++) {
			singleLinkedList.remove(Item.of("금화", i));
		}
		for (long i = 10000; i < 20000; i++) {
			singleLinkedList.remove(Item.of("금화", i));
		}
		for (long i = 40000; i < 50000; i++) {
			singleLinkedList.remove(Item.of("금화", i));
		}
		for (long i = 1; i < 10000; i++) {
			singleLinkedList.remove(Item.of("금화", i));
		}
		meowTimer.end();
		meowTimer.printTimeAndClear();
	}


}
