import org.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {
    @Test
    void deveRetornarExcecaoParaCarroSemMarca() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("voyage")
                    .setNumPortass(4)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCarroSemModelo() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setMarca("fiat")
                    .setNumPortass(4)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setModelo("Siena")
                .setVelocidadeMax(200)
                .setMarca("fiat")
                .setNumPortass(4)
                .build();

        assertNotNull(carro);
    }

}