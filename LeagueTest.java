import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LeagueTest{

  League league;
  Team team;


  @Before 
  public void before() {
    league = new League( "Premier League");
    team = new Team("West Ham");
  }

  @Test
  public void hasName(){
    assertEquals( "Premier League", league.getName() );
  }

  @Test 

  public void teamCountStartsAtZero() {
    assertEquals( 0, league.countTeams() );
  }

  @Test 
  public void canAddTeamToLeague(){
    league.addTeam( team );
    assertEquals( 1, league.countTeams() );
  }

  @Test
  public void cantAddWhenFull(){
    for (int i = 0; i < 30; i++){
      league.addTeam( team );
    }
    assertEquals( 24, league.countTeams() );

  }

  @Test

  public void testLeagueFull(){
    for ( int i = 0; i < 24; i++){
      league.addTeam( team );
    }
    assertEquals( true, league.isLeagueFull() );

  }


}