![Image text](https://github.com/350679778/TestThread/blob/master/images/class3/%E7%BA%BF%E7%A8%8B%E7%8A%B6%E6%80%81%E5%88%87%E6%8D%A2%E7%A4%BA%E6%84%8F%E5%9B%BE.jpg)
1. 新创建一个新的线程对象后，再调用它的start()方法，系统会为此线程分配CPU资源，使其处于Runnable（可运行）状态，这是一个准备运行的阶段。如果线程抢占到CPU资源，此线程就处于Running（运行）状态。
2. Runnable状态和Running状态可相互切换，应为有可能线程运行一段时间后，有其他高优先级的线程抢占了资源，这时此线程就从Running状态编程Runnable状态。  
线程进入Runnable状态大体分为如下5种情况：
 * 调用sleep()方法后经过的时间超过了指定的休眠时间。
 * 线程调用的阻塞IO已经返回，阻塞方法执行完毕。
 * 线程成功地获得了试图同步的监视器。
 * 线程正在等待某个通知，其他线程发出了通知。
 * 处于挂起状态的线程调用了resume恢复方法。
3. Blocked是阻塞的意思，例如遇到到了一个IO操作，此时CPU处于空闲状态，可能会转而把CPU时间片分配给其他线程，这时也可以称为“暂停”状态。Blocked状态结束后，进入Runnable状态，等待系统重新分配资源。  
出现阻塞的情况大体分为如下5种：
 * 线程调用sleep方法，主动放弃占用的处理器资源。
 * 线程调用了阻塞式IO方法，在该方法返回前，该线程被阻塞。
 * 线程试图获得一个同步监视器，但该同步监视器正被其他线程所持有。
 * 线程等待某个通知。
 * 程序调用了suspend方法将该线程挂起。此方法容易导致死锁，尽量避免使用该方法。
4. run()方法运行结束后进入销毁阶段，整个线程执行完毕。  

### 每个锁对象都有两个队列，一个是就绪队列，一个是阻塞队列。就绪队列存储了将要获得锁的线程，阻塞队列存储了被阻塞的线程。一个线程被唤醒后，才会进入就绪队列，等待CPU的调度；反之，一个线程被wait后，就会进入阻塞队列，等待下一次被唤醒。