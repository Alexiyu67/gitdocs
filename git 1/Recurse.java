public class Recurse {

  private void call(int i, int n) {
    if (i == n) return;
    System.out.println(i);
    call(i+1,n);
  }

  public static void main(String[] args) {
    Recurse recurse = new Recurse();
    recurse.call(0,100000);
  }

}