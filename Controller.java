package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller extends CardsInPlay {


    public Label card0;
    public Label card1;
    public Label card2;
    public Label card3;
    public Label card4;
    @FXML
Button chkbtn;








@FXML
    private TextField textfield;





    public void compareScore(ActionEvent event) {








        try {





            ArrayList<String> ActualHand = new ArrayList<String>();
            ActualHand=GetHand();
            String Card0 = ActualHand.get(0);
            String Card1 = ActualHand.get(1);
            String Card2 = ActualHand.get(2);
            String Card3 = ActualHand.get(3);
            String Card4 = ActualHand.get(4);





            card0.setText(Card0);
            card1.setText(Card1);
            card2.setText(Card2);
            card3.setText(Card3);
            card4.setText(Card4);







            String Answer = textfield.getText();

            int answerr = Integer.parseInt(Answer);
            int score = getScore();
            System.out.println(score);
            int count = 0;


            if (answerr == score) {
                count++;
                JOptionPane.showMessageDialog(null, Answer + " Is Correct " + "You Have A Score of " + count);
                GetHand();
            } else {
                JOptionPane.showMessageDialog(null, Answer + " Is Incorrect" + " You Have A Score of " + count);
                GetHand();


            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please Enter A Value");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Please Enter A Value");
        }
        catch(NullPointerException e)
    {






    }
        }
    }