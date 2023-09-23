package charactercopy;

public class FakeFileDestination implements FileDestination {
  private StringDestination destination = new StringDestination();

  public FakeFileDestination(String path) {
  }

  @Override
  public void writeChar(char c) {
    destination.writeChar(c);
  }

  @Override
  public String toString() {
    return destination.toString();
  }
}
