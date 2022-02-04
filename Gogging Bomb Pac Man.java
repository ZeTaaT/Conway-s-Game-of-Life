



	public int x = 10;
    public int y = 10;
	public int[,] board = new int[x, y];


public static void main(String[] args){
	
	populate();
	
	
	
	
	
	
}

public void populate(){


      int bombs = 20;
      while(bombs !=0){
		  
		int x = random(100);
		int y = random(100);
		
		if(board(x,y) == 9) {}
		else{ 
			board(x,y) = 9;
			bombs--;
		}
		
	  }
	  int size = board.size();
	  for(int i = 0; i < board.size1(); i++ ) {
		   for(int a = 0; a < board.size2(); a++ ) {
				if(board(i,a) != 9){
					
					int bomb = checkBomb();
					
					
					
				}
		  
		   }
		  
	  }
}

public int amount checkBomb(){
	
}
	

	