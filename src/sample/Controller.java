package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
//import javafx.scene.control.TextField;
//import javafx.scene.control.ListView;


public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> listView;

    private final ObservableList<String> chatList = FXCollections.observableArrayList("Привет! Добро пожаловать в наш уютный чатик!");

    @FXML
    public void initialize() {
        listView.setItems(chatList);
    }

    @FXML
    public void addMessageToChat() {
        String message = inputField.getText();
        if (message.isEmpty()) {
            System.out.println("Вы ничего не написали");
        } else {
            listView.getItems().add(message);
        }
        inputField.clear();
    }

}
