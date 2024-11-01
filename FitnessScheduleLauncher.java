import java.awt.*;
import javax.swing.*;

/**
 * A program for setting up the Fitness schedule application.
 * @version 1.0.1 29-10-2024
 * @author andrey_tonkoshkurov
 */
public class FitnessScheduleLauncher
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> 
		{
			FitnessScheduleLauncherFrame frame = new FitnessScheduleLauncherFrame();
			frame.setTitle("fitness launcher");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

class FitnessScheduleLauncherFrame extends JFrame
{
	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGHT = 320;
	
	public FitnessScheduleLauncherFrame()
	{
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}