package charactercopy;

public class StringDestination implements IDestination{
  StringBuilder written = new StringBuilder();

  @Override
  public void writeChar(char c) {
    written.append(c);
  }

  @Override
  public String toString() {
    return written.toString();
  }
}
