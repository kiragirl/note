package mutileThread;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicTest {
    public AtomicInteger mAtomicInteger = new AtomicInteger();//如果没有指定值，默认是1

    public static void main(String[] args) {
        AtomicTest demo = new AtomicTest();
        for (int i = 0; i < 25535; i++) {
            new Thread(demo::doAdd, "线程2").start();
        }
    }

    private void doAdd() {
        int value = mAtomicInteger.addAndGet(1);
        System.out.println(Thread.currentThread().getName() + "--->" + value);
    }
}