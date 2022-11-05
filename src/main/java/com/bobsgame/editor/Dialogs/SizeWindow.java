package com.bobsgame.editor.Dialogs;

import java.awt.*;
import java.awt.event.*;

import com.bobsgame.editor.MapCanvas.MapCanvas;
import com.bobsgame.editor.SpriteEditor.SpriteEditor;
//===============================================================================================
public class SizeWindow extends WindowAdapter implements ActionListener
{//===============================================================================================

	protected Dialog dialog;
	protected Panel panel;
	protected TextField xTextField, yTextField;
	protected Label xByYLabel, tilesLabel;
	protected Button okButton;
	
	protected boolean isRequired;
	
	//===============================================================================================
	public SizeWindow()
	{//===============================================================================================
		
	}


	//===============================================================================================
	public void show()
	{//===============================================================================================

	}
	//===============================================================================================
	public void showRequired()
	{//===============================================================================================

	}
	//===============================================================================================
	public boolean isShowing()
	{//===============================================================================================
		return dialog.isShowing();
	}
	//===============================================================================================
	public void windowClosing(WindowEvent we)
	{//===============================================================================================
		if(!isRequired)
		{
			dialog.setVisible(false);
		}
	}
	//===============================================================================================
	public void actionPerformed(ActionEvent ae)
	{//===============================================================================================

	}
}
