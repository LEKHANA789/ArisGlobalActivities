
public class ThreadClass {
	public void run()
	    {

	        try {
	            for (int i = 0; i < 5; i++) {
	                
	                // it will sleep the main thread for 1 sec
	                // ,each time the for loop runs
	                ThreadClass.sleep(100);
	                
	                // This Thread.sleep() method will sleep the
	                // thread 0.
	                // printing the value of the variable
	                System.out.println(i);
	            }
	        }
	        catch (Exception e) {
	            
	            // catching the exception
	            System.out.println(e);
	        }
	    }
	    
		public static void main(String[] args)
	    {
	        // main thread
	       ThreadClass obj = new ThreadClass();
	        obj.start();
	        obj.run();
	    }
		private void start() {
			// TODO Auto-generated method stub
			System.out.println("Thread is starting");
		}
		private static void sleep(int i) {
			// TODO Auto-generated method stub
		    	//System.out.println("Thread is sleep for"+i+"seconds");
			
		}
	}


