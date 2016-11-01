import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TeamTest{

  Team team;

  @Before
  public void before(){
    team = new Team("West Ham");
    // System.out.println("Created West Ham");
  }

  @Test
  public void teamStartsWithZeroPoints(){
    assertEquals( 0, team.getPoints() );

  }

  @Test
  public void teamHasName(){
    assertEquals( "West Ham", team.getName() );
  }

  







}