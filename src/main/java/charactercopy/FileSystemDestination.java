package charactercopy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSystemDestination implements FileDestination {

  private final FileWriter fileWriter;
  private final String path;

  public FileSystemDestination(String filePath) {

    try {
      fileWriter = new FileWriter(filePath);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    path = filePath;
  }

  @Override
  public void writeChar(char c) {
    try {
      this.fileWriter.write(c);
    } catch (Exception e) {
      throw new RuntimeException("Error writing character");
    }
  }

  @Override
  public String toString() {
    try (FileReader reader = new FileReader(path)) {
      fileWriter.close();

      StringBuilder content = new StringBuilder();
      int nextChar = reader.read();
      while (nextChar != -1) {
        content.append((char) nextChar);
        nextChar = reader.read();
      }

      return content.toString();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
