//I used cats dressed as fruits for all the fruits in the program!
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
public class VariousFruits extends Application
{
private String[] fruitTitles = {"Apple", "Strawberry", "Orange"};
private ImageView[] fruitImage = {new ImageView("apple.jpg"),
new ImageView("strawberry.jpg"),
new ImageView("orange.jpg")};
private String[] fruitDescription = new String[4];
private DescriptionPane descriptionPane = new DescriptionPane();
private ComboBox<String> cbo = new ComboBox<>();
@Override
public void start(Stage primaryStage)
{
fruitDescription[0] = "Apple cat!";
fruitDescription[1] = "Strawberry cat!";
fruitDescription[2] = "Orange cat!";
setDisplay(0);
BorderPane pane = new BorderPane();
BorderPane paneForComboBox = new BorderPane();
paneForComboBox.setLeft(new Label("Select a fruit: "));
paneForComboBox.setCenter(cbo);
pane.setTop(paneForComboBox);
cbo.setPrefWidth(400);
cbo.setValue("Apple");
ObservableList<String> items =
FXCollections.observableArrayList(fruitTitles);
cbo.getItems().addAll(items);
pane.setCenter(descriptionPane);
cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
Scene scene = new Scene(pane, 600, 500);
primaryStage.setTitle("VariousFruits");
primaryStage.setScene(scene);
primaryStage.show();
}
public void setDisplay(int index)
{
descriptionPane.setTitle(fruitTitles[index]);
descriptionPane.setImageView(fruitImage[index]);
}
}
