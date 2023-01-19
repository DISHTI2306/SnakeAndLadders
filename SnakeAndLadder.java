/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;
import javax.swing.JOptionPane;
/**
 *
 * @author Dishti Chitapain
 */
public class SnakeAndLadder {
      static int number1=0,number2=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        JOptionPane.showMessageDialog(null, "Two players alternate to play. The one to reach position 100 first wins the game");
         int result1=0 ,result2=0;
         String output1;
         String output2;
          do{
          if(number1==0 && number2==0){
          //player1
          do{
          result1= rollDie();
        
          if(result1!=6){
               output1 = " You have to roll a 6 to get on the board to start the game";
                 JOptionPane.showMessageDialog(null,"player1: you roll a die " + result1 + "" + output1);
          }else if (result1==6){
              number1=1;
           output1="player1: You won a six.you may get on the board,current position 1"; 
           JOptionPane.showMessageDialog(null, output1);
           //congrats player1 you can start the game
          }     
          
          //player2
          result2= rollDie();
          
          if(result2!=6){
                 output2 ="You have to roll a 6 to start the game";
                   JOptionPane.showMessageDialog(null, "player2: you roll the die " + result2 + "" + output2);
          }else if (result2==6){
              number2=1;
            output2="player2: You won a six.You may get on the board,current position 1";
            JOptionPane.showMessageDialog(null, output2);
            //congrats player2 you can start the game
          }
   
          }while(result1!=6 && result2!=6);
          }
          if(number1>=1 && number2<=0){    //to continue to add to the number
           do{
              //Call method for player1
              result1=rollDie();
              player1(result1);
              JOptionPane.showMessageDialog(null,"player one rolled a " + result1 + "you reached on" + number1);
              
              //player2 finding 6 to start the game
          result2= rollDie();
          if(result2!=6){
                 output2 ="You have to roll a 6 to start the game";
                   JOptionPane.showMessageDialog(null, "player2: you roll the die " + result2 + "" + output2);
          }else if (result2==6){
              number2=1;
            output2="player2: You won a six.You may get on the board,current position 1";
            JOptionPane.showMessageDialog(null, output2);
            //congrats player2 you can start the game
          }
              
           }while(result2!=6);
          }else if (number2>=1 && number1<=0){
            do{
                //player1 still trying to finding 6
                result1= rollDie();
          if(result1!=6){
               output1 = " You have to roll a 6 to get on the board to start the game";
                 JOptionPane.showMessageDialog(null,"player1: you roll a die " + result1 + "" + output1);
          }else if (result1==6){
              number1=1;
           output1="player1: You won a six.you may get on the board,current position 1"; 
           JOptionPane.showMessageDialog(null, output1);
           //congrats player1 you can start the game
          }     
          
                //call method for player2
                result2=rollDie();
                player2(result2);
                JOptionPane.showMessageDialog(null,"player two rolled a " + result2 + "you reached on" + number2);
               
            }while(result1!=6);
              
          }
          
          //Both player1 and player2 are on board
         
          //call method for player1:
           result1=rollDie();
           player1(result1);
           if(number1==100){
               System.exit(0);
           }
           JOptionPane.showMessageDialog(null, "player1 rolled a " + result1 + "you reached on" + number1);
           
           
          //call method for player2:
           result2=rollDie();
           player2(result2);
             if(number2==100){
               System.exit(0);
           }
           JOptionPane.showMessageDialog(null, "player2 rolled a " + result2 + "you reached on" + number2);
           
           
          }while(number1!=100 && number2!=100);
       
          }
           public static int rollDie(){
                 return (int)(Math.random()*6)+1;
          }  
     public static void player1(int result1){
         number1 = number1 + result1;
         //5 Ladders:
         if(number1==3){
             number1=39;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"you reach a ladder, now you are on position="+number1);
         }
         if(number1==27){
             number1=53;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"You reach a ladder, now you are on position="+number1);
         }
         if(number1==56){
             number1=84;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"You reach a ladder, now you are on position="+number1);
         }
         if(number1==61){
             number1=99;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"You reach a ladder, now you are on position="+number1);
         }
         if(number1==72){
             number1=90;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"You reach a ladder, now you are on position="+number1);
         }
         //5 Snakes
         if(number1==31){
             number1=4;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"You are bitten by a snake, now you are on position="+number1);
         }
         if(number1==47){
             number1=25;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"You are bitten by a snake, now you are on position="+number1);
         }
         if(number1==66){
             number1=52;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"You are bitten by a snake, now you are on position="+number1);
         }
         if(number1==63){
             number1=60;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"You are bitten by a snake, now you are on position="+number1);
         }
         if(number1==97){
             number1=75;
             JOptionPane.showMessageDialog(null,"player1 rolled a"+result1+"You are bitten by a snake, now you are on position="+number1);
       
         }
       //if player1 exceeds 100 on the board
       if(number1>=101){
           number1=number1 - result1;
           JOptionPane.showMessageDialog(null,"player1 does not move,you cannot exceed 100 on the board" );
       }
       //player1 wins the game:
       if(number1==100){
          JOptionPane.showMessageDialog(null, "Congrats.player1 scores a 100,you win the game\nplayer2 lose"); 
       }
     }
     
     public static void player2(int result2){
         number2 = number2 + result2;
         //5 Ladders:
          if(number2==3){
             number2=39;
             JOptionPane.showMessageDialog(null, "player2 rolled a"+result2+"You reach a ladder, now you are on position="+number2);
         }
         if(number2==27){
             number2=53;
             JOptionPane.showMessageDialog(null, "player2 rolled a"+result2+"You reach a ladder, now you are on position="+number2);    
         }
         if(number2==56){
             number2=84;
             JOptionPane.showMessageDialog(null,"player2 rolled a"+result2+"You reach a ladder, now you are on position="+number2);
         }
         if(number2==61){
             number2=99;
             JOptionPane.showMessageDialog(null,"player2 rolled a"+result2+"You reach a ladder, now you are on position="+number2);
         }
         if(number2==72){
             number2=90;
             JOptionPane.showMessageDialog(null,"player2 rolled a"+result2+"You reach a ladder, now you are on position="+number2);
         }
         //5 Snakes
         if(number2==31){
             number2=4;
             JOptionPane.showMessageDialog(null,"player2 rolled a"+result2+"You are bitten by a snake, now you are on position="+number2);
         }
         if(number2==47){
             number2=25;
             JOptionPane.showMessageDialog(null,"player2 rolled a"+result2+"You are bitten by a snake, now you are on position="+number2);
         }
         if(number2==66){
             number2=52;
             JOptionPane.showMessageDialog(null,"player2 rolled a"+result2+"You are bitten by a snake, now you are on position="+number2);
         }
         if(number2==63){
             number2=60;
             JOptionPane.showMessageDialog(null,"player2 rolled a"+result2+"You are bitten by a snake, now you are on position="+number2);
         }
         if(number2==97){
             number2=75;
             JOptionPane.showMessageDialog(null,"player2 rolled a"+result2+"You are bitten by a snake, now you are on position="+number2);
     }       
        //if player2 exceeds 100 on the board
       if(number2>=101){
           number2=number2 - result2;
           JOptionPane.showMessageDialog(null,"player2 does not move,you cannot exceed 100 on the board" );
            }
         //player2 wins the game:
       if(number2==100){
          JOptionPane.showMessageDialog(null, "Congrats.player2 scores a 100,you win the game\nplayer1 lose"); 
       }
        
       
     }
     
}
        
   
         
         
      
        
         

   
