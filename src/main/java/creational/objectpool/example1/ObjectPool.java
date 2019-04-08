package creational.objectpool.example1;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author Ramin Pakzad
 */
public abstract class ObjectPool<T> {
    private long expirationTime;
    private Hashtable<T, Long> locked;
    private Hashtable<T, Long> unlocked;

    public ObjectPool() {
        this.expirationTime = 30000;
        this.locked = new Hashtable<>();
        this.unlocked = new Hashtable<>();
    }

    public abstract T create();
    public abstract boolean validate(T t);
    public abstract void expire(T t);

    public synchronized T getObject() {
        long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0) {// there are some available objects
            Enumeration<T> keys = unlocked.keys();
            while (keys.hasMoreElements()) {
                t = keys.nextElement();
                if (now - unlocked.get(t) > expirationTime) {// object has expired
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                } else {
                    if (validate(t)) { //if it is validated, lock the object and return it
                        unlocked.remove(t);
                        locked.put(t, now);
                        return t;
                    } else {
                        unlocked.remove(t);
                        expire(t);
                        t = null;
                    }
                }
            }
        }
        // no object available
        t = create();
        locked.put(t, now);
        return t;
    }

    public synchronized void releaseObject(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }
}
