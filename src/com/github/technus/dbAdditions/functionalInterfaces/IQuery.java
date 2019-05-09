package com.github.technus.dbAdditions.functionalInterfaces;

@FunctionalInterface
public interface IQuery<Query,Collection,Result> {
    /**
     * Used to ask for elements, should add new elements to collection
     * @param query whatever to be passed as query
     * @param collection actual collection
     * @return elements found both new and old
     */
    Result ask(Query query, Collection collection) throws Exception;
}
