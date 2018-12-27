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
A inner class is a class inside other. That simplify code, making it more clear and intuitive. I change some classes that I already have to inner classes because there are correlated.
I put Product Class inside Category Class, because at the time that you register a product, you assign this product to a category, then, it is logic to be inside of Category Class.
I also move the class TopBuyers to User, because in the website only con buy users so, it is logically an user will be a top buyer. According to this, I put TopBuyers Class inside User.
Finally, the class recently created based on threads, BuyTime, I include it inside Product Class. By this way, we have a Class called Category, that includes Product Class, that includes BuyTime class.

Doing this, we can see the main classes firstly, finding the secondary ones inside each one, making the code intuitive.
## Testing
Before doing this final project I took a picture of percentage of testing coverage.
In the picture we can see that the project has a 22.4% of coverage. More concretely, a 0.0% of Controller testing, 17.6% of main classes, and 95.8% of correct tests.
![alt text](https://github.com/AlonsoMartinToledano/Apricity/blob/master/pictures/1.PNG)

After making some changes the general percentage decrease to 11.8%.
In the picture we can see that the Controller Class still in 0.0%, main classes has 5.5% (It decrease 12.1%), and testing accuracy decrease to 94.0% (A 1.8% from last picture).
![alt text](https://github.com/AlonsoMartinToledano/Apricity/blob/master/pictures/2.PNG)

Finally, I dis some new tests after complete the final project.
As we can see, the general percentage of covering by testing increase to 25.6% (13,8% more than the last picture, and 3.4% more than at the beggining of the project).
Controller Class still in 0.0% of testing, main classes increase to 20.8% (15.3% more than the last picture, and 3.8% more than the beggining of the project), and testing accuracy increase to 99.4% (5.4% more than the last picture, and 3.6% more than at the beggining of the project).

![alt text](https://github.com/AlonsoMartinToledano/Apricity/blob/master/pictures/3.PNG)
