package frasesfamosas

class Frase {

    String autor
    String frase

    /**
     * Grails automaGicamente preencher esses dados
     */
    Date dateCreated
    Date lastUpdated

    static constraints = {
        autor blank: false, nullable: false
        frase blank: false, nullable: false, maxSize: 1000

    }
}
