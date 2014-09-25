/* 
 *when run this program will simulate a baseball game between
 *two teams. It will display each inning of the game and how many 
 *runs each team scored in the inning and then the overall score of the game
 *until the 9 innings are up. 
 */

public class LoopyBaseball { 

    public static void main(String[] args) {
        int Giants, Dodgers; //this will represent the score for the team overall
        int inningScoreG, inningScoreD; //the score for the inning 
        int inning; //this will be increased by 1 each time through the loop      
        Giants = 0; 
        Dodgers = 0; 
        inning = 1; 
        while (inning < 9) { 
            inningScoreG = (int)(Math.random()*5);
            inningScoreD = (int)(Math.random()*5);
                if (inning == 2 ||inning == 3 || inning == 5 || inning == 7 || inning == 8 ){
                inningScoreG = 0;
                inningScoreD= 0;
                }
            System.out.println();
            System.out.println ("Inning " + inning); 
            System.out.println("The Giants score " + inningScoreG); 
            System.out.println("The Dodgers score " + inningScoreD); 
            Giants = inningScoreG + Giants ; 
            Dodgers = inningScoreD + Dodgers ; 
            System.out.println("Score at the end of the inning: The Giants " + Giants + " to The Dodgers " + Dodgers); 
            inning ++ ;
                
       }
       
     	if (inning == 9){
     		System.out.println(); 
     		System.out.println("inning " + inning); 
     		inningScoreG = (int)(Math.random()*5);
     		System.out.println("The Giants score " + inningScoreG); 
     		Giants = inningScoreG + Giants ; 
     		
     	
     	}
        
        
        if (Giants > Dodgers){
        	inningScoreD = (int)(Math.random()*5); 
        	System.out.println ("The dodgers score " + inningScoreD); 
        	Dodgers = inningScoreD + Dodgers; 
        }
        	else if (Dodgers > Giants){ 
       				 System.out.println("The Dodgers score -");
        	
        	}
        System.out.println("The score at the end of the inning is The Giants " + Giants + " to The Dodgers " + Dodgers);
             
        if (Giants == Dodgers){ 
        	inning = 10; 
            System.out.println("Extra innings!");
            while (Giants == Dodgers){           
            System.out.println();
            System.out.println("Inning " + inning);
            inningScoreG = (int)(Math.random()*2);
            inningScoreD = (int)(Math.random()*2);
            System.out.println("The Giants score " + inningScoreG); 
            System.out.println("The Dodgers score " + inningScoreD); 
            Giants = inningScoreG + Giants ; 
            Dodgers = inningScoreD + Dodgers ; 
            System.out.println("Score at the end of the inning: The Giants " + Giants + " to The Dodgers " + Dodgers); 
            inning ++ ;
            }
        
        }
        
        if (Giants > Dodgers){ 
       System.out.println("The Giants win :-D!!!!!!!!!!!!") ;
       
       }
        else if (Dodgers > Giants) {
       System.out.println ("The Dodgers win :-(");
       
        }
        
        
        
        
        
    
    
    
    
    
    }
}
