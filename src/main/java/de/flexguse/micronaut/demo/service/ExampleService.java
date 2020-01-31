package de.flexguse.micronaut.demo.service;

import io.micronaut.validation.Validated;
import io.reactivex.Single;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Validated
public interface ExampleService {

    Single<String> greet(@NotNull(message = "the greeting name is required") Optional<String> name);

}
