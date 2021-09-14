package ${package}.data.model;

import com.prosegur.data.model.BasicEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;

@Getter
@Setter
@javax.persistence.Entity
@Table(name="TABLE")
@AttributeOverride(name="id", column = @Column(name="OID", unique=true,nullable = false,length = 36))
public class ${MainClassName} extends BasicEntity {

}
