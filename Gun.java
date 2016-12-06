import java.util.*;

public class Gun {
  private String name;
  private ArrayList<Ammunition> magazine;

  public Gun(String name) {
    this.name = name;
    this.magazine = new ArrayList<Ammunition>();
  }

  public String getName() {
    return this.name;
  }

  public int bulletCount() {
    return magazine.size();
  }

  public void fire() {
    return magazine.clear;

  }

  public void load(Ammunition bullet) {
   magazine.add(bullet);
  }

  // public boolean magazineEmpty() {
  //   return bulletCount() == 0;
  // }

  // public boolean magazineFull() {
  //   return magazine.size;
  // }

  
}

