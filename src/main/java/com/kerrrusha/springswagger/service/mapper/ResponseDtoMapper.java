package com.kerrrusha.springswagger.service.mapper;

public interface ResponseDtoMapper<D, T> {

    D mapToDto(T t);

}
