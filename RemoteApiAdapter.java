class RemoteApiAdapter implements MediaSource {
	private String apiUrl;

	public RemoteApiAdapter(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	@Override
	public String fetch() {
		System.out.println("[RemoteAPI] Fetching stream from: " + apiUrl);
		return "[RemoteAPI Stream] " + apiUrl;
	}
}