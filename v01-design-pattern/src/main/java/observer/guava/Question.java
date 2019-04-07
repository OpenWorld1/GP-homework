package observer.guava;

import com.google.common.eventbus.Subscribe;

public class Question {

    String gpName;
    String content;

    public Question(String gpName, String content) {
        this.gpName = gpName;
        this.content = content;
    }

    public String getGpName() {
        return gpName;
    }

    public void setGpName(String gpName) {
        this.gpName = gpName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
