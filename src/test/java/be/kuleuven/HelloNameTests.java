package be.kuleuven;

import org.junit.jupiter.api.Test;

public class HelloNameTests {
    @Test
    public void gegevenHelloNameArne_whenGetNaam_thenArne(){
        //Arrange
        HelloName test = new HelloName("Arne");

        //Act
        String result = test.getNaam();

        //Assert
        assert (result.equals("Arne"));
    }
}
