package threadTest;

public class MyThread extends Thread {
   // 필드
   String str;

   // 생성자
   public MyThread(String str) {
      super();
      this.str = str;
   }
   

   @Override
   public void run() {
      for (int i = 0; i < 10; i++) {
         System.out.println(str);
      }
      System.out.println(str + "쓰레드 종료!");
   }

}