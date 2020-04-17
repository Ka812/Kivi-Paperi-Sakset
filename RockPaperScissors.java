import java.util.*;
    
class RockPaperScissors {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hei! Pelataan vähän vanhaa kunnon Kivi - Paperi - Sakset -peliä!") ;
        System.out.println() ;
        System.out.println("Muistathan, että säännöt meni siten, että paperi voittaa kiven,") ;
        System.out.println("kivi voittaa sakset ja sakset voittaa paperin?") ;
        System.out.println() ;
        System.out.print("Pelataan paras viidestä systeemillä, eli kolmesta voitosta.") ;
        System.out.println("") ;
        System.out.println("Aloitetaanpa sitten.") ;
        System.out.println("") ;
        int yourWins = 0 ;
        int computerWins = 0 ;

        while (yourWins < 3 && computerWins < 3) {
            System.out.print("Tee valintasi:" ) ;
            System.out.println("1) rock, 2) paper, 3) scissors?");
            int choice = Integer.parseInt(s.nextLine());
            int computerChoice = (int) (Math.random()*3 + 1) ; // random stuff
            
            if(choice == 1 && computerChoice == 2) {
                System.out.println("Computer won!");
                computerWins = computerWins + 1 ;
                System.out.println() ;
                System.out.println("Tilanne on: " + "Sinä " + yourWins + " - " + "Tietokone " + computerWins) ;
                System.out.println() ;
            } else if (choice == 1 && computerChoice == 3) {
                System.out.println("You won!") ;
                yourWins = yourWins + 1 ;
                System.out.println() ;
                System.out.println("Tilanne on: " + "Sinä " + yourWins + " - " + "Tietokone " + computerWins) ;
                System.out.println() ;

            } else if (choice == 2 && computerChoice == 1) {
                System.out.println("You won!") ;
                yourWins = yourWins + 1 ;
                System.out.println() ;
                System.out.println("Tilanne on: " + "Sinä " + yourWins + " - " + "Tietokone " + computerWins) ;
                System.out.println() ;

            } else if (choice == 2 && computerChoice == 3) {
                System.out.println("Computer won!") ;
                computerWins = computerWins + 1 ;
                System.out.println() ;
                System.out.println("Tilanne on: " + "Sinä " + yourWins + " - " + "Tietokone " + computerWins) ;
                System.out.println() ;

            } else if (choice == 3 && computerChoice == 1) {
                System.out.println("Computer won!") ;
                computerWins = computerWins + 1 ;
                System.out.println() ;
                System.out.println("Tilanne on: " + "Sinä " + yourWins + " - " + "Tietokone " + computerWins) ;
                System.out.println() ;

            } else if (choice == 3 && computerChoice == 2) {
                System.out.println("You won!") ;
                yourWins = yourWins + 1 ;
                System.out.println() ;
                System.out.println("Tilanne on: " + "Sinä " + yourWins + " - " + "Tietokone " + computerWins) ;
                System.out.println() ;

            } else {
                System.out.println("Tie, you didn't win, computer did't win") ;
                System.out.println() ;
            }
        }

        if (yourWins > computerWins) {
            System.out.println("Onnittelut! Voitit " + yourWins + " - " + computerWins) ;
            System.out.println("Olet SUURMESTARI!!!") ;
        } else {
            System.out.println("Osanottoni, hävisit " + yourWins + " - " + computerWins + " Harjoittelehan lisää!!!") ;
        }

    }
}
