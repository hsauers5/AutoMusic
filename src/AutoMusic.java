import javax.sound.sampled.LineUnavailableException;

public class AutoMusic {

	public static String[] chromaticScale;
	public static double[] hertzList;
	
	public static void main(String[] args) throws LineUnavailableException {
		// TODO Auto-generated method stub
		
		//environment variables go here
		
		int[] chromaticPitch = new int[25];
		
		for (int i : chromaticPitch)
			chromaticPitch[i] = i+1;
		
		
		chromaticScale = new String[25];
		chromaticScale[0] = "C";
		chromaticScale[1] = "Db";
		chromaticScale[2] = "D";
		chromaticScale[3] = "Eb";
		chromaticScale[4] = "E";
		chromaticScale[5] = "F";
		chromaticScale[6] = "Gb";
		chromaticScale[7] = "G";
		chromaticScale[8] = "Ab";
		chromaticScale[9] = "A";
		chromaticScale[10] = "Bb";
 		chromaticScale[11] = "B";
		chromaticScale[12] = "C2";
		chromaticScale[13] = "Db2";
		chromaticScale[14] = "D2";
		chromaticScale[15] = "Eb2";
		chromaticScale[16] = "E2";
		chromaticScale[17] = "F2";
		chromaticScale[18] = "Gb2";
		chromaticScale[19] = "G2";
		chromaticScale[20] = "Ab2";
		chromaticScale[21] = "A2";
		chromaticScale[22] = "Bb2";
		chromaticScale[23] = "B2";
		chromaticScale[24] = "C2";
		
		hertzList = new double[] { 261.6, 277.2, 293.7, 311.1, 329.6, 349.2, 370, 392, 415.3, 440.0, 466.2, 493.9, 523.3, 554.4, 597.3, 622.3, 659.3, 698.5, 740, 784, 830.6, 880.0, 932.3, 987.8, 1046.5 };
		hertzList = hertzList;
		
		
		//Begin unit tests
		
		Scale scales = new Scale();
		scales.returnScales();
		
		Scale gScale = new Scale("G");
		gScale.returnScales();
		
		System.out.println();
		System.out.println("=====================================");
		TwelveBarBlues song = new TwelveBarBlues("C");
		System.out.println(song);
		song.playNotes();
		
	}
	
}
