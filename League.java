public class League{

  private String name;
  private Team[] teams;

  public League( String name ){
    this.name = name;
    this.teams = new Team[24];
  }

  public String getName(){
    return this.name;

  }

  public int countTeams(){
    int team_count = 0;
    for ( Team team : teams ){
      if ( team != null ) {
        team_count++;
      }
    }
    return team_count;

  }

  public int getNextSlot(){
    return countTeams();
  }

  public void addTeam( Team team ){
    if ( this.isLeagueFull() == false ) {
      teams[ getNextSlot() ] = team;
    } else {
      return;
    }
  }

  // public boolean isLeagueFull(){
  //   if ( this.countTeams() == this.teams.length ){
  //     return true;
  //   } else {
  //     return false;
  //   }
    
  // }

  public boolean isLeagueFull(){
    return this.countTeams() == this.teams.length;
  }

  
}