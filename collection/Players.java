package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player> {

	  @Override
	  public int compare(Player a1, Player a2) {
	    if (a1.score < a2.score) {
	      return 1;
	    } else if (a1.score > a2.score) {
	      return -1;
	    } else {
	      return a1.name.compareTo(a2.name);
	    }
	  }
	}
class Player {
	  String name;
	  int score;

	  Player(String name, int score){
	    this.name = name;
	    this.score = score;
	  }
	}


public class Players {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("enter no of player");
	    int n = scan.nextInt();

	    Player[] player = new Player[n];
	    Checker checker = new Checker();

	    System.out.println("enter name and after score ");
	    for(int i = 0; i < n; i++){
	      player[i] = new Player(scan.next(), scan.nextInt());
	    }
	    scan.close();

	    Arrays.sort(player, checker);
	    for(int i = 0; i < player.length; i++){
	      System.out.printf("%s %s\n", player[i].name, player[i].score);
	    }
	  }
}
