import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ScoreManager {
	
	public static void main(String[] args) {
		
		List<Score> scores = new ArrayList<>();

		Path path = Paths.get("scores.ser");
		
		if (Files.exists(path)) {
			scores = loadScores(path);

}		 else {
			scores = new ArrayList<>();
				}
			
			Random numberGenerator = new Random();

			Score myScore = new Score("Mary", numberGenerator.nextInt(50000), LocalDateTime.now());

			scores.add(myScore);


			//System.out.println("All scores:");
			
			System.out.println("Sorted scores (highest on top):");
			Comparator<Score> byScoreDescending =
			        Collections.reverseOrder(Comparator.comparing(s -> s.score));
			
			
			scores.stream()
			        .sorted(byScoreDescending)
			        .forEach(s -> System.out.println(s));

			saveScores(path, scores);

}

	private static void saveScores(Path path, List<Score> gameScores)
	{


		try (ObjectOutputStream whereToWrite = new ObjectOutputStream(
				Files.newOutputStream(path, StandardOpenOption.CREATE))){

			whereToWrite.writeObject(gameScores);

		} catch (IOException ioe) {
    System.out.println("Can't serialize scores: " + ioe.getMessage());
		}


	}
	
	@SuppressWarnings("unchecked")
	private static List<Score> loadScores(Path path)
	{
		List<Score> loadedScores= null;

	try (ObjectInputStream whereToReadFrom =
			new ObjectInputStream(Files.newInputStream(path))){

		loadedScores = (List<Score>) whereToReadFrom.readObject();

	} catch (ClassNotFoundException cnfe) {
    System.out.println("Can't find the declaration of Score: " + cnfe.getMessage());
	}  catch (IOException ioe) {
    System.out.println("Can't deserialize file: " + ioe.getMessage());
	}

	return loadedScores;


	}

}
