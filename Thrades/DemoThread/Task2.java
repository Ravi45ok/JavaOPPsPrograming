package DemoThread;

public class Task2 extends Thread {
  @Override
  public void run() {
    // ! Methos of Tharede class->

    // ! Static methods->
    // *Static methods always operate on the currently executing thread — whichever
    // thread calls them. */

    // ! 1. currentThread()
    // * it will return the object of the current thread
    // * As this class directly doesnot extend the Thread Class so if i try to
    // access the methods of Threads it will give error so that why we need
    // currentThread() method
    Thread th = Thread.currentThread();
    System.out.println(th);

    // ! 2. sleep()
    // * this is a static method of thread class
    // * sleep() pauses current thread
    // * does not release the lock
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // ! 3. yield()
    // *yield() is a hint given by the currently running thread to the scheduler
    //* */ saying: “If any other thread of the same or higher priority is ready, let it run.”
    // * it is a request not a order cpu might ignore it.
    // * yield() does not relase the object lock even if requset is acceptecd , it
    //*just just realse the cpu not object lock . And it will go Running to Runnable state where it has all resourse except cpu.

    Thread.yield();

    for (int i = 0; i < 4; i++) {
      System.out.println("this task is executing");
    }

    // ! 4.interrupted()
      

    // * Checks if current thread is interrupted and clears the flag

    // ! 5. holdsLock(obj)
    // *Returns true if current thread holds monitor lock on given object */

    // ! Non-static Methods
    // * */ Non-static methods are called on a specific thread instance, but they
    // can be called by any thread.

    // !1. start()
    // * this method will start the thrade and it will be called by the parent
    // thread, in our case mainThread will call it.

    // ! 2.run()
    // * carries the exceutable task should not directly call this method

    // ! 3. setName()
    // *
    Thread.currentThread().setName("Task1-Thread");

    // ! 4. getName()
    String name = Thread.currentThread().getName();
    System.out.println(name);

    // ! 5.interrupt()
    // *Interrupts the thread — sets interrupt flag

    // ! 6.isInterrupted()
    // * Checks interrupt flag — does not clear it*/

    // ! 7. join()
    // * join() stops (pauses) the thread that CALLS join() until the thread on
    // which join() is CALLED finishes execution.
    // * A.join(); // means → "Current thread, wait until A finishes".
    // * example see in mainthread
    // * The thread where the join() is called will be in wating state , it will be
    // in the wait set of the thread which will call the join(). in our case this
    // thread will be in wait set of A */
    // * Thread.currentThread().join(); will create a self deadLock.

    // ! 8. isAlive()
    // * is return that weather a threade is completly executed or not.
    // * this method is also called by some other thread to check weather some
    // theread is alive or dead
    Thread.currentThread().isAlive();

    // ! 9.getPriority()
    // *Returns thread priority (1-10)

    // ! 10.setPriority(int)
    // *Sets thread priority

    // !11.isDaemon()
    // *Returns true if thread is a daemon

    // !12.threadsetDaemon(boolean)
    // *Marks thread as daemon — must call before start()

    // !13.getThreadGroup()
    // *Returns the ThreadGroup this thread belongs

    // !14.togetStackTrace()
    // *Returns stack trace of this thread as array

  }
}
