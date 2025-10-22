// -------------------- PROXY PATTERN --------------------
class CachedRemoteProxy implements MediaSource {
    private RemoteApiAdapter realSource;
    private String cachedData;

    public CachedRemoteProxy(RemoteApiAdapter realSource) {
        this.realSource = realSource;
    }

    @Override
    public String fetch() {
        if (cachedData == null) {
            System.out.println("[Proxy] Cache empty — fetching from remote...");
            cachedData = realSource.fetch();
        } else {
            System.out.println("[Proxy] Returning cached stream...");
        }
        return cachedData;
    }
}