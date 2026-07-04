import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public record Folder(List<String> documents) {
    public Folder(List<String> documents) {
        this.documents = new ArrayList<>(documents);
    }

    @Override
    public List<String> documents() {
        return Collections.unmodifiableList(documents);
    }
}