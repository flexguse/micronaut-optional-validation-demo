package de.flexguse.micronaut.demo.service;

import io.reactivex.Single;

import javax.inject.Singleton;
import java.util.Optional;

@Singleton
public class ExampleServiceImpl implements ExampleService {

    @Override
    public Single<String> greet(Optional<String> name) {

        return Single.just(name.map(givenString -> "Hello " + givenString).orElse("Hello Nobody"));

    }
}
