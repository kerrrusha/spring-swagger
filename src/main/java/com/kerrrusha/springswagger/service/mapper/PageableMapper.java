package com.kerrrusha.springswagger.service.mapper;

import com.kerrrusha.springswagger.dto.request.PagedSortedDto;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class PageableMapper implements RequestDtoMapper<PagedSortedDto, Pageable> {

    public Pageable mapToModel(PagedSortedDto request) {
        Sort.Direction direction = Sort.Direction.ASC;
        if (request.getSortOrder().equalsIgnoreCase("desc")) {
            direction = Sort.Direction.DESC;
        }

        Sort sort = Sort.by(direction, request.getSortBy());

        return PageRequest.of(request.getPageNo(), request.getPageSize(), sort);
    }

}
