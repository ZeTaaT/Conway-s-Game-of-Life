


public class Cell{
	
	
	
	public char type; //either d or a (Dead or Alive)
	public image image; 
	
	
	public Cell(char type){
		
		this.type = type;
		if(type == 'a')
		{
			this.image = ALIVE_IMAGE;
		}
		else {
			this.image = DEAD_IMAGE;
		}
		
		
	}
	
	
}