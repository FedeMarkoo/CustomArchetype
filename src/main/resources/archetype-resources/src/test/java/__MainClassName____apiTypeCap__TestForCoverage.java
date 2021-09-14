package ${package};

import com.prosegur.cash.integration.testhelper.generators.ObjectGenerator;
import ${package}.data.model.${MainClassName};
import ${package}.data.repository.${MainClassName}QUERYRepository;
import ${package}.data.repository.${MainClassName}CRUDRepository;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
@ActiveProfiles(value = "test", inheritProfiles = false)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ${MainClassName}${apiTypeCap}TestForCoverage {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void initialiseRestAssuredMockMvcWebApplicationContext() {
        RestAssuredMockMvc.webAppContextSetup(this.webApplicationContext);
    }


    @MockBean
    ${MainClassName}QueryRepository ${MainClassNameObj}QueryRepository;
    @MockBean
	${MainClassName}CRUDRepository ${MainClassNameObj}CRUDRepository;

    @Test
    public void test() {
        final ${MainClassName} instance = ObjectGenerator.createInstanceFully(${MainClassName}.class);

        Mockito.when(this.${MainClassNameObj}CRUDRepository.findById(any())).thenReturn(Optional.of(instance));
        RestAssuredMockMvc.given()
                .contentType(ContentType.JSON)
                .param("id", instance.getId())
                .get("/${endpoint}")
                .then()
                .statusCode(200);
    }

    @Test
    public void testIgnoringFields() {
        final ArrayList<String> ignoredFields = new ArrayList<>();
        ignoredFields.add("");

        final ${MainClassName} instance = ObjectGenerator.createInstance(${MainClassName}.class, ignoredFields);
		Mockito.when(this.${MainClassNameObj}CRUDRepository.findById(any())).thenReturn(Optional.of(instance));
		RestAssuredMockMvc.given()
                .contentType(ContentType.JSON)
                .param("id", instance.getId())
                .get("/${endpoint}")
                .then()
                .statusCode(200);
    }

    @Test
    public void testValuedFields() {
        final HashMap<String, Object> valuedFields = new HashMap<>();
        valuedFields.put("", new ArrayList<>());

        final ${MainClassName} instance = ObjectGenerator.createInstance(${MainClassName}.class, valuedFields);
        Mockito.when(this.${MainClassNameObj}CRUDRepository.findById(any())).thenReturn(Optional.of(instance));

        RestAssuredMockMvc.given()
                .contentType(ContentType.JSON)
                .param("id", instance.getId())
                .get("/${endpoint}")
                .then()
                .statusCode(200);
    }

}
