import javax.sound.sampled.LineUnavailableException;

public class Note {

	String name;
	String fileName;
	double mhertz;
		
	public Note(String note)
	{
		name = note;
		fileName = name.toLowerCase() + ".wav";
		
		for (int i = 0; i < AutoMusic.chromaticScale.length; i++)
		{
			if (AutoMusic.chromaticScale[i] == note)
			{
				mhertz = AutoMusic.hertzList[i];
			}
		}
			
	}
	
	/**
	 * 
	 * @param lenth - length in seconds to play the note.
	 * Let's assume a tempo of 2 beats per second or 120bpm for now.
	 * @throws LineUnavailableException 
	 */
	public void play(int length) throws LineUnavailableException
	{
		Sound.play((int) mhertz, length);
	}
	
	/**
	 * @return name of note
	 */
	public String toString()
	{
		return name;
	}
	
}
