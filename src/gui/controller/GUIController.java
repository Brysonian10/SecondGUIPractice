package gui.controller;

import gui.view.FirstFrame;
import gui.view.FirstPanel;

public class GUIController
{
	private FirstFrame appFrame;
	private FirstPanel appPanel;
	
	public GUIController()
	{
		this.appFrame = new FirstFrame(this);
	}
	
	public void start()
	{
		
	}
}
