package gui.view;

import gui.controller.GUIController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;


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
		this.setBackground(Color.ORANGE);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent mouseClick)
					{
						changeBackgroundColor();
					}
				});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red is: " + red + " Blue is: " + blue + " Green is: " + green);
	}
}
