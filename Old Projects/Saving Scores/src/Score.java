
import java.io.Serializable;
import java.time.LocalDateTime;

public class Score implements Serializable 
{

	private static final long serialVersionUID = -4065143908150387392L;
	
	String name;
    int score;
    LocalDateTime dateTime;

    Score(String name, int score, LocalDateTime dateTime){
        this.name=name;
        this.score=score;
        this.dateTime=dateTime;
    }

    public String toString(){
        return name + " scored " + score + " on " + dateTime;
    }
}




