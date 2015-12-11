package Home;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML private TextArea originalWord;
    @FXML private TextArea outputText;

    public void reverseWord(ActionEvent actionEvent) {
        String forwardWord = originalWord.getText();
        StringBuilder reversedWord = new StringBuilder();
        reversedWord = reversedWord.append(forwardWord);
        reversedWord.reverse();

        outputText.setText(String.valueOf(reversedWord + "\n"));
    }
}
