package lock;



/**
 * @author Colin
 *
 */
public class lock {
	
	private int key;
	private int rank;
	private int num;
	private int rust;
        public double time;
	
	//pos must always be an odd number >=9
	
	/**
	 * Generates a lock based off of a given rank
	 * and the specified key position
	 *
	 * @param int k is the specified position for the lockpick to open
	 * @param int r the rank of the lock r>=1 && r<=5
	 */
	public lock(int k, int r){
		key =k;
		rank =r;
                if(rank==1){num=9;}
		else if(rank==2){num=17;}
		else if(rank==3){num=27;}
		else if(rank==4){num=69;}
		else if(rank==5){num=179;}
		rust =(int)(Math.random()*5);
                time = 0;
	}
	
	
	
	/**
	 * Generates a lock only based off of a given rank
	 * 
	 * @param int r the rank of the lock r>=1 && r<=6
	 */
	public lock(int r){
		rank =r;
		if(rank==1){num=9;}
		else if(rank==2){num=17;}
		else if(rank==3){num=27;}
		else if(rank==4){num=69;}
		else if (rank ==5){
                    num=179;
                }
		key =(int)(Math.random()*num);
		rust =(int)(Math.random()*5);
                time = 0;
	}
        
        public int getKey(){
            return key;
        }
        
        public int getRust(){
            return rust;
        }
        
        public double getTime(){
            return time;
        }
        
        public int getRank(){
            return rank;
        }
        
        public int getNum(){
            return num;
        }

}
