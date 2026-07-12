import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Folder {
    private final List<String> documents;

    public Folder(List<String> documents) {
        this.documents = new ArrayList<>(documents);
    }

    public List<String> getDocuments() {
        return Collections.unmodifiableList(documents);
    }
}
