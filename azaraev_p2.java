import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class azaraev_p2{
    public static void main(String[] args){
        if(args.length != 2){ //check to see if there are correct # of args     
            System.out.println("There needs to be 2 arguments");
            System.exit(1);
	}
        //your arguments are the LLLL 1111 type                                 
        String directions = args[0];
        String marbleTypes = args[1];
        //make a list of the directions                                         
        char[] directionList = new char[4]; //there will be 4 items in the list
        //loop thru                                                             
	int i =	0;
	while(i < directions.length()){
            char letter	= directions.charAt(i);
            directionList[i] = letter;
            i++;
	}
	String marble = ""+marbleTypes;
	char[] marb=marble.toCharArray();
	System.out.print(directionList);

	char whichChute = '0';
	for(int x = 0; x<marb.length; x++){
	    //char whichChute = '0';
	    if(marb[x] == '0'){
		if(directionList[0] == 'L'){
		    directionList[0] = 'C';
		    if(directionList[1] == 'L'){
			directionList[1] = 'R';
		    	System.out.print("->");
		    	System.out.print(directionList);
		    	whichChute = 'B';
		    }//changes to center if on left and 0
		    else if(directionList[1] == 'R'){
		    	directionList[1] = 'L';
		    	System.out.print("->");
		    	System.out.print(directionList);
		    	whichChute = 'C';
		    }
		}
		else if(directionList[0] == 'R'){
			directionList[0] = 'L';
			if(directionList[3] == 'R'){  //x4
			    directionList[3] = 'L';
			    System.out.print("->");
			    System.out.print(directionList);
			    whichChute = 'E';
			}//if it starts to the right its gonna be E
			else if(directionList[3] == 'L'){
                            directionList[3] = 'R';
                            System.out.print("->");
			    System.out.print(directionList);
                            whichChute = 'D';
                        }//if it starts to the left its gonna be E
		}
		else if(directionList[0] == 'C'){
		    directionList[0] = 'R';
		    if(directionList[2] == 'L'){
			directionList[2] = 'R';
			System.out.print("->");
			System.out.print(directionList);
			whichChute = 'C';
		    }
		    else if(directionList[2] == 'R'){
			directionList[2] = 'L';
                        System.out.print("->");
                        System.out.print(directionList);
                        whichChute = 'D';
		    }
		}
	    }
	    else if (marb[x] == '1'){
		if(directionList[0] == 'L'){
                    directionList[0] = 'R';// if left u go to right
		    if(directionList[1] == 'L'){
			directionList[1] = 'R';
			System.out.print("->");
			System.out.print(directionList);
			whichChute = 'B';
		    }
		    else if (directionList[1] == 'R'){
                        directionList[1] = 'L';
                        System.out.print("->");
                        System.out.print(directionList);
                        whichChute = 'C';
                    }
		}
                else if(directionList[0] == 'R'){
		    //should this be directionList[0]???
                    directionList[0] = 'C'; //C?
		    if(directionList[3] == 'L'){
			directionList[3] = 'R';
			System.out.print("->");
			System.out.print(directionList);
			whichChute = 'C';
		    } else if(directionList[3] == 'R'){
			directionList[3] = 'L';
                        System.out.print("->");
                        System.out.print(directionList);
                        whichChute = 'E';
		    }
                }
                
                else if(directionList[0] == 'C'){
                    directionList[0] = 'L';
                    if(directionList[2] == 'L'){
                        directionList[2] = 'R';
                        System.out.print("->");
                        System.out.print(directionList);
                        whichChute = 'C';
                    }
                    else if(directionList[2] == 'R'){
                        directionList[2] = 'L';
                        System.out.print("->");
                        System.out.print(directionList);
                        whichChute = 'D';
                    }
                }
	    }
	}
	System.out.print(" "+ whichChute+ "\n");
    }
}
