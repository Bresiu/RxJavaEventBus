package com.bresiu;

/**
 * @author Michal Brewczak
 */
public class Main {
	public static void main(String[] args) {
		RxBus rxBus = new RxBus();

		//NoticeBoard noticeBoard1 = new NoticeBoard(rxBus, EventOne.class, "1");
		//NoticeBoard noticeBoard2 = new NoticeBoard(rxBus, EventTwo.class, "2");

		System.out.println("pushing event one");
		rxBus.push(new EventOne());
		//System.out.println("pushing event two");
		//rxBus.push(new EventTwo());
//		System.out.println("pushing event one");
//		rxBus.push(new EventOne());
		//System.out.println("pushing event two");
		//rxBus.push(new EventTwo());

		//System.out.println(noticeBoard1.getClass().toString() + " end");
		//System.out.println(noticeBoard2.getClass().toString() + " end");

		System.out.println("subscribe to event one");
		NoticeBoard noticeBoard3 = new NoticeBoard(rxBus, EventOne.class, "3");
		System.out.println(noticeBoard3.getClass().toString() + " end");
	}
}