package ${package}.${MainClassNameLow}.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.prosegur.cash.exception.exceptions.EntityNotFoundException;

import ${package}.data.model.${MainClassName};
import ${package}.data.repository.${MainClassName}CRUDRepository;
import ${package}.data.repository.${MainClassName}QueryRepository;
import ${package}.${MainClassNameLow}.resource.request.${MainClassName}Request;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class ${MainClassName}Service {

    private final ${MainClassName}QueryRepository ${MainClassNameObj}QueryRepository;
    private final ${MainClassName}CRUDRepository ${MainClassNameObj}CRUDRepository;
    private static final ObjectMapper mapperJson = new ObjectMapper();
    private static final String EMPTY_VALUE = "{}";

    public ${MainClassName} findById(final String ${MainClassNameObj}Id) {
        return this.${MainClassNameObj}CRUDRepository.findById(${MainClassNameObj}Id).orElseThrow(() -> new EntityNotFoundException("${MainClassName}"));
    }
}
