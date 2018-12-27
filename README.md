# Apricity
## Description
This is the last exercise of this project, the ecommerce Apricity.
On this README I will show three different pictures that show testing before, middle and after finish the project. I will also explain some Inner classes and threads that I add to the final project.
## Threads
On this project I made a buy system based on threads. By this method, I can avoid the website overload. I implement a thread at time to buy something. When you boy something, the thread sleeps for a random time between 0 to 5 seconds to buy a product again.
I create the class BuyTime, who implements Runnable. Also import java.security.SecureRandom to generate random numbers. That number we will record it in a variable called sleep time. We did this in the constructor of the class BuyTime.
We had implemented Runnable, so we have to override the method run(). In this method, we did a try catch, to catch any exception that can happen without our knowledge. Inside the try, we put a message to the user telling how many seconds has to wait before making another purchase, and we sleep the thread these seconds.
Finally, the thread continues working, and console shows a message to the user telling him that he can buy again.

	public static class BuyTime implements Runnable {
		private static SecureRandom randomTime = new SecureRandom();
		private int sleepTime;

		public BuyTime () {
			sleepTime = randomTime.nextInt(5000);
		}

		@Override
		public void run() {
			try {
				System.out.println("You can buy again in " + sleepTime + "seconds");
				Thread.sleep(sleepTime);
			}catch(InterruptedException exception) {
				exception.printStackTrace();
				Thread.currentThread().interrupt();
			}
			System.out.println("Now you can buy again");
		}
	}
## Inner Classes


## Testing
