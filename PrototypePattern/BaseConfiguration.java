
public class BaseConfiguration implements Configuration {

	private String dbConnectionString;
	private String apiEndpoint;
	private String timeout;
	
	public  BaseConfiguration(String dbConnectionString,String apiEndpoint,String timeout) {
		this.dbConnectionString=dbConnectionString;
		this.apiEndpoint=apiEndpoint;
		this.timeout=timeout;
	}
	
	public  BaseConfiguration(BaseConfiguration baseconf) {
		if(baseconf!=null) 
		{
			this.dbConnectionString=baseconf.dbConnectionString;
			this.apiEndpoint=baseconf.apiEndpoint;
			this.timeout=baseconf.timeout;
		}
	}
	
	@Override
	public BaseConfiguration clone() {
		
		return new BaseConfiguration(this);
	};
	
	
	@Override
	public void apply() {
		System.out.println("Apply BaseConfiguration : ");
		System.out.println("DB Connection string : "+dbConnectionString);
		System.out.println("API Endpoint : "+apiEndpoint);
		System.out.println("TimeOut : "+timeout);

	}
	
}
