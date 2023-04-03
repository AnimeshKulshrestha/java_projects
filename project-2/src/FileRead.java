import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileRead {
    public static void main(String[] args) throws IOException {
        String filename = "carbrands.txt";
        Stream<String> stream = Files.lines(Paths.get(filename));
        File file = new File("carbrandout.txt");
        if(file.exists())
            file.delete();
        file.createNewFile();
        int ind = 1;
        FileWriter fileWriter = new FileWriter("carbrandout.txt");
        for(String name : stream.toList()){
            if(name.length()>=5){
                fileWriter.write((ind++)+" "+name+"\n");
            }
        }
        fileWriter.close();
    }
}
