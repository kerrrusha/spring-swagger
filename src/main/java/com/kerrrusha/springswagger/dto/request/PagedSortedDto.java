package com.kerrrusha.springswagger.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class PagedSortedDto {

    private int pageNo;
    private int pageSize;

    @ApiModelProperty(
            value = "Field to sort by",
            notes="Ignoring case, set here name of field to sort by",
            example = "title")
    private String sortBy;

    @ApiModelProperty(
            value = "Sorting order",
            notes="Ignoring case, set here 'desc' to sort in descending order. Any other values will be considered as 'asc'",
            example = "desc")
    private String sortOrder;

}
