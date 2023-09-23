package charactercopy;

public class TestHelpers {
  public static void copyHelper(String stringSource, StringBuilder stringDestination) {
    ISource source = new StringSource(stringSource);
    IDestination destination = new StringDestination();

    Copier.copy(source, destination);
    stringDestination.append(destination);
  }
}
