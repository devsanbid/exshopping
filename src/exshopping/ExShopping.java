/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exshopping;

import com.formdev.flatlaf.FlatLightLaf;
import exshopping.view.SettingFrame;
import javax.swing.UIManager;

/**
 *
 * @author sanbid
 */
public class ExShopping {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel( new FlatLightLaf() );
		}catch (Exception ex){
			System.err.println("Failed to initialize LaF");
		}
		SettingFrame addcart = new SettingFrame();
		addcart.setVisible(true);
	}
	
}
