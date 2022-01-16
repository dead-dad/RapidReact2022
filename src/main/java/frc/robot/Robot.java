package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

import java.util.ArrayList;

import autonomous.*;
import autonomous.Command.CommandType;
import hardware.*;
import interfaces.*;
import networking.*;
import utils.*;
import wrappers.*;

public class Robot extends TimedRobot {

	AutoPath autoPath;

	@Override
	public void robotInit() {}

	@Override
	public void robotPeriodic() {}

	@Override
	public void autonomousInit() {

		autoPath = new AutoPath("home/lvuser/deploy/autopaths/test.json");

		ArrayList<Command> commands = autoPath.getCommandQueue();

		for (int i = 0; i < commands.size(); i++) {

			System.out.println("type: " + commands.get(i).getType());
			System.out.println("value: " + commands.get(i).getValue());
			System.out.println("speed: " + commands.get(i).getSpeed());
			System.out.println("chordLength: " + commands.get(i).getChordLength());
			System.out.println("arcLength: " + commands.get(i).getArcHeight() + "\n\n");
			System.out.println("\n");

		}

	} 

	@Override
	public void autonomousPeriodic() {}

	// NO TOUCH
	@Override 
	public void disabledInit() {}
	
	// VERY EXTRA NO TOUCH
	@Override
	public void disabledPeriodic() {}
	
	@Override
	public void teleopInit() {}

	@Override
	public void teleopPeriodic() {}

	@Override
	public void testInit() {}
	
	@Override
	public void testPeriodic() {}

}