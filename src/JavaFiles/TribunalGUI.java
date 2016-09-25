package JavaFiles;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class TribunalGUI extends Application{
	
	Hyperlink hyperLink;
	Label category;
	TextField categoryField;
	Line divider;
	ImageView profilePicView;
	Label johnDoeLabel;
	TextField commentField;
	
	Button checkBox;
	Button xBox;
	Button notSureBox;
	VBox verticalBox;
	HBox boxesBox;
	HBox profileBox;
	GridPane gPane;
	
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		hyperLink = new Hyperlink("Context (Link to full post)");
		category = new Label("Category");
		categoryField = new TextField("harassment?");
		categoryField.setEditable(false);
		divider = new Line();
		Image i = new Image("/Users/vz97/desktop/pfp.jpg");
		profilePicView = new ImageView(i);
		
		johnDoeLabel = new Label("John Doe");
		commentField = new TextField("i hate ugly people");
		commentField.setEditable(false);
		
		checkBox = new Button("I find this offensive.");
		xBox = new Button("I do not find this offensive.");
		notSureBox = new Button("I'm not sure.");
		
		verticalBox = new VBox();
		gPane = new GridPane();
		profileBox = new HBox();
		
		//rectangles
		hyperLink.setAlignment(Pos.TOP_RIGHT);
		hyperLink.setTranslateX(300);
		profileBox.getChildren().addAll(profilePicView, johnDoeLabel);
		gPane.add(checkBox, 0, 0);
		gPane.add(xBox, 1, 0);
		gPane.add(notSureBox, 2, 0);
		gPane.setAlignment(Pos.CENTER);
		gPane.setHgap(30);
		verticalBox.getChildren().addAll(hyperLink, category, categoryField, divider,
				profileBox, commentField, gPane);
		verticalBox.setSpacing(5);
		divider.setStartX(0);
		divider.setStartY(categoryField.getLayoutY() + 40);
		divider.setEndX(475);
		divider.setEndY(categoryField.getLayoutY() + 40);
		verticalBox.setVisible(true);
		verticalBox.setPadding(new Insets(15, 12, 15, 12));
		verticalBox.setSpacing(5);
		Scene s = new Scene(verticalBox, 500, 220);
		primaryStage.setScene(s);
		primaryStage.show();
	}
}
