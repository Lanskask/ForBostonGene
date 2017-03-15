package ru.smurtazin.parallel.experiments;

import java.util.LinkedList;

/**
 * Created by a1 on 15.03.17.
 */
public class BlockingQueue<T> {
    public LinkedList<T> queue = new LinkedList<T>();

    public void push(T t) {
        synchronized (this.queue) {
            this.queue.add(t);
            this.queue.notify();
        }
    }

    public T poll() {
        synchronized (this.queue) {
            while(this.queue.isEmpty()) {
                try {
                   this.queue.wait();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
        return this.queue.remove();
    }

}
