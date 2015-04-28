package application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DateComboBoxes extends Application {
	public static void main(String[] args) {
		launch(args);
	}


	
	@Override
	public void start(Stage stage) {
		Label mLabel = new Label ("Month:");
		Label dLabel = new Label ("Day:");
		Label yLabel = new Label ("Year:");
		VBox vb = new VBox();
		vb.setPadding(new Insets(10, 0, 0, 10));
		vb.setSpacing(10);
		HBox hb = new HBox();
		hb.setSpacing(10);
		hb.setAlignment(Pos.CENTER_LEFT);
		Scene scene = new Scene (new Group(), 500,270);
		stage.setScene(scene);
		stage.setTitle("Date Combo Boxes");
		ObservableList<String> months = FXCollections.observableArrayList(
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December");
		ObservableList<Integer> days = FXCollections.observableArrayList(
				1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
		final ComboBox monthsComboBox = new ComboBox(months);
		final ComboBox daysComboBox = new ComboBox(days);
		vb.getChildren().addAll(mLabel, monthsComboBox);
		vb.getChildren().addAll(dLabel, daysComboBox);
		vb.getChildren().addAll(yLabel);
		scene.setRoot(vb);
		stage.show();
	};
	
		


}
