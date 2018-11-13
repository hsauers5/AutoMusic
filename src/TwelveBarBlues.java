import java.util.ArrayList;

import javax.sound.sampled.LineUnavailableException;

public class TwelveBarBlues {

	
	/*
	 * C, C, C, C
	 * F, F, C, C
	 * G, F, C, C
	 * 
	 * 48 beats in total.
	 * 96 eighth notes.
	 * 
	 * 1-16 are 1. 
	 * 17-24 are 4.
	 * 25-32 are 1.
	 * 33-36 are 5. 
	 * 37-40 are 4.
	 * 41-48 are 1.
	 * 
	 */
	
	ArrayList<Note> notes;
	int[] measures;
	int[] keys;
	String[] scaleDegrees;
	
	public TwelveBarBlues(String key)
	{
		scaleDegrees = AutoMusic.chromaticScale;
		
		notes = new ArrayList<Note>();
		//measures = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		
		//note that keys reflect chromatic degree, not true degree.
		keys = new int[] { 0, 0, 0, 0, 5, 5, 0, 0, 7, 5, 0, 0 };
		
		int measureCount = 0;
		int eighthCount = 0;
		int keyPicker = (int) (Math.random() * 4);
		System.out.println(keyPicker);
		
		for (int i = 0; i < 48; i++) 
		{
			eighthCount++;
			if (eighthCount == 4)
			{
				eighthCount = 0;
				measureCount++;
				if (measureCount == 12)
					measureCount--;
			}
			
			//generate notes
			Note note;
			
			if(keyPicker == 0)
			{			
				ArrayList<Note> scale = new Scale(scaleDegrees[keys[measureCount]]).Major;
				//randomly generates note from major scale.
				int num = (int) (Math.random() * 8);
				note = scale.get(num);
				notes.add(note);
			} else if (keyPicker == 1)
			{
				ArrayList<Note> scale = new Scale(scaleDegrees[keys[measureCount]]).Minor;
				//randomly generates note from major scale.
				int num = (int) (Math.random() * 8);
				note = scale.get(num);
				notes.add(note);
			} else if (keyPicker == 2)
			{
				ArrayList<Note> scale = new Scale(scaleDegrees[keys[measureCount]]).Blues;
				//randomly generates note from major scale.
				int num = (int) (Math.random() * 7);
				note = scale.get(num);
				notes.add(note);
			}  else if (keyPicker == 3)
			{
				ArrayList<Note> scale = new Scale(scaleDegrees[keys[measureCount]]).Mixolydian;
				//randomly generates note from major scale.
				int num = (int) (Math.random() * 8);
				note = scale.get(num);
				notes.add(note);
			}
		}
		
	}
	
	/**
	 * @todo randomize key
	 */
	public TwelveBarBlues()
	{
		this("C");
	}
	
	public String toString()
	{
		
		String song = "";
		
		int eighthCount = 0;
		int measureCount = 0;
		
		for (Note note : notes)
		{
			if (eighthCount == 4)
			{
				eighthCount = 0;
				measureCount++;
				song += " | ";
			}
			
			if (measureCount == 4)
			{
				measureCount = 0;
				song += "\n";
			}
			song += note + ", ";
			eighthCount++;
		}
			
		return song;
	}
	
	public void playNotes() throws LineUnavailableException
	{
		for (Note note : notes)
		{
			note.play(500);
		}
	}
	
}
