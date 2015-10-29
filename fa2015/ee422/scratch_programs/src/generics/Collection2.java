// JAVA ABSTRACT TYPE VARIABLE CONVENTIONS
//
// T == TYPE
// E == ELEMENT
// K == KEY
// V == VALUE

interface Collection2<E> {
    public boolean containsAll(Collection2<?> c);
    public boolean addAll(Collection2<? extends E> c);
}

interface Collection3<E> {
    public <T> boolean containsAll(Collection3<T> c);
    public <T extends E> boolean addAll(Collection3<T> c);
}

class Collections4 {
    public static <T> void copy (List<T> dest, List<? extends T> src);
    public static <T, S extends T> void copy (List<T> dest, List<S> src);
}
