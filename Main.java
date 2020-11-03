class Main {
  public static void main(String[] args) {
  String[] toys = {"monoply", "beyblades", "pokemon cards", "chess", "checkers", "frisbee", "ping pong", "action figures", "yoyo"};

  for(int i = 0; i < 9; i++){
  System.out.println(toys[i]);
  }

  toys[6]= "ping pong";

  System.out.println("\n Here is my updated array: \n");

    for(int i = 0; i < 9; i++){
  System.out.println(toys[i]);
  }
  
  }
}