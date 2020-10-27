class Ex33 {
  public static void main ( String[] args ) {
      NewCar mycar = new NewCar(10.0, 5.0);
      mycar.regNumber(1234);
      System.out.println(mycar.run(200) + " km 走行しました"); // 200 km 走行させる
      System.out.println(mycar.run(1) + " km 走行しました"); // 1 km 走行させる
      mycar.replenish(10); // 10 リットル給油
      
      System.out.println(mycar.run(20) + " km 走行しました"); // 20 km 走行させる
     
      mycar.print(); // ガソリンの残りを表示
  }
}
