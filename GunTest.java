import static org.junit.Assert.assertEquals;
import org.junit.*;

public class GunTest {
  Gun gun;
  Bullet bullet;

  @Before
  public void before() {
    gun = new Gun("SA80");
    bullet = new Bullet();
  }

  @Test
  public void hasName(){
    assertEquals("SA80", gun.getName());
  }

  // @Test
  // public void magazineStartsFull() {
  //   assertEquals(30, gun.bulletCount());
  // }

  @Test 
  public void gunCanFire() {
    gun.load(bullet);
    assertEquals(1, gun.bulletCount());
    gun.fire();
    assertEquals(0, gun.bulletCount());
  }

  @Test 
  public void gunCanReload() {
    gun.load(bullet);
    assertEquals(1, gun.bulletCount());
  }

  @Test
  public void magazineIsEmpty() {
    assertEquals(0, gun.bulletCount());
  }

  @Test
  public void magazineIsFull() {
    for (int i = 0; i < 30; i++) {
      gun.load(bullet);
    }
    assertEquals(true, gun.magazineFull());
  }
}