public class Gun {
  private String name;
  private Bullet[] magazine;

  public Gun(String name) {
    this.name = name;
    this.magazine = new Bullet[30];
  }

  public String getName() {
    return this.name;
  }

  public int bulletCount() {
    int count = 0;
    for (Bullet bullet : magazine) {
      if (bullet != null) {
        count++;
      }

    }
    return count;
  }

  public void fire() {
    if (magazineEmpty()) {
      
    }
    int bulletCount = bulletCount();
    magazine[bulletCount -1] = null;

  }

  public void load(Bullet bullet) {
    if (magazineFull()) {
      
    }
    else {
      int bulletCount = bulletCount(); 
      magazine[bulletCount] = bullet;
    }
  }

  public boolean magazineEmpty() {
    return bulletCount() == 0;
  }

  public boolean magazineFull() {
    return bulletCount() == magazine.length;
  }

  
}

