package demo

import spock.lang.Ignore
import spock.lang.Specification

@Ignore("Comment this annotation to check the errors")
class E2_PowerAsserts extends Specification {

    void 'should fail with numbers'() {
        expect:
            2 * 3 == 5 * 4
    }

    void 'should fail with maps and lists'() {
        given:
            def data = [
                name  : 'Iván',
                age   : 37,
                childs: [
                    [name: 'Judith', age: 9], [name: 'Adriana', age: 6]
                ]
            ]

        expect:
            data.childs.name.first() == 'Adriana'
    }

}
