package charactercopy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCopyTest {

  @Test
  void whenSourceHasManyCharacters_ThenCopyAllCharactersToDestination() {
    //Arrange
    String source = "abcx";
    StringBuilder destination = new StringBuilder();

    //Act
    copyHelper(source, destination);

    //Assert
    assertEquals(source, destination.toString());
  }

  private static void copyHelper(String source, StringBuilder destination) {
    Copier.copy(source, destination);
  }

}
