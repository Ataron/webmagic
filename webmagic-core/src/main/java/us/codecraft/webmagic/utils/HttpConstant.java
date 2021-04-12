package us.codecraft.webmagic.utils;

/**
 * Some constants of Http protocal.
 * @author code4crafer@gmail.com
 * @since 0.5.0
 */
public abstract class HttpConstant {
	
	static String uc = "Utility class";
	
	private HttpConstant() {
		throw new IllegalStateException(uc);
	}
	
    public static abstract class Method {
    	
    	private Method() {
    		throw new IllegalStateException(HttpConstant.uc);
    	}

        public static final String GET = "GET";

        public static final String HEAD = "HEAD";

        public static final String POST = "POST";

        public static final String PUT = "PUT";

        public static final String DELETE = "DELETE";

        public static final String TRACE = "TRACE";

        public static final String CONNECT = "CONNECT";

    }

    public static abstract class StatusCode {
    	
    	private StatusCode() {
    		throw new IllegalStateException(HttpConstant.uc);
    	}

        public static final int CODE_200 = 200;

    }

    public static abstract class Header {
    	
    	private Header() {
    		throw new IllegalStateException(HttpConstant.uc);
    	}

        public static final String REFERER = "Referer";

        public static final String USER_AGENT = "User-Agent";
    }

}
