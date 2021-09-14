package ${package}.${MainClassNameLow}.resource.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ${MainClassName}Request {

    @NotBlank
    private String id;

}
