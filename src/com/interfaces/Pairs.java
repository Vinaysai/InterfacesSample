package com.interfaces;

@SuppressWarnings("hiding")
public interface Pairs<Source, Destination> {
	public Source getKey(Destination b);

	public Destination getValue(Source b);
}