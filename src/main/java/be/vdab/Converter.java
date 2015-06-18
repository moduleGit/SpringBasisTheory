package be.vdab;

public interface Converter<S,T> {
	T convert(S source);
}
