import java.util.ArrayList;

public class Scale {
	
	ArrayList<Note> Chromatic = new ArrayList<Note>();
	ArrayList<Note> Major = new ArrayList<Note>();
	ArrayList<Note> Minor = new ArrayList<Note>();
	ArrayList<Note> Blues = new ArrayList<Note>();
	ArrayList<Note> Mixolydian = new ArrayList<Note>();
	
	/**
	 * Default constructor for Scale class. Assumes a key of C.
	 */
	public Scale()
	{
		this("C");
	}
	
	public Scale(String key)
	{
		int beginningDegree = 0;
		
		//find the first scale degree
		for (int i = 0; i < 13; i++)
			if (AutoMusic.chromaticScale[i] == key)
				beginningDegree = i;
		//populate scale
		for (int i = beginningDegree; i < beginningDegree + 13; i++)
		{
			Note note = new Note(AutoMusic.chromaticScale[i]);
			Chromatic.add(note);
		}
		
		generateScales();
	}
	
	//populates other scales upon creation of chromatic
	public void generateScales()
	{
		//major
		Major.add(Chromatic.get(0));
		Major.add(Chromatic.get(2));
		Major.add(Chromatic.get(4));
		Major.add(Chromatic.get(5));
		Major.add(Chromatic.get(7));
		Major.add(Chromatic.get(9));
		Major.add(Chromatic.get(11));
		Major.add(Chromatic.get(12));
		
		//minor
		Minor.add(Chromatic.get(0));
		Minor.add(Chromatic.get(2));
		Minor.add(Chromatic.get(3));
		Minor.add(Chromatic.get(5));
		Minor.add(Chromatic.get(7));
		Minor.add(Chromatic.get(9));
		Minor.add(Chromatic.get(10));
		Minor.add(Chromatic.get(12));
		
		//mixolydian
		Mixolydian.add(Chromatic.get(0));
		Mixolydian.add(Chromatic.get(2));
		Mixolydian.add(Chromatic.get(4));
		Mixolydian.add(Chromatic.get(5));
		Mixolydian.add(Chromatic.get(7));
		Mixolydian.add(Chromatic.get(9));
		Mixolydian.add(Chromatic.get(10));
		Mixolydian.add(Chromatic.get(12));
		//Mixolydian.add(Chromatic.get(14));
		
		//blues
		Blues.add(Chromatic.get(0));
		Blues.add(Chromatic.get(3));
		Blues.add(Chromatic.get(5));
		Blues.add(Chromatic.get(6));
		Blues.add(Chromatic.get(7));
		Blues.add(Chromatic.get(10));
		Blues.add(Chromatic.get(12));
		
	}
	
	public void returnScales()
	{
		System.out.println();
		for (Note note : Chromatic)
		{
			System.out.print(note + ", ");
		}
		
		System.out.println();
		
		for (Note note : Major)
		{
			System.out.print(note + ", ");
		}
		
		System.out.println();
		
		for (Note note : Minor)
		{
			System.out.print(note + ", ");
		}
		
		System.out.println();
			
		for (Note note : Blues)
		{
			System.out.print(note + ", ");
		}
		
		System.out.println();
		
		for (Note note : Mixolydian)
		{
			System.out.print(note + ", ");
		}
		
	}
	
}
