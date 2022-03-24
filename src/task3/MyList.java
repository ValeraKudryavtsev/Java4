package task3;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class MyList implements List<String> {
    private List<String> arrayList = new ArrayList<>();
    private ReentrantLock locker = new ReentrantLock();

    @Override
    public int size() {
        locker.lock();
        try {
            return arrayList.size();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return arrayList.size();
        }
    }

    @Override
    public boolean isEmpty() {
        locker.lock();
        try {
            return arrayList.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        locker.lock();
        try {
            return arrayList.contains(o);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return false;
        }
    }

    @Override
    public Iterator<String> iterator() {
        locker.lock();
        try {
            return arrayList.iterator();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return null;
        }
    }

    @Override
    public Object[] toArray() {
        locker.lock();
        try {
            return arrayList.toArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return new Object[0];
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        locker.lock();
        try {
            return arrayList.toArray(a);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return null;
        }
    }

    @Override
    public boolean add(String s) {
        locker.lock();
        try {
            return arrayList.add(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        locker.lock();
        try {
            return arrayList.remove(o);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        locker.lock();
        try {
            return arrayList.containsAll(c);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return false;
        }
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        locker.lock();
        try {
            return arrayList.addAll(c);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return false;
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        locker.lock();
        try {
            return arrayList.addAll(c);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return false;
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        locker.lock();
        try {
            return arrayList.removeAll(c);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return false;
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        locker.lock();
        try {
            return arrayList.retainAll(c);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return false;
        }
    }

    @Override
    public void clear() {
        locker.lock();
        try {
            arrayList.clear();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }

    @Override
    public String get(int index) {
        locker.lock();
        try {
            return arrayList.get(index);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return "";
        }
    }

    @Override
    public String set(int index, String element) {
        locker.lock();
        try {
            return arrayList.set(index, element);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return "";
        }
    }

    @Override
    public void add(int index, String element) {
        locker.lock();
        try {
            arrayList.add(index, element);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }

    @Override
    public String remove(int index) {
        locker.lock();
        try {
            return arrayList.remove(index);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return "";
        }
    }

    @Override
    public int indexOf(Object o) {
        locker.lock();
        try {
            return arrayList.indexOf(o);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return 0;
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        locker.lock();
        try {
            return arrayList.lastIndexOf(o);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return 0;
        }
    }

    @Override
    public ListIterator<String> listIterator() {
        locker.lock();
        try {
            return arrayList.listIterator();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return arrayList.listIterator();
        }
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        locker.lock();
        try {
            return arrayList.listIterator(index);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return arrayList.listIterator(index);
        }
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        locker.lock();
        try {
            return arrayList.subList(fromIndex, toIndex);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
            return arrayList.subList(fromIndex, toIndex);
        }
    }

    @Override
    public String toString() {
        return "MyList{" +
                "arrayList=" + arrayList +
                ", locker=" + locker +
                '}';
    }
}
