package ai.labs.resources.rest.http.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HttpCall {
    private String name;
    private List<String> actions;
    private Boolean saveResponse = false;
    private String responseObjectName;
    private Boolean fireAndForget = false;
    private Boolean isBatchCalls = false;
    private String iterationObjectName;
    private PreRequest preRequest;
    private Request request;
    private PostResponse postResponse;

    public boolean isSaveResponse() {
        return saveResponse;
    }

    public boolean isFireAndForget() {
        return fireAndForget;
    }
}
