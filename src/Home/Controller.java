package Home;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML private TextField originalWord;
    @FXML private Text outputText;

    public void reverseWord(ActionEvent actionEvent) {
        String forwardWord = originalWord.getText();
        StringBuilder reversedWord = new StringBuilder();
        reversedWord = reversedWord.append(forwardWord);
        reversedWord.reverse();

        outputText.setText(String.valueOf(reversedWord + "\n"));
    }
}
