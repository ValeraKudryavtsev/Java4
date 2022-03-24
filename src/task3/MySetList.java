package task3;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySetList implements Set<String> {
    private Set<String> hashSet = new HashSet<>();

    @Override
    synchronized public int size() {
        return hashSet.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return hashSet.isEmpty();
    }

    @Override
    synchronized public boolean contains(Object o) {
        return hashSet.contains(o);
    }

    @Override
    synchronized public Iterator<String> iterator() {
        return hashSet.iterator();
    }

    @Override
    synchronized public Object[] toArray() {
        return hashSet.toArray(new String[0]);
    }

    @Override
    synchronized public <T> T[] toArray(T[] a) {
        return (T[]) hashSet.toArray();
    }

    @Override
    synchronized public boolean add(String s) {
        return hashSet.add(s);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return hashSet.remove(o);
    }

    @Override
    synchronized public boolean containsAll(Collection<?> c) {
        return hashSet.containsAll(c);
    }

    @Override
    synchronized public boolean addAll(Collection<? extends String> c) {
        return hashSet.addAll(c);
    }

    @Override
    synchronized public boolean retainAll(Collection<?> c) {
        return hashSet.retainAll(c);
    }

    @Override
    synchronized public boolean removeAll(Collection<?> c) {
        return hashSet.removeAll(c);
    }

    @Override
    synchronized public void clear() {
        hashSet.clear();
    }

    @Override
    public String toString() {
        return "MySetList{" +
                "hashSet=" + hashSet +
                '}';
    }
}
