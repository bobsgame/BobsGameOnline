package com.bobsgame.client.state;

import com.bobsgame.client.engine.EnginePart;

//=========================================================================================================================
public class State
{//=========================================================================================================================




	static public long lastTicks = 0; //updated once per frame from main loop
	static public long mainTicksPassed = 0;//updated once per frame from main loop
	static public boolean callNanoTimeForEachCall = false;

	public float engineSpeed = 1.0f;



	//=========================================================================================================================
	public void setEngineSpeed(float f)
	{//=========================================================================================================================
		engineSpeed = f;

	}


	//=========================================================================================================================
	public long engineTicksPassed()
	{//=========================================================================================================================


		if(callNanoTimeForEachCall==true)
		{
			long ticks = System.nanoTime()/1000/1000;//Sys.getTime();

			return (long)((ticks-lastTicks)*engineSpeed);

		}
		else
		{
			return (long)(mainTicksPassed * engineSpeed);
		}


		//DONE: can multiply this to speed up game, divide it to slow game down!

	}

	//=========================================================================================================================
	public long realWorldTicksPassed()
	{//=========================================================================================================================


		if(callNanoTimeForEachCall==true)
		{
			long ticks = System.nanoTime()/1000/1000;//Sys.getTime();

			return (long)((ticks-lastTicks));

		}
		else
		{
			return (long)(mainTicksPassed);
		}


		//DONE: can multiply this to speed up game, divide it to slow game down!

	}
	//=========================================================================================================================
	public void update()
	{//=========================================================================================================================


	}
	//=========================================================================================================================
	public void render()
	{//=========================================================================================================================


	}
	//=========================================================================================================================
	public void cleanup()
	{//=========================================================================================================================

	}

}