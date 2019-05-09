package com.github.technus.dbAdditions.functionalInterfaces;

@FunctionalInterface
public interface IProducer<OUT> {
    OUT make() throws Exception;
}
