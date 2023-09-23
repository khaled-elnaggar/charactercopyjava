package charactercopy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileSystemDestinationTest {

  @Test
  void whenSourceHasManyCharactersBeforeNewline_ThenDestinationHasCharactersBeforeNewlineInFile() {
    //Arrange
    ISource iSource = new StringSource("hello\n");
    IDestination iDestination = getFileDestination("result.txt");

    //Act
    Copier.copy(iSource, iDestination);

    //Assert
    assertEquals("hello", iDestination.toString());
  }

  @Test
  void whenSourceHasManyCharactersBeforeAndAfterNewline_ThenDestinationHasCharactersBeforeNewlineInFile() {
    //Arrange
    ISource iSource = new StringSource("Hi\nNo");
    IDestination iDestination = getFileDestination("result.txt");

    //Act
    Copier.copy(iSource, iDestination);

    //Assert
    assertEquals("Hi", iDestination.toString());
  }

  private FileDestination getFileDestination(String path) {
    return new FileSystemDestination(path);
  }


}
