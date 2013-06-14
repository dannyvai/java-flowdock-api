import java.util.List;


public class StreamingApi {
	private static String STREAMING_API_URL = "https://stream.flowdock.com/flows";
	private static String DEFAULT_CONTENT_TYPE = "application/json";

	public String personal_api_token;
	public String accept_content_type;
	public List<String> headers;
	
	public StreamingApi(
			String personal_api_token,
			String accept_content_type
	) {
		this.personal_api_token = personal_api_token;
		this.accept_content_type = accept_content_type;
		this.headers.add("content-type:"+DEFAULT_CONTENT_TYPE);
		this.headers.add("accept:"+accept_content_type);
	}
	
	
	
}
