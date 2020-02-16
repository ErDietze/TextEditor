import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class texteditor extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        String family = "Arial";
        double size = 28;

        TextFlow textFlow = new TextFlow();
        textFlow.setLayoutX(40);
        textFlow.setLayoutY(40);
        Text textRegular = new Text("A quick brown");
        textRegular.setFont(Font.font(family, size));

        Text textBold = new Text("fox");
        textBold.setFont(Font.font(family, FontWeight.BOLD, size));
        textBold.setFill(Color.BROWN);

        Text textRegular2 = new Text("Jumps over the lazy");
        textRegular2.setFont(Font.font(family, size));

        Text textItalics = new Text("Dog");
        textItalics.setFont(Font.font(family, FontPosture.ITALIC, size));
        textItalics.setFill(Color.SANDYBROWN);

        textFlow.getChildren().addAll(textRegular, textBold, textRegular2, textItalics);

        Group group = new Group();

        Scene scene = new Scene(group, 600,100, Color.WHITE);

        primaryStage.setTitle("JavaFx Rich Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
