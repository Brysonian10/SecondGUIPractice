package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;


public class FirstFrame extends JFrame
{
	private GUIController appController;
	private FirstPanel appPanel;
	
	public FirstFrame(GUIController appController)
	{
	super();
	
	this.appController = appController;
	this.appPanel = new FirstPanel(appController);
	
	setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1000, 500);
		this.setTitle("Second GUI App");
		this.setResizable(false);
		this.setVisible(true);
	}
}
