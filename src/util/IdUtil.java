package util;

import java.util.UUID;

public class IdUtil {
	public static String getId(){
		String id=UUID.randomUUID().toString().replaceAll("-", "");
		return id;
	}
}
