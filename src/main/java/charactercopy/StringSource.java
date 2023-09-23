package charactercopy;

public class StringSource implements ISource {
  String source;
  int index;

  public StringSource(String stringSource) {
    source = stringSource;
    index = 0;
  }

  @Override
  public char readChar() {
    char result = source.charAt(index);
      index++;
    return result;
  }

  @Override
  public boolean hasNext() {
    return index < source.length();
  }

}
