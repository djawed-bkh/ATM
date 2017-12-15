package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class authentification {
    //initialisations
    @FXML
    private Button n0;
    @FXML
    private Button n1;
    @FXML
    private Button n2;
    @FXML
    private Button n3;
    @FXML
    private Button n4;
    @FXML
    private Button n5;
    @FXML
    private Button n6;
    @FXML
    private Button n7;
    @FXML
    private Button n8;
    @FXML
    private Button n9;
    @FXML
    private Button entrer;
    @FXML
    private Button annule;
    @FXML
    private Button sup;
    @FXML
    private PasswordField screen;
    @FXML
    private Label screen1;


    private int codetest;
    private int codemem=1111;
    private boolean test=false;
    private int nbrtest=0;
    private int nbclics=0;
    //initialisations





    @FXML
    public void action (ActionEvent event) throws IOException {
        nbclics++;
        if (nbclics<=4){
            if(event.getSource()==n1){
                System.out.println( "n1"+event.getSource());
                screen.setText(screen.getText()+"1");


            }else if((event.getSource()==n2)){
                System.out.println( "n1"+event.getSource());

                screen.setText(screen.getText()+"2");
            }else if((event.getSource()==n3)){
                System.out.println( "n1"+event.getSource());

                screen.setText(screen.getText()+"3");
            }else if((event.getSource()==n4)){
                System.out.println( "n1"+event.getSource());

                screen.setText(screen.getText()+"4");
            }else if((event.getSource()==n5)){

                screen.setText(screen.getText()+"5");
            }else if((event.getSource()==n6)){

                screen.setText(screen.getText()+"6");
            }else if((event.getSource()==n7)){

                screen.setText(screen.getText()+"7");
            }else if((event.getSource()==n8)){

                screen.setText(screen.getText()+"8");
            }else if((event.getSource()==n9)){

                screen.setText(screen.getText()+"9");
            }else if((event.getSource()==n0)) {
                System.out.println("n1" + event.getSource());
                screen.setText(screen.getText() + "0");
            }
            }
        }




    public void Valider(ActionEvent event) throws IOException {
        if((event.getSource()==entrer && nbrtest<3)){
            System.out.println("test 0");
            nbclics=0;
            nbrtest++;
            System.out.println( event.getSource());
            codetest=Integer.parseInt(screen.getText());
            if (verification()==true){
                ((Node) (event.getSource())).getScene().getWindow().hide();
                System.out.println("verification");
                Parent root = FXMLLoader.load(getClass().getResource("/sample/compte.fxml"));
                Stage primaryStage = new Stage();
                primaryStage.setTitle("ATM");
                primaryStage.setScene(new Scene(root));
                primaryStage.setResizable(false);
                primaryStage.show();
            }else {
                screen1.setText("ce mot de passe est incorrecte RÉESSAYEZ");
                screen.setText("");

            }

    }else if (nbrtest>3){
            screen1.setText("TROP DE TENTATIVES MACHINE MOMENTANÉMENT BLOQUÉ");
        }}
    public boolean verification(){
        if (codetest==codemem){
            test=true;
            return test;
        }else {
            return false;
        }
    }
}


