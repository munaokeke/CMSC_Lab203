

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.collections.*;
/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox

public class FXMainPane extends VBox {
	// Student Task #2:
	// Declare five buttons, a label, and a TextField
	
	// Buttons
	Button b1;
	Button b2;
	Button b3;
	Button jamesBond;
	Button b4;
	Button b5;
	
	// Label
	Label promptLabel;
	
	// TextField
	TextField textField;
	
	//  Declare two HBoxes
	HBox hbox1;
	HBox hbox2;
	HBox hbox3;
	
	// Student Task #4:
	// Declare an instance of DataManager
	DataManager dm;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		// Student Task #2:
		//  Instantiate the buttons, label, and textfield
		
		// Buttons
		b1 = new Button("Hello");
		b1.setOnAction(new ButtonHandler());
		b2 = new Button("Howdy");
		b2.setOnAction(new ButtonHandler());
		b3 = new Button("Chinese");
		b3.setOnAction(new ButtonHandler());
		jamesBond = new Button("James Bond");
		jamesBond.setOnAction(new ButtonHandler());
		b4 = new Button("Clear");
		b4.setOnAction(new ButtonHandler());
		b5 = new Button("Exit");
		b5.setOnAction(new ButtonHandler());
		
		// Label
		promptLabel = new Label("Feedback:");
		
		// TextField
		textField = new TextField();
		textField.setMinWidth(200);
		
		//  Instantiate the HBoxes
		hbox1 = new HBox();
		hbox2 = new HBox();
		hbox3 = new HBox();
		
		

		
		// Student Task #4:
		// Instantiate the DataManager instance
		dm = new DataManager();
		
		// Margins for branch nodes
		HBox.setMargin(hbox1, new Insets(10));
		HBox.setMargin(hbox2, new Insets(10));
		HBox.setMargin(hbox3, new Insets(10));	
		
		// Margins for each leaf nodes
		HBox.setMargin(b1, new Insets(10));
		HBox.setMargin(b2, new Insets(10));
		HBox.setMargin(b3, new Insets(10));
		HBox.setMargin(jamesBond, new Insets(10));
		HBox.setMargin(promptLabel, new Insets(10));
		HBox.setMargin(b4, new Insets(10));
		
		// Alignments for branch nodes
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox3.setAlignment(Pos.CENTER);
		
		
		// Student Task #3:
		// Add the label and textfield to one of the HBoxes
		// Add the buttons to the other HBox
		hbox1.getChildren().addAll(b1, b2, b3, jamesBond);
		hbox2.getChildren().addAll(promptLabel, textField);
		hbox3.getChildren().addAll(b4, b5);
		
		// Add the HBoxes to this FXMainPanel (a VBox)
		this.getChildren().addAll(hbox1, hbox2, hbox3);
		this.setPadding(new Insets(50));
		

	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	public class ButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			String message = "";
			if (event.getTarget() == b1) 
				message = dm.getHello();
			else if (event.getTarget() == b2)
				message = dm.getHowdy();
			else if (event.getTarget() == b3)
				message = dm.getChinese();
			else if (event.getTarget() == jamesBond)
				message = dm.getJamesBond();
			else if (event.getTarget() == b4)
				message = "";
			else if (event.getTarget() == b5) {
				Platform.exit();
				System.exit(0);
			}
			textField.setText(message);
		}
	}
}
