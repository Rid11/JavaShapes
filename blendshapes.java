/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blendshapes;

import java.awt.Rectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class BlendShapes extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        root.getChildren().add(blendMode());
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    static Node blendMode(){
        
        Group g1 = new Group();
        
        Circle c1 = new Circle(50,50,25);
        c1.setFill(Color.CYAN);
        c1.setBlendMode(BlendMode.MULTIPLY);
        
        Rectangle r1 = new Rectangle(50,50,50,50);
        r1.setFill(Color.CYAN);
        g1.getChildren().addAll(c1,r1);
        
        
        
        return g1;
    }
  
    public static void main(String[] args) {
        launch(args);
    }
    
}

//Error at line 45 & 46
// please i need help ASAP
