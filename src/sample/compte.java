package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class compte {
    //intialisations
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
    private Button e1;
    @FXML
    private Button e2;
    @FXML
    private Button e3;
    @FXML
    private Button e4;
    @FXML
    private Button e5;
    @FXML
    private Button e6;
    @FXML
    private Button e7;
    @FXML
    private Button e8;
    @FXML
    private Label screen2;
    @FXML
    private Label screen1;
    @FXML
    private Button men;


    private int euro = 5000;
    private int dollar = 3000;
    private int inter;
    private String name = "inconnu";
    private boolean var=true;
    private int clav=0;
    private int op;
    //initialisations

    public void menu(ActionEvent event) {
        if (event.getSource() == men) {
            screen1.setText("MENU :");
            screen2.setText("details  press 1 on the screen \n verser dollar press 2 on the screen\n verser euro press 3 on the screen\n retrait dollar press 4 on the screen\n retrait euro press 5 on the screen");
        } else if (event.getSource() == e2) {
            screen1.setText("VERSEMENT DOLLAR");
            screen2.setText("");
            sasie(event);
          op=2;
        }
        else if (event.getSource() == e3) {
            screen1.setText("VERSEMENT EURO");
            var=false;
            sasie(event);
           op=3;
        } else if (event.getSource() == e4) {
            screen1.setText("RETRAIT DOLLAR");
            screen2.setText("");
            var=false;
            sasie(event);
           op=4;
        } else if (event.getSource() == e5) {
            screen1.setText("RETRAIT EURO");
            screen2.setText("");
            var=false;
            sasie(event);
            op=5;
        }

        else if (event.getSource() == e1) {
            screen2.setText("");
            screen1.setText(" DÉTAILS COMPTE");
            screen2.setText("NOM : " + name + "\n" + screen2.getText() + "EURO :" + euro + "\n" + screen2.getText() + "dollar :" + dollar);
        }
        if (op==2){
            dollar+=inter;
            inter=0;
        }else if (op==3) {
            euro+=inter;
            inter=0;
        }else if (op==4){
            dollar-=inter;
            inter=0;

        }else if (op==5) {
            euro -= inter;
            inter=0;
        }

    }
    public void sasie(ActionEvent event){
        if (var==false &&clav==0){
            screen2.setText("");}
       if (event.getSource() == n1) {
           clav++;
            screen2.setText(screen2.getText() + "1");
        } else if ((event.getSource() == n2)) {
           clav++;
            screen2.setText(screen2.getText() + "2");
        } else if ((event.getSource() == n3)) {
           clav++;
            screen2.setText(screen2.getText() + "3");
        } else if ((event.getSource() == n4)) {
           clav++;
            System.out.println("n1" + event.getSource());

            screen2.setText(screen2.getText() + "4");
        } else if ((event.getSource() == n5)) {
           clav++;
            screen2.setText(screen2.getText() + "5");
        } else if ((event.getSource() == n6)) {
           clav++;
            screen2.setText(screen2.getText() + "6");
        } else if ((event.getSource() == n7)) {
           clav++;
            screen2.setText(screen2.getText() + "7");
        } else if ((event.getSource() == n8)) {
           clav++;
            screen2.setText(screen2.getText() + "8");
        } else if ((event.getSource() == n9)) {
           clav++;
            screen2.setText(screen2.getText() + "9");
        } else if ((event.getSource() == n0)) {
           clav++;
            screen2.setText(screen2.getText() + "0");
        } else if (event.getSource() == entrer) {
           clav=0;
           inter = Integer.parseInt(screen2.getText());
            screen2.setText("Operation effectué correctement");



        }

    }
}




