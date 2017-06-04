package dynamicProgramming;

class A implements Runnable{public void run() {}}
class B {
  public static void main(String[] args) {
    Thread t1 = new Thread();             // 1
    Thread t2 = new Thread(new A());      // 2
    Thread t3 = new Thread(new A(), "A"); // 3
    Thread t4 = new Thread("A");          // 4
}}