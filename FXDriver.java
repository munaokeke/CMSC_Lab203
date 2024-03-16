
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);
		FXMainPane root = new FXMainPane();
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		// Student Task #1:
		// Instantiate the FXMainPane, name it root
		FXMainPane root = new FXMainPane();
		
		
		// Set the scene to hold root
		stage.setScene(new Scene(root,500,250));
		
		
		//set stage title
		stage.setTitle("Hello World GUI");
		
		//display the stage
		stage.show();

	}
}
