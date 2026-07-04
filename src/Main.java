import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> myDocs = new ArrayList<>();
            myDocs.add("Car");
            myDocs.add("Home");

        Folder myFolder = new Folder(myDocs);

        System.out.println(myFolder.documents());
    }
}