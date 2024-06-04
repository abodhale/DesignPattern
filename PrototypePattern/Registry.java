import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<String, Configuration> map=new HashMap<>();
	
	public void register(String key, Configuration configuration) {	
		map.put(key, configuration);
	}

	public Configuration get(String key) {
        return map.get(key);
    }

}
