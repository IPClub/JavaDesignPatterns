package am.ipc.factory.types;

import am.ipc.computer.Computer;
import am.ipc.computer.types.Server;
import am.ipc.factory.ComputerAbstractFactory;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(ram,hdd,cpu);
	}

}
