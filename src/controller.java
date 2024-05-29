
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class controller {

    ObservableList<User> users = FXCollections.observableArrayList();




    @FXML
    private Button btn_createuser;

    @FXML
    private Button btn_deleteuser;

    @FXML
    private AnchorPane checkboxstaff;

    @FXML
    private ListView<User> list_users;

    @FXML
    private TextField txt_email;

    @FXML
    private TextField txt_userid;

    @FXML
    private TextField txt_username;

public void initialize() {
    list_users.setItems(users);
    
    
}

@FXML
public void createUser(){

    String userName = txt_username.getText();
    String userEmail = txt_email.getText();
    int userId = Integer.parseInt(txt_userid.getText());
    
    User myUser = new User(userName, userEmail, userId);

    users.add(myUser);
    
}

    
}
