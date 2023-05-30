package com.sda.discover.oradea.controller.advice;

import com.sda.discover.oradea.controller.dto.SearchDto;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice(basePackages = "com.sda.discover.oradea.controller")
public class GlobalControllerAdvice {

    @ModelAttribute("searchDto")
    public SearchDto searchDto() {
        return new SearchDto();
    }
}
