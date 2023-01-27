import java.util.Scanner;

abstract class Player{
    int intellegence, strength, combat, charisma;
    public abstract void setStats();
    public abstract void printStats();
}


class Raider extends Player {
    public void setStats() {
      intellegence = 3;
      strength = 6;
      combat = 7;
      charisma = 5;
    }
    public void printStats()
    {
      System.out.println("Raider Stats:\nIntellegence: " + intellegence + "\nStrength: " + strength + "\nCombat: " + combat + "\nCharisma: " + charisma);
    }
  }

  class Janitor extends Player {
    public void setStats() {
      intellegence = 10;
      strength = 10;
      combat = 10;
      charisma = 10;
    }
    public void printStats()
    {
      System.out.println("Janitor Stats:\nIntellegence: " + intellegence + "\nStrength: " + strength + "\nCombat: " + combat + "\nCharisma: " + charisma);
    }
  }

  class Soldier extends Player {
    public void setStats() {
      intellegence = 4;
      strength = 7;
      combat = 7;
      charisma = 3;
    }
    public void printStats()
    {
      System.out.println("Soldier Stats:\nIntellegence: " + intellegence + "\nStrength: " + strength + "\nCombat: " + combat + "\nCharisma: " + charisma);
    }
  }

  class Doctor extends Player {
    public void setStats() {
      intellegence = 10;
      strength = 3;
      combat = 3;
      charisma = 5;
    }
    public void printStats()
    {
      System.out.println("Doctor Stats:\nIntellegence: " + intellegence + "\nStrength: " + strength + "\nCombat: " + combat + "\nCharisma: " + charisma);
    }
  }


public class App{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Player player1;
    System.out.println("What would you like to be in this crazy new world?\n1. Doctor (Smart and weak, interesting combo)\n2. Raider (otherwise know as a jerk)\n3. Soldier (feeling brave?)\n4. Janitor (Heart of gold and fists of steel)");
    int selection = sc.nextInt();
    switch(selection) {
      case 1: player1 = new Doctor();
        player1.setStats();
        player1.printStats();
        break;
      case 2: player1 = new Raider();
        player1.setStats();
        player1.printStats();
        break;
      case 3: player1 = new Soldier();
        player1.setStats();
        player1.printStats();
        break;
      case 4: player1 = new Janitor();
        player1.setStats();
        player1.printStats();
        break;
    }
    
    sc.close();
    
  }
}
