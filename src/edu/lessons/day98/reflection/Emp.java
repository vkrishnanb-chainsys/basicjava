package edu.lessons.day98.reflection;
public class Emp
{
   public int Eno;
   public String Name;
   public Emp()
   {
      System.out.println("Emp Created");
   }
   public void startWork()
   {
      System.out.println("WorkStarted");
	}
	public void pauseWork(int duration)
	{
		System.out.println("pauseWork for "+duration );
	}
}