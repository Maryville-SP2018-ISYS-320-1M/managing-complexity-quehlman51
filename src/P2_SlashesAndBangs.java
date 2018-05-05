/*
  	ISYS 320
  	Name(s):
  	Date: 
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| Fwd Slash	| Bangs	| Back Slash | HEADING		| HEADING		|	
1                     0         22         0
2                     2         18         2
3                     4         14         4
4                     6         10         6   
5                     8         6          8
6                     10        2          10  
*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 
 
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		for (int line = 0; line < 6; line++) {			
			for (int i = 0; i < 2 * line; i++)
			System.out.print("\\");			
			for (int i = 0; i < 22 - (4 * line); i++)
				System.out.print("!");			
			for (int i = 0; i < 2 * line; i++)
			System.out.print("/");			
			System.out.println();

		}

	}

}
