/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pdgame;

import java.util.Random;


/**
 *
 * @author maksim
 */
public class RandomPlayer implements Player {
    
    int totalScore=0;

    public int makeMove() {
        Random r=new Random();
        return(r.nextInt(2)); //Return an integer 0 or 1
    }

    public void setScore(int myMove, int oppMove, int myScore, int oppScore) {
        totalScore+=myScore;
        System.out.println("Score"+myScore+" over "+oppScore+" My total: "+totalScore);
    }

}
