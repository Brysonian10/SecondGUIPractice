package gui.view;

import gui.controller.GUIController;
import javax.swing.*;
import java.awt.Color;

public class FirstPanel extends JPanel
{
	private GUIController appController;
	
	private JButton colorButton;
	private JLabel textLabel;
	
	public FirstPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		
		colorButton = new JButton("Click to change the color");
		textLabel = new JLabel("This is a color app");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel() 
	{
		this.add(textLabel);
		this.add(colorButton);
		this.setBackground(Color.BLUE);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
