package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AppController {
	
	
	float param1;
	float param2;
	
	@FXML
	TextField arg1;
	
	@FXML
	TextField arg2;
	
	@FXML
	Text output;
	
	@FXML
	//Button add = new Button();
	//Button sub = new Button();
	//Button divide = new Button();
	//Button mult = new Button();
	
	
	
	private void loadWhenClicked(ActionEvent event){
	    Button button = (Button) event.getSource();
	    String text = button.getText(); // prints out button's text
	    
	    float out;
	    
	    switch(text)
	    {
	    
	    case "+":
	    
	    	System.out.println("Test");
	    	out = Float.parseFloat(arg1.getText()) + Float.parseFloat(arg2.getText());
	    	output.setText(Float.toString(out));
	    	//output.setText("Testing");
	    
	    	break;
	    case "-":
	    
	    	out = Float.parseFloat(arg1.getText()) - Float.parseFloat(arg2.getText());
	    	output.setText(Float.toString(out));
	    
	    break;
	    case "/":
	    
	    	out = Float.parseFloat(arg1.getText()) / Float.parseFloat(arg2.getText());
	    	output.setText(Float.toString(out));
	    
	    break;
	    case "X":
	    
	    	out = Integer.parseInt(arg1.getText()) * Integer.parseInt(arg2.getText());
	    	output.setText(Float.toString(out));
	    
	    break;
	    }
	}
}
