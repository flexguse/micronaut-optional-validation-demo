package de.flexguse.micronaut.demo.service


import io.micronaut.test.annotation.MicronautTest
import io.reactivex.Single
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject

@MicronautTest
class ExampleServiceImplTest extends Specification {

    @Inject
    ExampleService service

    @Unroll
    void "should greet #name"() {

        when:
        Single<String> greeting = service.greet(name);

        then:
        greeting.blockingGet() == expected

        where:
        name                | expected
        Optional.of("Anna") | "Hello Anna"
        Optional.empty()    | "Hello Nobody"

    }

}
