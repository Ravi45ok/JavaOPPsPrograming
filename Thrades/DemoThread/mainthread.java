package DemoThread;

public class mainthread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== MAIN METHOD STARTED ===\n");
        
        Task1 task1 = new Task1();
        Thread th1 = new Thread(task1);
        Task2 th2 = new Task2();
        
        // ============================================
        // ! STATIC METHODS (operate on current thread)
        // ============================================
        
        // ! 1. currentThread()
        // * Returns the reference of the currently running thread
        System.out.println("--- 1. currentThread() ---");
        Thread currentTh = Thread.currentThread();
        System.out.println("Current Thread: " + currentTh);
        System.out.println("Current Thread Name: " + currentTh.getName());
        System.out.println("Current Thread ID: " + currentTh.getId() + "\n");
        
        
        // ! 2. sleep()
        // * Pauses current thread for specified milliseconds
        // * Does not release the lock (remains in synchronized blocks)
        System.out.println("--- 2. sleep() ---");
        System.out.println("Main thread is going to sleep for 2 seconds...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread woke up after 2 seconds\n");
        
        
        // ! 3. yield()
        // * Hints to scheduler: "If any other thread of same/higher priority is ready, let it run"
        // * Request not a command � CPU might ignore it
        // * Releases CPU but not object lock
        // * Thread goes from Running ? Runnable state
        System.out.println("--- 3. yield() ---");
        System.out.println("Demonstrating yield():");
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread - iteration " + i);
            Thread.yield();
        }
        System.out.println();
        
        
        // ! 4. boolean interrupted()
        // * Static method that checks if current thread is interrupted
        // * Set  the interrupt flag as false  after checking weather it is true or false before.
        System.out.println("--- 4. interrupted() ---");
        System.out.println("Is main thread interrupted? " + Thread.interrupted());
        System.out.println("Interrupt flag cleared: " + !Thread.interrupted() + "\n");
        
        
        // ! 5. holdsLock(Object)
        // * Returns true if current thread holds monitor lock on given object
        System.out.println("--- 5. holdsLock() ---");
        Object lockObj = new Object();
        System.out.println("Does main thread hold lock (before syncronization)? " + Thread.holdsLock(lockObj));
        synchronized (lockObj) {
            System.out.println("Does main thread hold lock (inside syncronization)? " + Thread.holdsLock(lockObj));
        }
        System.out.println();
        
        
        // ============================================
        // ! NON-STATIC METHODS (called on instance)
        // ============================================
        
        // ! 1. start()
        // * Starts the thread and calls run() method in a new thread
        // * Called by parent thread (main thread in this case)
        System.out.println("--- 1. start() ---");
        th1.setName("Task1-Thread");
        System.out.println("Starting thread: " + th1.getName());
        th1.start();
        System.out.println();
        
        
        // ! 2. setName() & getName()
        // * setName() sets the thread name
        // * getName() retrieves the thread name
        System.out.println("--- 2. setName() & getName() ---");
        System.out.println("Task1 Thread name: " + th1.getName());
        th1.setName("UpdatedTask1");
        System.out.println("Updated name: " + th1.getName() + "\n");
        
        
        // ! 3. setPriority() & getPriority()
        // * Thread priority ranges from 1 (MIN_PRIORITY) to 10 (MAX_PRIORITY)
        // * Default priority is 5 (NORM_PRIORITY)
        System.out.println("--- 3. setPriority() & getPriority() ---");
        System.out.println("Default priority of th1: " + th1.getPriority());
        th1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("After setting to MAX_PRIORITY: " + th1.getPriority() + "\n");
        
        
        // ! 4. isAlive()
        // * Returns true if thread is still executing
        // * Returns false after thread completes execution
        System.out.println("--- 4. isAlive() ---");
        System.out.println("Is th1 alive before join? " + th1.isAlive());
        
        
        // ! 5. join()
        // * Pauses the thread that CALLS join() until the thread on which it's CALLED finishes
        // * Example: A.join() means "Wait until A finishes before continuing"
        System.out.println("--- 5. join() ---");
        System.out.println("Main thread is waiting for th1 to complete...");
        th1.join();
        System.out.println("th1 has completed!");
        System.out.println("Is th1 alive after join? " + th1.isAlive() + "\n");
        
        
        // ! 6. setDaemon() & isDaemon()
        // * Daemon threads are background threads that don't prevent JVM shutdown
        // * Must call setDaemon() BEFORE start()
        // * Non-daemon threads prevent JVM from exiting until they complete
        System.out.println("--- 6. setDaemon() & isDaemon() ---");
        th2.setName("DaemonTask");
        System.out.println("Is th2 a daemon thread? " + th2.isDaemon());
        th2.setDaemon(true);
        System.out.println("After setDaemon(true): " + th2.isDaemon());
        th2.start();
        System.out.println();
        
        
        // ! 7. interrupt() & isInterrupted()
        // * interrupt() sets the interrupt flag to true for a thread
        // * isInterrupted() checks the flag WITHOUT clearing it (non-static method)
        // * interrupted() is static and clears the flag
        System.out.println("--- 7. interrupt() & isInterrupted() ---");
        Thread interruptThread = new Thread(() -> {
            try {
                System.out.println("Worker thread sleeping...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Worker thread was interrupted!");
            }
        });
        interruptThread.start();
        Thread.sleep(500);
        interruptThread.interrupt();
        interruptThread.join();
        System.out.println();
        
        
        // ! 8. getThreadGroup()
        // * Returns the ThreadGroup this thread belongs to
        System.out.println("--- 8. getThreadGroup() ---");
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        System.out.println("Current thread group: " + group.getName());
        System.out.println("Active threads in group: " + group.activeCount() + "\n");
        
        
        // ! 9. getStackTrace()
        // * Returns the stack trace of this thread as an array
        System.out.println("--- 9. getStackTrace() ---");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println("Stack trace elements: " + stackTrace.length);
        System.out.println("Top method: " + stackTrace[1].getMethodName());
        System.out.println("Top class: " + stackTrace[1].getClassName() + "\n");
        
        
        System.out.println("=== MAIN METHOD COMPLETED ===");
    }
}
