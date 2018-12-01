
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class Controller {
    private Telefonliste telefonliste;
    @FXML
    private ListView listView;

    @FXML
    private TextField txtName;
    
     @FXML
    private TextField txtNummer;

    //Inhalt für die ListView!
    private ObservableList<String> content;

    public Controller()
    {
        telefonliste = new Telefonliste();
    }

    @FXML
    private void initialize()   {

        listeAktualisieren();
    }

    @FXML
    public void einfuegen(Event event) {
        personEinfuegen();
    }

    @FXML
    public void handleTxtEinfuegen(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER)
        {
            personEinfuegen();
        }

    }

    public void personEinfuegen()
    {
        String name = txtName.getText();
        String nummer = txtNummer.getText();
        Person pat = new Person(name,nummer);
        telefonliste.einfuegen(pat);
        listeAktualisieren();
        txtName.setText("");
        txtNummer.setText("");
    }

    public void listeAktualisieren()
    {
        listView.getItems().clear();
        String[] liste = telefonliste.getListe();
        for (int i = 0; i < liste.length; i++)
        {
            listView.getItems().add(liste[i]);
        }
    }



   
}