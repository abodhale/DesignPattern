
public class ProdConfiguration extends BaseConfiguration {
	
	private boolean proddebugmode;
	
	public ProdConfiguration(String dbConnectionString, String apiEndpoint, String timeout,boolean prd) {
		super(dbConnectionString, apiEndpoint, timeout);
		this.proddebugmode=prd;
		
	}
	
	public ProdConfiguration(BaseConfiguration baseconf) {
		super(baseconf);
		
	}
	
	@Override
	public ProdConfiguration clone() {	
		return new ProdConfiguration(this);
	};
}
