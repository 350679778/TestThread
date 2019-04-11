首先要明白thread和t1是两个完全不同的类，他俩之间唯一的联系就是thread作为一个target传递给了t1，hello thread = new hello();运行这句话的时候会调用hello的构造方法，Thread.currentThread().getName()是获得调用这个方法的线程的名字，在main线程中调用的当然是main了，而this.getName()这个方法是获取当前hello对象的名字，只是单纯的方法的调用。因为没有重写这个方法所以调用的是父类Thread(把这个对象当作是普通的对象)中的方法。
```
this.getName()-->
public final String getName() {
    return String.valueOf(name);
}//所以最终是输出name的值，因为你在hello的构造方法中没有显式调用父类的所以调用的是默认无参的
public Thread() {
    init(null, null, "Thread-" + nextThreadNum(), 0);
}//最终的名字就是这个"Thread-" + nextThreadNum()-->
private static synchronized int nextThreadNum() {
    return threadInitNumber++;
}//private static int threadInitNumber;因为是第一次调用nextThreadNum() 方法所以返回值为0-->this.getName()=Thread-0
//后面的输出类似。t1.setName("A");这句话只是修改了t1的名字，和thread对象没有关系，所以run方法中this.getName()的输出还是Thread-0。
```