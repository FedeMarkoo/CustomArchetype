package ${package}.${MainClassNameLow}.resource;

import ${package}.${MainClassNameLow}.resource.mapper.${MainClassName}Mapper;
import ${package}.${MainClassNameLow}.resource.request.${MainClassName}Filter;
import ${package}.${MainClassNameLow}.resource.response.${MainClassName}Response;
import ${package}.${MainClassNameLow}.service.${MainClassName}Service;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class ${MainClassName}Resource {

    private final ${MainClassName}Service service;
    private final ${MainClassName}Mapper mapper;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ${MainClassName}Response findById(@Parameter @Valid final ${MainClassName}Filter filter) {
        return this.mapper.toResponse(this.service.findById(filter.getId()));
    }

}
