package com.kerrrusha.springswagger.dto;

import lombok.Getter;

@Getter
public class PagedSortedDto {

    private Long from;
    private String sortByField;
    private SortType sortType;

    public enum SortType {
        ASC, DESC
    }

}
