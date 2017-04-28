package am.ipc;

import am.ipc.computer.Computer;
import am.ipc.factory.ComputerAbstractFactory;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
	
}
