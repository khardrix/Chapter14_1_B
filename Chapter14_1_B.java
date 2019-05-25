/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                          Chapter 14: Problem 1                                            *****
 *****___________________________________________________________________________________________________________*****
 *****                                        1. Create a program that                                           *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****       b. change the code to create a Color variable, say c, of a single Color (e.g., Color.RED) and       *****
 *****                        before drawing each Circle, reset c using c = c.darker();                          *****
 *****                               so that the Circles are progressively darker.                               *****
 *****                                                                                                           *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                           Experiment with a few different starting colors such as:                        *****
 *****                                               Color.RED,                                                  *****
 *****                                            Color.GREEN and                                                *****
 *****                                              Color.WHITE                                                  *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;


public class Chapter14_1_B extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        // First row of circles
        Color e = Color.RED;

        Circle e1 = new Circle(70, 50, 40);
        Circle e2 = new Circle(160, 50, 40);
        Circle e3 = new Circle(250, 50, 40);
        Circle e4 = new Circle(340, 50, 40);
        Circle e5 = new Circle(430, 50, 40);

        e1.setFill(e);

        e = e.darker();
        e2.setFill(e);

        e = e.darker();
        e3.setFill(e);

        e = e.darker();
        e4.setFill(e);

        e = e.darker();
        e5.setFill(e);

        pane.getChildren().addAll(e1, e2, e3, e4, e5);

        // Next row of circles
        Color d = Color.GREEN;

        Circle d1 = new Circle(70, 150, 40);
        Circle d2 = new Circle(160, 150, 40);
        Circle d3 = new Circle(250, 150, 40);
        Circle d4 = new Circle(340, 150, 40);
        Circle d5 = new Circle(430, 150, 40);

        d1.setFill(d);

        d = d.darker();
        d2.setFill(d);

        d = d.darker();
        d3.setFill(d);

        d = d.darker();
        d4.setFill(d);

        d = d.darker();
        d5.setFill(d);

        pane.getChildren().addAll(d1, d2, d3, d4, d5);

        // Next row of circles
        Color c = Color.WHITE;

        Circle c1 = new Circle(70, 250, 40);
        Circle c2 = new Circle(160, 250, 40);
        Circle c3 = new Circle(250, 250, 40);
        Circle c4 = new Circle(340, 250, 40);
        Circle c5 = new Circle(430, 250, 40);

        c1.setFill(c);

        c = c.darker();
        c2.setFill(c);

        c = c.darker();
        c3.setFill(c);

        c = c.darker();
        c4.setFill(c);

        c = c.darker();
        c5.setFill(c);

        pane.getChildren().addAll(c1, c2, c3, c4, c5);

        // Next row of circles
        Color f = Color.GREEN;

        Circle f1 = new Circle(70, 350, 40);
        Circle f2 = new Circle(160, 350, 40);
        Circle f3 = new Circle(250, 350, 40);
        Circle f4 = new Circle(340, 350, 40);
        Circle f5 = new Circle(430, 350, 40);

        f1.setFill(f);

        f = f.darker();
        f2.setFill(f);

        f = f.darker();
        f3.setFill(f);

        f = f.darker();
        f4.setFill(f);

        f = f.darker();
        f5.setFill(f);

        pane.getChildren().addAll(f1, f2, f3, f4, f5);

        // Last row of circles
        Color g = Color.RED;

        Circle g1 = new Circle(70, 450, 40);
        Circle g2 = new Circle(160, 450, 40);
        Circle g3 = new Circle(250, 450, 40);
        Circle g4 = new Circle(340, 450, 40);
        Circle g5 = new Circle(430, 450, 40);

        g1.setFill(g);

        g = g.darker();
        g2.setFill(g);

        g = g.darker();
        g3.setFill(g);

        g = g.darker();
        g4.setFill(g);

        g = g.darker();
        g5.setFill(g);

        pane.getChildren().addAll(g1, g2, g3, g4, g5);


        // Putting the Scene in the Stage and showing the Stage
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Chapter 14, Problem 1, Part A");

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
