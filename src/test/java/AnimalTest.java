import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal dog;

    @BeforeEach
    void setUp() {
        dog = new Animal("Bello", 3, "Dog", "Wuff");
    }

    @Test
    @DisplayName("Test Konstruktor")
    void testAgeSmallerThan0(){
        Animal cat = new Animal("Minky", -1, "Cat", "Miau");
    assertEquals("Minky", cat.getName());
    assertEquals(0, cat.getAge());
    assertEquals("Cat", cat.getSpecies());
    assertEquals("Miau", cat.getAnimalLoud());
    }

    @Test
    void isABabyAnimal(){
        Animal cat = new Animal("Minky", -1, "Cat", "Miau");
        assertTrue(cat.isABabyAninmal());
    }

    @Test
    void isNotABabyAnimal(){
        assertFalse(dog.isABabyAninmal());
    }

    @Test
    void giveAninmalLoud() {
        String expected = "Wuff";
        String actual = dog.giveAninmalLoud();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNameAndAge() {
        String expected = "Name: Bello, Alter: 3";
        Assertions.assertEquals(expected, dog.getNameAndAge());
    }

    @Test
    void ageCategory() {
        assertEquals("young animal", dog.ageCategory());

        dog.setAge(8);
        assertEquals("old animal", dog.ageCategory());
    }
}