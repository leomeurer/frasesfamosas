package frasesfamosas

class FraseController {

    static scaffold = true

    def fraseService

    def index() {
        redirect(action: 'frasesAleatorias')
    }

    def frasesAleatorias() {
        Frase fraseAleatoria = fraseService.getFraseAleatoria()

        //Mapa
        //[chave:'valor', chave2:'valor2']
        [frase: fraseAleatoria]

    }


}
