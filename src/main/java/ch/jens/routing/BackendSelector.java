package ch.jens.routing;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class BackendSelector {

    private final List<String> allServers;
    private Set<String> unhealthyServers;
    int nextServerIndex;

    public BackendSelector(List<String> servers) {
        this.allServers = Objects.requireNonNull(servers);
        this.unhealthyServers = new HashSet<>();
        nextServerIndex = 0;
    }

    public String nextServer() {
        String nextServer = allServers.get(nextServerIndex);
        nextServerIndex = (nextServerIndex + 1) % servers.size();
        return nextServer;
    }

    public void markUnhealthy(String server) {

    }

    public void markHealthy(String server) {

    }
}
