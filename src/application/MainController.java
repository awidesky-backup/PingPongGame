package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
	
	
	@FXML Button onlineMultiBtn;
	@FXML Button localMultiBtn;
	@FXML Button singleBtn;
	
	public void onlineMultiBtnPressed() {
		
		disableAll();
	}
	
	public void singleBtnPressed() {
		
		disableAll();
	}
	
	public void localMultiBtnPressed() {
		
		disableAll();
	}
	
	public void disableAll() {
		
		onlineMultiBtn.setDisable(true);
		localMultiBtn.setDisable(true);
		singleBtn.setDisable(true);
		
	}
}
