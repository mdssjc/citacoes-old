package com.github.mdssjc.citacoes.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Classe de entrada da aplicação.
 *
 * @author Marcelo dos Santos
 *
 */
public class Main extends Application {

  public static void main(final String[] args) {
    launch(args);
  }

  @Override
  public void start(final Stage stage) throws Exception {
    final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("FXMLMain.fxml"));
    final Scene scene = new Scene(root);
    stage.setTitle("Citações");
    stage.setScene(scene);
    stage.show();
  }
}
