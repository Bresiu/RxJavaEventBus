package com.bresiu;

import rx.Observable;
import rx.subjects.BehaviorSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * @author Michal Brewczak
 */
public class RxBus {
	private final Subject<Event, Event> mBus;
	private final Observable<Event> mBusObservable;

	public RxBus() {
		mBus = new SerializedSubject<>(BehaviorSubject.<Event>create());
		mBusObservable = mBus.onBackpressureBuffer().cache();
	}

	public void push(Event e) {
		//if (mBus.hasObservers()) {
			mBus.onNext(e);
		//}
	}

	public <T> Observable<T> signTo(Class<T> objectType) {
		return mBusObservable.ofType(objectType);
	}
}
