package frasesfamosas

import grails.test.mixin.Mock
import grails.test.mixin.TestFor

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(FraseService)
@Mock(Frase)
class FraseServiceTests {

    void testFraseAleatoria() {
        Frase fraseAleatoriaEstatica = service.getFraseAleatoria()
        assertEquals("Anônimo", fraseAleatoriaEstatica.autor)
        assertEquals("Água mole pedra dura, tanto bate até que fura", fraseAleatoriaEstatica.frase)
    }
}
