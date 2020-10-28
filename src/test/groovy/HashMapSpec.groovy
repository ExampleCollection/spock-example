import spock.lang.Specification

/**
 * HashMap Spec
 *
 * @author moqi On 10/28/20 15:27
 */
class HashMapSpec extends Specification {

    def "HashMap accepts null key"() {
        given:
        def map = new HashMap()

        when:
        map.put(null, "element")

        then:
        notThrown(NullPointerException)
    }

}
