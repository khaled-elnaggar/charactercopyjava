package charactercopy;

public class Copier {
  public static void copy(ISource source, IDestination destination) {
    while (source.hasNext()){
      char c = source.readChar();
      if(c == '\n'){
        break;
      }
      destination.writeChar(c);
    }
  }
}
