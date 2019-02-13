package demo.dmt;

/**
 * 电脑组件类
 * @author sourlemon
 */
public class ComputerModule {

	private String cpu;
	private String displayCard;
	private String processor;
	private String networkCard;

	public ComputerModule() {
	}

	public ComputerModule(String cpu, String displayCard, String processor,
			String networkCard) {
		this.cpu = cpu;
		this.displayCard = displayCard;
		this.processor = processor;
		this.networkCard = networkCard;
	}

	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getDisplayCard() {
		return displayCard;
	}

	public void setDisplayCard(String displayCard) {
		this.displayCard = displayCard;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getNetworkCard() {
		return networkCard;
	}

	public void setNetworkCard(String networkCard) {
		this.networkCard = networkCard;
	}
	
	
	
}
