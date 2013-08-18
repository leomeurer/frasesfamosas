package frasesfamosas

class FraseService {

    def getFraseAleatoria() {
        def todasFrases = Frase.list()

        def fraseAleatoria

        if (todasFrases.size() > 0) {
            def randonIndex = new Random().nextInt(todasFrases.size())
            fraseAleatoria = todasFrases[randonIndex]
        } else {
            def autorEstatico = "Anônimo"
            def fraseEstatica = "Água mole pedra dura, tanto bate até que fura"

            fraseAleatoria = new Frase(autor: autorEstatico, frase: fraseEstatica)
        }

        fraseAleatoria
    }

}
