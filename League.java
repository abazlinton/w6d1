import java.util.*;

public class League{

  private String name;
  private ArrayList<Team> teams;
  private int leaguePlaces = 24;

  public League( String name ){
    this.name = name;
    this.teams = new ArrayList<Team>();
  }

  public String getName(){
    return this.name;

  }

  public int countTeams(){
    return this.teams.size();

  }

  // public int getNextSlot(){
  //   return countTeams();
  // }

  public boolean isLeagueFull(){
    return this.countTeams() == this.leaguePlaces;
  }

  public void addTeam( Team team ){
    if ( isLeagueFull() == false ) { 
      this.teams.add(team);
    }
  }

  // public boolean isLeagueFull(){
  //   if ( this.countTeams() == this.leaguePlaces ){
  //     return true;
  //   } else {
  //     return false;
  //   }
    
  // }

  

  
}