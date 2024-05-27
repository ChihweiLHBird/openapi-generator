package controllers;

import apimodels.Client;
import java.util.UUID;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class AnotherFakeApiController extends Controller {
    private final AnotherFakeApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AnotherFakeApiController(Config configuration, AnotherFakeApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result call123testSpecialTags(Http.Request request) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Client body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Client.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        String valueuuidTest = request.header("uuid_test").orElse(null);
        UUID uuidTest;
        if (valueuuidTest != null) {
            uuidTest = UUID.fromString(valueuuidTest);
        } else {
            throw new IllegalArgumentException("'uuid_test' parameter is required");
        }
        return imp.call123testSpecialTagsHttp(request, uuidTest, body);
    }

}
