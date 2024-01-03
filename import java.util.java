import java.util.ArrayList;
import java.util.List;
class Main {
  public static void main(String[] args) {
    
    List<String> Favs = new ArrayList<>();
    Favs.add("women are from mars");
    Favs.add("hitler");
    Favs.add("oppenheimer");
    Favs.add("13 angry men");
    Favs.add("thousand years");
    Favs.remove(3);
  for(String personal: Favs ){
    System.out.println(personal);



  }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}