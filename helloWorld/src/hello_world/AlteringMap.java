package hello_world;

import java.util.HashMap;
import java.util.Map;

public class AlteringMap {
	private Map<Integer, String> map = new HashMap<>();

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public void adding(int input1, String input2) {
		map.put(input1, input2);
	}

	public void retrieving(int input3) {
		map.get(input3);
	}
}
