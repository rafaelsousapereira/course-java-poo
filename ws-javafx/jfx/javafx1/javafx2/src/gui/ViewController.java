package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btnTest;
	
	@FXML
	public void btnTestAction() {
		System.out.println("Click");
	}
}
