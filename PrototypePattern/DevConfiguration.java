
public class DevConfiguration extends BaseConfiguration {

	private boolean debugmode;
	
	public DevConfiguration(String dbConnectionString, String apiEndpoint, String timeout,boolean debugMode) {
		
		super(dbConnectionString, apiEndpoint, timeout);
		this.debugmode= debugMode;
		
	}
	
	public DevConfiguration(BaseConfiguration baseconf) {
		super(baseconf);
	}
	
	@Override
	public DevConfiguration clone() {	
		return new DevConfiguration(this);
	};

}
