package com.bresiu;

import rx.Subscriber;

/**
 * @author Michal Brewczak
 */
public class NoticeBoard {

	public NoticeBoard(RxBus rxBus, Class klass, String instance) {

		rxBus.signTo(klass).subscribe(new Subscriber<Event>() {
			@Override
			public void onCompleted() {

			}

			@Override
			public void onError(Throwable throwable) {

			}

			@Override
			public void onNext(Event event) {
				System.out.println("on next");
				System.out.println(instance);
				event.printMessage();
			}
		});
	}
}
