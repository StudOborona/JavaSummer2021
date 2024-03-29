package com.doughepi.main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * @author omran alhaja
 * @version 1.0
 *          <p>
 *          The controller class for the main view, shown after a successful login.
 */
public class MainController
{
    /**
     * JavaFX injected fields.
     */
    @FXML
    private Button logoutButton;
    @FXML
    private Label sessionLabel;

    /**
     * Called on switch to the main view by the Manager setScene_Main() method.
     *
     * @param manager   Controls the movement between the login and main view.
     * @param sessionID The session id generated by the login controller on successful login.
     */
    void initializeSessionID(final Manager manager, String sessionID)
    {
        //When switched to main view, set text to display the session id.
        sessionLabel.setText(sessionID);

        //Create event handler; on click of log out, set to login view.
        logoutButton.setOnAction(event -> manager.doLogout());
    }
}