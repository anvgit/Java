package com.anvesh.basic.collection;

import java.util.*;

//Write your Checker class here
class Checker implements Comparator<Player>{

	@Override
	public int compare(Player a, Player b) {
		
		return 0;
	}

}
class Player{
 String name;
 int score;
 
 Player(String name, int score){
     this.name = name;
     this.score = score;
 }
}

class Solution {

 public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // int n = scan.nextInt();

     Player[] player = new Player[5];
     Checker checker = new Checker();
     
//     for(int i = 0; i < 5; i++){
//         player[i] = new Player(scan.next(), scan.nextInt());
//     }
     player[0] = new Player("amy", 100);
     player[1] = new Player("david", 100);
     player[2] = new Player("heraldo", 50);
     player[3] = new Player("aakansha", 75);
     player[4] = new Player("aleksa", 150);
     
     //scan.close();
  
     Arrays.sort(player, checker);
     for(int i = 0; i < player.length; i++){
         System.out.printf("%s %s\n", player[i].name, player[i].score);
     }
 }
}
