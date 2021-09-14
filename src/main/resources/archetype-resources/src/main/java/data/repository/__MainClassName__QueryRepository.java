package ${package}.data.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import ${package}.data.model.Q${MainClassName};
import ${package}.data.model.${MainClassName};
import com.querydsl.core.group.GroupBy;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.JPQLQuery;

@Repository
public class ${MainClassName}QueryRepository extends QuerydslRepositorySupport {


    Q${MainClassName} ${MainClassNameObj} = Q${MainClassName}.${MainClassNameObj};
   

    public ${MainClassName}QueryRepository() {
        super(${MainClassName}.class);
    }
}



