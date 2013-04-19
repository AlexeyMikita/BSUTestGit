package bsu.osgi;

import bsu.osgi.impl.ASCII7Stream;
import bsu.osgi.impl.FileStream;

public class StreamFactory {
	
	public static IAbstractStream getAbstractStream(String pName) {
		IAbstractStream result = null;
		if ("FileStream".equals(pName)) {
			result = new FileStream();
		}
		return result;
	}

	public static IAbstractStream getAbstractStream(String pName, IAbstractStream oDecorator) {
		IAbstractStream result = null;

		if ("ASCII&Stream".equals(pName)  ) {
			result = new ASCII7Stream(oDecorator);
		} else {
		result = getAbstractStream(pName);
		}
		return result;
	}
	
	public static IAbstractStream getAvstractStream(String [] pNames) {
		IAbstractStream result = null;
		if (pNames != null && pNames.length > 0) {
			for (int i = 0; i < pNames.length; i++) {
				result = getAbstractStream(pNames[i], result);
			}
		}
		return result;
	}
	
}
