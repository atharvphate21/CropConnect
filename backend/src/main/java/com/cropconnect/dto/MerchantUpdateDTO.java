package com.cropconnect.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MerchantUpdateDTO {
	
    @Size(max = 50)
    @NotNull
    private String firstName;
    
    @Size(max = 50)
    @NotNull
    private String lastName;
    
    private Integer rating;
}
