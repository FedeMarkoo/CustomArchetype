package ${package}.${MainClassNameLow}.resource.mapper;

import ${package}.${MainClassNameLow}.resource.response.${MainClassName}Response;
import ${package}.data.model.${MainClassName};
import com.prosegur.rest.mapper.configuration.DefaultRequestMapperConfig;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", config = DefaultRequestMapperConfig.class)
public interface ${MainClassName}Mapper {

    ${MainClassName}Response toResponse(${MainClassName} ${MainClassNameObj});

}
