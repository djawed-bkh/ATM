import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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
    private TextField screen ;
    @FXML
    private Label screen1;


    private int euro=5000;
    private int dollar=3000;
    private int inter;
    private String name="inconnu";
    //initialisations

    public void menu(ActionEvent event) {
        screen1.setText("MENU :");
        screen.setText("details compte press 1 on the screen)");
        screen.setText(screen.getText() + "verser press 2 on the screen");
        screen.setText(screen.getText() + "retrait press 3 on the screen)");
        if (event.getSource() == e2) {
            screen1.setText("en quel devise voulez vous verser?");
            screen.setText("DOLLAR press 4 on the screen");
            screen.setText("Euro press 5 on the screen");
            if (event.getSource() == e4) {
                screen.setText("VERSEMENT DOLLAR");
                screen1.setText("tappez la somme a verser");

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
                }else if (event.getSource()==entrer){
                    inter = Integer.parseInt(screen.getText());
                    dollar += inter;
            }

            } else if (event.getSource() == e5) {
                screen.setText("VERSEMENT EURO");
                screen1.setText("tappez la somme a verser");

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
                }else if (event.getSource()==entrer){
                    inter = Integer.parseInt(screen.getText());
                    euro += inter;
                }

            }

        } else if (event.getSource() == e3) {
            screen1.setText("en quel devise voulez vous retirer?");
            screen.setText("DOLLAR press 6 on the screen");
            screen.setText("Euro press 7 on the screen");
            if (event.getSource() == e6) {
                screen.setText("RETRAIT DOLLAR");
                screen1.setText("tappez la somme a retirer");

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
                }else if (event.getSource()==entrer){
                    inter = Integer.parseInt(screen.getText());
                    dollar -= inter;
                }
            } else if (event.getSource() == e7) {
                screen.setText("RETRAIT EURO");
                screen1.setText("tappez la somme a retirer");

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
                }else if (event.getSource()==entrer){
                    inter = Integer.parseInt(screen.getText());
                    dollar -= inter;
                }
            }

        } else if (event.getSource() == e1) {
            screen.setText(" DÉTAILS COMPTE");
            screen1.setText("NOM : " + name);
            screen1.setText(screen.getText() + "EURO :" + euro);
            screen1.setText(screen.getText() + "dollar :" + dollar);
        }

    }

}



