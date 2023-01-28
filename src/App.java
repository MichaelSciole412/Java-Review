import java.util.InputMismatchException;
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

  class Custom extends Player
  {
    public void setStats() 
    {
      int skillPoints = 21;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please set your intellegence: ");
      intellegence = setSkill(skillPoints, sc);
      skillPoints = skillPoints - intellegence;
      System.out.println("Skill points left to spend: " + skillPoints);
      if(skillPoints == 0)
      {
        return;
      }

      System.out.println("Please set your strength: ");
      strength = setSkill(skillPoints, sc);
      skillPoints = skillPoints - strength;
      System.out.println("Skill points left to spend: " + skillPoints);
      if(skillPoints == 0)
      {
        return;
      }

      System.out.println("Please set your combat: ");
      combat = setSkill(skillPoints, sc);
      skillPoints = skillPoints - combat;
      System.out.println("Skill points left to spend: " + skillPoints);
      if(skillPoints == 0)
      {
        return;
      }

      System.out.println("Please set your charisma: ");
      charisma = setSkill(skillPoints, sc);
      skillPoints = skillPoints - charisma;
      System.out.println("Skill points left to spend: " + skillPoints);
      if(skillPoints == 0)
      {
        return;
      }

      sc.close();
    }


    public int setSkill(int sp, Scanner getskill)
    {
      int skill = -1;
      while (skill > sp || skill < 0)
      {
        try
        {
          skill = getskill.nextInt();
        }
        catch (InputMismatchException e)
        {
          getskill.nextLine();
          System.out.println("Invalid input!");
        }
        if (skill > 10 || skill < 0)
        {
          System.out.println("Select a number between 0 and 10!");
          skill = -1;
        }
      }
      return skill;
    }

    public void printStats()
    {
      System.out.println("Custom Stats:\nIntellegence: " + intellegence + "\nStrength: " + strength + "\nCombat: " + combat + "\nCharisma: " + charisma);
    }
  }


public class App{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Player player1;
    System.out.println("What would you like to be in this crazy new world?\n1. Doctor (Smart and weak, interesting combo)\n2. Raider (otherwise know as a jerk)\n3. Soldier (feeling brave?)\n4. Janitor (Heart of gold and fists of steel)\n5. Custom (who knows who you will be?");
    int selection = 0;

    while (selection > 5 || selection < 1)
    {
      try{
        selection = sc.nextInt();
      }
      catch (Exception e) {
        sc.nextLine();
        System.out.println("Please enter an integer for character selection!");
      }
      if (selection > 5 || selection < 1)
      {
        System.out.println("Please select a number between 1 and 5!");
      }
    }
    

    switch (selection) {
      case 1: 
        player1 = new Doctor();
        player1.setStats();
        break;
      case 2: 
        player1 = new Raider();
        player1.setStats();
        break;
      case 3: 
        player1 = new Soldier();
        player1.setStats();
        break;
      case 4: 
        player1 = new Janitor();
        player1.setStats();
        break;
      default:
        player1 = new Custom();
        player1.setStats();
        break;
    }
    
    player1.printStats();
    sc.close();
    
  }
}
