package charactercopy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterCopyTest {

  @Test
  void whenSourceHasManyCharacters_ThenCopyAllCharactersToDestination() {
    //Arrange
    String source = "abcx";
    StringBuilder destination = new StringBuilder();

    //Act
    TestHelpers.copyHelper(source, destination);

    //Assert
    assertEquals(source, destination.toString());
  }

  @Test
  void whenSourceNoCharactersBeforeNewline_ThenDestinationHasNoCharacters() {
    //Arrange
    String source = "\n";
    StringBuilder destination = new StringBuilder();

    //Act
    TestHelpers.copyHelper(source, destination);

    //Assert
    assertEquals("", destination.toString());
  }

  @Test
  void whenSourceHasCharactersAfterNewline_ThenDestinationHasOnlyCharactersBeforeNewline() {
    //Arrange
    String source = "hello\nbye";
    StringBuilder destination = new StringBuilder();

    //Act
    TestHelpers.copyHelper(source, destination);

    //Assert
    assertEquals("hello", destination.toString());
  }

}
