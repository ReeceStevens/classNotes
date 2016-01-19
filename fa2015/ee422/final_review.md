EE 422C Final Review
==

Multithreading
--
	- Implements the Runnable interface  (what we'll prolly be using)
	- OR extend the Thread class
	- Syncronized keyword is used to protect from read/write race condition dangers
	- Also can use threadsafe datastructures
		Queue<Integer> q = new ConcurrentLinkedList<Integer>();
		List<Integer> l = new Collections.synchronizedList(new List<Integer>()) // Given a list, returns a thread-safe version of that list.			

public class MyDriver {
	public static void main(String[] args) {
		MyRunnable myFirstRunnable = new MyRunnable("Runnable 1");
		MyRunnable mySecondRunnable = new MyRunnable("Runnable 2");
		
		// Runs methods one after the other. Nothing special.
		myFirstRunnable.run();
		mySecondRunnable.run();
		
		// Now they print in a jumbled order
		myFirstRunnable.start();
		mySecondRunnable.start();
			
	}
}

public class MyRunnable implements Runnable {

	public myRunnable {
		run();
	}

	@Override
	public void run() {
		for (int i = 0; i , 10; i++) {
			System.out.println(runnableName + ": " + i);
		}
	}

	// Required if you are implementing runnable, already included if you're extending Thread
	public void start() {
		new Thread(this).start();
	}
}

WildCards
--
You can write into a superclass but can only pull from a subclass
(example of copy using a source of <? extends Number> into a destination of <? super Number>)

Linear probing vs. Chaining?
--
for hash tables.
