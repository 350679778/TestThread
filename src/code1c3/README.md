����Ҫ����thread��t1��������ȫ��ͬ���࣬����֮��Ψһ����ϵ����thread��Ϊһ��target���ݸ���t1��hello thread = new hello();������仰��ʱ������hello�Ĺ��췽����Thread.currentThread().getName()�ǻ�õ�������������̵߳����֣���main�߳��е��õĵ�Ȼ��main�ˣ���this.getName()��������ǻ�ȡ��ǰhello��������֣�ֻ�ǵ����ķ����ĵ��á���Ϊû����д����������Ե��õ��Ǹ���Thread(���������������ͨ�Ķ���)�еķ�����
```
this.getName()-->
public final String getName() {
    return String.valueOf(name);
}//�������������name��ֵ����Ϊ����hello�Ĺ��췽����û����ʽ���ø�������Ե��õ���Ĭ���޲ε�
public Thread() {
    init(null, null, "Thread-" + nextThreadNum(), 0);
}//���յ����־������"Thread-" + nextThreadNum()-->
private static synchronized int nextThreadNum() {
    return threadInitNumber++;
}//private static int threadInitNumber;��Ϊ�ǵ�һ�ε���nextThreadNum() �������Է���ֵΪ0-->this.getName()=Thread-0
//�����������ơ�t1.setName("A");��仰ֻ���޸���t1�����֣���thread����û�й�ϵ������run������this.getName()���������Thread-0��
```