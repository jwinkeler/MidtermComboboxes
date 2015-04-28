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
		ObservableList<Integer> years = FXCollections.observableArrayList(2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020);
		final ComboBox<String> monthsComboBox = new ComboBox<String>(months);
		final ComboBox<Integer> yearsComboBox = new ComboBox<Integer>(years);
		monthsComboBox.setOnAction((event) -> {
		    String month = monthsComboBox.getSelectionModel().getSelectedItem().toString();
		    System.out.println("ComboBox Action (selected: " + month + ")");
		    if (month == "January"||month == "March"||month == "May"||month == "July"||month == "August"||month == "November"){
		    	ObservableList<Integer> days = FXCollections.observableArrayList(
						1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,
						22,23,24,25,26,27,28,29,30,31);
		    	final ComboBox<Integer> daysComboBox = new ComboBox<Integer>(days);
		    	vb.getChildren().addAll(dLabel, daysComboBox);
		    }
		    else if(month == "February"){
				ObservableList<Integer> days = FXCollections.observableArrayList(
						1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,
						22,23,24,25,26,27,28);
				final ComboBox<Integer> daysComboBox = new ComboBox<Integer>(days);
				vb.getChildren().addAll(dLabel, daysComboBox);
		    }
		    else{
				ObservableList<Integer> days = FXCollections.observableArrayList(
						1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,
						22,23,24,25,26,27,28,29,30);
				final ComboBox<Integer> daysComboBox = new ComboBox<Integer>(days);
				vb.getChildren().addAll(dLabel, daysComboBox);
		    }
		    
		});
		
		
		
		vb.getChildren().addAll(mLabel, monthsComboBox);
		vb.getChildren().addAll(yLabel,yearsComboBox);
		scene.setRoot(vb);
		stage.show();
	};
	
		


}
